package za.co.onlineintelligence.hyforge.accessibility;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * FocusBorder HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class FocusBorder implements Serializable, Exportable {


    public FocusBorder() {
    }

    /**
     * Enable/disable focus border for chart.
     *
     * @since 6.0.3
     */
    private boolean enabled;

    /**
     * Hide the browser's default focus indicator.
     *
     * @since 6.0.4
     */
    private boolean hideBrowserFocusOutline;

    /**
     * Focus border margin around the elements.
     *
     * @since 6.0.3
     */
    private int margin;

    /**
     * ControlPointOptionsStyle options for the focus border drawn around elements
     * while navigating through them. Note that some browsers in
     * addition draw their own borders for focused elements. These
     * automatic borders can not be styled by Highcharts.
     * <p>
     * In styled mode, the border is given the
     * `.highcharts-focus-border` class.
     *
     * @since 6.0.3
     */
    private HighchartsCSS style;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public FocusBorder setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public boolean getHideBrowserFocusOutline() {
        return this.hideBrowserFocusOutline = getInstanceOf(boolean.class, this.hideBrowserFocusOutline);
    }

    public FocusBorder setHideBrowserFocusOutline(boolean hideBrowserFocusOutline) {
        this.hideBrowserFocusOutline = hideBrowserFocusOutline;
        return this;
    }

    public int getMargin() {
        return this.margin = getInstanceOf(int.class, this.margin);
    }

    public FocusBorder setMargin(int margin) {
        this.margin = margin;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public FocusBorder setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.hideBrowserFocusOutline);
        hash = 17 * hash + Objects.hashCode(this.margin);
        hash = 17 * hash + Objects.hashCode(this.style);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "enabled:" + enabled
                + ", hideBrowserFocusOutline:" + hideBrowserFocusOutline
                + ", margin:" + margin
                + ", style:" + style
                + '}';
    }


}
