/*
 */
package za.co.onlineintelligence.hyforge.chart;

import za.co.onlineintelligence.hyforge.common.*;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean Briggs
 */
public class ResetZoomButton implements Serializable, DrosteDeflater {

    public ResetZoomButton() {
    }

    /**
     * The position of the button.
     *
     * @since 2.2.0
     */
    private HighchartsAlignObject position;

    /**
     * What frame the button placement should be related to. Can be either
     * `plotBox` or `spacingBox`.
     *
     * @since 2.2.0
     */
    private String relativeTo;

    /**
     * A collection of attributes for the button. The object takes SVG
     * attributes like `fill`, `stroke`, `stroke-width` or `r`, the border
     * radius. The theme also supports `style`, a collection of CSS properties
     * for the text. Equivalent attributes for the hover state are given in
     * `theme.states.hover`.
     *
     * @since 2.2.0
     */
    private HighchartsSVGAttributes theme;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsAlignObject getPosition() {
        return getInstanceOf(HighchartsAlignObject.class, this.position);
    }

    public ResetZoomButton setPosition(HighchartsAlignObject position) {
        this.position = position;
        return this;
    }

    public String getRelativeTo() {
        return getInstanceOf(String.class, this.relativeTo);
    }

    public ResetZoomButton setRelativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    public HighchartsSVGAttributes getTheme() {
        return getInstanceOf(HighchartsSVGAttributes.class, this.theme);
    }

    public ResetZoomButton setTheme(HighchartsSVGAttributes theme) {
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
