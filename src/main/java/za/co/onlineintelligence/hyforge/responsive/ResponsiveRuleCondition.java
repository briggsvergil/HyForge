package za.co.onlineintelligence.hyforge.responsive;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * ResponsiveRuleCondition  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ResponsiveRuleCondition implements Serializable, Exportable {


    public ResponsiveRuleCondition() {
    }

    /**
     * A callback function to gain complete control on when the responsive
     * rule applies. Return `true` if it applies. This opens for checking
     * against other metrics than the chart size, for example the document
     * size or other elements.
     *
     * @since 5.0.0
     */
    private HighchartsCallbackFunction callback;

    /**
     * The responsive rule applies if the chart height is less than this.
     *
     * @since 5.0.0
     */
    private Integer maxHeight;

    /**
     * The responsive rule applies if the chart width is less than this.
     *
     * @since 5.0.0
     */
    private Integer maxWidth;

    /**
     * The responsive rule applies if the chart height is greater than this.
     *
     * @since 5.0.0
     */
    private Integer minHeight;

    /**
     * The responsive rule applies if the chart width is greater than this.
     *
     * @since 5.0.0
     */
    private Integer minWidth;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsCallbackFunction getCallback() {
        return this.callback = getInstanceOf(HighchartsCallbackFunction.class, this.callback);
    }

    public ResponsiveRuleCondition setCallback(HighchartsCallbackFunction callback) {
        this.callback = callback;
        return this;
    }

    public Integer getMaxHeight() {
        return this.maxHeight = getInstanceOf(Integer.class, this.maxHeight);
    }

    public ResponsiveRuleCondition setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    public Integer getMaxWidth() {
        return this.maxWidth = getInstanceOf(Integer.class, this.maxWidth);
    }

    public ResponsiveRuleCondition setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    public Integer getMinHeight() {
        return this.minHeight = getInstanceOf(Integer.class, this.minHeight);
    }

    public ResponsiveRuleCondition setMinHeight(Integer minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    public Integer getMinWidth() {
        return this.minWidth = getInstanceOf(Integer.class, this.minWidth);
    }

    public ResponsiveRuleCondition setMinWidth(Integer minWidth) {
        this.minWidth = minWidth;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.callback);
        hash = 17 * hash + Objects.hashCode(this.maxHeight);
        hash = 17 * hash + Objects.hashCode(this.maxWidth);
        hash = 17 * hash + Objects.hashCode(this.minHeight);
        hash = 17 * hash + Objects.hashCode(this.minWidth);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "callback:" + callback
                + ", maxHeight:" + maxHeight
                + ", maxWidth:" + maxWidth
                + ", minHeight:" + minHeight
                + ", minWidth:" + minWidth
                + '}';
    }


}
