package za.co.onlineintelligence.hyforge.plotoptions;

import java.io.Serializable;
import java.util.Objects;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

/**
 * SeriesAccessibility HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class SeriesAccessibility implements Serializable
{

    public SeriesAccessibility()
    {
    }

    /**
     * Provide a description of the series, announced to screen readers.
     *
     * @since 7.1.0
     */
    private String description;

    /**
     * Enable/disable accessibility functionality for a specific series.
     *
     * @since 7.1.0
     */
    private Boolean enabled;

    /**
     * Expose only the series element to screen readers, not its points.
     *
     * @since 7.1.0
     */
    private Boolean exposeAsGroupOnly;

    /**
     * Keyboard navigation for a series
     *
     * @since 7.1.0
     */
    private Boolean keyboardNavigation;

    /**
     * Formatter function to use instead of the default for point descriptions.
     * Same as `accessibility.point.descriptionFormatter`, but for a single
     * series.
     *
     * @since 7.1.0
     */
    private HighchartsCallbackFunction pointDescriptionFormatter;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public String getDescription()
    {
        return this.description;
    }

    public SeriesAccessibility setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public boolean getEnabled()
    {
        return this.enabled;
    }

    public SeriesAccessibility setEnabled(boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    public boolean getExposeAsGroupOnly()
    {
        return this.exposeAsGroupOnly;
    }

    public SeriesAccessibility setExposeAsGroupOnly(boolean exposeAsGroupOnly)
    {
        this.exposeAsGroupOnly = exposeAsGroupOnly;
        return this;
    }

    public Boolean getKeyboardNavigation()
    {
        return this.keyboardNavigation;
    }

    public SeriesAccessibility setKeyboardNavigation(Boolean keyboardNavigation)
    {
        this.keyboardNavigation = keyboardNavigation;
        return this;
    }

    public HighchartsCallbackFunction getPointDescriptionFormatter()
    {
        return this.pointDescriptionFormatter;
    }

    public SeriesAccessibility setPointDescriptionFormatter(HighchartsCallbackFunction pointDescriptionFormatter)
    {
        this.pointDescriptionFormatter = pointDescriptionFormatter;
        return this;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.exposeAsGroupOnly);
        hash = 17 * hash + Objects.hashCode(this.keyboardNavigation);
        hash = 17 * hash + Objects.hashCode(this.pointDescriptionFormatter);

        return hash;
    }

    @Override
    public String toString()
    {
        return '{'
                + "description:" + description
                + ", enabled:" + enabled
                + ", exposeAsGroupOnly:" + exposeAsGroupOnly
                + ", keyboardNavigation:" + keyboardNavigation
                + ", pointDescriptionFormatter:" + pointDescriptionFormatter
                + '}';
    }

}
