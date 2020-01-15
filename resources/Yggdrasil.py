# THIS SCRIPT WILL RECURSIVELY WALK THROUGH THE TREE.JSON OF THE HIGHHARTS LIBRARY AND CREATE POJO CLASSES FROM THE EXTRAPOLATED DATA
#
# SEAN BRIGGS 23/12/2019
import json
import os
# import argparse
#
# parser = argparse.ArgumentParser(description='THIS SCRIPT WILL RECURSIVELY WALK THROUGH THE TREE.JSON OF THE HIGHHARTS LIBRARY AND CREATE POJO CLASSES FROM THE EXTRAPOLATED DATA')
# parser.add_argument('--i')

defaultPackage = "za.co.onlineintelligence.hyforge"

filedata = open('HighchartsTree.json','r', encoding='utf-8')
filedata = json.load(filedata)

arr = []
descArr = []

def capitalise(s):
    return s[0].upper() + s[1:]

def getClassFile(p, c, i):
    h = '_'.join(hierarchy[:len(hierarchy)-1])
    f = p + h + ('_' if len(h)> 0 else '') + c
    if i==0:
        if os.path.isfile(f+'.java'):
            return getClassFile(p,c,1)
        else:
            return f+'.java'
    else:
        if os.path.isfile(f + str(i) + '.java'):
            return getClassFile(p,c,i+1)
        else:
            return f + str(i) + '.java'

# def getReturnType(t):
#     if len(t) == 1:
#         if t[0] == '*':
#             arr.append(", TYPE=Class\n")
#             arr.append('-' * indentCount)
#             arr.append("CHILDREN={\n")
#             return capitalise(k)
#         elif t[0] == 'Array.<*>':
#             arr.append(", TYPE=ArrayOfClass\n")
#             arr.append('-' * indentCount)
#             arr.append("CHILDREN={\n")
#             type = capitalise(k) + "[]"
#         else:
#             arr.append(", Type=" + ''.join(types) + "\n")
#             arr.append('-' * indentCount)
#             arr.append("CHILDREN={\n")
#             type = ''.join(types)
#     else:
#         arr.append(", Type=Complex [" + ', '.join(types) + "]\n")
#         arr.append('-' * indentCount)
#         arr.append("CHILDREN={\n")
#         type = "TBC[" + ','.join(types) + "]"

#p=packageName,string; i=commentOutPackage, bool
def templatePackage(p, i):
    iS = "//" if i==True else ""
    if len(p) > 0:
        return f"{iS}package {defaultPackage}.{p};\n\n"
    else:
        return f"{iS}package {defaultPackage};\n\n"

#i=import,String; p=usePackage,bool
def templateImport(i, p):
    if len(i) > 0:
        if p:
            return f"import {defaultPackage}.{i};\n"
        else:
            return f"import {i};\n"
    else:
        return i

#c=className,string
def templateAuthorTag(c):
    return f"\n\n/**\n* {c}  HighchartsAPI Class\n* @author Sean Briggs\n*/\n"

#cT=classType,string:class|interface|enum; cN=className,string; aI=additionalInheritance,stringDict {cN: "class"|"interface"}
def templateClassDef(cT, cN, aI):
    b = False
    e = ''
    i = []
    if len(aI) > 0:
        for d in aI:
            if d['type'] == 'class' and not b:
                b = True
                e = d['name']
            else:
                i.append(d['name'])
    iS = " implements Serializable, DrosteDeflater" + (" {\n\n\n" if len(i)==0 else (", ".join(i) + " {\n\n\n"))
    e = '' if len(e)==0 else ' extends ' + e
    return f"public {cT} {cN}{e}{iS}"

def createClass(className, fields):
    lns = []
    #Generate standard package name, import Serializable
    #lns.append(templatePackage("", True))
    lns.append(templateImport("java.io.Serializable", False))
    lns.append(templateImport("java.util.Objects", False))
    lns.append(templateImport("common.DrosteDeflater", True))
    lns.append("import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;\n")

    #Add imports for new classes for Highcharts specific types
    if any(d['type'] == 'HighchartsColor' for d in fields):
        lns.append(templateImport("common.HighchartsColor", True))
    if any(d['type'] == 'HighchartsSize' for d in fields):
        lns.append(templateImport("common.HighchartsSize", True))
    if any(d['type'] == 'HighchartsCSS' for d in fields):
        lns.append(templateImport("common.HighchartsCSS", True))
    if any(d['type'] == 'HighchartsVerticalAlignValue' for d in fields):
        lns.append(templateImport("common.enums.HighchartsVerticalAlignValue", True))
    if any(d['type'] == 'HighchartsAlignValue' for d in fields):
        lns.append(templateImport("common.enums.HighchartsAlignValue", True))
    if any(d['type'] == 'HighchartsCallbackFunction' for d in fields):
        lns.append(templateImport("common.HighchartsCallbackFunction", True))
    if any(d['type'] == 'HighchartsColorString' for d in fields):
        lns.append(templateImport("common.HighchartsColorString", True))


    #Author creation tag before class definition
    lns.append(templateAuthorTag(className))

    #Actual class definition
    lns.append(templateClassDef("class", className, []))

    #Public no-args constructor for class
    lns.append("\tpublic " + className + "() {\n\t}\n\n")

    #Create private fields for each field
    for item in fields:
        lns.append(f"\t/**\n\t* {item['doc']}\n")
        if len(item['since']) > 0:
            lns.append(f"\t* @since {item['since']}\n")
        if len(item['defaultValue']) > 0:
            lns.append(f"\t* @defaultValue {item['defaultValue']}\n")
        lns.append('\t*/\n')
        lns.append(f"\tprivate {item['type']} {item['field']};\n\n")

    #Insert getter and setter methods for each field
    lns.append("\t/*\n\t\tInstance-Safe Getters\n\t*/\n")
    for item in fields:
        t = item['type']
        f = item['field']
        lns.append(f"\tpublic {t} get{capitalise(f)}() {{\n")
        lns.append(f"\t\treturn this.{f} = getInstanceOf({t}.class, this.{f});\n\t}}\n\n")

    lns.append("\t/*\n\t\tBuilder-Style Setters\n\t*/\n")
    for item in fields:
        t = item['type']
        f = item['field']

        lns.append(f"\tpublic {className} set{capitalise(f)}({t} {f}){{\n")
        lns.append(f"\t\tthis.{f} = {f};\n")
        lns.append("\t\treturn this;\n\t}\n\n")

    #Override hashCode method
    lns.append("\t@Override\n")
    lns.append("\tpublic int hashCode() {\n\t\tint hash = 3;\n")
    for item in fields:
        f = item['field']
        lns.append(f"\t\thash = 17 * hash + Objects.hashCode(this.{f});\n")
    lns.append("\n\t\treturn hash;\n\t}\n\n")

    #Override the toString() method
    lns.append("\t@Override\n")
    lns.append("\tpublic String toString() {\n\t\treturn '{'\n")
    bF = True
    for item in fields:
        f = item['field']
        if bF:
            lns.append(f"\t\t\t+ \"{f}:\" + {f}\n")
            bF = False
        else:
            lns.append(f"\t\t\t+ \", {f}:\" + {f}\n")
    lns.append("\t\t\t+ '}';\n\t}\n\n")

    #end of class
    lns.append("\n}")

    filePath = os.path.dirname(os.path.realpath(__file__)) + "\\highchartsjapi\\"
    fileName = getClassFile(filePath,className,0)
    if not os.path.exists(os.path.dirname(filePath)):
        try:
            os.makedirs(filePath)
        except OSError as ex:
            print(ex)

    with open(fileName, 'w') as fl:
        for item in lns:
            fl.write(item)


hierarchy = []

def extract_class(obj, parent, indentCount):
    if isinstance(obj, dict):
        fieldDict = []
        for k, v in obj.items():
            if 'children' in v and 'doclet' in v:
                """Extract description, class name, type, etc."""
                arr.append('-' * indentCount)
                arr.append("FIELD_NAME= " + k)
                descArr.append("\n\nFIELD_NAME=" + k)
                types = []
                if 'type' in v['doclet']:
                    types = v['doclet']['type']['names']
                elif 'extends' in v['doclet']:
                    types.append('Extends.' + v['doclet']['extends'])
                else:
                    types.append('ERROR')
                descr = ''
                if 'description' in v['doclet']:
                    descr = v['doclet']['description']
                since = ''
                if 'since' in v['doclet']:
                    since = v['doclet']['since']
                defVal = ''
                if 'defaultValue' in v['doclet']:
                    defVal = v['doclet']['defaultValue']
                type = ''

                if len(types) > 0:
                    if len(types) == 1:
                        if types[0] == '*':
                            # arr.append(", TYPE=Class\n")
                            # arr.append('-' * indentCount)
                            # arr.append("CHILDREN={\n")
                            type = capitalise(k)
                        elif types[0] == 'Array.<*>':
                            # arr.append(", TYPE=ArrayOfClass\n")
                            # arr.append('-' * indentCount)
                            # arr.append("CHILDREN={\n")
                            type = capitalise(k) + "[]"
                        elif 'Array.<' in types[0]:
                            temp = types[0][7:types[0].index('>')]
                            if temp == 'number':
                                type = 'int[]'
                            elif temp == 'string':
                                type = 'String[]'
                            elif temp == 'boolean':
                                type = 'boolean[]'
                            elif temp == 'Highcharts.ColorString':
                                type = 'HighchartsColorString'
                            else:
                                type = temp + '[]'
                        elif types[0] == 'Highcharts.CSSObject':
                            type = 'HighchartsCSS'
                        elif types[0] == 'Highcharts.VerticalAlignValue':
                            type = 'HighchartsVerticalAlignValue'
                        elif types[0] == 'Highcharts.AlignValue':
                            type = 'HighchartsAlignValue'
                        elif types[0] == "Highcharts.ColorString":
                            type = 'HighchartsColorString'
                        elif 'CallbackFunction' in types[0]:
                            type = 'HighchartsCallbackFunction'
                        elif types[0] == 'function':
                            type = 'HighchartsCallbackFunction'
                        else:
                            # arr.append(", Type=" + ''.join(types) + "\n")
                            # arr.append('-' * indentCount)
                            # arr.append("CHILDREN={\n")
                            type = ''.join(types)
                    else:
                        if len(types) == 2 and types[1]=='null':
                            if types[0]=='number':
                                type = 'Integer'
                            elif types[0]=='string':
                                type = 'String'
                            elif types[0]=='boolean':
                                type = 'Boolean'
                        elif len(types) == 3 and 'Highcharts.ColorString' in types:
                            type = 'HighchartsColor'
                        elif 'number' in types and 'string' in types:
                            type = 'HighchartsSize'
                        elif any('ShadowOptionsObject' in t for t in types):
                            type = 'HighchartsShadowOptionsObject'
                        else:
                            # arr.append(", Type=Complex [" + ', '.join(types) + "]\n")
                            # arr.append('-' * indentCount)
                            # arr.append("CHILDREN={\n")
                            type = "TBC[" + ','.join(types) + "]"

                if 'TBC' in type and ('width' in k or 'height' in k):
                    type = 'HighchartsSize'

                if type == 'number':
                    type = 'Integer'
                elif type == 'string':
                    type = 'String'
                elif type == 'boolean':
                    type = 'Boolean'
                if "-" in k:
                    k.replace("-", "_")
                d = {'field' : k, 'type': type, 'doc': descr, 'since': since, 'defaultValue': defVal}
                fieldDict.append(d.copy())
                descArr.append("\nDESCRIPTION={" + descr + "}")
                hierarchy.append(capitalise(k))
                extract_class(v['children'], capitalise(k), indentCount+1)
                hierarchy.pop()
                arr.append("\n}\n")
            else:
                arr.append(k + ' does not have children structure.')
        if len(fieldDict) > 0:
            createClass(parent, fieldDict)

arr.append('----Highcharts----\n')
extract_class(filedata, 'Highcharts', 0)
# print(''.join(arr))
# with open('class_descriptions.txt', 'w') as f:
#     for item in descArr:
#         f.write(item)
