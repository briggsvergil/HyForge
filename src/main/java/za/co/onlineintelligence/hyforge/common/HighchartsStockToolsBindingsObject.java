package za.co.onlineintelligence.hyforge.common;

import za.co.onlineintelligence.hyforge.annotations.Annotations;

public class HighchartsStockToolsBindingsObject {

    public HighchartsStockToolsBindingsObject() {
    }

    private String className;
    private HighchartsCallbackFunction start;
    private HighchartsCallbackFunction[] steps;
    private Annotations annotationsOptions;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public HighchartsCallbackFunction getStart() {
        return start;
    }

    public void setStart(HighchartsCallbackFunction start) {
        this.start = start;
    }

    public HighchartsCallbackFunction[] getSteps() {
        return steps;
    }

    public void setSteps(HighchartsCallbackFunction[] steps) {
        this.steps = steps;
    }

    public Annotations getAnnotationsOptions() {
        return annotationsOptions;
    }

    public void setAnnotationsOptions(Annotations annotationsOptions) {
        this.annotationsOptions = annotationsOptions;
    }
}
