package za.co.onlineintelligence.hyforge.plotoptions;

import za.co.onlineintelligence.hyforge.common.HighchartsSVGAttributes;

import java.io.Serializable;
import java.util.Objects;


/**
 * TextPath HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class TextPath implements Serializable {


    public TextPath() {
    }

    /**
     * Presentation attributes for the text path.
     *
     * @since 7.1.0
     */
    private HighchartsSVGAttributes attributes;

    /**
     * Enable or disable `textPath` option for link's or marker's data
     * labels.
     *
     * @since 7.1.0
     */
    private boolean enabled;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsSVGAttributes getAttributes() {
        return this.attributes;
    }

    public TextPath setAttributes(HighchartsSVGAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public TextPath setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.attributes);
        hash = 17 * hash + Objects.hashCode(this.enabled);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "attributes:" + attributes
                + ", enabled:" + enabled
                + '}';
    }


}