package za.co.onlineintelligence.hyforge.axis;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.*;
import za.co.onlineintelligence.hyforge.series.HighchartsPoint;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * Crosshair HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Crosshair implements Serializable, DrosteDeflater {

    public Crosshair() {
    }

    /**
     * A class name for the crosshair, especially as a hook for styling.
     *
     * @since 5.0.0
     */
    private String className;

    /**
     * The color of the crosshair. Defaults to `#cccccc` for numeric and
     * datetime axes, and `rgba(204,214,235,0.25)` for category axes, where the
     * crosshair by default highlights the whole category.
     *
     * @since 4.1.0
     */
    private HighchartsColor color;

    /**
     * The dash style for the crosshair. See
     * [plotOptions.series.dashStyle](#plotOptions.series.dashStyle) for
     * possible values.
     *
     * @since 4.1.0
     */
    private HighchartsDashStyleValue dashStyle;

    /**
     * A label on the axis next to the crosshair.
     * <p>
     * In styled mode, the label is styled with the
     * `.highcharts-crosshair-label` class.
     *
     * @since 4.1.0
     */
    private CrosshairLabel label;

    /**
     * Whether the crosshair should snap to the point or follow the pointer
     * independent of points.
     *
     * @since 4.1.0
     */
    private boolean snap;

    /**
     * The pixel width of the crosshair. Defaults to 1 for numeric or datetime
     * axes, and for one category width for category axes.
     *
     * @since 4.1.0
     */
    private int width;

    /**
     * The Z index of the crosshair. Higher Z indices allow drawing the
     * crosshair on top of the series or behind the grid lines.
     *
     * @since 4.1.0
     */
    private int zIndex;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public String getClassName() {
        return getInstanceOf(String.class, this.className);
    }

    public Crosshair setClassName(String className) {
        this.className = className;
        return this;
    }

    public HighchartsColor getColor() {
        return getInstanceOf(HighchartsColor.class, this.color);
    }

    public Crosshair setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public Crosshair setColor(String colorString) {
        this.color = new HighchartsColorString(colorString);
        return this;
    }

    public HighchartsDashStyleValue getDashStyle() {
        return getInstanceOf(HighchartsDashStyleValue.class, this.dashStyle);
    }

    public Crosshair setDashStyle(HighchartsDashStyleValue dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public CrosshairLabel getLabel() {
        return getInstanceOf(CrosshairLabel.class, this.label);
    }

    public Crosshair setLabel(CrosshairLabel label) {
        this.label = label;
        return this;
    }

    public boolean getSnap() {
        return getInstanceOf(boolean.class, this.snap);
    }

    public Crosshair setSnap(boolean snap) {
        this.snap = snap;
        return this;
    }

    public int getWidth() {
        return getInstanceOf(int.class, this.width);
    }

    public Crosshair setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getZIndex() {
        return getInstanceOf(int.class, this.zIndex);
    }

    public Crosshair setZIndex(int zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.dashStyle);
        hash = 17 * hash + Objects.hashCode(this.label);
        hash = 17 * hash + Objects.hashCode(this.snap);
        hash = 17 * hash + Objects.hashCode(this.width);
        hash = 17 * hash + Objects.hashCode(this.zIndex);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "className:" + className
                + ", color:" + color
                + ", dashStyle:" + dashStyle
                + ", label:" + label
                + ", snap:" + snap
                + ", width:" + width
                + ", zIndex:" + zIndex
                + '}';
    }

}
