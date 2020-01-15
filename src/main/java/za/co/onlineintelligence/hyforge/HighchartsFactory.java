package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.plotoptions.HighchartsSeriesPlotOptions;
import za.co.onlineintelligence.hyforge.series.HighchartsSeriesType;
import za.co.onlineintelligence.hyforge.series.Series;

/**
 *
 *
 * @author Sean Briggs
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public interface HighchartsFactory {

    /**
     * @return New ChartOptions Instance
     */
    ChartOptions createChartOptions();

    /**
     * @param product Highcharts Product Type to get Product-Specific Options
     * @return New ChartOptions Instance.
     */
    ChartOptions createChartOptions(HighchartsProduct product);

    /**
     * Creates an instance of Series using the type of chart specified.
     * e.g. HighchartsSeriesType.PIE, HighchartsSeriesType.BAR, etc.
     *
     * @param type
     * @return
     */
    Series createSeries(HighchartsSeriesType type);

    /**
     * Override method for String argument of chart type. e.g. "bar", "pie", etc.
     * Creates an instance of Series using the type of chart specified if it exists,
     * else an IllegalArgumentException is thrown.
     *
     * @param type The type of chart to create for the series, for a full list see HighchartsSeriesType enum.
     * @return
     */
    Series createSeries(String type);

}
