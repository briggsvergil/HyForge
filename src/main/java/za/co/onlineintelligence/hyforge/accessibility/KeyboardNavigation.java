package za.co.onlineintelligence.hyforge.accessibility;

//package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.common.Exportable;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * KeyboardNavigation HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class KeyboardNavigation implements Serializable, Exportable {


    public KeyboardNavigation() {
    }

    /**
     * Enable keyboard navigation for the chart.
     *
     * @since 5.0.0
     */
    private boolean enabled;

    /**
     * Options for the focus border drawn around elements while
     * navigating through them.
     *
     * @since 6.0.3
     */
    private FocusBorder focusBorder;

    /**
     * Order of tab navigation in the chart. Determines which elements
     * are tabbed to first. Available elements are: `series`, `zoom`,
     * `rangeSelector`, `chartMenu`, `legend`. In addition, any custom
     * components can be added here.
     *
     * @since 7.1.0
     */
    private String[] order;

    /**
     * Options for the keyboard navigation of data points and series.
     *
     * @since 8.0.0
     */
    private SeriesNavigation seriesNavigation;

    /**
     * Whether or not to wrap around when reaching the end of arrow-key
     * navigation for an element in the chart.
     *
     * @since 7.1.0
     */
    private boolean wrapAround;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public KeyboardNavigation setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public FocusBorder getFocusBorder() {
        return this.focusBorder = getInstanceOf(FocusBorder.class, this.focusBorder);
    }

    public KeyboardNavigation setFocusBorder(FocusBorder focusBorder) {
        this.focusBorder = focusBorder;
        return this;
    }

    public String[] getOrder() {
        return this.order = getInstanceOf(String[].class, this.order);
    }

    public KeyboardNavigation setOrder(String[] order) {
        this.order = order;
        return this;
    }

    public SeriesNavigation getSeriesNavigation() {
        return this.seriesNavigation = getInstanceOf(SeriesNavigation.class, this.seriesNavigation);
    }

    public KeyboardNavigation setSeriesNavigation(SeriesNavigation seriesNavigation) {
        this.seriesNavigation = seriesNavigation;
        return this;
    }

    public boolean getWrapAround() {
        return this.wrapAround = getInstanceOf(boolean.class, this.wrapAround);
    }

    public KeyboardNavigation setWrapAround(boolean wrapAround) {
        this.wrapAround = wrapAround;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.focusBorder);
        hash = 17 * hash + Objects.hashCode(this.order);
        hash = 17 * hash + Objects.hashCode(this.seriesNavigation);
        hash = 17 * hash + Objects.hashCode(this.wrapAround);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "enabled:" + enabled
                + ", focusBorder:" + focusBorder
                + ", order:" + order
                + ", seriesNavigation:" + seriesNavigation
                + ", wrapAround:" + wrapAround
                + '}';
    }


}
