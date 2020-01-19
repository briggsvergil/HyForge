package za.co.onlineintelligence.hyforge.legend;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * LegendRangeOptions HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class LegendRangeOptions implements Serializable, Exportable {


    public LegendRangeOptions() {
    }

    /**
     * The color of the border for individual range.
     *
     * @since 7.0.0
     */
    private HighchartsColor borderColor;

    /**
     * The color of the bubble for individual range.
     *
     * @since 7.0.0
     */
    private HighchartsColor color;

    /**
     * The color of the connector for individual range.
     *
     * @since 7.0.0
     */
    private HighchartsColor connectorColor;

    /**
     * Range size value, similar to bubble Z data.
     *
     * @since 7.0.0
     */
    private Integer value;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsColor getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColor.class, this.borderColor);
    }

    public LegendRangeOptions setBorderColor(HighchartsColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public LegendRangeOptions setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public HighchartsColor getConnectorColor() {
        return this.connectorColor = getInstanceOf(HighchartsColor.class, this.connectorColor);
    }

    public LegendRangeOptions setConnectorColor(HighchartsColor connectorColor) {
        this.connectorColor = connectorColor;
        return this;
    }

    public Integer getValue() {
        return this.value = getInstanceOf(Integer.class, this.value);
    }

    public LegendRangeOptions setValue(Integer value) {
        this.value = value;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.connectorColor);
        hash = 17 * hash + Objects.hashCode(this.value);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "borderColor:" + borderColor
                + ", color:" + color
                + ", connectorColor:" + connectorColor
                + ", value:" + value
                + '}';
    }


}
