package za.co.onlineintelligence.hyforge.plotoptions;

public class PointPlacement {
    public PointPlacement() {
    }

    public static final String BETWEEN = "between";
    public static final String ON = "on";

    private String s_value;
    private Float f_value;

    public String getValue() {
        return s_value!=null ? s_value : f_value + "";
    }

    public void setValue(String value) {
        if(!BETWEEN.equalsIgnoreCase(value) && !ON.equalsIgnoreCase(value)) {
            this.s_value = value;
            this.f_value = null;
        }
    }

    public void setValue(Float value) {
        if(!value.isNaN()) {
            this.f_value = value;
            this.s_value = null;
        }
    }

}
