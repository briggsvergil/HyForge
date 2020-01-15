package za.co.onlineintelligence.hyforge.chart;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Sean Briggs
 */
public class Panning implements Serializable
{

    public Panning()
    {
    }

    /**
     * Enable or disable chart panning.
     */
    private boolean enabled;

    /**
     * Decides in what dimensions the user can pan the chart. Can be one of `x`,
     * `y`, or `xy`.
     */
    private String type;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public boolean getEnabled()
    {
        return this.enabled;
    }

    public Panning setEnabled(boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    public String getType()
    {
        return this.type;
    }

    public Panning setType(String type)
    {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.type);

        return hash;
    }

    @Override
    public String toString()
    {
        return '{'
                + "enabled:" + enabled
                + ", type:" + type
                + '}';
    }

}
