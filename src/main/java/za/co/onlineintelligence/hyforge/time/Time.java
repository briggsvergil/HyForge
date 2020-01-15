package za.co.onlineintelligence.hyforge.time;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;


/**
 * Time  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Time implements Serializable, DrosteDeflater {


    public Time() {
    }

    /**
     * A custom `Date` class for advanced date handling. For example,
     * [JDate](https://github.com/tahajahangir/jdate) can be hooked in to
     * handle Jalali dates.
     *
     * @since 6.0.5
     */
    private ZonedDateTime Date;

    /**
     * A callback to return the time zone offset for a given datetime. It
     * takes the timestamp in terms of milliseconds since January 1 1970,
     * and returns the timezone offset in minutes. This provides a hook
     * for drawing time based charts in specific time zones using their
     * local DST crossover dates, with the help of external libraries.
     *
     * @since 6.0.5
     */
    private String getTimezoneOffset;

    /**
     * Requires [moment.js](http://momentjs.com/). If the timezone option
     * is specified, it creates a default
     * [getTimezoneOffset](#time.getTimezoneOffset) function that looks
     * up the specified timezone in moment.js. If moment.js is not included,
     * this throws a Highcharts error in the console, but does not crash the
     * chart.
     *
     * @since 6.0.5
     */
    private String timezone;

    /**
     * The timezone offset in minutes. Positive values are west, negative
     * values are east of UTC, as in the ECMAScript
     * [getTimezoneOffset](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset)
     * method. Use this to display UTC based data in a predefined time zone.
     *
     * @since 6.0.5
     */
    private Integer timezoneOffset;

    /**
     * Whether to use UTC time for axis scaling, tickmark placement and
     * time display in `Highcharts.dateFormat`. Advantages of using UTC
     * is that the time displays equally regardless of the user agent's
     * time zone settings. Local time can be used when the data is loaded
     * in real time or when correct Daylight Saving Time transitions are
     * required.
     *
     * @since 6.0.5
     */
    private Boolean useUTC;

    /*
        Getters and Builder-Style Setters
    */
    public ZonedDateTime getDate() {
        return this.Date;
    }

    public Time setDate(ZonedDateTime Date) {
        this.Date = Date;
        return this;
    }

    public String getGetTimezoneOffset() {
        return this.getTimezoneOffset;
    }

    public Time setGetTimezoneOffset(String getTimezoneOffset) {
        this.getTimezoneOffset = getTimezoneOffset;
        return this;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public Time setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public Integer getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public Time setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    public Boolean getUseUTC() {
        return this.useUTC;
    }

    public Time setUseUTC(Boolean useUTC) {
        this.useUTC = useUTC;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.Date);
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
                + ", getTimezoneOffset:" + getTimezoneOffset
                + ", timezone:" + timezone
                + ", timezoneOffset:" + timezoneOffset
                + ", useUTC:" + useUTC
                + '}';
    }


}