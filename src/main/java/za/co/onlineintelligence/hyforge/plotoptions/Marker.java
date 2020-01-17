package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * ColorAxisMarker HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Marker implements Serializable, DrosteDeflater {


    public Marker() {
    }

    /**
     * Enable or disable the point marker. If `undefined`, the markers
     * are hidden when the data is dense, and shown for more widespread
     * data points.
     */
    private Boolean enabled;

    /**
     * The threshold for how dense the point markers should be before
     * they are hidden, given that `enabled` is not defined. The number
     * indicates the horizontal distance between the two closest points
     * in the series, as multiples of the `marker.radius`. In other
     * words, the default value of 2 means points are hidden if
     * overlapping horizontally.
     *
     * @since 6.0.5
     */
    private Integer enabledThreshold;

    /**
     * The fill color of the point marker. When `undefined`, the series'
     * or point's color is used.
     */
    private HighchartsColor fillColor;

    /**
     * Image markers only. Set the image width explicitly. When using
     * this option, a `width` must also be set.
     *
     * @since 4.0.4
     */
    private Integer height;

    /**
     * The color of the point marker's outline. When `undefined`, the
     * series' or point's color is used.
     */
    private HighchartsColor lineColor;

    /**
     * The width of the point marker's outline.
     */
    private Integer lineWidth;

    /**
     * The radius of the point marker.
     */
    private Integer radius;

    /**
     * States for a single point marker.
     */
    private States states;

    /**
     * A predefined shape or symbol for the marker. When undefined, the
     * symbol is pulled from options.symbols. Other possible values are
     * `'circle'`, `'square'`,`'diamond'`, `'triangle'` and
     * `'triangle-down'`.
     * <p>
     * Additionally, the URL to a graphic can be given on this form:
     * `'url(graphic.png)'`. Note that for the image to be applied to
     * exported charts, its URL needs to be accessible by the export
     * server.
     * <p>
     * Custom callbacks for symbol path generation can also be added to
     * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then
     * used by its method name, as shown in the demo.
     */
    private String symbol;

    /**
     * Image markers only. Set the image width explicitly. When using
     * this option, a `height` must also be set.
     *
     * @since 4.0.4
     */
    private Integer width;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public Marker setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public int getEnabledThreshold() {
        return this.enabledThreshold = getInstanceOf(int.class, this.enabledThreshold);
    }

    public Marker setEnabledThreshold(int enabledThreshold) {
        this.enabledThreshold = enabledThreshold;
        return this;
    }

    public HighchartsColor getFillColor() {
        return this.fillColor = getInstanceOf(HighchartsColor.class, this.fillColor);
    }

    public Marker setFillColor(HighchartsColor fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public int getHeight() {
        return this.height = getInstanceOf(int.class, this.height);
    }

    public Marker setHeight(int height) {
        this.height = height;
        return this;
    }

    public HighchartsColor getLineColor() {
        return this.lineColor = getInstanceOf(HighchartsColor.class, this.lineColor);
    }

    public Marker setLineColor(HighchartsColor lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public int getLineWidth() {
        return this.lineWidth = getInstanceOf(int.class, this.lineWidth);
    }

    public Marker setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public int getRadius() {
        return this.radius = getInstanceOf(int.class, this.radius);
    }

    public Marker setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    public States getStates() {
        return this.states = getInstanceOf(States.class, this.states);
    }

    public Marker setStates(States states) {
        this.states = states;
        return this;
    }

    public String getSymbol() {
        return this.symbol = getInstanceOf(String.class, this.symbol);
    }

    public Marker setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public int getWidth() {
        return this.width = getInstanceOf(int.class, this.width);
    }

    public Marker setWidth(int width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.enabledThreshold);
        hash = 17 * hash + Objects.hashCode(this.fillColor);
        hash = 17 * hash + Objects.hashCode(this.height);
        hash = 17 * hash + Objects.hashCode(this.lineColor);
        hash = 17 * hash + Objects.hashCode(this.lineWidth);
        hash = 17 * hash + Objects.hashCode(this.radius);
        hash = 17 * hash + Objects.hashCode(this.states);
        hash = 17 * hash + Objects.hashCode(this.symbol);
        hash = 17 * hash + Objects.hashCode(this.width);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "enabled:" + enabled
                + ", enabledThreshold:" + enabledThreshold
                + ", fillColor:" + fillColor
                + ", height:" + height
                + ", lineColor:" + lineColor
                + ", lineWidth:" + lineWidth
                + ", radius:" + radius
                + ", states:" + states
                + ", symbol:" + symbol
                + ", width:" + width
                + '}';
    }


}
