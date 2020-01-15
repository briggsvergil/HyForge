/*
 */
package za.co.onlineintelligence.hyforge.axis;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * AxisEvents HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class AxisEvents implements Serializable, DrosteDeflater {

    public AxisEvents() {
    }

    /**
     * An event fired after the breaks have rendered.
     *
     * @since 4.1.0
     */
    private HighchartsCallbackFunction afterBreaks;

    /**
     * As opposed to the `setExtremes` event, this event fires after the final
     * min and max values are computed and corrected for `minRange`.
     * <p>
     * Fires when the minimum and maximum is set for the axis, either by calling
     * the `.setExtremes()` method or by selecting an area in the chart. One
     * parameter, `event`, is passed to the function, containing common event
     * information.
     * <p>
     * The new user set minimum and maximum values can be found by `event.min`
     * and `event.max`. These reflect the axis minimum and maximum in axis
     * values. The actual data extremes are found in `event.dataMin` and
     * `event.dataMax`.
     *
     * @since 2.3.0
     */
    private HighchartsCallbackFunction afterSetExtremes;

    /**
     * An event fired when a break from this axis occurs on a point.
     *
     * @since 4.1.0
     */
    private HighchartsCallbackFunction pointBreak;

    /**
     * An event fired when a point falls inside a break from this axis.
     */
    private HighchartsCallbackFunction pointInBreak;

    /**
     * Fires when the minimum and maximum is set for the axis, either by calling
     * the `.setExtremes()` method or by selecting an area in the chart. One
     * parameter, `event`, is passed to the function, containing common event
     * information.
     * <p>
     * The new user set minimum and maximum values can be found by `event.min`
     * and `event.max`. These reflect the axis minimum and maximum in data
     * values. When an axis is zoomed all the way out from the "Reset zoom"
     * button, `event.min` and `event.max` are null, and the new extremes are
     * set based on `this.dataMin` and `this.dataMax`.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction setExtremes;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsCallbackFunction getAfterBreaks() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.afterBreaks);
    }

    public AxisEvents setAfterBreaks(HighchartsCallbackFunction afterBreaks) {
        this.afterBreaks = afterBreaks;
        return this;
    }

    public HighchartsCallbackFunction getAfterSetExtremes() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.afterSetExtremes);
    }

    public AxisEvents setAfterSetExtremes(HighchartsCallbackFunction afterSetExtremes) {
        this.afterSetExtremes = afterSetExtremes;
        return this;
    }

    public HighchartsCallbackFunction getPointBreak() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.pointBreak);
    }

    public AxisEvents setPointBreak(HighchartsCallbackFunction pointBreak) {
        this.pointBreak = pointBreak;
        return this;
    }

    public HighchartsCallbackFunction getPointInBreak() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.pointInBreak);
    }

    public AxisEvents setPointInBreak(HighchartsCallbackFunction pointInBreak) {
        this.pointInBreak = pointInBreak;
        return this;
    }

    public HighchartsCallbackFunction getSetExtremes() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.setExtremes);
    }

    public AxisEvents setSetExtremes(HighchartsCallbackFunction setExtremes) {
        this.setExtremes = setExtremes;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.afterBreaks);
        hash = 17 * hash + Objects.hashCode(this.afterSetExtremes);
        hash = 17 * hash + Objects.hashCode(this.pointBreak);
        hash = 17 * hash + Objects.hashCode(this.pointInBreak);
        hash = 17 * hash + Objects.hashCode(this.setExtremes);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "afterBreaks:" + afterBreaks
                + ", afterSetExtremes:" + afterSetExtremes
                + ", pointBreak:" + pointBreak
                + ", pointInBreak:" + pointInBreak
                + ", setExtremes:" + setExtremes
                + '}';
    }

}
