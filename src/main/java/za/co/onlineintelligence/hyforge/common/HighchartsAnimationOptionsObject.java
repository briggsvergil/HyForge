package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;

public class HighchartsAnimationOptionsObject implements Serializable, DrosteDeflater {

    public HighchartsAnimationOptionsObject() {

    }

    private HighchartsCallbackFunction complete;
    private Integer duration;
    private String easing;
    private HighchartsCallbackFunction step;

    public HighchartsCallbackFunction getComplete() {
        return complete;
    }

    public void setComplete(HighchartsCallbackFunction complete) {
        this.complete = complete;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getEasing() {
        return easing;
    }

    public void setEasing(String easing) {
        this.easing = easing;
    }

    public HighchartsCallbackFunction getStep() {
        return step;
    }

    public void setStep(HighchartsCallbackFunction step) {
        this.step = step;
    }
}
