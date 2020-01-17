package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * DragDrop HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class DragDrop implements Serializable {


    public DragDrop() {
    }

    /**
     * Options for the drag handles.
     *
     * @since 6.2.0
     */
    private DragHandle dragHandle;

    /**
     * Set the maximum X value the points can be moved to.
     *
     * @since 6.2.0
     */
    private int dragMaxX;

    /**
     * Set the maximum Y value the points can be moved to.
     *
     * @since 6.2.0
     */
    private int dragMaxY;

    /**
     * Set the minimum X value the points can be moved to.
     *
     * @since 6.2.0
     */
    private int dragMinX;

    /**
     * Set the minimum Y value the points can be moved to.
     *
     * @since 6.2.0
     */
    private int dragMinY;

    /**
     * The X precision value to drag to for this series. Set to 0 to disable. By
     * default this is disabled, except for category axes, where the default is 1.
     *
     * @since 6.2.0
     */
    private int dragPrecisionX;

    /**
     * The Y precision value to drag to for this series. Set to 0 to disable. By
     * default this is disabled, except for category axes, where the default is 1.
     *
     * @since 6.2.0
     */
    private int dragPrecisionY;

    /**
     * The amount of pixels to drag the pointer before it counts as a drag
     * operation. This prevents drag/drop to fire when just clicking or selecting
     * points.
     *
     * @since 6.2.0
     */
    private int dragSensitivity;

    /**
     * Enable dragging in the X dimension.
     *
     * @since 6.2.0
     */
    private boolean draggableX;

    /**
     * Enable dragging in the Y dimension. Note that this is not supported for
     * TreeGrid axes (the default axis type in Gantt charts).
     *
     * @since 6.2.0
     */
    private boolean draggableY;

    /**
     * Group the points by a property. Points with the same property value will be
     * grouped together when moving.
     *
     * @since 6.2.0
     */
    private String groupBy;

    /**
     * ControlPointOptionsStyle options for the guide box. The guide box has one state by default, the
     * `default` state.
     *
     * @since 6.2.0
     */
    private Object guideBox;

    /**
     * Update points as they are dragged. If false, a guide box is drawn to
     * illustrate the new point size.
     *
     * @since 6.2.0
     */
    private boolean liveRedraw;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public DragHandle getDragHandle() {
        return this.dragHandle = getInstanceOf(DragHandle.class, this.dragHandle);
    }

    public DragDrop setDragHandle(DragHandle dragHandle) {
        this.dragHandle = dragHandle;
        return this;
    }

    public int getDragMaxX() {
        return this.dragMaxX = getInstanceOf(int.class, this.dragMaxX);
    }

    public DragDrop setDragMaxX(int dragMaxX) {
        this.dragMaxX = dragMaxX;
        return this;
    }

    public int getDragMaxY() {
        return this.dragMaxY = getInstanceOf(int.class, this.dragMaxY);
    }

    public DragDrop setDragMaxY(int dragMaxY) {
        this.dragMaxY = dragMaxY;
        return this;
    }

    public int getDragMinX() {
        return this.dragMinX = getInstanceOf(int.class, this.dragMinX);
    }

    public DragDrop setDragMinX(int dragMinX) {
        this.dragMinX = dragMinX;
        return this;
    }

    public int getDragMinY() {
        return this.dragMinY = getInstanceOf(int.class, this.dragMinY);
    }

    public DragDrop setDragMinY(int dragMinY) {
        this.dragMinY = dragMinY;
        return this;
    }

    public int getDragPrecisionX() {
        return this.dragPrecisionX = getInstanceOf(int.class, this.dragPrecisionX);
    }

    public DragDrop setDragPrecisionX(int dragPrecisionX) {
        this.dragPrecisionX = dragPrecisionX;
        return this;
    }

    public int getDragPrecisionY() {
        return this.dragPrecisionY = getInstanceOf(int.class, this.dragPrecisionY);
    }

    public DragDrop setDragPrecisionY(int dragPrecisionY) {
        this.dragPrecisionY = dragPrecisionY;
        return this;
    }

    public int getDragSensitivity() {
        return this.dragSensitivity = getInstanceOf(int.class, this.dragSensitivity);
    }

    public DragDrop setDragSensitivity(int dragSensitivity) {
        this.dragSensitivity = dragSensitivity;
        return this;
    }

    public boolean getDraggableX() {
        return this.draggableX = getInstanceOf(boolean.class, this.draggableX);
    }

    public DragDrop setDraggableX(boolean draggableX) {
        this.draggableX = draggableX;
        return this;
    }

    public boolean getDraggableY() {
        return this.draggableY = getInstanceOf(boolean.class, this.draggableY);
    }

    public DragDrop setDraggableY(boolean draggableY) {
        this.draggableY = draggableY;
        return this;
    }

    public String getGroupBy() {
        return this.groupBy = getInstanceOf(String.class, this.groupBy);
    }

    public DragDrop setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public Object getGuideBox() {
        return this.guideBox = getInstanceOf(Object.class, this.guideBox);
    }

    public DragDrop setGuideBox(Object guideBox) {
        this.guideBox = guideBox;
        return this;
    }

    public boolean getLiveRedraw() {
        return this.liveRedraw = getInstanceOf(boolean.class, this.liveRedraw);
    }

    public DragDrop setLiveRedraw(boolean liveRedraw) {
        this.liveRedraw = liveRedraw;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.dragHandle);
        hash = 17 * hash + Objects.hashCode(this.dragMaxX);
        hash = 17 * hash + Objects.hashCode(this.dragMaxY);
        hash = 17 * hash + Objects.hashCode(this.dragMinX);
        hash = 17 * hash + Objects.hashCode(this.dragMinY);
        hash = 17 * hash + Objects.hashCode(this.dragPrecisionX);
        hash = 17 * hash + Objects.hashCode(this.dragPrecisionY);
        hash = 17 * hash + Objects.hashCode(this.dragSensitivity);
        hash = 17 * hash + Objects.hashCode(this.draggableX);
        hash = 17 * hash + Objects.hashCode(this.draggableY);
        hash = 17 * hash + Objects.hashCode(this.groupBy);
        hash = 17 * hash + Objects.hashCode(this.guideBox);
        hash = 17 * hash + Objects.hashCode(this.liveRedraw);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "dragHandle:" + dragHandle
                + ", dragMaxX:" + dragMaxX
                + ", dragMaxY:" + dragMaxY
                + ", dragMinX:" + dragMinX
                + ", dragMinY:" + dragMinY
                + ", dragPrecisionX:" + dragPrecisionX
                + ", dragPrecisionY:" + dragPrecisionY
                + ", dragSensitivity:" + dragSensitivity
                + ", draggableX:" + draggableX
                + ", draggableY:" + draggableY
                + ", groupBy:" + groupBy
                + ", guideBox:" + guideBox
                + ", liveRedraw:" + liveRedraw
                + '}';
    }


}