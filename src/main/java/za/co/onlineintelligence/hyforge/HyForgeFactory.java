package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.plotoptions.HighchartsSeriesPlotOptions;
import za.co.onlineintelligence.hyforge.series.HighchartsSeriesType;
import za.co.onlineintelligence.hyforge.series.Series;

/**
 * This is the implemented Factory to create options and series data for Highcharts.
 * The createChartOptions method has a no-args implementation that will default to creating HighchartsOptions.
 * The overridden method takes a product argument to create the respective product options.
 *
 * @author Sean Briggs
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class HyForgeFactory implements HighchartsFactory {

    @Override
    public ChartOptions createChartOptions() {
        return new HighchartsOptions();
    }

    @Override
    public ChartOptions createChartOptions(HighchartsProduct product) {
        switch (product) {
            case HIGHCHARTS:
                return new HighchartsOptions();
            case HIGHSTOCK:
                return new HighstockOptions();
            case HIGHMAPS:
                return new HighmapsOptions();
            case GANNT:
                return new GanntOptions();
            default:
                throw new IllegalArgumentException("Factory could not create ChartOptions for the specified product.");
        }
    }

    @Override
    public Series createSeries(HighchartsSeriesType type) {
        return type.createSeriesInstance();
    }

    @Override
    public Series createSeries(String type) {
        HighchartsSeriesType instance = HighchartsSeriesType.getInstance(type);
        if (instance == null) throw new IllegalArgumentException("Invalid Highcharts Chart Type specified: " + type);

        return instance.createSeriesInstance();
    }
}
