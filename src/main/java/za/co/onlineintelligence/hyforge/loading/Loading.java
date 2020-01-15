package za.co.onlineintelligence.hyforge.loading;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Loading  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Loading implements Serializable, DrosteDeflater {


    public Loading() {
    }

    /**
     * The duration in milliseconds of the fade out effect.
     *
     * @since 1.2.0
     */
    private Integer hideDuration;

    /**
     * CSS styles for the loading label `span`.
     *
     * @since 1.2.0
     */
    private HighchartsCSS labelStyle;

    /**
     * The duration in milliseconds of the fade in effect.
     *
     * @since 1.2.0
     */
    private Integer showDuration;

    /**
     * CSS styles for the loading screen that covers the plot area.
     * <p>
     * In styled mode, the loading label is styled with the
     * `.highcharts-loading` class.
     *
     * @since 1.2.0
     */
    private HighchartsCSS style;

    /*
        Getters and Builder-Style Setters
    */
    public Integer getHideDuration() {
        return getInstanceOf(Integer.class, this.hideDuration);
    }

    public Loading setHideDuration(Integer hideDuration) {
        this.hideDuration = hideDuration;
        return this;
    }

    public HighchartsCSS getLabelStyle() {
        return getInstanceOf(HighchartsCSS.class, this.labelStyle);
    }

    public Loading setLabelStyle(HighchartsCSS labelStyle) {
        this.labelStyle = labelStyle;
        return this;
    }

    public Integer getShowDuration() {
        return getInstanceOf(Integer.class, this.showDuration);
    }

    public Loading setShowDuration(Integer showDuration) {
        this.showDuration = showDuration;
        return this;
    }

    public HighchartsCSS getStyle() {
        return getInstanceOf(HighchartsCSS.class, this.style);
    }

    public Loading setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.hideDuration);
        hash = 17 * hash + Objects.hashCode(this.labelStyle);
        hash = 17 * hash + Objects.hashCode(this.showDuration);
        hash = 17 * hash + Objects.hashCode(this.style);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "hideDuration:" + hideDuration
                + ", labelStyle:" + labelStyle
                + ", showDuration:" + showDuration
                + ", style:" + style
                + '}';
    }


}