package za.co.onlineintelligence.hyforge.plotoptions;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.HighchartsCSS;
import za.co.onlineintelligence.hyforge.common.HighchartsLabelIntersectBoxObject;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * SeriesLabelOptions HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class SeriesLabelOptions implements Serializable {


    public SeriesLabelOptions() {
    }

    /**
     * An array of boxes to avoid when laying out the labels. Each
     * item has a `left`, `right`, `top` and `bottom` property.
     *
     * @since 6.0.0
     */
    private HighchartsLabelIntersectBoxObject[] boxesToAvoid;

    /**
     * Allow labels to be placed distant to the graph if necessary,
     * and draw a connector line to the graph. Setting this option
     * to true may decrease the performance significantly, since the
     * algorithm with systematically search for open spaces in the
     * whole plot area. Visually, it may also result in a more
     * cluttered chart, though more of the series will be labeled.
     *
     * @since 6.0.0
     */
    private boolean connectorAllowed;

    /**
     * If the label is closer than this to a neighbour graph, draw a
     * connector.
     *
     * @since 6.0.0
     */
    private int connectorNeighbourDistance;

    /**
     * Enable the series label per series.
     *
     * @since 6.0.0
     */
    private boolean enabled;

    /**
     * For area-like series, allow the font size to vary so that
     * small areas get a smaller font size. The default applies this
     * effect to area-like series but not line-like series.
     *
     * @since 6.0.0
     */
    private Integer maxFontSize;

    /**
     * For area-like series, allow the font size to vary so that
     * small areas get a smaller font size. The default applies this
     * effect to area-like series but not line-like series.
     *
     * @since 6.0.0
     */
    private Integer minFontSize;

    /**
     * Draw the label on the area of an area series. By default it
     * is drawn on the area. Set it to `false` to draw it next to
     * the graph instead.
     *
     * @since 6.0.0
     */
    private Boolean onArea;

    /**
     * Styles for the series label. The color defaults to the series
     * color, or a contrast color if `onArea`.
     *
     * @since 6.0.0
     */
    private HighchartsCSS style;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsLabelIntersectBoxObject[] getBoxesToAvoid() {
        return this.boxesToAvoid = getInstanceOf(HighchartsLabelIntersectBoxObject[].class, this.boxesToAvoid);
    }

    public SeriesLabelOptions setBoxesToAvoid(HighchartsLabelIntersectBoxObject[] boxesToAvoid) {
        this.boxesToAvoid = boxesToAvoid;
        return this;
    }

    public boolean getConnectorAllowed() {
        return this.connectorAllowed = getInstanceOf(boolean.class, this.connectorAllowed);
    }

    public SeriesLabelOptions setConnectorAllowed(boolean connectorAllowed) {
        this.connectorAllowed = connectorAllowed;
        return this;
    }

    public int getConnectorNeighbourDistance() {
        return this.connectorNeighbourDistance = getInstanceOf(int.class, this.connectorNeighbourDistance);
    }

    public SeriesLabelOptions setConnectorNeighbourDistance(int connectorNeighbourDistance) {
        this.connectorNeighbourDistance = connectorNeighbourDistance;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public SeriesLabelOptions setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getMaxFontSize() {
        return this.maxFontSize = getInstanceOf(Integer.class, this.maxFontSize);
    }

    public SeriesLabelOptions setMaxFontSize(Integer maxFontSize) {
        this.maxFontSize = maxFontSize;
        return this;
    }

    public Integer getMinFontSize() {
        return this.minFontSize = getInstanceOf(Integer.class, this.minFontSize);
    }

    public SeriesLabelOptions setMinFontSize(Integer minFontSize) {
        this.minFontSize = minFontSize;
        return this;
    }

    public Boolean getOnArea() {
        return this.onArea = getInstanceOf(Boolean.class, this.onArea);
    }

    public SeriesLabelOptions setOnArea(Boolean onArea) {
        this.onArea = onArea;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public SeriesLabelOptions setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.boxesToAvoid);
        hash = 17 * hash + Objects.hashCode(this.connectorAllowed);
        hash = 17 * hash + Objects.hashCode(this.connectorNeighbourDistance);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.maxFontSize);
        hash = 17 * hash + Objects.hashCode(this.minFontSize);
        hash = 17 * hash + Objects.hashCode(this.onArea);
        hash = 17 * hash + Objects.hashCode(this.style);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "boxesToAvoid:" + boxesToAvoid
                + ", connectorAllowed:" + connectorAllowed
                + ", connectorNeighbourDistance:" + connectorNeighbourDistance
                + ", enabled:" + enabled
                + ", maxFontSize:" + maxFontSize
                + ", minFontSize:" + minFontSize
                + ", onArea:" + onArea
                + ", style:" + style
                + '}';
    }


}