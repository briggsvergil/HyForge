package za.co.onlineintelligence.hyforge.plotoptions;

import java.io.Serializable;
import java.util.Objects;


/**
 * Filter HighchartsAPI Class
 * @author Sean Briggs
 */
public class Filter implements Serializable {


    public Filter() {
    }

    /**
     * The operator to compare by. Can be one of `>`, `<`, `>=`, `<=`,
     `==`, and `===`.
     * @since 6.0.3
     */
    private String operator;

    /**
     * The point property to filter by. Point options are passed
     directly to properties, additionally there are `y` value,
     `percentage` and others listed under {Highcharts.Point}
     members.
     * @since 6.0.3
     */
    private String property;

    /**
     * The value to compare against.
     * @since 6.0.3
     */
    private int value;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public String getOperator() {
        return this.operator;
    }

    public Filter setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getProperty() {
        return this.property;
    }

    public Filter setProperty(String property) {
        this.property = property;
        return this;
    }

    public int getValue() {
        return this.value;
    }

    public Filter setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.operator);
        hash = 17 * hash + Objects.hashCode(this.property);
        hash = 17 * hash + Objects.hashCode(this.value);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "operator:" + operator
                + ", property:" + property
                + ", value:" + value
                + '}';
    }


}