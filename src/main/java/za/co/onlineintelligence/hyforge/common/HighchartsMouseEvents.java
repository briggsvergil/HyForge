/*
 */
package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;
import java.util.Objects;

/**
 * MouseEvents HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class HighchartsMouseEvents implements Serializable
{

    public HighchartsMouseEvents()
    {
    }

    /**
     * Click event on a plot band.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction click;

    /**
     * Mouse move event on a plot band.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction mousemove;

    /**
     * Mouse out event on the corner of a plot band.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction mouseout;

    /**
     * Mouse over event on a plot band.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction mouseover;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsCallbackFunction getClick()
    {
        return this.click;
    }

    public HighchartsMouseEvents setClick(HighchartsCallbackFunction click)
    {
        this.click = click;
        return this;
    }

    public HighchartsCallbackFunction getMousemove()
    {
        return this.mousemove;
    }

    public HighchartsMouseEvents setMousemove(HighchartsCallbackFunction mousemove)
    {
        this.mousemove = mousemove;
        return this;
    }

    public HighchartsCallbackFunction getMouseout()
    {
        return this.mouseout;
    }

    public HighchartsMouseEvents setMouseout(HighchartsCallbackFunction mouseout)
    {
        this.mouseout = mouseout;
        return this;
    }

    public HighchartsCallbackFunction getMouseover()
    {
        return this.mouseover;
    }

    public HighchartsMouseEvents setMouseover(HighchartsCallbackFunction mouseover)
    {
        this.mouseover = mouseover;
        return this;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.click);
        hash = 17 * hash + Objects.hashCode(this.mousemove);
        hash = 17 * hash + Objects.hashCode(this.mouseout);
        hash = 17 * hash + Objects.hashCode(this.mouseover);

        return hash;
    }

    @Override
    public String toString()
    {
        return "click:" + click
                + ", mousemove:" + mousemove
                + ", mouseout:" + mouseout
                + ", mouseover:" + mouseover;
    }

}
