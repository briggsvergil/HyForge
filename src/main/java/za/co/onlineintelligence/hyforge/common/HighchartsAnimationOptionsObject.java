package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

public class HighchartsAnimationOptionsObject implements Serializable, DrosteDeflater {

    public HighchartsAnimationOptionsObject() {

    }

    private HighchartsCallbackFunction complete;
    private Integer duration;
    private String easing;
    private HighchartsCallbackFunction step;

    public HighchartsCallbackFunction getComplete() {
        return this.complete = getInstanceOf(HighchartsCallbackFunction.class, this.complete);
    }

    public void setComplete(HighchartsCallbackFunction complete) {
        this.complete = complete;
    }

    public Integer getDuration() {
        return this.duration = getInstanceOf(Integer.class, this.duration);
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getEasing() {
        return this.easing = getInstanceOf(String.class, this.easing);
    }

    public void setEasing(String easing) {
        this.easing = easing;
    }

    public HighchartsCallbackFunction getStep() {
        return this.step = getInstanceOf(HighchartsCallbackFunction.class, this.step);
    }

    public void setStep(HighchartsCallbackFunction step) {
        this.step = step;
    }
}
