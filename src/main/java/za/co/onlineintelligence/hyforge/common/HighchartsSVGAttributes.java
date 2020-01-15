package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Sean Briggs.
 */
public class HighchartsSVGAttributes implements Serializable, DrosteDeflater {

    public HighchartsSVGAttributes() {
    }

    /**
     * This is the actual SVG Path Array comparable to the HTML "d" attribute of the "<path>" tag
     * <p>
     * Example:
     * <svg viewBox="0 0 100 100" xmlns="http://www.w3.org/2000/svg">
     * <path fill="none" stroke="red"
     * d="M 10,30
     * A 20,20 0,0,1 50,30
     * A 20,20 0,0,1 90,30d
     * Q 90,60 50,90
     * Q 10,60 10,30 z" />
     * </svg>
     */
    private String d;
    private HighchartsColor fill;
    private Boolean inverted;
    private Integer[] matrix;
    private Integer rotation;
    private Integer rotationOriginX;
    private Integer rotationOriginY;
    private Integer scaleX;
    private Integer scaleY;
    private HighchartsColor stroke;
    private HighchartsCSS style;
    private Integer translateX;
    private Integer translateY;
    private Integer zIndex;

    public String getD() {
        return d;
    }

    public HighchartsSVGAttributes setD(String d) {
        this.d = d;
        return this;
    }

    public HighchartsColor getFill() {
        return fill;
    }

    public HighchartsSVGAttributes setFill(HighchartsColor fill) {
        this.fill = fill;
        return this;
    }

    public Boolean getInverted() {
        return inverted;
    }

    public HighchartsSVGAttributes setInverted(Boolean inverted) {
        this.inverted = inverted;
        return this;
    }

    public Integer[] getMatrix() {
        return matrix;
    }

    public HighchartsSVGAttributes setMatrix(Integer[] matrix) {
        this.matrix = matrix;
        return this;
    }

    public Integer getRotation() {
        return rotation;
    }

    public HighchartsSVGAttributes setRotation(Integer rotation) {
        this.rotation = rotation;
        return this;
    }

    public Integer getRotationOriginX() {
        return rotationOriginX;
    }

    public HighchartsSVGAttributes setRotationOriginX(Integer rotationOriginX) {
        this.rotationOriginX = rotationOriginX;
        return this;
    }

    public Integer getRotationOriginY() {
        return rotationOriginY;
    }

    public HighchartsSVGAttributes setRotationOriginY(Integer rotationOriginY) {
        this.rotationOriginY = rotationOriginY;
        return this;
    }

    public Integer getScaleX() {
        return scaleX;
    }

    public HighchartsSVGAttributes setScaleX(Integer scaleX) {
        this.scaleX = scaleX;
        return this;
    }

    public Integer getScaleY() {
        return scaleY;
    }

    public HighchartsSVGAttributes setScaleY(Integer scaleY) {
        this.scaleY = scaleY;
        return this;
    }

    public HighchartsColor getStroke() {
        return stroke;
    }

    public HighchartsSVGAttributes setStroke(HighchartsColor stroke) {
        this.stroke = stroke;
        return this;
    }

    public HighchartsCSS getStyle() {
        return style;
    }

    public HighchartsSVGAttributes setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public Integer getTranslateX() {
        return translateX;
    }

    public HighchartsSVGAttributes setTranslateX(Integer translateX) {
        this.translateX = translateX;
        return this;
    }

    public Integer getTranslateY() {
        return translateY;
    }

    public HighchartsSVGAttributes setTranslateY(Integer translateY) {
        this.translateY = translateY;
        return this;
    }

    public Integer getzIndex() {
        return zIndex;
    }

    public HighchartsSVGAttributes setzIndex(Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }


    @Override
    public String toString() {
        return "HighchartsSVGAttributes{" +
                "d='" + d + '\'' +
                ", fill=" + fill +
                ", inverted=" + inverted +
                ", matrix=" + Arrays.toString(matrix) +
                ", rotation=" + rotation +
                ", rotationOriginX=" + rotationOriginX +
                ", rotationOriginY=" + rotationOriginY +
                ", scaleX=" + scaleX +
                ", scaleY=" + scaleY +
                ", stroke=" + stroke +
                ", style=" + style +
                ", translateX=" + translateX +
                ", translateY=" + translateY +
                ", zIndex=" + zIndex +
                '}';
    }
}
