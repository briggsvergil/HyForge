package za.co.onlineintelligence.hyforge.responsive;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.HighchartsOptions;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;


/**
 * ResponsiveRule  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ResponsiveRule implements Serializable, DrosteDeflater {


    public ResponsiveRule() {
    }

    /**
     * A full set of chart options to apply as overrides to the general
     * chart options. The chart options are applied when the given rule
     * is active.
     * <p>
     * A special case is configuration objects that take arrays, for example
     * [xAxis](#xAxis), [yAxis](#yAxis) or [series](#series). For these
     * collections, an `id` option is used to map the new option set to
     * an existing object. If an existing object of the same id is not found,
     * the item of the same indexupdated. So for example, setting `chartOptions`
     * with two series items without an `id`, will cause the existing chart's
     * two series to be updated with respective options.
     *
     * @since 5.0.0
     */
    private HighchartsOptions chartOptions;

    /**
     * Under which conditions the rule applies.
     *
     * @since 5.0.0
     */
    private ResponsiveRuleCondition condition;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsOptions getChartOptions() {
        return this.chartOptions;
    }

    public ResponsiveRule setChartOptions(HighchartsOptions chartOptions) {
        this.chartOptions = chartOptions;
        return this;
    }

    public ResponsiveRuleCondition getCondition() {
        return this.condition;
    }

    public ResponsiveRule setCondition(ResponsiveRuleCondition condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.chartOptions);
        hash = 17 * hash + Objects.hashCode(this.condition);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "chartOptions:" + chartOptions
                + ", condition:" + condition
                + '}';
    }


}
