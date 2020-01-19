package za.co.onlineintelligence.hyforge.nodata;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * NoData  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class NoData implements Serializable, Exportable {


    public NoData() {
    }

    /**
     * An object of additional SVG attributes for the no-data label.
     *
     * @since 3.0.8
     */
    private HighchartsSVGAttributes attr;

    /**
     * The position of the no-data label, relative to the plot area.
     *
     * @since 3.0.8
     */
    private HighchartsAlignObject position;

    /**
     * CSS styles for the no-data label.
     */
    private HighchartsCSS style;

    /**
     * Whether to insert the label as HTML, or as pseudo-HTML rendered with
     * SVG.
     *
     * @since 4.1.10
     */
    private Boolean useHTML;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsSVGAttributes getAttr() {
        return this.attr = getInstanceOf(HighchartsSVGAttributes.class, this.attr);
    }

    public NoData setAttr(HighchartsSVGAttributes attr) {
        this.attr = attr;
        return this;
    }

    public HighchartsAlignObject getPosition() {
        return this.position = getInstanceOf(HighchartsAlignObject.class, this.position);
    }

    public NoData setPosition(HighchartsAlignObject position) {
        this.position = position;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public NoData setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public Boolean getUseHTML() {
        return this.useHTML = getInstanceOf(Boolean.class, this.useHTML);
    }

    public NoData setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.attr);
        hash = 17 * hash + Objects.hashCode(this.position);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.useHTML);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "attr:" + attr
                + ", position:" + position
                + ", style:" + style
                + ", useHTML:" + useHTML
                + '}';
    }


}