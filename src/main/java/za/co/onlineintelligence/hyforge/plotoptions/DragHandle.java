package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;
import za.co.onlineintelligence.hyforge.common.HighchartsColor;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * DragHandle HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class DragHandle implements Serializable {


    public DragHandle() {
    }

    /**
     * The class name of the drag handles. Defaults to `highcharts-drag-handle`.
     *
     * @since 6.2.0
     */
    private String className;

    /**
     * The fill color of the drag handles.
     *
     * @since 6.2.0
     */
    private HighchartsColor color;

    /**
     * The mouse cursor to use for the drag handles. By default this is
     * intelligently switching between `ew-resize` and `ns-resize` depending on
     * the direction the point is being dragged.
     *
     * @since 6.2.0
     */
    private String cursor;

    /**
     * The line color of the drag handles.
     *
     * @since 6.2.0
     */
    private HighchartsColorString lineColor;

    /**
     * The line width for the drag handles.
     *
     * @since 6.2.0
     */
    private int lineWidth;

    /**
     * Function to define the SVG path to use for the drag handles. Takes the
     * point as argument. Should return an SVG path in array format. The SVG
     * path is automatically positioned on the point.
     *
     * @since 6.2.0
     */
    private HighchartsCallbackFunction pathFormatter;

    /**
     * The z index for the drag handles.
     *
     * @since 6.2.0
     */
    private int zIndex;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public String getClassName() {
        return this.className = getInstanceOf(String.class, this.className);
    }

    public DragHandle setClassName(String className) {
        this.className = className;
        return this;
    }

    public HighchartsColor getColor() {
        return this.color = getInstanceOf(HighchartsColor.class, this.color);
    }

    public DragHandle setColor(HighchartsColor color) {
        this.color = color;
        return this;
    }

    public String getCursor() {
        return this.cursor = getInstanceOf(String.class, this.cursor);
    }

    public DragHandle setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public HighchartsColorString getLineColor() {
        return this.lineColor = getInstanceOf(HighchartsColorString.class, this.lineColor);
    }

    public DragHandle setLineColor(HighchartsColorString lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public int getLineWidth() {
        return this.lineWidth = getInstanceOf(int.class, this.lineWidth);
    }

    public DragHandle setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public HighchartsCallbackFunction getPathFormatter() {
        return this.pathFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.pathFormatter);
    }

    public DragHandle setPathFormatter(HighchartsCallbackFunction pathFormatter) {
        this.pathFormatter = pathFormatter;
        return this;
    }

    public int getZIndex() {
        return this.zIndex = getInstanceOf(int.class, this.zIndex);
    }

    public DragHandle setZIndex(int zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.className);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.cursor);
        hash = 17 * hash + Objects.hashCode(this.lineColor);
        hash = 17 * hash + Objects.hashCode(this.lineWidth);
        hash = 17 * hash + Objects.hashCode(this.pathFormatter);
        hash = 17 * hash + Objects.hashCode(this.zIndex);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "className:" + className
                + ", color:" + color
                + ", cursor:" + cursor
                + ", lineColor:" + lineColor
                + ", lineWidth:" + lineWidth
                + ", pathFormatter:" + pathFormatter
                + ", zIndex:" + zIndex
                + '}';
    }


}