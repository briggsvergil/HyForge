package za.co.onlineintelligence.hyforge.series;

import java.io.Serializable;
import java.util.Objects;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * DataGrouping  HighchartsAPI Class
 * @author Sean Briggs
 */
public class DataGrouping implements Serializable, DrosteDeflater {


    public DataGrouping() {
    }

    /**
     * The approximate pixel width of each group. If for example a series
     with 30 points is displayed over a 600 pixel wide plot area, no grouping
     is performed. If however the series contains so many points that
     the spacing is less than the groupPixelWidth, Highcharts will try
     to group it into appropriate groups so that each is more or less
     two pixels wide. Defaults to `10`.
     */
    private Integer groupPixelWidth;

    /*
        Instance-Safe Getters
    */
    public Integer getGroupPixelWidth() {
        return getInstanceOf(Integer.class, this.groupPixelWidth);
    }

    /*
        Builder-Style Setters
    */
    public DataGrouping setGroupPixelWidth(Integer groupPixelWidth){
        this.groupPixelWidth = groupPixelWidth;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.groupPixelWidth);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "groupPixelWidth:" + groupPixelWidth
                + '}';
    }


}
