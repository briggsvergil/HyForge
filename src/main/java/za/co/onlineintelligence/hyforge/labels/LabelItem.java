package za.co.onlineintelligence.hyforge.labels;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * LabelItem  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class LabelItem implements Serializable, DrosteDeflater {


    public LabelItem() {
    }

    /**
     * Inner HTML or text for the label.
     */
    private String html;

    /**
     * CSS styles for each label. To position the label, use left and top
     * like this:
     * ```js
     * style: {
     * left: '100px',
     * top: '100px'
     * }
     * ```
     */
    private HighchartsCSS style;

    /*
        Getters and Builder-Style Setters
    */
    public String getHtml() {
        return this.html = getInstanceOf(String.class, this.html);
    }

    public LabelItem setHtml(String html) {
        this.html = html;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public LabelItem setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.html);
        hash = 17 * hash + Objects.hashCode(this.style);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "html:" + html
                + ", style:" + style
                + '}';
    }


}
