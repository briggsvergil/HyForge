package za.co.onlineintelligence.hyforge.drilldown;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;
import za.co.onlineintelligence.hyforge.plotoptions.HighchartsSeriesPlotOptions;


/**
 * Drilldown  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Drilldown implements Serializable, DrosteDeflater {


    public Drilldown() {
    }

    /**
     * Additional styles to apply to the X axis label for a point that
     * has drilldown data. By default it is underlined and blue to invite
     * to interaction.
     * <p>
     * In styled mode, active label styles can be set with the
     * `.highcharts-drilldown-axis-label` class.
     *
     * @since 3.0.8
     */
    private HighchartsCSS activeAxisLabelStyle;

    /**
     * Additional styles to apply to the data label of a point that has
     * drilldown data. By default it is underlined and blue to invite to
     * interaction.
     * <p>
     * In styled mode, active data label styles can be applied with the
     * `.highcharts-drilldown-data-label` class.
     *
     * @since 3.0.8
     */
    private HighchartsCSS activeDataLabelStyle;

    /**
     * When this option is false, clicking a single point will drill down
     * all points in the same category, equivalent to clicking the X axis
     * label.
     *
     * @since 4.1.7
     */
    private Boolean allowPointDrilldown;

    /**
     * Set the animation for all drilldown animations. Animation of a drilldown
     * occurs when drilling between a column point and a column series,
     * or a pie slice and a full pie series. Drilldown can still be used
     * between series and points of different types, but animation will
     * not occur.
     * <p>
     * The animation can either be set as a boolean or a configuration
     * object. If `true`, it will use the 'swing' jQuery easing and a duration
     * of 500 ms. If used as a configuration object, the following properties
     * are supported:
     * <p>
     * - `duration`: The duration of the animation in milliseconds.
     * <p>
     * - `easing`: A string reference to an easing function set on the `Math`
     * object. See
     * [the easing demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/).
     *
     * @since 3.0.8
     */
    private Integer animation;

    /**
     * Options for the drill up button that appears when drilling down on a
     * series. The text for the button is defined in
     * [lang.drillUpText](#lang.drillUpText).
     *
     * @since 3.0.8
     */
    private DrillUpButton drillUpButton;

    /**
     * An array of series configurations for the drill down. Each series
     * configuration uses the same syntax as the [series](#series) option set.
     * These drilldown series are hidden by default. The drilldown series is
     * linked to the parent series' point by its `id`.
     *
     * @since 3.0.8
     */
    private HighchartsSeriesPlotOptions[] series;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsCSS getActiveAxisLabelStyle() {
        return this.activeAxisLabelStyle;
    }

    public Drilldown setActiveAxisLabelStyle(HighchartsCSS activeAxisLabelStyle) {
        this.activeAxisLabelStyle = activeAxisLabelStyle;
        return this;
    }

    public HighchartsCSS getActiveDataLabelStyle() {
        return this.activeDataLabelStyle;
    }

    public Drilldown setActiveDataLabelStyle(HighchartsCSS activeDataLabelStyle) {
        this.activeDataLabelStyle = activeDataLabelStyle;
        return this;
    }

    public Boolean getAllowPointDrilldown() {
        return this.allowPointDrilldown;
    }

    public Drilldown setAllowPointDrilldown(Boolean allowPointDrilldown) {
        this.allowPointDrilldown = allowPointDrilldown;
        return this;
    }

    public Integer getAnimation() {
        return this.animation;
    }

    public Drilldown setAnimation(Integer animation) {
        this.animation = animation;
        return this;
    }

    public DrillUpButton getDrillUpButton() {
        return this.drillUpButton;
    }

    public Drilldown setDrillUpButton(DrillUpButton drillUpButton) {
        this.drillUpButton = drillUpButton;
        return this;
    }

    public HighchartsSeriesPlotOptions[] getSeries() {
        return this.series;
    }

    public Drilldown setSeries(HighchartsSeriesPlotOptions[] series) {
        this.series = series;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.activeAxisLabelStyle);
        hash = 17 * hash + Objects.hashCode(this.activeDataLabelStyle);
        hash = 17 * hash + Objects.hashCode(this.allowPointDrilldown);
        hash = 17 * hash + Objects.hashCode(this.animation);
        hash = 17 * hash + Objects.hashCode(this.drillUpButton);
        hash = 17 * hash + Objects.hashCode(this.series);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "activeAxisLabelStyle:" + activeAxisLabelStyle
                + ", activeDataLabelStyle:" + activeDataLabelStyle
                + ", allowPointDrilldown:" + allowPointDrilldown
                + ", animation:" + animation
                + ", drillUpButton:" + drillUpButton
                + ", series:" + series
                + '}';
    }


}