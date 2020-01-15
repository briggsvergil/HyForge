package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.navigator.Navigator;
import za.co.onlineintelligence.hyforge.rangeselector.RangeSelector;
import za.co.onlineintelligence.hyforge.scrollbar.Scrollbar;
import za.co.onlineintelligence.hyforge.series.Series;
import za.co.onlineintelligence.hyforge.stocktools.StockTools;

public class HighstockOptions extends ChartOptions<HighstockOptions> {
    /**
     * TODO: Still to be implemented
     */
    /**
     * "Configure the stockTools gui strings in the chart. Requires the
     * [stockTools module]() to be loaded. For a description of the module and
     * information on its features, see [Highcharts StockTools]()."
     */
    private StockTools stockTools;
    /**
     * "The scrollbar is a means of panning over the X axis of a stock chart.
     * Scrollbars can also be applied to other types of axes.
     * <p>
     * Another approach to scrollable charts is the
     * [chart.scrollablePlotArea](https://api.highcharts.com/highcharts/chart.scrollablePlotArea)
     * option that is especially suitable for simpler cartesian charts on
     * mobile.
     * <p>
     * In styled mode, all the presentational options for the scrollbar are
     * replaced by the classes `.highcharts-scrollbar-thumb`,
     * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
     * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`."
     */
    private Scrollbar scrollbar;
    /**
     * "The range selector is a tool for selecting ranges to display within the
     * chart. It provides buttons to select preconfigured ranges in the chart,
     * like 1 day, 1 week, 1 month etc. It also provides input boxes where min
     * and max dates can be manually input."
     */
    private RangeSelector rangeSelector;
    /**
     * "The navigator is a small series below the main series, displaying a view
     * of the entire data set. It provides tools to zoom in and out on parts of
     * the data as well as panning across the dataset."
     */
    private Navigator navigator;

    /*
        GETTERS AND BUILDER-STYLE SETTERS
     */

    public StockTools getStockTools() {
        return stockTools;
    }

    public HighstockOptions setStockTools(StockTools stockTools) {
        this.stockTools = stockTools;
        return this;
    }

    public Scrollbar getScrollbar() {
        return scrollbar;
    }

    public HighstockOptions setScrollbar(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
        return this;
    }

    public RangeSelector getRangeSelector() {
        return rangeSelector;
    }

    public HighstockOptions setRangeSelector(RangeSelector rangeSelector) {
        this.rangeSelector = rangeSelector;
        return this;
    }

    public Navigator getNavigator() {
        return navigator;
    }

    public HighstockOptions setNavigator(Navigator navigator) {
        this.navigator = navigator;
        return this;
    }

    @Override
    public HighstockOptions addSeries(Series series) {
        return null;
    }
}
