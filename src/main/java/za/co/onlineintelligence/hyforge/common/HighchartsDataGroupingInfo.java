package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;

public class HighchartsDataGroupingInfo implements Serializable {

    private Integer length;
    private Integer start;
    private Object options;

    public HighchartsDataGroupingInfo() {
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Object getOptions() {
        return options;
    }

    public void setOptions(Object options) {
        this.options = options;
    }
}
