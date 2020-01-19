package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;

/**
 * @author Sean
 */
public class HighchartsShadowOptionsObject implements Serializable, Exportable {

    public HighchartsShadowOptionsObject() {
    }

    private HighchartsColorString color;
    private Integer offsetX;
    private Integer offsetY;
    private Integer opacity;
    private Integer width;

    public HighchartsColorString getColor() {
        return color;
    }

    public void setColor(HighchartsColorString color) {
        this.color = color;
    }

    public Integer getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Integer offsetX) {
        this.offsetX = offsetX;
    }

    public Integer getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Integer offsetY) {
        this.offsetY = offsetY;
    }

    public Integer getOpacity() {
        return opacity;
    }

    public void setOpacity(Integer opacity) {
        this.opacity = opacity;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

}
