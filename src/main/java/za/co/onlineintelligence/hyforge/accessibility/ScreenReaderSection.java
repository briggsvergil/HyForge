package za.co.onlineintelligence.hyforge.accessibility;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * ScreenReaderSection HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ScreenReaderSection implements Serializable, Exportable {


    public ScreenReaderSection() {
    }

    /**
     * Format for the screen reader information region after the chart.
     * Analogous to [beforeChartFormat](#accessibility.screenReaderSection.beforeChartFormat).
     *
     * @since 8.0.0
     */
    private String afterChartFormat;

    /**
     * A formatter function to create the HTML contents of the hidden
     * screen reader information region after the chart. Analogous to
     * [beforeChartFormatter](#accessibility.screenReaderSection.beforeChartFormatter).
     *
     * @since 8.0.0
     */
    private HighchartsCallbackFunction afterChartFormatter;

    /**
     * Date format to use to describe range of datetime axes.
     * <p>
     * For an overview of the replacement codes, see
     * [dateFormat](/class-reference/Highcharts#dateFormat).
     *
     * @since 8.0.0
     */
    private String axisRangeDateFormat;

    /**
     * Format for the screen reader information region before the chart.
     * Supported HTML tags are `<h1-7>`, `<p>`, `<div>`, `<a>`, and
     * `<button>`. Attributes are not supported, except for id on
     * `<div>`, `<a>`, and `<button>`. Id is required on `<a>` and
     * `<button>` in the format `<tag id="abcd">`. Numbers, lower- and
     * uppercase letters, "-" and "#" are valid characters in IDs.
     *
     * @since 8.0.0
     */
    private String beforeChartFormat;

    /**
     * A formatter function to create the HTML contents of the hidden
     * screen reader information region before the chart. Receives one
     * argument, `chart`, referring to the chart object. Should return a
     * string with the HTML content of the region. By default this
     * returns an automatic description of the chart based on
     * [beforeChartFormat](#accessibility.screenReaderSection.beforeChartFormat).
     *
     * @since 8.0.0
     */
    private HighchartsCallbackFunction beforeChartFormatter;

    /**
     * Function to run upon clicking the "View as Data Table" link in
     * the screen reader region.
     * <p>
     * By default Highcharts will insert and set focus to a data table
     * representation of the chart.
     *
     * @since 8.0.0
     */
    private HighchartsCallbackFunction onViewDataTableClick;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public String getAfterChartFormat() {
        return this.afterChartFormat = getInstanceOf(String.class, this.afterChartFormat);
    }

    public ScreenReaderSection setAfterChartFormat(String afterChartFormat) {
        this.afterChartFormat = afterChartFormat;
        return this;
    }

    public HighchartsCallbackFunction getAfterChartFormatter() {
        return this.afterChartFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.afterChartFormatter);
    }

    public ScreenReaderSection setAfterChartFormatter(HighchartsCallbackFunction afterChartFormatter) {
        this.afterChartFormatter = afterChartFormatter;
        return this;
    }

    public String getAxisRangeDateFormat() {
        return this.axisRangeDateFormat = getInstanceOf(String.class, this.axisRangeDateFormat);
    }

    public ScreenReaderSection setAxisRangeDateFormat(String axisRangeDateFormat) {
        this.axisRangeDateFormat = axisRangeDateFormat;
        return this;
    }

    public String getBeforeChartFormat() {
        return this.beforeChartFormat = getInstanceOf(String.class, this.beforeChartFormat);
    }

    public ScreenReaderSection setBeforeChartFormat(String beforeChartFormat) {
        this.beforeChartFormat = beforeChartFormat;
        return this;
    }

    public HighchartsCallbackFunction getBeforeChartFormatter() {
        return this.beforeChartFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.beforeChartFormatter);
    }

    public ScreenReaderSection setBeforeChartFormatter(HighchartsCallbackFunction beforeChartFormatter) {
        this.beforeChartFormatter = beforeChartFormatter;
        return this;
    }

    public HighchartsCallbackFunction getOnViewDataTableClick() {
        return this.onViewDataTableClick = getInstanceOf(HighchartsCallbackFunction.class, this.onViewDataTableClick);
    }

    public ScreenReaderSection setOnViewDataTableClick(HighchartsCallbackFunction onViewDataTableClick) {
        this.onViewDataTableClick = onViewDataTableClick;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.afterChartFormat);
        hash = 17 * hash + Objects.hashCode(this.afterChartFormatter);
        hash = 17 * hash + Objects.hashCode(this.axisRangeDateFormat);
        hash = 17 * hash + Objects.hashCode(this.beforeChartFormat);
        hash = 17 * hash + Objects.hashCode(this.beforeChartFormatter);
        hash = 17 * hash + Objects.hashCode(this.onViewDataTableClick);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "afterChartFormat:" + afterChartFormat
                + ", afterChartFormatter:" + afterChartFormatter
                + ", axisRangeDateFormat:" + axisRangeDateFormat
                + ", beforeChartFormat:" + beforeChartFormat
                + ", beforeChartFormatter:" + beforeChartFormatter
                + ", onViewDataTableClick:" + onViewDataTableClick
                + '}';
    }

}
