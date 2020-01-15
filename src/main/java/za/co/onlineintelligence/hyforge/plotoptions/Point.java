package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Point HighchartsAPI Class
 * @author Sean Briggs
 */
public class Point implements Serializable {


    public Point() {
    }

    /**
     * AnnotationsEvents for each single point.
     */
    private PointEvents events;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public PointEvents getEvents() {
        return getInstanceOf(PointEvents.class, this.events);
    }

    public Point setEvents(PointEvents events) {
        this.events = events;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.events);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "events:" + events
                + '}';
    }


}