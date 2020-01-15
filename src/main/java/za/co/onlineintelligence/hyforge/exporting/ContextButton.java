package za.co.onlineintelligence.hyforge.exporting;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;
import za.co.onlineintelligence.hyforge.common.HighchartsSymbol;
import za.co.onlineintelligence.hyforge.navigation.ButtonOptions;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * ContextButton  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ContextButton extends ButtonOptions implements Serializable, DrosteDeflater {


    public ContextButton() {
    }

    @Deprecated
    /**
     * @deprecated
     * This option is deprecated, use
     * [titleKey](#exporting.buttons.contextButton.titleKey) instead.
     */
    private String _titleKey;

    /**
     * The class name of the context button.
     */
    private String className;

    /**
     * The class name of the menu appearing from the button.
     */
    private String menuClassName;

    /**
     * A collection of strings pointing to config options for the menu
     * items. The config options are defined in the
     * `menuItemDefinitions` option.
     * <p>
     * By default, there is the "View in full screen" and "Print" menu
     * items, plus one menu item for each of the available export types.
     *
     * @since 2.0.0
     */
    private String[] menuItems;

    /**
     * A click handler callback to use on the button directly instead of
     * the popup menu.
     *
     * @since 2.0.0
     */
    private HighchartsCallbackFunction onclick;

    /**
     * The symbol for the button. Points to a definition function in
     * the `Highcharts.Renderer.symbols` collection. The default
     * `exportIcon` function is part of the exporting module. Possible
     * values are "circle", "square", "diamond", "triangle",
     * "triangle-down", "menu", "menuball" or custom shape.
     * <p>
     * Note:
     * Use HighchartsContexButtonSymbol enum for common values, HighchartsSymbolKeyValue enum for generic symbols or
     * HighchartsCustomSymbol class for a custom-defined symbol
     *
     * @since 2.0.0
     */
    private HighchartsSymbol symbol;

    /**
     * See [navigation.buttonOptions.symbolFill](#navigation.buttonOptions.symbolFill).
     *
     * @since 2.0.0
     */
    private HighchartsColorString symbolFill;

    /**
     * The key to a [lang](#lang) option setting that is used for the
     * button's title tooltip. When the key is `contextButtonTitle`, it
     * refers to [lang.contextButtonTitle](#lang.contextButtonTitle)
     * that defaults to "Chart context menu".
     *
     * @since 6.1.4
     */
    private String titleKey;

    /**
     * The horizontal position of the button relative to the `align`
     * option.
     *
     * @since 2.0.0
     */
    private Integer x;

    /*
        Getters and Builder-Style Setters
    */
    public String get_titleKey() {
        return this._titleKey = getInstanceOf(String.class, this._titleKey);
    }

    public ContextButton set_titleKey(String _titleKey) {
        this._titleKey = _titleKey;
        return this;
    }

    public String getClassName() {
        return this.className = getInstanceOf(String.class, this.className);
    }

    public ContextButton setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getMenuClassName() {
        return this.menuClassName = getInstanceOf(String.class, this.menuClassName);
    }

    public ContextButton setMenuClassName(String menuClassName) {
        this.menuClassName = menuClassName;
        return this;
    }

    public String[] getMenuItems() {
        return this.menuItems = getInstanceOf(String[].class, this.menuItems);
    }

    public ContextButton setMenuItems(String[] menuItems) {
        this.menuItems = menuItems;
        return this;
    }

    public HighchartsCallbackFunction getOnclick() {
        return this.onclick = getInstanceOf(HighchartsCallbackFunction.class, this.onclick);
    }

    public ContextButton setOnclick(HighchartsCallbackFunction onclick) {
        this.onclick = onclick;
        return this;
    }

    public HighchartsSymbol getSymbol() {
        return this.symbol = getInstanceOf(HighchartsSymbol.class, this.symbol);
    }

    public ContextButton setSymbol(HighchartsSymbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public HighchartsColorString getSymbolFill() {
        return this.symbolFill = getInstanceOf(HighchartsColorString.class, this.symbolFill);
    }

    public ContextButton setSymbolFill(HighchartsColorString symbolFill) {
        this.symbolFill = symbolFill;
        return this;
    }

    public String getTitleKey() {
        return this.titleKey = getInstanceOf(String.class, this.titleKey);
    }

    public ContextButton setTitleKey(String titleKey) {
        this.titleKey = titleKey;
        return this;
    }

    public Integer getX() {
        return this.x = getInstanceOf(Integer.class, this.x);
    }

    public ContextButton setX(Integer x) {
        this.x = x;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this._titleKey);
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.menuClassName);
        hash = 17 * hash + Objects.hashCode(this.menuItems);
        hash = 17 * hash + Objects.hashCode(this.onclick);
        hash = 17 * hash + Objects.hashCode(this.symbol);
        hash = 17 * hash + Objects.hashCode(this.symbolFill);
        hash = 17 * hash + Objects.hashCode(this.titleKey);
        hash = 17 * hash + Objects.hashCode(this.x);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "_titleKey:" + _titleKey
                + ", className:" + className
                + ", menuClassName:" + menuClassName
                + ", menuItems:" + menuItems
                + ", onclick:" + onclick
                + ", symbol:" + symbol
                + ", symbolFill:" + symbolFill
                + ", titleKey:" + titleKey
                + ", x:" + x
                + '}';
    }


}