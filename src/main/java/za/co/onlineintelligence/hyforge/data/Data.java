package za.co.onlineintelligence.hyforge.data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Data  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Data implements Serializable, DrosteDeflater {


    public Data() {
    }

    /**
     * A callback function to modify the CSV before parsing it. Return the modified
     * string.
     *
     * @since 6.1.0
     */
    private HighchartsCallbackFunction beforeParse;

    /**
     * A two-dimensional array representing the input data on tabular form.
     * This input can be used when the data is already parsed, for example
     * from a grid view component. Each cell can be a string or number.
     * If not switchRowsAndColumns is set, the columns are interpreted as
     * series.
     *
     * @since 4.0.0
     */
    private Object[][] columns;

    /**
     * A URL to a remote JSON dataset, structured as a column array.
     * Will be fetched when the chart is created using Ajax.
     *
     * @since 4.0.0
     */
    private String columnsURL;

    /**
     * The callback that is evaluated when the data is finished loading,
     * optionally from an external source, and parsed. The first argument
     * passed is a finished chart options object, containing the series.
     * These options can be extended with additional options and passed
     * directly to the chart constructor.
     *
     * @since 4.0.0
     */
    private HighchartsCallbackFunction complete;

    /**
     * A comma delimited string to be parsed. Related options are [startRow](#data.startRow), [endRow](#data.endRow), [startColumn](#data.startColumn)
     * and [endColumn](#data.endColumn) to delimit what part of the table
     * is used. The [lineDelimiter](#data.lineDelimiter) and [itemDelimiter](#data.itemDelimiter) options define the CSV delimiter formats.
     * <p>
     * The built-in CSV parser doesn't support all flavours of CSV, so in
     * some cases it may be necessary to use an external CSV parser. See
     * [this example](https://jsfiddle.net/highcharts/u59176h4/) of parsing
     * CSV through the MIT licensed [Papa Parse](http://papaparse.com/)
     * library.
     *
     * @since 4.0.0
     */
    private String csv;

    /**
     * An URL to a remote CSV dataset. Will be fetched when the chart is created
     * using Ajax.
     *
     * @since 4.0.0
     */
    private String csvURL;

    /**
     * Sets the refresh rate for data polling when importing remote dataset by
     * setting [data.csvURL](data.csvURL), [data.rowsURL](data.rowsURL),
     * [data.columnsURL](data.columnsURL), or
     * [data.googleSpreadsheetKey](data.googleSpreadsheetKey).
     * <p>
     * Note that polling must be enabled by setting
     * [data.enablePolling](data.enablePolling) to true.
     * <p>
     * The value is the number of seconds between pollings.
     * It cannot be set to less than 1 second.
     *
     * @since 4.0.0
     */
    private Integer dataRefreshRate;

    /**
     * Which of the predefined date formats in Date.prototype.dateFormats
     * to use to parse date values. Defaults to a best guess based on what
     * format gives valid and ordered dates. Valid options include: `YYYY/mm/dd`,
     * `dd/mm/YYYY`, `mm/dd/YYYY`, `dd/mm/YY`, `mm/dd/YY`.
     *
     * @since 4.0.0
     */
    private String dateFormat;

    /**
     * The decimal point used for parsing numbers in the CSV.
     * <p>
     * If both this and data.delimiter is set to `undefined`, the parser will
     * attempt to deduce the decimal point automatically.
     *
     * @since 4.1.0
     */
    private String decimalPoint;

    /**
     * Enables automatic refetching of remote datasets every _n_ seconds (defined by
     * setting [data.dataRefreshRate](data.dataRefreshRate)).
     * <p>
     * Only works when either [data.csvURL](data.csvURL),
     * [data.rowsURL](data.rowsURL), [data.columnsURL](data.columnsURL), or
     * [data.googleSpreadsheetKey](data.googleSpreadsheetKey).
     *
     * @since 4.0.0
     */
    private Boolean enablePolling;

    /**
     * In tabular input data, the last column (indexed by 0) to use. Defaults
     * to the last column containing data.
     *
     * @since 4.0.0
     */
    private Integer endColumn;

    /**
     * In tabular input data, the last row (indexed by 0) to use. Defaults
     * to the last row containing data.
     *
     * @since 4.0.4
     */
    private Integer endRow;

    /**
     * Whether to use the first row in the data set as series names.
     *
     * @since 4.1.0
     */
    private Boolean firstRowAsNames;

    /**
     * The key for a Google Spreadsheet to load. See [general information
     * on GS](https://developers.google.com/gdata/samples/spreadsheet_sample).
     *
     * @since 4.0.0
     */
    private String googleSpreadsheetKey;

    /**
     * The Google Spreadsheet worksheet to use in combination with
     * [googleSpreadsheetKey](#data.googleSpreadsheetKey). The available id's from
     * your sheet can be read from `https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic`.
     *
     * @since 4.0.0
     */
    private String googleSpreadsheetWorksheet;

    /**
     * Item or cell delimiter for parsing CSV. Defaults to the tab character
     * `\t` if a tab character is found in the CSV string, if not it defaults
     * to `,`.
     * <p>
     * If this is set to false or undefined, the parser will attempt to deduce
     * the delimiter automatically.
     *
     * @since 4.0.0
     */
    private String itemDelimiter;

    /**
     * Line delimiter for parsing CSV.
     *
     * @since 4.0.0
     */
    private String lineDelimiter;

    /**
     * A callback function to parse string representations of dates into
     * JavaScript timestamps. Should return an integer timestamp on success.
     *
     * @since 4.0.0
     */
    private HighchartsCallbackFunction parseDate;

    /**
     * A callback function to access the parsed columns, the two-dimentional
     * input data array directly, before they are interpreted into series
     * data and categories. Return `false` to stop completion, or call
     * `this.complete()` to continue async.
     *
     * @since 4.0.0
     */
    private HighchartsCallbackFunction parsed;

    /**
     * The same as the columns input option, but defining rows intead of
     * columns.
     *
     * @since 4.0.0
     */
    private Object[][] rows;

    /**
     * A URL to a remote JSON dataset, structured as a row array.
     * Will be fetched when the chart is created using Ajax.
     *
     * @since 4.0.0
     */
    private String rowsURL;

    /**
     * An array containing dictionaries for each series. A dictionary exists of
     * Point property names as the key and the CSV column index as the value.
     *
     * @since 4.0.4
     */
    private List<Map<String, Integer>> seriesMapping;

    /**
     * In tabular input data, the first column (indexed by 0) to use.
     *
     * @since 4.0.0
     */
    private Integer startColumn;

    /**
     * In tabular input data, the first row (indexed by 0) to use.
     *
     * @since 4.0.0
     */
    private Integer startRow;

    /**
     * Switch rows and columns of the input data, so that `this.columns`
     * effectively becomes the rows of the data set, and the rows are interpreted
     * as series.
     *
     * @since 4.0.0
     */
    private Boolean switchRowsAndColumns;

    /**
     * An HTML table or the id of such to be parsed as input data. Related
     * options are `startRow`, `endRow`, `startColumn` and `endColumn` to
     * delimit what part of the table is used.
     *
     * @since 4.0.0
     */
    private String table;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsCallbackFunction getBeforeParse() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.beforeParse);
    }

    public Data setBeforeParse(HighchartsCallbackFunction beforeParse) {
        this.beforeParse = beforeParse;
        return this;
    }

    public Object[][] getColumns() {
        return getInstanceOf(Object[][].class, this.columns);
    }

    public Data setColumns(Object[][] columns) {
        this.columns = columns;
        return this;
    }

    public String getColumnsURL() {
        return getInstanceOf(String.class, this.columnsURL);
    }

    public Data setColumnsURL(String columnsURL) {
        this.columnsURL = columnsURL;
        return this;
    }

    public HighchartsCallbackFunction getComplete() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.complete);
    }

    public Data setComplete(HighchartsCallbackFunction complete) {
        this.complete = complete;
        return this;
    }

    public String getCsv() {
        return getInstanceOf(String.class, this.csv);
    }

    public Data setCsv(String csv) {
        this.csv = csv;
        return this;
    }

    public String getCsvURL() {
        return getInstanceOf(String.class, this.csvURL);
    }

    public Data setCsvURL(String csvURL) {
        this.csvURL = csvURL;
        return this;
    }

    public Integer getDataRefreshRate() {
        return getInstanceOf(Integer.class, this.dataRefreshRate);
    }

    public Data setDataRefreshRate(Integer dataRefreshRate) {
        this.dataRefreshRate = dataRefreshRate;
        return this;
    }

    public String getDateFormat() {
        return getInstanceOf(String.class, this.dateFormat);
    }

    public Data setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    public String getDecimalPoint() {
        return getInstanceOf(String.class, this.decimalPoint);
    }

    public Data setDecimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
        return this;
    }

    public Boolean getEnablePolling() {
        return getInstanceOf(Boolean.class, this.enablePolling);
    }

    public Data setEnablePolling(Boolean enablePolling) {
        this.enablePolling = enablePolling;
        return this;
    }

    public Integer getEndColumn() {
        return getInstanceOf(Integer.class, this.endColumn);
    }

    public Data setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
        return this;
    }

    public Integer getEndRow() {
        return getInstanceOf(Integer.class, this.endRow);
    }

    public Data setEndRow(Integer endRow) {
        this.endRow = endRow;
        return this;
    }

    public Boolean getFirstRowAsNames() {
        return getInstanceOf(Boolean.class, this.firstRowAsNames);
    }

    public Data setFirstRowAsNames(Boolean firstRowAsNames) {
        this.firstRowAsNames = firstRowAsNames;
        return this;
    }

    public String getGoogleSpreadsheetKey() {
        return getInstanceOf(String.class, this.googleSpreadsheetKey);
    }

    public Data setGoogleSpreadsheetKey(String googleSpreadsheetKey) {
        this.googleSpreadsheetKey = googleSpreadsheetKey;
        return this;
    }

    public String getGoogleSpreadsheetWorksheet() {
        return getInstanceOf(String.class, this.googleSpreadsheetWorksheet);
    }

    public Data setGoogleSpreadsheetWorksheet(String googleSpreadsheetWorksheet) {
        this.googleSpreadsheetWorksheet = googleSpreadsheetWorksheet;
        return this;
    }

    public String getItemDelimiter() {
        return getInstanceOf(String.class, this.itemDelimiter);
    }

    public Data setItemDelimiter(String itemDelimiter) {
        this.itemDelimiter = itemDelimiter;
        return this;
    }

    public String getLineDelimiter() {
        return getInstanceOf(String.class, this.lineDelimiter);
    }

    public Data setLineDelimiter(String lineDelimiter) {
        this.lineDelimiter = lineDelimiter;
        return this;
    }

    public HighchartsCallbackFunction getParseDate() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.parseDate);
    }

    public Data setParseDate(HighchartsCallbackFunction parseDate) {
        this.parseDate = parseDate;
        return this;
    }

    public HighchartsCallbackFunction getParsed() {
        return getInstanceOf(HighchartsCallbackFunction.class, this.parsed);
    }

    public Data setParsed(HighchartsCallbackFunction parsed) {
        this.parsed = parsed;
        return this;
    }

    public Object[][] getRows() {
        return getInstanceOf(Object[][].class, this.rows);
    }

    public Data setRows(Object[][] rows) {
        this.rows = rows;
        return this;
    }

    public String getRowsURL() {
        return getInstanceOf(String.class, this.rowsURL);
    }

    public Data setRowsURL(String rowsURL) {
        this.rowsURL = rowsURL;
        return this;
    }

    public List<Map<String, Integer>> getSeriesMapping() {
        return getInstanceOf(List.class, this.seriesMapping);
    }

    public Data setSeriesMapping(List<Map<String, Integer>> seriesMapping) {
        this.seriesMapping = seriesMapping;
        return this;
    }

    public Integer getStartColumn() {
        return getInstanceOf(Integer.class, this.startColumn);
    }

    public Data setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
        return this;
    }

    public Integer getStartRow() {
        return getInstanceOf(Integer.class, this.startRow);
    }

    public Data setStartRow(Integer startRow) {
        this.startRow = startRow;
        return this;
    }

    public Boolean getSwitchRowsAndColumns() {
        return getInstanceOf(Boolean.class, this.switchRowsAndColumns);
    }

    public Data setSwitchRowsAndColumns(Boolean switchRowsAndColumns) {
        this.switchRowsAndColumns = switchRowsAndColumns;
        return this;
    }

    public String getTable() {
        return getInstanceOf(String.class, this.table);
    }

    public Data setTable(String table) {
        this.table = table;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.beforeParse);
        hash = 17 * hash + Objects.hashCode(this.columns);
        hash = 17 * hash + Objects.hashCode(this.columnsURL);
        hash = 17 * hash + Objects.hashCode(this.complete);
        hash = 17 * hash + Objects.hashCode(this.csv);
        hash = 17 * hash + Objects.hashCode(this.csvURL);
        hash = 17 * hash + Objects.hashCode(this.dataRefreshRate);
        hash = 17 * hash + Objects.hashCode(this.dateFormat);
        hash = 17 * hash + Objects.hashCode(this.decimalPoint);
        hash = 17 * hash + Objects.hashCode(this.enablePolling);
        hash = 17 * hash + Objects.hashCode(this.endColumn);
        hash = 17 * hash + Objects.hashCode(this.endRow);
        hash = 17 * hash + Objects.hashCode(this.firstRowAsNames);
        hash = 17 * hash + Objects.hashCode(this.googleSpreadsheetKey);
        hash = 17 * hash + Objects.hashCode(this.googleSpreadsheetWorksheet);
        hash = 17 * hash + Objects.hashCode(this.itemDelimiter);
        hash = 17 * hash + Objects.hashCode(this.lineDelimiter);
        hash = 17 * hash + Objects.hashCode(this.parseDate);
        hash = 17 * hash + Objects.hashCode(this.parsed);
        hash = 17 * hash + Objects.hashCode(this.rows);
        hash = 17 * hash + Objects.hashCode(this.rowsURL);
        hash = 17 * hash + Objects.hashCode(this.seriesMapping);
        hash = 17 * hash + Objects.hashCode(this.startColumn);
        hash = 17 * hash + Objects.hashCode(this.startRow);
        hash = 17 * hash + Objects.hashCode(this.switchRowsAndColumns);
        hash = 17 * hash + Objects.hashCode(this.table);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "beforeParse:" + beforeParse
                + ", columns:" + columns
                + ", columnsURL:" + columnsURL
                + ", complete:" + complete
                + ", csv:" + csv
                + ", csvURL:" + csvURL
                + ", dataRefreshRate:" + dataRefreshRate
                + ", dateFormat:" + dateFormat
                + ", decimalPoint:" + decimalPoint
                + ", enablePolling:" + enablePolling
                + ", endColumn:" + endColumn
                + ", endRow:" + endRow
                + ", firstRowAsNames:" + firstRowAsNames
                + ", googleSpreadsheetKey:" + googleSpreadsheetKey
                + ", googleSpreadsheetWorksheet:" + googleSpreadsheetWorksheet
                + ", itemDelimiter:" + itemDelimiter
                + ", lineDelimiter:" + lineDelimiter
                + ", parseDate:" + parseDate
                + ", parsed:" + parsed
                + ", rows:" + rows
                + ", rowsURL:" + rowsURL
                + ", seriesMapping:" + seriesMapping
                + ", startColumn:" + startColumn
                + ", startRow:" + startRow
                + ", switchRowsAndColumns:" + switchRowsAndColumns
                + ", table:" + table
                + '}';
    }


}