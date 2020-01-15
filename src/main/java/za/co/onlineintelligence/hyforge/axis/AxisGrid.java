/*
 */
package za.co.onlineintelligence.hyforge.axis;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * AxisGrid HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class AxisGrid implements Serializable, DrosteDeflater {

    public AxisGrid() {
    }

    /**
     * Set border color for the label grid lines.
     *
     * @since 6.2.0
     */
    private HighchartsColorString borderColor;

    /**
     * Set border width of the label grid lines.
     *
     * @since 6.2.0
     */
    private int borderWidth;

    /**
     * Set cell height for grid axis labels. By default this is calculated from
     * font size. This option only applies to horizontal axes.
     *
     * @since 6.2.0
     */
    private int cellHeight;

    /**
     * Set specific options for each column (or row for horizontal axes) in the
     * grid. Each extra column/row is its own axis, and the axis options can be
     * set here.
     *
     * @since 6.2.0
     */
    private Object columns;

    /**
     * Enable grid on the axis labels. Defaults to true for Gantt charts.
     *
     * @since 6.2.0
     */
    private boolean enabled;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartsColorString getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColorString.class, this.borderColor);
    }

    public AxisGrid setBorderColor(HighchartsColorString borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public int getBorderWidth() {
        return this.borderWidth = getInstanceOf(int.class, this.borderWidth);
    }

    public AxisGrid setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public int getCellHeight() {
        return this.cellHeight = getInstanceOf(int.class, this.cellHeight);
    }

    public AxisGrid setCellHeight(int cellHeight) {
        this.cellHeight = cellHeight;
        return this;
    }

    public Object getColumns() {
        return this.columns = getInstanceOf(Object.class, this.columns);
    }

    public AxisGrid setColumns(Object columns) {
        this.columns = columns;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public AxisGrid setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.cellHeight);
        hash = 17 * hash + Objects.hashCode(this.columns);
        hash = 17 * hash + Objects.hashCode(this.enabled);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "borderColor:" + borderColor
                + ", borderWidth:" + borderWidth
                + ", cellHeight:" + cellHeight
                + ", columns:" + columns
                + ", enabled:" + enabled
                + '}';
    }

}
