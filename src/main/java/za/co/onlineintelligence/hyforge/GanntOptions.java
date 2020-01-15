package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.connectors.Connectors;
import za.co.onlineintelligence.hyforge.navigator.Navigator;
import za.co.onlineintelligence.hyforge.rangeselector.RangeSelector;
import za.co.onlineintelligence.hyforge.scrollbar.Scrollbar;
import za.co.onlineintelligence.hyforge.series.Series;

public class GanntOptions extends ChartOptions<GanntOptions> {
    /**
     * TODO: Still to be implemented
     */
    /**
     * "The Pathfinder module allows you to define connections between any two
     * points, represented as lines - optionally with markers for the start
     * and/or end points. Multiple algorithms are available for calculating how
     * the connecting lines are drawn.
     * <p>
     * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
     * charts, the connectors are used to draw dependencies between tasks."
     */
    private Connectors connectors;
    /**
     * "The navigator is a small series below the main series, displaying a view
     * of the entire data set. It provides tools to zoom in and out on parts of
     * the data as well as panning across the dataset."
     */
    private Navigator navigator;
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



    /*
        GETTERS AND BUILDER-STYLE SETTERS
     */

    public Connectors getConnectors() {
        return connectors;
    }

    public GanntOptions setConnectors(Connectors connectors) {
        this.connectors = connectors;
        return this;
    }

    public Scrollbar getScrollbar() {
        return scrollbar;
    }

    public GanntOptions setScrollbar(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
        return this;
    }

    public RangeSelector getRangeSelector() {
        return rangeSelector;
    }

    public GanntOptions setRangeSelector(RangeSelector rangeSelector) {
        this.rangeSelector = rangeSelector;
        return this;
    }

    public Navigator getNavigator() {
        return navigator;
    }

    public GanntOptions setNavigator(Navigator navigator) {
        this.navigator = navigator;
        return this;
    }

    @Override
    public GanntOptions addSeries(Series series) {
        return null;
    }
}
