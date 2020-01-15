package za.co.onlineintelligence.hyforge.accessibility;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

/**
 * Series  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class SeriesAccessibilityOptions implements Serializable, DrosteDeflater {


    public SeriesAccessibilityOptions() {
    }

    /**
     * Whether or not to add series descriptions to charts with a single
     * series.
     *
     * @since 8.0.0
     */
    private Boolean describeSingleSeries;

    /**
     * Formatter function to use instead of the default for series
     * descriptions. Receives one argument, `series`, referring to the
     * series to describe. Should return a string with the description
     * of the series for a screen reader user. If `false` is returned,
     * the default formatter will be used for that series.
     *
     * @since 8.0.0
     */
    private HighchartsCallbackFunction descriptionFormatter;

    /**
     * When a series contains more points than this, we no longer expose
     * information about individual points to screen readers.
     * <p>
     * Set to `false` to disable.
     * TODO: Implement ability to set false
     *
     * @since 8.0.0
     */
    private Integer pointDescriptionEnabledThreshold;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public Boolean getDescribeSingleSeries() {
        return this.describeSingleSeries;
    }

    public SeriesAccessibilityOptions setDescribeSingleSeries(Boolean describeSingleSeries) {
        this.describeSingleSeries = describeSingleSeries;
        return this;
    }

    public HighchartsCallbackFunction getDescriptionFormatter() {
        return this.descriptionFormatter;
    }

    public SeriesAccessibilityOptions setDescriptionFormatter(HighchartsCallbackFunction descriptionFormatter) {
        this.descriptionFormatter = descriptionFormatter;
        return this;
    }

    public Integer getPointDescriptionEnabledThreshold() {
        return this.pointDescriptionEnabledThreshold;
    }

    public SeriesAccessibilityOptions setPointDescriptionEnabledThreshold(Integer pointDescriptionEnabledThreshold) {
        this.pointDescriptionEnabledThreshold = pointDescriptionEnabledThreshold;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.describeSingleSeries);
        hash = 17 * hash + Objects.hashCode(this.descriptionFormatter);
        hash = 17 * hash + Objects.hashCode(this.pointDescriptionEnabledThreshold);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "describeSingleSeries:" + describeSingleSeries
                + ", descriptionFormatter:" + descriptionFormatter
                + ", pointDescriptionEnabledThreshold:" + pointDescriptionEnabledThreshold
                + '}';
    }


}
