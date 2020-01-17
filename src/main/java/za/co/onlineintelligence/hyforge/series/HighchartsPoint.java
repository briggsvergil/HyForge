package za.co.onlineintelligence.hyforge.series;

import com.google.gson.JsonElement;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;
import za.co.onlineintelligence.hyforge.common.HighchartsDataGroupingInfo;

import java.io.Serializable;
import java.util.List;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * This class stands as a wrapper for all the information that can be set in the `data` structure for a series.
 *
 *
 * <p>
 * The following are valid data structures (Depending on chart type (BAR, AREA_RANGE, ) / axis type):
 * ========================================ONE SET FIELD========================================
 * 1. Array of only y values = data: [ 1, 2, 3, 4, 5, 6, ... ]
 * =======================================TWO SET FIELDS========================================
 * 2. Array of x and y tuples = data: [ [ 1, 10 ], [ 2, 20 ], [ 3, 30], ... ]
 * 3. Array of name and y tuples = data: [ [ 'A', 10 ], [ 'B', 20 ], [ 'C', 30 ], ... ]
 * 4. Array of dateTime X value (milliseconds) and Y point tuples =
 * data: [ [ Date.UTC(2018, 1, 1), 10 ], [ 1546304461, 20 ], ]
 * ======================================THREE SET FIELDS=======================================
 * 5. Array of X, Low, and High tuples =
 * data: [ [ 1, 1, 7 ], [ 2, 3, 10 ], [ 3, 2, 6 ], ... ]
 * 6. Array of Name, Low, and High tuples =
 * data: [ [ 'A', 1, 7 ], [ 'B', 3, 10 ], [ 'C', 2, 6 ], ... ]
 * 3. craziness...dictionary of values.
 *
 * @author Sean Briggs
 */
public class HighchartsPoint implements Serializable, DrosteDeflater {

    private String category;
    private HighchartsColor color;
    private Integer colorIndex;
    private HighchartsDataGroupingInfo dataGroupingInfo;
    private Integer high;
    private Integer index;
    private Integer low;
    private String name;
    private HighchartsPointOptions options;
    private Series series;
    private Boolean sliced;
    private Integer total;
    private Boolean visible;
    private Object x;
    private Object y;

    public HighchartsPoint() {
    }

    public String getCategory() {
        return this.category = getInstanceOf(String.class, this.category);
    }

    public HighchartsPoint setCategory(String category) {
        this.category = category;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public HighchartsPoint setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public HighchartsPoint setColor(String colorString) {
        this.color = new HighchartsColorString(colorString);
        return this;
    }

    public Integer getColorIndex() {
        return this.colorIndex = getInstanceOf(Integer.class, this.colorIndex);
    }

    public HighchartsPoint setColorIndex(Integer colorIndex) {
        this.colorIndex = colorIndex;
        return this;
    }

    public HighchartsDataGroupingInfo getDataGroupingInfo() {
        return this.dataGroupingInfo = getInstanceOf(HighchartsDataGroupingInfo.class, this.dataGroupingInfo);
    }

    public HighchartsPoint setDataGroupingInfo(HighchartsDataGroupingInfo dataGroupingInfo) {
        this.dataGroupingInfo = dataGroupingInfo;
        return this;
    }

    public Integer getHigh() {
        return this.high = getInstanceOf(Integer.class, this.high);
    }

    public HighchartsPoint setHigh(Integer high) {
        this.high = high;
        return this;
    }

    public int getIndex() {
        return this.index = getInstanceOf(int.class, this.index);
    }

    public HighchartsPoint setIndex(int index) {
        this.index = index;
        return this;
    }

    public Integer getLow() {
        return this.low = getInstanceOf(Integer.class, this.low);
    }

    public HighchartsPoint setLow(Integer low) {
        this.low = low;
        return this;
    }

    public String getName() {
        return this.name = getInstanceOf(String.class, this.name);
    }

    public HighchartsPoint setName(String name) {
        this.name = name;
        return this;
    }

    public HighchartsPointOptions getOptions() {
        return this.options = getInstanceOf(HighchartsPointOptions.class, this.options);
    }

    public HighchartsPoint setOptions(HighchartsPointOptions options) {
        this.options = options;
        return this;
    }

    public Series getSeries() {
        return this.series = getInstanceOf(Series.class, this.series);
    }

    public HighchartsPoint setSeries(Series series) {
        this.series = series;
        return this;
    }

    public Boolean getSliced() {
        return this.sliced = getInstanceOf(Boolean.class, this.sliced);
    }

    public HighchartsPoint setSliced(Boolean sliced) {
        this.sliced = sliced;
        return this;
    }

    public Integer getTotal() {
        return this.total = getInstanceOf(Integer.class, this.total);
    }

    public HighchartsPoint setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public boolean isVisible() {
        return this.visible = getInstanceOf(boolean.class, this.visible);
    }

    public HighchartsPoint setVisible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public Object getX() {
        return this.x = getInstanceOf(Object.class, this.x);
    }

    public HighchartsPoint setX(Object x) {
        this.x = x;
        return this;
    }

    public Object getY() {
        return this.y = getInstanceOf(Object.class, this.y);
    }

    public HighchartsPoint setY(Object y) {
        this.y = y;
        return this;
    }

    @Override
    public String deflateFields(boolean ignoreName, String nameDelegate, int tabLevel) {
        List<String> setFields = this.getSetFields();
        int len = setFields.size();

        if (len > 0) {
            if (len == 1) {
                if (setFields.contains("y")) {
                    return this.y + "";
                } else {
                    return "";
                }
            } else if (len == 2) {
                if (setFields.contains("y"))
                    if (setFields.contains("x")) {
                        return "[" + this.x + ", " + this.y + "]";
                    } else if (setFields.contains("name")) {
                        return "['" + this.name + "', " + this.y + "]";
                    }
            } else if (len == 3) {
                if (setFields.contains("low") && setFields.contains("high")) {
                    if (setFields.contains("x")) {
                        return "[" + this.x + ", " + this.low + ", " + this.high + "]";
                    } else if (setFields.contains("name")) {
                        return "[" + this.name + ", " + this.low + ", " + this.high + "]";
                    }
                }
            } else {
                //else delegate back to superclass
                DrosteDeflater.super.deflateFields(ignoreName, nameDelegate, tabLevel);
            }
        } else {
            return null;
        }
        return null;
    }
}
