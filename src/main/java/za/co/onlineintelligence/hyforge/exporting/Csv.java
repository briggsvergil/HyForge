package za.co.onlineintelligence.hyforge.exporting;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Csv  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Csv implements Serializable, DrosteDeflater {


    public Csv() {
    }

    /**
     * Formatter callback for the column headers. Parameters are:
     * - `item` - The series or axis object)
     * - `key` -  The point key, for example y or z
     * - `keyLength` - The amount of value keys for this item, for
     * example a range series has the keys `low` and `high` so the
     * key length is 2.
     * <p>
     * If [useMultiLevelHeaders](#exporting.useMultiLevelHeaders) is
     * true, columnHeaderFormatter by default returns an object with
     * columnTitle and topLevelColumnTitle for each key. Columns with
     * the same topLevelColumnTitle have their titles merged into a
     * single cell with colspan for table/Excel export.
     * <p>
     * If `useMultiLevelHeaders` is false, or for CSV export, it returns
     * the series name, followed by the key if there is more than one
     * key.
     * <p>
     * For the axis it returns the axis title or "Category" or
     * "DateTime" by default.
     * <p>
     * Return `false` to use Highcharts' proposed header.
     *
     * @since 6.0.0
     */
    private HighchartsCallbackFunction columnHeaderFormatter;

    /**
     * Which date format to use for exported dates on a datetime X axis.
     * See `Highcharts.dateFormat`.
     *
     * @since 6.0.0
     */
    private String dateFormat;

    /**
     * Which decimal point to use for exported CSV. Defaults to the same
     * as the browser locale, typically `.` (English) or `,` (German,
     * French etc).
     *
     * @since 6.0.4
     */
    private String decimalPoint;

    /**
     * The item delimiter in the exported data. Use `;` for direct
     * exporting to Excel. Defaults to a best guess based on the browser
     * locale. If the locale _decimal point_ is `,`, the `itemDelimiter`
     * defaults to `;`, otherwise the `itemDelimiter` defaults to `,`.
     *
     * @since 6.0.0
     */
    private String itemDelimiter;

    /**
     * The line delimiter in the exported data, defaults to a newline.
     *
     * @since 6.0.0
     */
    private String lineDelimiter;

    /*
        Getters and Builder-Style Setters
    */
    public HighchartsCallbackFunction getColumnHeaderFormatter() {
        return this.columnHeaderFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.columnHeaderFormatter);
    }

    public Csv setColumnHeaderFormatter(HighchartsCallbackFunction columnHeaderFormatter) {
        this.columnHeaderFormatter = columnHeaderFormatter;
        return this;
    }

    public String getDateFormat() {
        return this.dateFormat = getInstanceOf(String.class, this.dateFormat);
    }

    public Csv setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    public String getDecimalPoint() {
        return this.decimalPoint = getInstanceOf(String.class, this.decimalPoint);
    }

    public Csv setDecimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
        return this;
    }

    public String getItemDelimiter() {
        return this.itemDelimiter = getInstanceOf(String.class, this.itemDelimiter);
    }

    public Csv setItemDelimiter(String itemDelimiter) {
        this.itemDelimiter = itemDelimiter;
        return this;
    }

    public String getLineDelimiter() {
        return this.lineDelimiter = getInstanceOf(String.class, this.lineDelimiter);
    }

    public Csv setLineDelimiter(String lineDelimiter) {
        this.lineDelimiter = lineDelimiter;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.columnHeaderFormatter);
        hash = 17 * hash + Objects.hashCode(this.dateFormat);
        hash = 17 * hash + Objects.hashCode(this.decimalPoint);
        hash = 17 * hash + Objects.hashCode(this.itemDelimiter);
        hash = 17 * hash + Objects.hashCode(this.lineDelimiter);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "columnHeaderFormatter:" + columnHeaderFormatter
                + ", dateFormat:" + dateFormat
                + ", decimalPoint:" + decimalPoint
                + ", itemDelimiter:" + itemDelimiter
                + ", lineDelimiter:" + lineDelimiter
                + '}';
    }


}
