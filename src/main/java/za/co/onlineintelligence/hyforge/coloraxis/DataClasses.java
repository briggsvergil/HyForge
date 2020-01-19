package za.co.onlineintelligence.hyforge.coloraxis;

import java.io.Serializable;
import java.util.Objects;
import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;
import za.co.onlineintelligence.hyforge.series.HighchartsPoint;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * DataClasses  HighchartsAPI Class
 * @author Sean Briggs
 */
public class DataClasses implements Serializable, Exportable {


    public DataClasses() {
    }

    /**
     * The color of each data class. If not set, the color is pulled
     from the global or chart-specific [colors](#colors) array. In
     styled mode, this option is ignored. Instead, use colors defined
     in CSS.
     */
    private HighchartsColor color;

    /**
     * The start of the value range that the data class represents,
     relating to the point value.

     The range of each `dataClass` is closed in both ends, but can be
     overridden by the next `dataClass`.
     */
    private Integer from;

    /**
     * The name of the data class as it appears in the legend.
     If no name is given, it is automatically created based on the
     `from` and `to` values. For full programmatic control,
     [legend.labelFormatter](#legend.labelFormatter) can be used.
     In the formatter, `this.from` and `this.to` can be accessed.
     */
    private String name;

    /**
     * The end of the value range that the data class represents,
     relating to the point value.

     The range of each `dataClass` is closed in both ends, but can be
     overridden by the next `dataClass`.
     */
    private Integer to;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public DataClasses setColor(HighchartsColor color){
        this.color = color;
        return this;
    }

    public DataClasses setColor(String colorString) {
        this.color = new HighchartsColorString(colorString);
        return this;
    }

    public Integer getFrom() {
        return this.from = getInstanceOf(Integer.class, this.from);
    }

    public DataClasses setFrom(Integer from){
        this.from = from;
        return this;
    }

    public String getName() {
        return this.name = getInstanceOf(String.class, this.name);
    }

    public DataClasses setName(String name){
        this.name = name;
        return this;
    }

    public Integer getTo() {
        return this.to = getInstanceOf(Integer.class, this.to);
    }

    public DataClasses setTo(Integer to){
        this.to = to;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.from);
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.to);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "color:" + color
                + ", from:" + from
                + ", name:" + name
                + ", to:" + to
                + '}';
    }


}
