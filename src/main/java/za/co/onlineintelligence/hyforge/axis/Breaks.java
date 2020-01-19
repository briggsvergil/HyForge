package za.co.onlineintelligence.hyforge.axis;

import za.co.onlineintelligence.hyforge.common.Exportable;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * Breaks HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Breaks implements Serializable, Exportable {

    public Breaks() {
    }

    /**
     * A number indicating how much space should be left between the start and
     * the end of the break. The break size is given in axis units, so for
     * instance on a `datetime` axis, a break size of 3600000 would indicate the
     * equivalent of an hour.
     *
     * @since 4.1.0
     */
    private int breakSize;

    /**
     * The point where the break starts.
     *
     * @since 4.1.0
     */
    private int from;

    /**
     * Defines an interval after which the break appears again. By default the
     * breaks do not repeat.
     *
     * @since 4.1.0
     */
    private int repeat;

    /**
     * The point where the break ends.
     *
     * @since 4.1.0
     */
    private int to;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public int getBreakSize() {
        return this.breakSize = getInstanceOf(int.class, this.breakSize);
    }

    public Breaks setBreakSize(int breakSize) {
        this.breakSize = breakSize;
        return this;
    }

    public int getFrom() {
        return this.from = getInstanceOf(int.class, this.from);
    }

    public Breaks setFrom(int from) {
        this.from = from;
        return this;
    }

    public int getRepeat() {
        return this.repeat = getInstanceOf(int.class, this.repeat);
    }

    public Breaks setRepeat(int repeat) {
        this.repeat = repeat;
        return this;
    }

    public int getTo() {
        return this.to = getInstanceOf(int.class, this.to);
    }

    public Breaks setTo(int to) {
        this.to = to;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.breakSize);
        hash = 17 * hash + Objects.hashCode(this.from);
        hash = 17 * hash + Objects.hashCode(this.repeat);
        hash = 17 * hash + Objects.hashCode(this.to);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "breakSize:" + breakSize
                + ", from:" + from
                + ", repeat:" + repeat
                + ", to:" + to
                + '}';
    }

}
