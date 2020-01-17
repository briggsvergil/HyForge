package za.co.onlineintelligence.hyforge.lang;

import java.io.Serializable;
import java.util.Objects;

import com.google.gson.JsonElement;
import za.co.onlineintelligence.hyforge.accessibility.Accessibility;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.DrosteSeperation;
import za.co.onlineintelligence.hyforge.stocktools.StockTools;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Lang  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Lang implements Serializable, DrosteDeflater, DrosteSeperation {


    public Lang() {
    }

    /**
     * Configure the accessibility strings in the chart. Requires the
     * [accessibility module](https://code.highcharts.com/modules/accessibility.js)
     * to be loaded. For a description of the module and information on its
     * features, see
     * [Highcharts Accessibility](https://www.highcharts.com/docs/chart-concepts/accessibility).
     * <p>
     * For more dynamic control over the accessibility functionality, see
     * [accessibility.pointDescriptionFormatter](#accessibility.pointDescriptionFormatter),
     * [accessibility.seriesDescriptionFormatter](#accessibility.seriesDescriptionFormatter),
     * and
     * [accessibility.screenReaderSectionFormatter](#accessibility.screenReaderSectionFormatter).
     *
     * @since 6.0.6
     */
    private Accessibility accessibility;

    /**
     * Exporting module menu. The tooltip title for the context menu holding
     * print and export menu items.
     *
     * @since 3.0.0
     */
    private String contextButtonTitle;

    /**
     * The default decimal point used in the `Highcharts.numberFormat`
     * method unless otherwise specified in the function arguments.
     *
     * @since 1.2.2
     */
    private String decimalPoint;

    /**
     * The text for the menu item.
     *
     * @since 6.0.0
     */
    private String downloadCSV;

    /**
     * Exporting module only. The text for the JPEG download menu item.
     *
     * @since 2.0.0
     */
    private String downloadJPEG;

    /**
     * Exporting module only. The text for the PDF download menu item.
     *
     * @since 2.0.0
     */
    private String downloadPDF;

    /**
     * Exporting module only. The text for the PNG download menu item.
     *
     * @since 2.0.0
     */
    private String downloadPNG;

    /**
     * Exporting module only. The text for the SVG download menu item.
     *
     * @since 2.0.0
     */
    private String downloadSVG;

    /**
     * The text for the menu item.
     *
     * @since 6.0.0
     */
    private String downloadXLS;

    /**
     * The text for the button that appears when drilling down, linking back
     * to the parent series. The parent series' name is inserted for
     * `{series.name}`.
     *
     * @since 3.0.8
     */
    private String drillUpText;

    /**
     * What to show in a date field for invalid dates. Defaults to an empty
     * string.
     *
     * @since 4.1.8
     */
    private String invalidDate;

    /**
     * The loading text that appears when the chart is set into the loading
     * state following a call to `chart.showLoading`.
     */
    private String loading;

    /**
     * An array containing the months names. Corresponds to the `%B` format
     * in `Highcharts.dateFormat()`.
     */
    private String[] months;

    /**
     * Configure the Popup strings in the chart. Requires the
     * `annotations.js` or `annotations-advanced.src.js` module to be
     * loaded.
     *
     * @since 7.0.0
     */
    private Object navigation;

    /**
     * The text to display when the chart contains no data.
     *
     * @since 3.0.8
     */
    private String noData;

    /**
     * The magnitude of [numericSymbols](#lang.numericSymbol) replacements.
     * Use 10000 for Japanese, Korean and various Chinese locales, which
     * use symbols for 10^4, 10^8 and 10^12.
     *
     * @since 5.0.3
     */
    private Integer numericSymbolMagnitude;

    /**
     * [Metric prefixes](http://en.wikipedia.org/wiki/Metric_prefix) used
     * to shorten high numbers in axis labels. Replacing any of the
     * positions with `null` causes the full number to be written. Setting
     * `numericSymbols` to `null` disables shortening altogether.
     *
     * @since 2.3.0
     */
    private String[] numericSymbols;

    /**
     * The text for the menu item.
     *
     * @since 6.1.0
     */
    private String openInCloud;

    /**
     * Exporting module only. The text for the menu item to print the chart.
     *
     * @since 3.0.1
     */
    private String printChart;

    /**
     * The text for the label for the "from" input box in the range
     * selector.
     */
    private String rangeSelectorFrom;

    /**
     * The text for the label for the "to" input box in the range selector.
     */
    private String rangeSelectorTo;

    /**
     * The text for the label for the range selector buttons.
     */
    private String rangeSelectorZoom;

    /**
     * The text for the label appearing when a chart is zoomed.
     *
     * @since 1.2.4
     */
    private String resetZoom;

    /**
     * The tooltip title for the label appearing when a chart is zoomed.
     *
     * @since 1.2.4
     */
    private String resetZoomTitle;

    /**
     * An array containing the months names in abbreviated form. Corresponds
     * to the `%b` format in `Highcharts.dateFormat()`.
     */
    private String[] shortMonths;

    /**
     * Short week days, starting Sunday. If not specified, Highcharts uses
     * the first three letters of the `lang.weekdays` option.
     *
     * @since 4.2.4
     */
    private String[] shortWeekdays;

    /**
     * Configure the stockTools GUI titles(hints) in the chart. Requires
     * the `stock-tools.js` module to be loaded.
     *
     * @since 7.0.0
     */
    private StockTools stockTools;

    /**
     * The default thousands separator used in the `Highcharts.numberFormat`
     * method unless otherwise specified in the function arguments. Defaults
     * to a single space character, which is recommended in
     * [ISO 31-0](https://en.wikipedia.org/wiki/ISO_31-0#Numbers) and works
     * across Anglo-American and continental European languages.
     *
     * @since 1.2.2
     */
    private String thousandsSep;

    /**
     * The text for the menu item.
     *
     * @since 6.0.0
     */
    private String viewData;

    /**
     * Exporting module only. View the chart in full screen.
     *
     * @since 7.1.0
     */
    private String viewFullscreen;

    /**
     * An array containing the weekday names.
     */
    private String[] weekdays;

    /**
     * The title appearing on hovering the zoom in button. The text itself
     * defaults to "+" and can be changed in the button options.
     */
    private String zoomIn;

    /**
     * The title appearing on hovering the zoom out button. The text itself
     * defaults to "-" and can be changed in the button options.
     */
    private String zoomOut;

    /*
        Getters and Builder-Style Setters
    */
    public Accessibility getAccessibility() {
        return this.accessibility = getInstanceOf(Accessibility.class, this.accessibility);
    }

    public Lang setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    public String getContextButtonTitle() {
        return this.contextButtonTitle = getInstanceOf(String.class, this.contextButtonTitle);
    }

    public Lang setContextButtonTitle(String contextButtonTitle) {
        this.contextButtonTitle = contextButtonTitle;
        return this;
    }

    public String getDecimalPoint() {
        return this.decimalPoint = getInstanceOf(String.class, this.decimalPoint);
    }

    public Lang setDecimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
        return this;
    }

    public String getDownloadCSV() {
        return this.downloadCSV = getInstanceOf(String.class, this.downloadCSV);
    }

    public Lang setDownloadCSV(String downloadCSV) {
        this.downloadCSV = downloadCSV;
        return this;
    }

    public String getDownloadJPEG() {
        return this.downloadJPEG = getInstanceOf(String.class, this.downloadJPEG);
    }

    public Lang setDownloadJPEG(String downloadJPEG) {
        this.downloadJPEG = downloadJPEG;
        return this;
    }

    public String getDownloadPDF() {
        return this.downloadPDF = getInstanceOf(String.class, this.downloadPDF);
    }

    public Lang setDownloadPDF(String downloadPDF) {
        this.downloadPDF = downloadPDF;
        return this;
    }

    public String getDownloadPNG() {
        return this.downloadPNG = getInstanceOf(String.class, this.downloadPNG);
    }

    public Lang setDownloadPNG(String downloadPNG) {
        this.downloadPNG = downloadPNG;
        return this;
    }

    public String getDownloadSVG() {
        return this.downloadSVG = getInstanceOf(String.class, this.downloadSVG);
    }

    public Lang setDownloadSVG(String downloadSVG) {
        this.downloadSVG = downloadSVG;
        return this;
    }

    public String getDownloadXLS() {
        return this.downloadXLS = getInstanceOf(String.class, this.downloadXLS);
    }

    public Lang setDownloadXLS(String downloadXLS) {
        this.downloadXLS = downloadXLS;
        return this;
    }

    public String getDrillUpText() {
        return this.drillUpText = getInstanceOf(String.class, this.drillUpText);
    }

    public Lang setDrillUpText(String drillUpText) {
        this.drillUpText = drillUpText;
        return this;
    }

    public String getInvalidDate() {
        return this.invalidDate = getInstanceOf(String.class, this.invalidDate);
    }

    public Lang setInvalidDate(String invalidDate) {
        this.invalidDate = invalidDate;
        return this;
    }

    public String getLoading() {
        return this.loading = getInstanceOf(String.class, this.loading);
    }

    public Lang setLoading(String loading) {
        this.loading = loading;
        return this;
    }

    public String[] getMonths() {
        return this.months = getInstanceOf(String[].class, this.months);
    }

    public Lang setMonths(String[] months) {
        this.months = months;
        return this;
    }

    public Object getNavigation() {
        return this.navigation = getInstanceOf(Object.class, this.navigation);
    }

    public Lang setNavigation(Object navigation) {
        this.navigation = navigation;
        return this;
    }

    public String getNoData() {
        return this.noData = getInstanceOf(String.class, this.noData);
    }

    public Lang setNoData(String noData) {
        this.noData = noData;
        return this;
    }

    public Integer getNumericSymbolMagnitude() {
        return this.numericSymbolMagnitude = getInstanceOf(Integer.class, this.numericSymbolMagnitude);
    }

    public Lang setNumericSymbolMagnitude(Integer numericSymbolMagnitude) {
        this.numericSymbolMagnitude = numericSymbolMagnitude;
        return this;
    }

    public String[] getNumericSymbols() {
        return this.numericSymbols = getInstanceOf(String[].class, this.numericSymbols);
    }

    public Lang setNumericSymbols(String[] numericSymbols) {
        this.numericSymbols = numericSymbols;
        return this;
    }

    public String getOpenInCloud() {
        return this.openInCloud = getInstanceOf(String.class, this.openInCloud);
    }

    public Lang setOpenInCloud(String openInCloud) {
        this.openInCloud = openInCloud;
        return this;
    }

    public String getPrintChart() {
        return this.printChart = getInstanceOf(String.class, this.printChart);
    }

    public Lang setPrintChart(String printChart) {
        this.printChart = printChart;
        return this;
    }

    public String getRangeSelectorFrom() {
        return this.rangeSelectorFrom = getInstanceOf(String.class, this.rangeSelectorFrom);
    }

    public Lang setRangeSelectorFrom(String rangeSelectorFrom) {
        this.rangeSelectorFrom = rangeSelectorFrom;
        return this;
    }

    public String getRangeSelectorTo() {
        return this.rangeSelectorTo = getInstanceOf(String.class, this.rangeSelectorTo);
    }

    public Lang setRangeSelectorTo(String rangeSelectorTo) {
        this.rangeSelectorTo = rangeSelectorTo;
        return this;
    }

    public String getRangeSelectorZoom() {
        return this.rangeSelectorZoom = getInstanceOf(String.class, this.rangeSelectorZoom);
    }

    public Lang setRangeSelectorZoom(String rangeSelectorZoom) {
        this.rangeSelectorZoom = rangeSelectorZoom;
        return this;
    }

    public String getResetZoom() {
        return this.resetZoom = getInstanceOf(String.class, this.resetZoom);
    }

    public Lang setResetZoom(String resetZoom) {
        this.resetZoom = resetZoom;
        return this;
    }

    public String getResetZoomTitle() {
        return this.resetZoomTitle = getInstanceOf(String.class, this.resetZoomTitle);
    }

    public Lang setResetZoomTitle(String resetZoomTitle) {
        this.resetZoomTitle = resetZoomTitle;
        return this;
    }

    public String[] getShortMonths() {
        return this.shortMonths = getInstanceOf(String[].class, this.shortMonths);
    }

    public Lang setShortMonths(String[] shortMonths) {
        this.shortMonths = shortMonths;
        return this;
    }

    public String[] getShortWeekdays() {
        return this.shortWeekdays = getInstanceOf(String[].class, this.shortWeekdays);
    }

    public Lang setShortWeekdays(String[] shortWeekdays) {
        this.shortWeekdays = shortWeekdays;
        return this;
    }

    public StockTools getStockTools() {
        return this.stockTools = getInstanceOf(StockTools.class, this.stockTools);
    }

    public Lang setStockTools(StockTools stockTools) {
        this.stockTools = stockTools;
        return this;
    }

    public String getThousandsSep() {
        return this.thousandsSep = getInstanceOf(String.class, this.thousandsSep);
    }

    public Lang setThousandsSep(String thousandsSep) {
        this.thousandsSep = thousandsSep;
        return this;
    }

    public String getViewData() {
        return this.viewData = getInstanceOf(String.class, this.viewData);
    }

    public Lang setViewData(String viewData) {
        this.viewData = viewData;
        return this;
    }

    public String getViewFullscreen() {
        return this.viewFullscreen = getInstanceOf(String.class, this.viewFullscreen);
    }

    public Lang setViewFullscreen(String viewFullscreen) {
        this.viewFullscreen = viewFullscreen;
        return this;
    }

    public String[] getWeekdays() {
        return this.weekdays = getInstanceOf(String[].class, this.weekdays);
    }

    public Lang setWeekdays(String[] weekdays) {
        this.weekdays = weekdays;
        return this;
    }

    public String getZoomIn() {
        return this.zoomIn = getInstanceOf(String.class, this.zoomIn);
    }

    public Lang setZoomIn(String zoomIn) {
        this.zoomIn = zoomIn;
        return this;
    }

    public String getZoomOut() {
        return this.zoomOut = getInstanceOf(String.class, this.zoomOut);
    }

    public Lang setZoomOut(String zoomOut) {
        this.zoomOut = zoomOut;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.accessibility);
        hash = 17 * hash + Objects.hashCode(this.contextButtonTitle);
        hash = 17 * hash + Objects.hashCode(this.decimalPoint);
        hash = 17 * hash + Objects.hashCode(this.downloadCSV);
        hash = 17 * hash + Objects.hashCode(this.downloadJPEG);
        hash = 17 * hash + Objects.hashCode(this.downloadPDF);
        hash = 17 * hash + Objects.hashCode(this.downloadPNG);
        hash = 17 * hash + Objects.hashCode(this.downloadSVG);
        hash = 17 * hash + Objects.hashCode(this.downloadXLS);
        hash = 17 * hash + Objects.hashCode(this.drillUpText);
        hash = 17 * hash + Objects.hashCode(this.invalidDate);
        hash = 17 * hash + Objects.hashCode(this.loading);
        hash = 17 * hash + Objects.hashCode(this.months);
        hash = 17 * hash + Objects.hashCode(this.navigation);
        hash = 17 * hash + Objects.hashCode(this.noData);
        hash = 17 * hash + Objects.hashCode(this.numericSymbolMagnitude);
        hash = 17 * hash + Objects.hashCode(this.numericSymbols);
        hash = 17 * hash + Objects.hashCode(this.openInCloud);
        hash = 17 * hash + Objects.hashCode(this.printChart);
        hash = 17 * hash + Objects.hashCode(this.rangeSelectorFrom);
        hash = 17 * hash + Objects.hashCode(this.rangeSelectorTo);
        hash = 17 * hash + Objects.hashCode(this.rangeSelectorZoom);
        hash = 17 * hash + Objects.hashCode(this.resetZoom);
        hash = 17 * hash + Objects.hashCode(this.resetZoomTitle);
        hash = 17 * hash + Objects.hashCode(this.shortMonths);
        hash = 17 * hash + Objects.hashCode(this.shortWeekdays);
        hash = 17 * hash + Objects.hashCode(this.stockTools);
        hash = 17 * hash + Objects.hashCode(this.thousandsSep);
        hash = 17 * hash + Objects.hashCode(this.viewData);
        hash = 17 * hash + Objects.hashCode(this.viewFullscreen);
        hash = 17 * hash + Objects.hashCode(this.weekdays);
        hash = 17 * hash + Objects.hashCode(this.zoomIn);
        hash = 17 * hash + Objects.hashCode(this.zoomOut);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "accessibility:" + accessibility
                + ", contextButtonTitle:" + contextButtonTitle
                + ", decimalPoint:" + decimalPoint
                + ", downloadCSV:" + downloadCSV
                + ", downloadJPEG:" + downloadJPEG
                + ", downloadPDF:" + downloadPDF
                + ", downloadPNG:" + downloadPNG
                + ", downloadSVG:" + downloadSVG
                + ", downloadXLS:" + downloadXLS
                + ", drillUpText:" + drillUpText
                + ", invalidDate:" + invalidDate
                + ", loading:" + loading
                + ", months:" + months
                + ", navigation:" + navigation
                + ", noData:" + noData
                + ", numericSymbolMagnitude:" + numericSymbolMagnitude
                + ", numericSymbols:" + numericSymbols
                + ", openInCloud:" + openInCloud
                + ", printChart:" + printChart
                + ", rangeSelectorFrom:" + rangeSelectorFrom
                + ", rangeSelectorTo:" + rangeSelectorTo
                + ", rangeSelectorZoom:" + rangeSelectorZoom
                + ", resetZoom:" + resetZoom
                + ", resetZoomTitle:" + resetZoomTitle
                + ", shortMonths:" + shortMonths
                + ", shortWeekdays:" + shortWeekdays
                + ", stockTools:" + stockTools
                + ", thousandsSep:" + thousandsSep
                + ", viewData:" + viewData
                + ", viewFullscreen:" + viewFullscreen
                + ", weekdays:" + weekdays
                + ", zoomIn:" + zoomIn
                + ", zoomOut:" + zoomOut
                + '}';
    }


    @Override
    public String hydrateClass() {
        return this.deflateFields();
    }

}