package za.co.onlineintelligence.hyforge.labels;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Labels  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Labels implements Serializable, DrosteDeflater {


    public Labels() {
    }

    /**
     * An HTML label that can be positioned anywhere in the chart area.
     */
    private LabelItem[] items;

    /**
     * Shared CSS styles for all labels.
     */
    private HighchartsCSS style;

    /*
        Getters and Builder-Style Setters
    */
    public LabelItem[] getItems() {
        return this.items = getInstanceOf(LabelItem[].class, this.items);
    }

    public Labels setItems(LabelItem[] items) {
        this.items = items;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public Labels setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.items);
        hash = 17 * hash + Objects.hashCode(this.style);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "items:" + items
                + ", style:" + style
                + '}';
    }


}
