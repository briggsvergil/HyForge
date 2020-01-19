package za.co.onlineintelligence.hyforge.boost;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Boost  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Boost implements Serializable, Exportable {


    public Boost() {
    }

    /**
     * If set to true, the whole chart will be boosted if one of the series
     * crosses its threshold, and all the series can be boosted.
     */
    private Boolean allowForce;

    /**
     * Debugging options for boost.
     * Useful for benchmarking, and general timing.
     */
    private BoostDebug debug;

    /**
     * Enable or disable boost on a chart.
     */
    private Boolean enabled;

    /**
     * Set the series threshold for when the boost should kick in globally.
     * <p>
     * Setting to e.g. 20 will cause the whole chart to enter boost mode
     * if there are 20 or more series active. When the chart is in boost mode,
     * every series in it will be rendered to a common canvas. This offers
     * a significant speed improvment in charts with a very high
     * amount of series.
     */
    private Integer seriesThreshold;

    /**
     * Enable or disable GPU translations. GPU translations are faster than doing
     * the translation in JavaScript.
     * <p>
     * This option may cause rendering issues with certain datasets.
     * Namely, if your dataset has large numbers with small increments (such as
     * timestamps), it won't work correctly. This is due to floating point
     * precission.
     */
    private Boolean useGPUTranslations;

    /**
     * Enable or disable pre-allocation of vertex buffers.
     * <p>
     * Enabling this will make it so that the binary data arrays required for
     * storing the series data will be allocated prior to transforming the data
     * to a WebGL-compatible format.
     * <p>
     * This saves a copy operation on the order of O(n) and so is significantly more
     * performant. However, this is currently an experimental option, and may cause
     * visual artifacts with some datasets.
     * <p>
     * As such, care should be taken when using this setting to make sure that
     * it doesn't cause any rendering glitches with the given use-case.
     */
    private Boolean usePreallocated;

    /*
        Getters and Builder-Style Setters
    */
    public Boolean getAllowForce() {
        return this.allowForce = getInstanceOf(Boolean.class, this.allowForce);
    }

    public Boost setAllowForce(Boolean allowForce) {
        this.allowForce = allowForce;
        return this;
    }

    public BoostDebug getDebug() {
        return this.debug = getInstanceOf(BoostDebug.class, this.debug);
    }

    public Boost setDebug(BoostDebug debug) {
        this.debug = debug;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled = getInstanceOf(Boolean.class, this.enabled);
    }

    public Boost setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getSeriesThreshold() {
        return this.seriesThreshold = getInstanceOf(Integer.class, this.seriesThreshold);
    }

    public Boost setSeriesThreshold(Integer seriesThreshold) {
        this.seriesThreshold = seriesThreshold;
        return this;
    }

    public Boolean getUseGPUTranslations() {
        return this.useGPUTranslations = getInstanceOf(Boolean.class, this.useGPUTranslations);
    }

    public Boost setUseGPUTranslations(Boolean useGPUTranslations) {
        this.useGPUTranslations = useGPUTranslations;
        return this;
    }

    public Boolean getUsePreallocated() {
        return this.usePreallocated = getInstanceOf(Boolean.class, this.usePreallocated);
    }

    public Boost setUsePreallocated(Boolean usePreallocated) {
        this.usePreallocated = usePreallocated;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.allowForce);
        hash = 17 * hash + Objects.hashCode(this.debug);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.seriesThreshold);
        hash = 17 * hash + Objects.hashCode(this.useGPUTranslations);
        hash = 17 * hash + Objects.hashCode(this.usePreallocated);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "allowForce:" + allowForce
                + ", debug:" + debug
                + ", enabled:" + enabled
                + ", seriesThreshold:" + seriesThreshold
                + ", useGPUTranslations:" + useGPUTranslations
                + ", usePreallocated:" + usePreallocated
                + '}';
    }


}