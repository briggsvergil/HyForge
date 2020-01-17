package za.co.onlineintelligence.hyforge.annotations;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * AnnotationsEvents  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class AnnotationsEvents implements Serializable, DrosteDeflater {


    public AnnotationsEvents() {
    }

    /**
     * Event callback when annotation is added to the chart.
     *
     * @since 7.1.0
     */
    private HighchartsCallbackFunction add;

    /**
     * Event callback when annotation is updated (e.g. drag and
     * droppped or resized by control points).
     *
     * @since 7.1.0
     */
    private HighchartsCallbackFunction afterUpdate;

    /**
     * Event callback when annotation is removed from the chart.
     *
     * @since 7.1.0
     */
    private HighchartsCallbackFunction remove;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsCallbackFunction getAdd() {
        return this.add = getInstanceOf(HighchartsCallbackFunction.class, this.add);
    }

    public AnnotationsEvents setAdd(HighchartsCallbackFunction add) {
        this.add = add;
        return this;
    }

    public HighchartsCallbackFunction getAfterUpdate() {
        return this.afterUpdate = getInstanceOf(HighchartsCallbackFunction.class, this.afterUpdate);
    }

    public AnnotationsEvents setAfterUpdate(HighchartsCallbackFunction afterUpdate) {
        this.afterUpdate = afterUpdate;
        return this;
    }

    public HighchartsCallbackFunction getRemove() {
        return this.remove = getInstanceOf(HighchartsCallbackFunction.class, this.remove);
    }

    public AnnotationsEvents setRemove(HighchartsCallbackFunction remove) {
        this.remove = remove;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.add);
        hash = 17 * hash + Objects.hashCode(this.afterUpdate);
        hash = 17 * hash + Objects.hashCode(this.remove);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "add:" + add
                + ", afterUpdate:" + afterUpdate
                + ", remove:" + remove
                + '}';
    }


}
