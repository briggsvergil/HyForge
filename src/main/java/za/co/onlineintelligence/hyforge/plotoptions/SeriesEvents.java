package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;


/**
 * AnnotationsEvents HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class SeriesEvents implements Serializable {


    public SeriesEvents() {
    }

    /**
     * Fires after the series has finished its initial animation, or in case
     * animation is disabled, immediately as the series is displayed.
     *
     *
     * @since 4.0.0
     */
    private HighchartsCallbackFunction afterAnimate;

    /**
     * Fires when the checkbox next to the series' name in the legend is
     * clicked. One parameter, `event`, is passed to the function. The state
     * of the checkbox is found by `event.checked`. The checked item is
     * found by `event.item`. Return `false` to prevent the default action
     * which is to toggle the select state of the series.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction checkboxClick;

    /**
     * Fires when the series is clicked. One parameter, `event`, is passed
     * to the function, containing common event information. Additionally,
     * `event.point` holds a pointer to the nearest point on the graph.
     */
    private HighchartsCallbackFunction click;

    /**
     * Fires when the series is hidden after chart generation time, either
     * by clicking the legend item or by calling `.hide()`.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction hide;

    /**
     * Fires when the legend item belonging to the series is clicked. One
     * parameter, `event`, is passed to the function. The default action
     * is to toggle the visibility of the series. This can be prevented
     * by returning `false` or calling `event.preventDefault()`.
     */
    private HighchartsCallbackFunction legendItemClick;

    /**
     * Fires when the mouse leaves the graph. One parameter, `event`, is
     * passed to the function, containing common event information. If the
     * [stickyTracking](#plotOptions.series) option is true, `mouseOut`
     * doesn't happen before the mouse enters another graph or leaves the
     * plot area.
     */
    private HighchartsCallbackFunction mouseOut;

    /**
     * Fires when the mouse enters the graph. One parameter, `event`, is
     * passed to the function, containing common event information.
     */
    private HighchartsCallbackFunction mouseOver;

    /**
     * Fires when the series is shown after chart generation time, either
     * by clicking the legend item or by calling `.show()`.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction show;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsCallbackFunction getAfterAnimate() {
        return this.afterAnimate;
    }

    public SeriesEvents setAfterAnimate(HighchartsCallbackFunction afterAnimate) {
        this.afterAnimate = afterAnimate;
        return this;
    }

    public HighchartsCallbackFunction getCheckboxClick() {
        return this.checkboxClick;
    }

    public SeriesEvents setCheckboxClick(HighchartsCallbackFunction checkboxClick) {
        this.checkboxClick = checkboxClick;
        return this;
    }

    public HighchartsCallbackFunction getClick() {
        return this.click;
    }

    public SeriesEvents setClick(HighchartsCallbackFunction click) {
        this.click = click;
        return this;
    }

    public HighchartsCallbackFunction getHide() {
        return this.hide;
    }

    public SeriesEvents setHide(HighchartsCallbackFunction hide) {
        this.hide = hide;
        return this;
    }

    public HighchartsCallbackFunction getLegendItemClick() {
        return this.legendItemClick;
    }

    public SeriesEvents setLegendItemClick(HighchartsCallbackFunction legendItemClick) {
        this.legendItemClick = legendItemClick;
        return this;
    }

    public HighchartsCallbackFunction getMouseOut() {
        return this.mouseOut;
    }

    public SeriesEvents setMouseOut(HighchartsCallbackFunction mouseOut) {
        this.mouseOut = mouseOut;
        return this;
    }

    public HighchartsCallbackFunction getMouseOver() {
        return this.mouseOver;
    }

    public SeriesEvents setMouseOver(HighchartsCallbackFunction mouseOver) {
        this.mouseOver = mouseOver;
        return this;
    }

    public HighchartsCallbackFunction getShow() {
        return this.show;
    }

    public SeriesEvents setShow(HighchartsCallbackFunction show) {
        this.show = show;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.afterAnimate);
        hash = 17 * hash + Objects.hashCode(this.checkboxClick);
        hash = 17 * hash + Objects.hashCode(this.click);
        hash = 17 * hash + Objects.hashCode(this.hide);
        hash = 17 * hash + Objects.hashCode(this.legendItemClick);
        hash = 17 * hash + Objects.hashCode(this.mouseOut);
        hash = 17 * hash + Objects.hashCode(this.mouseOver);
        hash = 17 * hash + Objects.hashCode(this.show);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "afterAnimate:" + afterAnimate
                + ", checkboxClick:" + checkboxClick
                + ", click:" + click
                + ", hide:" + hide
                + ", legendItemClick:" + legendItemClick
                + ", mouseOut:" + mouseOut
                + ", mouseOver:" + mouseOver
                + ", show:" + show
                + '}';
    }


}