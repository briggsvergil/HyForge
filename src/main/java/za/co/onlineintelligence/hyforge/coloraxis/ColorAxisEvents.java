package za.co.onlineintelligence.hyforge.coloraxis;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * ColorAxisEvents  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ColorAxisEvents implements Serializable, Exportable {


    public ColorAxisEvents() {
    }

    /**
     * Fires when the legend item belonging to the colorAxis is clicked.
     * One parameter, `event`, is passed to the function.
     */
    private HighchartsCallbackFunction legendItemClick;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsCallbackFunction getLegendItemClick() {
        return this.legendItemClick = getInstanceOf(HighchartsCallbackFunction.class, this.legendItemClick);
    }

    public ColorAxisEvents setLegendItemClick(HighchartsCallbackFunction legendItemClick) {
        this.legendItemClick = legendItemClick;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.legendItemClick);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "legendItemClick:" + legendItemClick
                + '}';
    }


}