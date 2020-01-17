package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Inactive HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Inactive implements Serializable {


    public Inactive() {
    }

    /**
     * The animation for entering the inactive state.
     */
    private Integer animation;

    /**
     * Opacity of series elements (dataLabels, line, area). Set to 1
     * to disable inactive state.
     */
    private int opacity;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public Integer getAnimation() {
        return this.animation = getInstanceOf(Integer.class, this.animation);
    }

    public Inactive setAnimation(Integer animation) {
        this.animation = animation;
        return this;
    }

    public int getOpacity() {
        return this.opacity = getInstanceOf(int.class, this.opacity);
    }

    public Inactive setOpacity(int opacity) {
        this.opacity = opacity;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.animation);
        hash = 17 * hash + Objects.hashCode(this.opacity);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "animation:" + animation
                + ", opacity:" + opacity
                + '}';
    }


}