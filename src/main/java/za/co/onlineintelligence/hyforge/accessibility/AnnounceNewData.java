package za.co.onlineintelligence.hyforge.accessibility;

import java.io.Serializable;
import java.util.Objects;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

/**
 * AnnounceNewData  HighchartsAPI Class
 * @author Sean Briggs
 */
public class AnnounceNewData implements Serializable, DrosteDeflater {


    public AnnounceNewData() {
    }

    /**
     * Optional formatter callback for the announcement. Receives
     up to three arguments. The first argument is always an array
     of all series that received updates. If an announcement is
     already queued, the series that received updates for that
     announcement are also included in this array. The second
     argument is provided if `chart.addSeries` was called, and
     there is a new series. In that case, this argument is a
     reference to the new series. The third argument, similarly,
     is provided if `series.addPoint` was called, and there is a
     new point. In that case, this argument is a reference to the
     new point.

     The function should return a string with the text to announce
     to the user. Return empty string to not announce anything.
     Return `false` to use the default announcement format.
     * @since 7.1.0
     */
    private HighchartsCallbackFunction announcementFormatter;

    /**
     * Enable announcing new data to screen reader users
     * @since 7.1.0
     */
    private Boolean enabled;

    /**
     * Choose whether or not the announcements should interrupt the
     screen reader. If not enabled, the user will be notified once
     idle. It is recommended not to enable this setting unless
     there is a specific reason to do so.
     * @since 7.1.0
     */
    private Boolean interruptUser;

    /**
     * Minimum interval between announcements in milliseconds. If
     new data arrives before this amount of time has passed, it is
     queued for announcement. If another new data event happens
     while an announcement is queued, the queued announcement is
     dropped, and the latest announcement is queued instead. Set
     to 0 to allow all announcements, but be warned that frequent
     announcements are disturbing to users.
     * @since 7.1.0
     */
    private Integer minAnnounceInterval;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsCallbackFunction getAnnouncementFormatter() {
        return this.announcementFormatter;
    }

    public AnnounceNewData setAnnouncementFormatter(HighchartsCallbackFunction announcementFormatter){
        this.announcementFormatter = announcementFormatter;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public AnnounceNewData setEnabled(Boolean enabled){
        this.enabled = enabled;
        return this;
    }

    public Boolean getInterruptUser() {
        return this.interruptUser;
    }

    public AnnounceNewData setInterruptUser(Boolean interruptUser){
        this.interruptUser = interruptUser;
        return this;
    }

    public Integer getMinAnnounceInterval() {
        return this.minAnnounceInterval;
    }

    public AnnounceNewData setMinAnnounceInterval(Integer minAnnounceInterval){
        this.minAnnounceInterval = minAnnounceInterval;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.announcementFormatter);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.interruptUser);
        hash = 17 * hash + Objects.hashCode(this.minAnnounceInterval);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "announcementFormatter:" + announcementFormatter
                + ", enabled:" + enabled
                + ", interruptUser:" + interruptUser
                + ", minAnnounceInterval:" + minAnnounceInterval
                + '}';
    }


}