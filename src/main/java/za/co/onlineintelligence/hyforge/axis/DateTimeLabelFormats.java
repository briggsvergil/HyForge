package za.co.onlineintelligence.hyforge.axis;

import java.io.Serializable;
import java.util.Objects;

import org.javatuples.Pair;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * DateTimeLabelFormats HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class DateTimeLabelFormats implements Serializable, DrosteDeflater {

    public DateTimeLabelFormats() {
    }

    /**
     *
     */
    private String day;

    /**
     *
     */
    private Pair<String, Boolean> hour;

    /**
     *
     */
    private Pair<String, Boolean> millisecond;

    /**
     *
     */
    private Pair<String, Boolean> minute;

    /**
     *
     */
    private Pair<String, Boolean> month;

    /**
     *
     */
    private Pair<String, Boolean> second;

    /**
     *
     */
    private Pair<String, Boolean> week;

    /**
     *
     */
    private Pair<String, Boolean> year;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public String getDay() {
        return getInstanceOf(String.class, this.day);
    }

    public DateTimeLabelFormats setDay(String day) {
        this.day = day;
        return this;
    }

    public Pair<String, Boolean> getHour() {
        return getInstanceOf(Pair.class, this.hour);
    }

    public DateTimeLabelFormats setHour(Pair<String, Boolean> hour) {
        this.hour = hour;
        return this;
    }

    public Pair<String, Boolean> getMillisecond() {
        return getInstanceOf(Pair.class, this.millisecond);
    }

    public DateTimeLabelFormats setMillisecond(Pair<String, Boolean> millisecond) {
        this.millisecond = millisecond;
        return this;
    }

    public Pair<String, Boolean> getMinute() {
        return getInstanceOf(Pair.class, this.minute);
    }

    public DateTimeLabelFormats setMinute(Pair<String, Boolean> minute) {
        this.minute = minute;
        return this;
    }

    public Pair<String, Boolean> getMonth() {
        return getInstanceOf(Pair.class, this.month);
    }

    public DateTimeLabelFormats setMonth(Pair<String, Boolean> month) {
        this.month = month;
        return this;
    }

    public Pair<String, Boolean> getSecond() {
        return getInstanceOf(Pair.class, this.second);
    }

    public DateTimeLabelFormats setSecond(Pair<String, Boolean> second) {
        this.second = second;
        return this;
    }

    public Pair<String, Boolean> getWeek() {
        return getInstanceOf(Pair.class, this.week);
    }

    public DateTimeLabelFormats setWeek(Pair<String, Boolean> week) {
        this.week = week;
        return this;
    }

    public Pair<String, Boolean> getYear() {
        return getInstanceOf(Pair.class, this.year);
    }

    public DateTimeLabelFormats setYear(Pair<String, Boolean> year) {
        this.year = year;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.day);
        hash = 17 * hash + Objects.hashCode(this.hour);
        hash = 17 * hash + Objects.hashCode(this.millisecond);
        hash = 17 * hash + Objects.hashCode(this.minute);
        hash = 17 * hash + Objects.hashCode(this.month);
        hash = 17 * hash + Objects.hashCode(this.second);
        hash = 17 * hash + Objects.hashCode(this.week);
        hash = 17 * hash + Objects.hashCode(this.year);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "day:" + day
                + ", hour:" + hour
                + ", millisecond:" + millisecond
                + ", minute:" + minute
                + ", month:" + month
                + ", second:" + second
                + ", week:" + week
                + ", year:" + year
                + '}';
    }

}
