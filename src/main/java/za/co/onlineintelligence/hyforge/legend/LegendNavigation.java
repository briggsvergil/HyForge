package za.co.onlineintelligence.hyforge.legend;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsAnimationOptionsObject;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * LegendNavigation HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class LegendNavigation implements Serializable, DrosteDeflater {


    public LegendNavigation() {
    }

    /**
     * The color for the active up or down arrow in the legend page
     * navigation.
     *
     * @since 2.2.4
     */
    private HighchartsColor activeColor;

    /**
     * How to animate the pages when navigating up or down. A value of
     * `true` applies the default navigation given in the
     * `chart.animation` option. Additional options can be given as an
     * object containing values for easing and duration.
     *
     * @since 2.2.4
     */
    private HighchartsAnimationOptionsObject animation;

    /**
     * The pixel size of the up and down arrows in the legend paging
     * navigation.
     *
     * @since 2.2.4
     */
    private Integer arrowSize;

    /**
     * Whether to enable the legend navigation. In most cases, disabling
     * the navigation results in an unwanted overflow.
     * <p>
     * See also the [adapt chart to legend](https://www.highcharts.com/products/plugin-registry/single/8/Adapt-Chart-To-Legend)
     * plugin for a solution to extend the chart height to make room for
     * the legend, optionally in exported charts only.
     *
     * @since 4.2.4
     */
    private Boolean enabled;

    /**
     * The color of the inactive up or down arrow in the legend page
     * navigation. .
     *
     * @since 2.2.4
     */
    private HighchartsColor inactiveColor;

    /**
     * Text styles for the legend page navigation.
     *
     * @since 2.2.4
     */
    private HighchartsCSS style;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsColor getActiveColor() {
        return this.activeColor = getInstanceOf(HighchartsColor.class, this.activeColor);
    }

    public LegendNavigation setActiveColor(HighchartsColor activeColor) {
        this.activeColor = activeColor;
        return this;
    }

    public HighchartsAnimationOptionsObject getAnimation() {
        return this.animation = getInstanceOf(HighchartsAnimationOptionsObject.class, this.animation);
    }

    public LegendNavigation setAnimation(HighchartsAnimationOptionsObject animation) {
        this.animation = animation;
        return this;
    }

    public Integer getArrowSize() {
        return this.arrowSize = getInstanceOf(Integer.class, this.arrowSize);
    }

    public LegendNavigation setArrowSize(Integer arrowSize) {
        this.arrowSize = arrowSize;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled = getInstanceOf(Boolean.class, this.enabled);
    }

    public LegendNavigation setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HighchartsColor getInactiveColor() {
        return this.inactiveColor = getInstanceOf(HighchartsColor.class, this.inactiveColor);
    }

    public LegendNavigation setInactiveColor(HighchartsColor inactiveColor) {
        this.inactiveColor = inactiveColor;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public LegendNavigation setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.activeColor);
        hash = 17 * hash + Objects.hashCode(this.animation);
        hash = 17 * hash + Objects.hashCode(this.arrowSize);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.inactiveColor);
        hash = 17 * hash + Objects.hashCode(this.style);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "activeColor:" + activeColor
                + ", animation:" + animation
                + ", arrowSize:" + arrowSize
                + ", enabled:" + enabled
                + ", inactiveColor:" + inactiveColor
                + ", style:" + style
                + '}';
    }


}
