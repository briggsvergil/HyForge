package za.co.onlineintelligence.hyforge.exporting;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.HighchartsOptions;
import za.co.onlineintelligence.hyforge.accessibility.Accessibility;
import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsExportingMimeTypeValue;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Exporting  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Exporting implements Serializable, Exportable {


    public Exporting() {
    }

    /**
     * Accessibility options for the exporting menu. Requires the
     * Accessibility module.
     *
     * @since 7.1.0
     */
    private Accessibility accessibility;

    /**
     * Experimental setting to allow HTML inside the chart (added through
     * the `useHTML` options), directly in the exported image. This allows
     * you to preserve complicated HTML structures like tables or bi-directional
     * text in exported charts.
     * <p>
     * Disclaimer: The HTML is rendered in a `foreignObject` tag in the
     * generated SVG. The official export server is based on PhantomJS,
     * which supports this, but other SVG clients, like Batik, does not
     * support it. This also applies to downloaded SVG that you want to
     * open in a desktop client.
     *
     * @since 4.1.8
     */
    private Boolean allowHTML;

    /**
     * Options for the export related buttons, print and export. In addition
     * to the default buttons listed here, custom buttons can be added.
     * See [navigation.buttonOptions](#navigation.buttonOptions) for general
     * options.
     */
    private ExportButtons buttons;

    /**
     * Additional chart options to be merged into the chart before exporting to
     * an image format. This does not apply to printing the chart via the export
     * menu.
     * <p>
     * For example, a common use case is to add data labels to improve
     * readability of the exported chart, or to add a printer-friendly color
     * scheme to exported PDFs.
     */
    private HighchartsOptions chartOptions;

    /**
     * Options for exporting data to CSV or ExCel, or displaying the data
     * in a HTML table or a JavaScript structure.
     * <p>
     * This module adds data export options to the export menu and provides
     * functions like `Chart.getCSV`, `Chart.getTable`, `Chart.getDataRows`
     * and `Chart.viewData`.
     * <p>
     * The XLS converter is limited and only creates a HTML string that is
     * passed for download, which works but creates a warning before
     * opening. The workaround for this is to use a third party XLSX
     * converter, as demonstrated in the sample below.
     *
     * @since 6.0.0
     */
    private Csv csv;

    /**
     * Whether to enable the exporting module. Disabling the module will
     * hide the context button, but API methods will still be available.
     *
     * @since 2.0.0
     */
    private Boolean enabled;

    /**
     * Function to call if the offline-exporting module fails to export
     * a chart on the client side, and [fallbackToExportServer](#exporting.fallbackToExportServer) is disabled. If left undefined, an
     * exception is thrown instead. Receives two parameters, the exporting
     * options, and the error from the module.
     *
     * @since 5.0.0
     */
    private HighchartsCallbackFunction error;

    /**
     * Whether or not to fall back to the export server if the offline-exporting
     * module is unable to export the chart on the client side. This happens for
     * certain browsers, and certain features (e.g.
     * [allowHTML](#exporting.allowHTML)), depending on the image type exporting
     * to. For very complex charts, it is possible that export can fail in
     * browsers that don't support Blob objects, due to data URL length limits.
     * It is recommended to define the [exporting.error](#exporting.error)
     * handler if disabling fallback, in order to notify users in case export
     * fails.
     *
     * @since 4.1.8
     */
    private Boolean fallbackToExportServer;

    /**
     * The filename, without extension, to use for the exported chart.
     *
     * @since 2.0.0
     */
    private String filename;

    /**
     * An object containing additional key value data for the POST form that
     * sends the SVG to the export server. For example, a `target` can be set to
     * make sure the generated image is received in another frame, or a custom
     * `enctype` or `encoding` can be set.
     *
     * @since 3.0.8
     */
    private Map<String, Object> formAttributes;

    /**
     * Path where Highcharts will look for export module dependencies to
     * load on demand if they don't already exist on `window`. Should currently
     * point to location of [CanVG](https://github.com/canvg/canvg) library,
     * [RGBColor.js](https://github.com/canvg/canvg),
     * [jsPDF](https://github.com/yWorks/jsPDF) and
     * [svg2pdf.js](https://github.com/yWorks/svg2pdf.js), required for client
     * side export in certain browsers.
     *
     * @since 5.0.0
     */
    private String libURL;

    /**
     * An object consisting of definitions for the menu items in the context
     * menu. Each key value pair has a `key` that is referenced in the
     * [menuItems](#exporting.buttons.contextButton.menuItems) setting,
     * and a `value`, which is an object with the following properties:
     * <p>
     * - **onclick:** The click handler for the menu item
     * <p>
     * - **text:** The text for the menu item
     * <p>
     * - **textKey:** If internationalization is required, the key to a language
     * string
     *
     * @since 5.0.13
     */
    private Map<String, HighchartsExportingMenuObject> menuItemDefinitions;

    /**
     * When printing the chart from the menu item in the burger menu, if
     * the on-screen chart exceeds this width, it is resized. After printing
     * or cancelled, it is restored. The default width makes the chart
     * fit into typical paper format. Note that this does not affect the
     * chart when printing the web page as a whole.
     *
     * @since 4.2.5
     */
    private Integer printMaxWidth;

    /**
     * Defines the scale or zoom factor for the exported image compared
     * to the on-screen display. While for instance a 600px wide chart
     * may look good on a website, it will look bad in print. The default
     * scale of 2 makes this chart export to a 1200px PNG or JPG.
     *
     * @since 3.0.0
     */
    private Integer scale;

    /**
     * Show a HTML table below the chart with the chart's current data.
     *
     * @since 6.0.0
     */
    private Boolean showTable;

    /**
     * Analogous to [sourceWidth](#exporting.sourceWidth).
     *
     * @since 3.0.0
     */
    private Integer sourceHeight;

    /**
     * The width of the original chart when exported, unless an explicit
     * [chart.width](#chart.width) is set, or a pixel width is set on the
     * container. The width exported raster image is then multiplied by
     * [scale](#exporting.scale).
     *
     * @since 3.0.0
     */
    private Integer sourceWidth;

    /**
     * Caption for the data table. Same as chart title by default. Set to
     * `false` to disable.
     *
     * @since 6.0.4
     */
    private String tableCaption;

    /**
     * Default MIME type for exporting if `chart.exportChart()` is called
     * without specifying a `type` option. Possible values are `image/png`,
     * `image/jpeg`, `application/pdf` and `image/svg+xml`.
     *
     * @since 2.0.0
     */
    private HighchartsExportingMimeTypeValue type;

    /**
     * The URL for the server module converting the SVG string to an image
     * format. By default this points to Highchart's free web service.
     *
     * @since 2.0.0
     */
    private String url;

    /**
     * Use multi level headers in data table. If [csv.columnHeaderFormatter](#exporting.csv.columnHeaderFormatter) is defined, it has to return
     * objects in order for multi level headers to work.
     *
     * @since 6.0.4
     */
    private Boolean useMultiLevelHeaders;

    /**
     * If using multi level table headers, use rowspans for headers that
     * have only one level.
     *
     * @since 6.0.4
     */
    private Boolean useRowspanHeaders;

    /**
     * The pixel width of charts exported to PNG or JPG. As of Highcharts
     * 3.0, the default pixel width is a function of the [chart.width](#chart.width) or [exporting.sourceWidth](#exporting.sourceWidth) and the
     * [exporting.scale](#exporting.scale).
     *
     * @since 2.0.0
     */
    private Integer width;

    /*
        Getters and Builder-Style Setters
    */
    public Accessibility getAccessibility() {
        return this.accessibility = getInstanceOf(Accessibility.class, this.accessibility);
    }

    public Exporting setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    public Boolean getAllowHTML() {
        return this.allowHTML = getInstanceOf(Boolean.class, this.allowHTML);
    }

    public Exporting setAllowHTML(Boolean allowHTML) {
        this.allowHTML = allowHTML;
        return this;
    }

    public ExportButtons getButtons() {
        return this.buttons = getInstanceOf(ExportButtons.class, this.buttons);
    }

    public Exporting setButtons(ExportButtons buttons) {
        this.buttons = buttons;
        return this;
    }

    public HighchartsOptions getChartOptions() {
        return this.chartOptions = getInstanceOf(HighchartsOptions.class, this.chartOptions);
    }

    public Exporting setChartOptions(HighchartsOptions chartOptions) {
        this.chartOptions = chartOptions;
        return this;
    }

    public Csv getCsv() {
        return this.csv = getInstanceOf(Csv.class, this.csv);
    }

    public Exporting setCsv(Csv csv) {
        this.csv = csv;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled = getInstanceOf(Boolean.class, this.enabled);
    }

    public Exporting setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HighchartsCallbackFunction getError() {
        return this.error = getInstanceOf(HighchartsCallbackFunction.class, this.error);
    }

    public Exporting setError(HighchartsCallbackFunction error) {
        this.error = error;
        return this;
    }

    public Boolean getFallbackToExportServer() {
        return this.fallbackToExportServer = getInstanceOf(Boolean.class, this.fallbackToExportServer);
    }

    public Exporting setFallbackToExportServer(Boolean fallbackToExportServer) {
        this.fallbackToExportServer = fallbackToExportServer;
        return this;
    }

    public String getFilename() {
        return this.filename = getInstanceOf(String.class, this.filename);
    }

    public Exporting setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public Map<String, Object> getFormAttributes() {
        return this.formAttributes = getInstanceOf(Map.class, this.formAttributes);
    }

    public Exporting setFormAttributes(Map<String, Object> formAttributes) {
        this.formAttributes = formAttributes;
        return this;
    }

    public String getLibURL() {
        return this.libURL = getInstanceOf(String.class, this.libURL);
    }

    public Exporting setLibURL(String libURL) {
        this.libURL = libURL;
        return this;
    }

    public Map<String, HighchartsExportingMenuObject> getMenuItemDefinitions() {
        return this.menuItemDefinitions = getInstanceOf(Map.class, this.menuItemDefinitions);
    }

    public Exporting setMenuItemDefinitions(Map<String, HighchartsExportingMenuObject> menuItemDefinitions) {
        this.menuItemDefinitions = menuItemDefinitions;
        return this;
    }

    public Integer getPrintMaxWidth() {
        return this.printMaxWidth = getInstanceOf(Integer.class, this.printMaxWidth);
    }

    public Exporting setPrintMaxWidth(Integer printMaxWidth) {
        this.printMaxWidth = printMaxWidth;
        return this;
    }

    public Integer getScale() {
        return this.scale = getInstanceOf(Integer.class, this.scale);
    }

    public Exporting setScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    public Boolean getShowTable() {
        return this.showTable = getInstanceOf(Boolean.class, this.showTable);
    }

    public Exporting setShowTable(Boolean showTable) {
        this.showTable = showTable;
        return this;
    }

    public Integer getSourceHeight() {
        return this.sourceHeight = getInstanceOf(Integer.class, this.sourceHeight);
    }

    public Exporting setSourceHeight(Integer sourceHeight) {
        this.sourceHeight = sourceHeight;
        return this;
    }

    public Integer getSourceWidth() {
        return this.sourceWidth = getInstanceOf(Integer.class, this.sourceWidth);
    }

    public Exporting setSourceWidth(Integer sourceWidth) {
        this.sourceWidth = sourceWidth;
        return this;
    }

    public String getTableCaption() {
        return this.tableCaption = getInstanceOf(String.class, this.tableCaption);
    }

    public Exporting setTableCaption(String tableCaption) {
        this.tableCaption = tableCaption;
        return this;
    }

    public HighchartsExportingMimeTypeValue getType() {
        return this.type = getInstanceOf(HighchartsExportingMimeTypeValue.class, this.type);
    }

    public Exporting setType(HighchartsExportingMimeTypeValue type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return this.url = getInstanceOf(String.class, this.url);
    }

    public Exporting setUrl(String url) {
        this.url = url;
        return this;
    }

    public Boolean getUseMultiLevelHeaders() {
        return this.useMultiLevelHeaders = getInstanceOf(Boolean.class, this.useMultiLevelHeaders);
    }

    public Exporting setUseMultiLevelHeaders(Boolean useMultiLevelHeaders) {
        this.useMultiLevelHeaders = useMultiLevelHeaders;
        return this;
    }

    public Boolean getUseRowspanHeaders() {
        return this.useRowspanHeaders = getInstanceOf(Boolean.class, this.useRowspanHeaders);
    }

    public Exporting setUseRowspanHeaders(Boolean useRowspanHeaders) {
        this.useRowspanHeaders = useRowspanHeaders;
        return this;
    }

    public Integer getWidth() {
        return this.width = getInstanceOf(Integer.class, this.width);
    }

    public Exporting setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.accessibility);
        hash = 17 * hash + Objects.hashCode(this.allowHTML);
        hash = 17 * hash + Objects.hashCode(this.buttons);
        hash = 17 * hash + Objects.hashCode(this.chartOptions);
        hash = 17 * hash + Objects.hashCode(this.csv);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.error);
        hash = 17 * hash + Objects.hashCode(this.fallbackToExportServer);
        hash = 17 * hash + Objects.hashCode(this.filename);
        hash = 17 * hash + Objects.hashCode(this.formAttributes);
        hash = 17 * hash + Objects.hashCode(this.libURL);
        hash = 17 * hash + Objects.hashCode(this.menuItemDefinitions);
        hash = 17 * hash + Objects.hashCode(this.printMaxWidth);
        hash = 17 * hash + Objects.hashCode(this.scale);
        hash = 17 * hash + Objects.hashCode(this.showTable);
        hash = 17 * hash + Objects.hashCode(this.sourceHeight);
        hash = 17 * hash + Objects.hashCode(this.sourceWidth);
        hash = 17 * hash + Objects.hashCode(this.tableCaption);
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + Objects.hashCode(this.url);
        hash = 17 * hash + Objects.hashCode(this.useMultiLevelHeaders);
        hash = 17 * hash + Objects.hashCode(this.useRowspanHeaders);
        hash = 17 * hash + Objects.hashCode(this.width);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "accessibility:" + accessibility
                + ", allowHTML:" + allowHTML
                + ", buttons:" + buttons
                + ", chartOptions:" + chartOptions
                + ", csv:" + csv
                + ", enabled:" + enabled
                + ", error:" + error
                + ", fallbackToExportServer:" + fallbackToExportServer
                + ", filename:" + filename
                + ", formAttributes:" + formAttributes
                + ", libURL:" + libURL
                + ", menuItemDefinitions:" + menuItemDefinitions
                + ", printMaxWidth:" + printMaxWidth
                + ", scale:" + scale
                + ", showTable:" + showTable
                + ", sourceHeight:" + sourceHeight
                + ", sourceWidth:" + sourceWidth
                + ", tableCaption:" + tableCaption
                + ", type:" + type
                + ", url:" + url
                + ", useMultiLevelHeaders:" + useMultiLevelHeaders
                + ", useRowspanHeaders:" + useRowspanHeaders
                + ", width:" + width
                + '}';
    }


}