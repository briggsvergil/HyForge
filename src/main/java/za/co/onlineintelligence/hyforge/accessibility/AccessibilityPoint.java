package za.co.onlineintelligence.hyforge.accessibility;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Point HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class AccessibilityPoint implements Serializable, Exportable {


    public AccessibilityPoint() {
    }

    /**
     * Date format to use for points on datetime axes when describing them
     * to screen reader users.
     * <p>
     * Defaults to the same format as in tooltip.
     * <p>
     * For an overview of the replacement codes, see
     * [dateFormat](/class-reference/Highcharts#dateFormat).
     *
     * @since 8.0.0
     */
    private String dateFormat;

    /**
     * Formatter function to determine the date/time format used with
     * points on datetime axes when describing them to screen reader users.
     * Receives one argument, `point`, referring to the point to describe.
     * Should return a date format string compatible with
     * [dateFormat](/class-reference/Highcharts#dateFormat).
     *
     * @since 8.0.0
     */
    private HighchartsCallbackFunction dateFormatter;

    /**
     * Formatter function to use instead of the default for point
     * descriptions.
     * Receives one argument, `point`, referring to the point to describe.
     * Should return a string with the description of the point for a screen
     * reader user. If `false` is returned, the default formatter will be
     * used for that point.
     *
     * @since 8.0.0
     */
    private HighchartsCallbackFunction descriptionFormatter;

    /**
     * Decimals to use for the values in the point descriptions. Uses
     * [tooltip.valueDecimals](#tooltip.valueDecimals) if not defined.
     *
     * @since 8.0.0
     */
    private int valueDecimals;

    /**
     * Prefix to add to the values in the point descriptions. Uses
     * [tooltip.valuePrefix](#tooltip.valuePrefix) if not defined.
     *
     * @since 8.0.0
     */
    private String valuePrefix;

    /**
     * Suffix to add to the values in the point descriptions. Uses
     * [tooltip.valueSuffix](#tooltip.valueSuffix) if not defined.
     *
     * @since 8.0.0
     */
    private String valueSuffix;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public String getDateFormat() {
        return this.dateFormat = getInstanceOf(String.class, this.dateFormat);
    }

    public AccessibilityPoint setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    public HighchartsCallbackFunction getDateFormatter() {
        return this.dateFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.dateFormatter);
    }

    public AccessibilityPoint setDateFormatter(HighchartsCallbackFunction dateFormatter) {
        this.dateFormatter = dateFormatter;
        return this;
    }

    public HighchartsCallbackFunction getDescriptionFormatter() {
        return this.descriptionFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.descriptionFormatter);
    }

    public AccessibilityPoint setDescriptionFormatter(HighchartsCallbackFunction descriptionFormatter) {
        this.descriptionFormatter = descriptionFormatter;
        return this;
    }

    public int getValueDecimals() {
        return this.valueDecimals = getInstanceOf(int.class, this.valueDecimals);
    }

    public AccessibilityPoint setValueDecimals(int valueDecimals) {
        this.valueDecimals = valueDecimals;
        return this;
    }

    public String getValuePrefix() {
        return this.valuePrefix = getInstanceOf(String.class, this.valuePrefix);
    }

    public AccessibilityPoint setValuePrefix(String valuePrefix) {
        this.valuePrefix = valuePrefix;
        return this;
    }

    public String getValueSuffix() {
        return this.valueSuffix = getInstanceOf(String.class, this.valueSuffix);
    }

    public AccessibilityPoint setValueSuffix(String valueSuffix) {
        this.valueSuffix = valueSuffix;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.dateFormat);
        hash = 17 * hash + Objects.hashCode(this.dateFormatter);
        hash = 17 * hash + Objects.hashCode(this.descriptionFormatter);
        hash = 17 * hash + Objects.hashCode(this.valueDecimals);
        hash = 17 * hash + Objects.hashCode(this.valuePrefix);
        hash = 17 * hash + Objects.hashCode(this.valueSuffix);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "dateFormat:" + dateFormat
                + ", dateFormatter:" + dateFormatter
                + ", descriptionFormatter:" + descriptionFormatter
                + ", valueDecimals:" + valueDecimals
                + ", valuePrefix:" + valuePrefix
                + ", valueSuffix:" + valueSuffix
                + '}';
    }


}
