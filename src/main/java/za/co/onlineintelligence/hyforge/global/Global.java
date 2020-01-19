package za.co.onlineintelligence.hyforge.global;

import java.io.Serializable;
import java.util.Objects;

import com.google.gson.JsonElement;
import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.DrosteSeperation;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Global  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Global implements Serializable, Exportable, DrosteSeperation {


    public Global() {
    }

    /**
     * This option is deprecated since v6.0.5. Instead, use
     * [time.Date](#time.Date) that supports individual time settings
     * per chart.
     */
    private HighchartsCallbackFunction Date;

    /**
     * Path to the pattern image required by VML browsers in order to
     * draw radial gradients.
     *
     * @since 2.3.0
     */
    private String VMLRadialGradientURL;

    /**
     * _Canvg rendering for Android 2.x is removed as of Highcharts 5.0\.
     * Use the [libURL](#exporting.libURL) option to configure exporting._
     * <p>
     * The URL to the additional file to lazy load for Android 2.x devices.
     * These devices don't support SVG, so we download a helper file that
     * contains [canvg](http://code.google.com/p/canvg/), its dependency
     * rbcolor, and our own CanVG Renderer class. To avoid hotlinking to
     * our site, you can install canvas-tools.js on your own server and
     * change this option accordingly.
     */
    private String canvasToolsURL;

    /**
     * This option is deprecated since v6.0.5. Instead, use
     * [time.getTimezoneOffset](#time.getTimezoneOffset) that supports
     * individual time settings per chart.
     */
    private HighchartsCallbackFunction getTimezoneOffset;

    /**
     * This option is deprecated since v6.0.5. Instead, use
     * [time.timezone](#time.timezone) that supports individual time
     * settings per chart.
     */
    private String timezone;

    /**
     * This option is deprecated since v6.0.5. Instead, use
     * [time.timezoneOffset](#time.timezoneOffset) that supports individual
     * time settings per chart.
     */
    private Integer timezoneOffset;

    /**
     * This option is deprecated since v6.0.5. Instead, use
     * [time.useUTC](#time.useUTC) that supports individual time settings
     * per chart.
     */
    private Boolean useUTC;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsCallbackFunction getDate() {
        return this.Date = getInstanceOf(HighchartsCallbackFunction.class, this.Date);
    }

    public Global setDate(HighchartsCallbackFunction Date) {
        this.Date = Date;
        return this;
    }

    public String getVMLRadialGradientURL() {
        return this.VMLRadialGradientURL = getInstanceOf(String.class, this.VMLRadialGradientURL);
    }

    public Global setVMLRadialGradientURL(String VMLRadialGradientURL) {
        this.VMLRadialGradientURL = VMLRadialGradientURL;
        return this;
    }

    public String getCanvasToolsURL() {
        return this.canvasToolsURL = getInstanceOf(String.class, this.canvasToolsURL);
    }

    public Global setCanvasToolsURL(String canvasToolsURL) {
        this.canvasToolsURL = canvasToolsURL;
        return this;
    }

    public HighchartsCallbackFunction getGetTimezoneOffset() {
        return this.getTimezoneOffset = getInstanceOf(HighchartsCallbackFunction.class, this.getTimezoneOffset);
    }

    public Global setGetTimezoneOffset(HighchartsCallbackFunction getTimezoneOffset) {
        this.getTimezoneOffset = getTimezoneOffset;
        return this;
    }

    public String getTimezone() {
        return this.timezone = getInstanceOf(String.class, this.timezone);
    }

    public Global setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public Integer getTimezoneOffset() {
        return this.timezoneOffset = getInstanceOf(Integer.class, this.timezoneOffset);
    }

    public Global setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    public Boolean getUseUTC() {
        return this.useUTC = getInstanceOf(Boolean.class, this.useUTC);
    }

    public Global setUseUTC(Boolean useUTC) {
        this.useUTC = useUTC;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.Date);
        hash = 17 * hash + Objects.hashCode(this.VMLRadialGradientURL);
        hash = 17 * hash + Objects.hashCode(this.canvasToolsURL);
        hash = 17 * hash + Objects.hashCode(this.getTimezoneOffset);
        hash = 17 * hash + Objects.hashCode(this.timezone);
        hash = 17 * hash + Objects.hashCode(this.timezoneOffset);
        hash = 17 * hash + Objects.hashCode(this.useUTC);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "Date:" + Date
                + ", VMLRadialGradientURL:" + VMLRadialGradientURL
                + ", canvasToolsURL:" + canvasToolsURL
                + ", getTimezoneOffset:" + getTimezoneOffset
                + ", timezone:" + timezone
                + ", timezoneOffset:" + timezoneOffset
                + ", useUTC:" + useUTC
                + '}';
    }


//    @Override
//    public String hydrateClass() {
//        return this.deflateFields();
//    }
//
//    @Override
//    public String deflateClass() {
//        return null;
//    }
}