package za.co.onlineintelligence.hyforge.annotations;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsSize;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Annotations  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Annotations implements Serializable, Exportable {


    public Annotations() {
    }

    /**
     * Options for annotation's control points. Each control point
     * inherits options from controlPointOptions object.
     * Options from the controlPointOptions can be overwritten
     * by options in a specific control point.
     *
     * @since 6.0.0
     */
    private ControlPointOptions controlPointOptions;


    /**
     * Allow an annotation to be draggable by a user. Possible
     * values are `"x"`, `"xy"`, `"y"` and `""` (disabled).
     *
     * @since 6.0.0
     */
    private String draggable;


    /**
     * AnnotationsEvents available in annotations.
     *
     * @since 6.0.0
     */
    private AnnotationsEvents events;


    /**
     * Sets an ID for an annotation. Can be user later when removing an
     * annotation in [Chart#removeAnnotation(id)](/class-reference/Highcharts.Chart#removeAnnotation) method.
     *
     * @since 6.0.0
     */
    private HighchartsSize id;


    /**
     * Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions
     * can be overwritten by config for a specific label.
     *
     * @since 6.0.0
     */
    private LabelOptions labelOptions;

    /**
     * An array of labels for the annotation. For options that apply to
     * multiple labels, they can be added to the
     * [labelOptions](annotations.labelOptions.html).
     *
     * @since 6.0.0
     */
    private AnnotationsLabels[] labels;


    /**
     * Options for annotation's shapes. Each shape inherits options from
     * the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     *
     * @since 6.0.0
     */
    private ShapeOptions shapeOptions;

    /**
     * An array of shapes for the annotation. For options that apply to
     * multiple shapes, then can be added to the
     * [shapeOptions](annotations.shapeOptions.html).
     *
     * @since 6.0.0
     */
    private AnnotationShapes[] shapes;

    /**
     * Whether the annotation is visible.
     *
     * @since 6.0.0
     */
    private Boolean visible;

    /**
     * The Z index of the annotation.
     *
     * @since 6.0.0
     */
    private Integer zIndex;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public ControlPointOptions getControlPointOptions() {
        return this.controlPointOptions = getInstanceOf(ControlPointOptions.class, this.controlPointOptions);
    }

    public Annotations setControlPointOptions(ControlPointOptions controlPointOptions) {
        this.controlPointOptions = controlPointOptions;
        return this;
    }

    public String getDraggable() {
        return this.draggable = getInstanceOf(String.class, this.draggable);
    }

    public Annotations setDraggable(String draggable) {
        this.draggable = draggable;
        return this;
    }

    public AnnotationsEvents getEvents() {
        return this.events = getInstanceOf(AnnotationsEvents.class, this.events);
    }

    public Annotations setEvents(AnnotationsEvents events) {
        this.events = events;
        return this;
    }

    public HighchartsSize getId() {
        return this.id = getInstanceOf(HighchartsSize.class, this.id);
    }

    public Annotations setId(HighchartsSize id) {
        this.id = id;
        return this;
    }

    public LabelOptions getLabelOptions() {
        return this.labelOptions = getInstanceOf(LabelOptions.class, this.labelOptions);
    }

    public Annotations setLabelOptions(LabelOptions labelOptions) {
        this.labelOptions = labelOptions;
        return this;
    }

    public AnnotationsLabels[] getLabels() {
        return this.labels = getInstanceOf(AnnotationsLabels[].class, this.labels);
    }

    public Annotations setLabels(AnnotationsLabels[] labels) {
        this.labels = labels;
        return this;
    }

    public ShapeOptions getShapeOptions() {
        return this.shapeOptions = getInstanceOf(ShapeOptions.class, this.shapeOptions);
    }

    public Annotations setShapeOptions(ShapeOptions shapeOptions) {
        this.shapeOptions = shapeOptions;
        return this;
    }

    public AnnotationShapes[] getShapes() {
        return this.shapes = getInstanceOf(AnnotationShapes[].class, this.shapes);
    }

    public Annotations setShapes(AnnotationShapes[] shapes) {
        this.shapes = shapes;
        return this;
    }

    public Boolean getVisible() {
        return this.visible = getInstanceOf(Boolean.class, this.visible);
    }

    public Annotations setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    public Integer getZIndex() {
        return this.zIndex = getInstanceOf(Integer.class, this.zIndex);
    }

    public Annotations setZIndex(Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.controlPointOptions);
        hash = 17 * hash + Objects.hashCode(this.draggable);
        hash = 17 * hash + Objects.hashCode(this.events);
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.labelOptions);
        hash = 17 * hash + Objects.hashCode(this.labels);
        hash = 17 * hash + Objects.hashCode(this.shapeOptions);
        hash = 17 * hash + Objects.hashCode(this.shapes);
        hash = 17 * hash + Objects.hashCode(this.visible);
        hash = 17 * hash + Objects.hashCode(this.zIndex);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "controlPointOptions:" + controlPointOptions
                + ", draggable:" + draggable
                + ", events:" + events
                + ", id:" + id
                + ", labelOptions:" + labelOptions
                + ", labels:" + labels
                + ", shapeOptions:" + shapeOptions
                + ", shapes:" + shapes
                + ", visible:" + visible
                + ", zIndex:" + zIndex
                + '}';
    }


}