package za.co.onlineintelligence.hyforge.drilldown;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsAlignObject;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * DrillUpButton  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class DrillUpButton implements Serializable, DrosteDeflater {


    public DrillUpButton() {
    }

    /**
     * Positioning options for the button within the `relativeTo` box.
     * Available properties are `x`, `y`, `align` and `verticalAlign`.
     *
     * @since 3.0.8
     */
    private HighchartsAlignObject position;

    /**
     * What box to align the button to. Can be either `plotBox` or
     * `spacingBox`.
     *
     * @since 3.0.8
     */
    private HighchartsButtonRelativeToValue relativeTo;

    /**
     * A collection of attributes for the button. The object takes SVG
     * attributes like `fill`, `stroke`, `stroke-width` or `r`, the border
     * radius. The theme also supports `style`, a collection of CSS
     * properties for the text. Equivalent attributes for the hover state
     * are given in `theme.states.hover`.
     * <p>
     * In styled mode, drill-up button styles can be applied with the
     * `.highcharts-drillup-button` class.
     *
     * @since 3.0.8
     * <p>
     * TODO: Object can be SVG attributes or CSS
     */
    private Object theme;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsAlignObject getPosition() {
        return getInstanceOf(HighchartsAlignObject.class, this.position);
    }

    public DrillUpButton setPosition(HighchartsAlignObject position) {
        this.position = position;
        return this;
    }

    public HighchartsButtonRelativeToValue getRelativeTo() {
        return getInstanceOf(HighchartsButtonRelativeToValue.class, this.relativeTo);
    }

    public DrillUpButton setRelativeTo(HighchartsButtonRelativeToValue relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    public Object getTheme() {
        return getInstanceOf(Object.class, this.theme);
    }

    public DrillUpButton setTheme(Object theme) {
        this.theme = theme;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.position);
        hash = 17 * hash + Objects.hashCode(this.relativeTo);
        hash = 17 * hash + Objects.hashCode(this.theme);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "position:" + position
                + ", relativeTo:" + relativeTo
                + ", theme:" + theme
                + '}';
    }


}
