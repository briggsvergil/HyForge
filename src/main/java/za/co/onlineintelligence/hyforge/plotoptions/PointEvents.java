package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * PointEvents HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class PointEvents implements Serializable {


    public PointEvents() {
    }

    /**
     * Fires when a point is clicked. One parameter, `event`, is passed
     * to the function, containing common event information.
     * <p>
     * If the `series.allowPointSelect` option is true, the default
     * action for the point's click event is to toggle the point's
     * select state. Returning `false` cancels this action.
     */
    private HighchartsCallbackFunction click;

    /**
     * Callback that fires while dragging a point. The mouse event is passed in as
     * parameter. The original data can be accessed from `e.origin`, and the new
     * point values can be accessed from `e.newPoints`. If there is only a single
     * point being updated, it can be accessed from `e.newPoint` for simplicity, and
     * its ID can be accessed from `e.newPointId`. The `this` context is the point
     * being dragged. To stop the default drag action, return false. See
     * [drag and drop options](plotOptions.series.dragDrop).
     *
     * @since 6.2.0
     */
    private HighchartsCallbackFunction drag;

    /**
     * Callback that fires when starting to drag a point. The mouse event object is
     * passed in as an argument. If a drag handle is used, `e.updateProp` is set to
     * the data property being dragged. The `this` context is the point. See
     * [drag and drop options](plotOptions.series.dragDrop).
     *
     * @since 6.2.0
     */
    private HighchartsCallbackFunction dragStart;

    /**
     * Callback that fires when the point is dropped. The parameters passed are the
     * same as for [drag](#plotOptions.series.point.PointEvents.drag). To stop the
     * default drop action, return false. See
     * [drag and drop options](plotOptions.series.dragDrop).
     *
     * @since 6.2.0
     */
    private HighchartsCallbackFunction drop;

    /**
     * Fires when the legend item belonging to the pie point (slice) is
     clicked. The `this` keyword refers to the point itself. One
     parameter, `event`, is passed to the function, containing common
     event information. The default action is to toggle the visibility of
     the point. This can be prevented by calling `event.preventDefault()`.
     * @since 1.2.0
     */
    private HighchartsCallbackFunction legendItemClick;

    /**
     * Fires when the mouse leaves the area close to the point. One
     * parameter, `event`, is passed to the function, containing common
     * event information.
     */
    private HighchartsCallbackFunction mouseOut;

    /**
     * Fires when the mouse enters the area close to the point. One
     * parameter, `event`, is passed to the function, containing common
     * event information.
     */
    private HighchartsCallbackFunction mouseOver;

    /**
     * Fires when the point is removed using the `.remove()` method. One
     * parameter, `event`, is passed to the function. Returning `false`
     * cancels the operation.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction remove;

    /**
     * Fires when the point is selected either programmatically or
     * following a click on the point. One parameter, `event`, is passed
     * to the function. Returning `false` cancels the operation.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction select;

    /**
     * Fires when the point is unselected either programmatically or
     * following a click on the point. One parameter, `event`, is passed
     * to the function.
     * Returning `false` cancels the operation.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction unselect;

    /**
     * Fires when the point is updated programmatically through the
     * `.update()` method. One parameter, `event`, is passed to the
     * function. The new point options can be accessed through
     * `event.options`. Returning `false` cancels the operation.
     *
     * @since 1.2.0
     */
    private HighchartsCallbackFunction update;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsCallbackFunction getClick() {
        return this.click;
    }

    public PointEvents setClick(HighchartsCallbackFunction click) {
        this.click = click;
        return this;
    }

    public HighchartsCallbackFunction getDrag() {
        return this.drag;
    }

    public PointEvents setDrag(HighchartsCallbackFunction drag) {
        this.drag = drag;
        return this;
    }

    public HighchartsCallbackFunction getDragStart() {
        return this.dragStart;
    }

    public PointEvents setDragStart(HighchartsCallbackFunction dragStart) {
        this.dragStart = dragStart;
        return this;
    }

    public HighchartsCallbackFunction getDrop() {
        return this.drop;
    }

    public PointEvents setDrop(HighchartsCallbackFunction drop) {
        this.drop = drop;
        return this;
    }

    public HighchartsCallbackFunction getMouseOut() {
        return this.mouseOut;
    }

    public PointEvents setMouseOut(HighchartsCallbackFunction mouseOut) {
        this.mouseOut = mouseOut;
        return this;
    }

    public HighchartsCallbackFunction getMouseOver() {
        return this.mouseOver;
    }

    public PointEvents setMouseOver(HighchartsCallbackFunction mouseOver) {
        this.mouseOver = mouseOver;
        return this;
    }

    public HighchartsCallbackFunction getRemove() {
        return this.remove;
    }

    public PointEvents setRemove(HighchartsCallbackFunction remove) {
        this.remove = remove;
        return this;
    }

    public HighchartsCallbackFunction getSelect() {
        return this.select;
    }

    public PointEvents setSelect(HighchartsCallbackFunction select) {
        this.select = select;
        return this;
    }

    public HighchartsCallbackFunction getUnselect() {
        return this.unselect;
    }

    public PointEvents setUnselect(HighchartsCallbackFunction unselect) {
        this.unselect = unselect;
        return this;
    }

    public HighchartsCallbackFunction getUpdate() {
        return this.update;
    }

    public PointEvents setUpdate(HighchartsCallbackFunction update) {
        this.update = update;
        return this;
    }

    /*
    Instance-Safe Getters
*/
    public HighchartsCallbackFunction getLegendItemClick() {
        return this.legendItemClick = getInstanceOf(HighchartsCallbackFunction.class, this.legendItemClick);
    }

    /*
        Builder-Style Setters
    */
    public PointEvents setLegendItemClick(HighchartsCallbackFunction legendItemClick){
        this.legendItemClick = legendItemClick;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.click);
        hash = 17 * hash + Objects.hashCode(this.drag);
        hash = 17 * hash + Objects.hashCode(this.dragStart);
        hash = 17 * hash + Objects.hashCode(this.drop);
        hash = 17 * hash + Objects.hashCode(this.mouseOut);
        hash = 17 * hash + Objects.hashCode(this.mouseOver);
        hash = 17 * hash + Objects.hashCode(this.remove);
        hash = 17 * hash + Objects.hashCode(this.select);
        hash = 17 * hash + Objects.hashCode(this.unselect);
        hash = 17 * hash + Objects.hashCode(this.update);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "click:" + click
                + ", drag:" + drag
                + ", dragStart:" + dragStart
                + ", drop:" + drop
                + ", mouseOut:" + mouseOut
                + ", mouseOver:" + mouseOver
                + ", remove:" + remove
                + ", select:" + select
                + ", unselect:" + unselect
                + ", update:" + update
                + '}';
    }


}
