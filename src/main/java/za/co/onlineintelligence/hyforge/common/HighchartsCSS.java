package za.co.onlineintelligence.hyforge.common;

import za.co.onlineintelligence.hyforge.common.enums.HighchartsCursorValue;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author Sean
 */
public class HighchartsCSS implements Serializable, DrosteDeflater {

    public HighchartsCSS() {
    }

    private String background;
    private HighchartsColorString backgroundColor;
    private String border;
    private Integer borderRadius;
    private HighchartsColorString color;
    private HighchartsCursorValue cursor;
    private String fontFamily;
    private String fontSize;
    private String fontWeight;
    private Integer height;
    private Integer lineWidth;
    private Integer opacity;
    private String padding;
    private String pointerEvents;
    private String position;
    private String textAlign;
    private String textDecoration;
    private String textOutline;
    private String textOverflow;
    private String top;
    private String transition;
    private String whiteSpace;
    private Integer width;

    public String getBackground() {
        return background;
    }

    public HighchartsCSS setBackground(String background) {
        this.background = background;
        return this;
    }

    public HighchartsColorString getBackgroundColor() {
        return backgroundColor;
    }

    public HighchartsCSS setBackgroundColor(HighchartsColorString backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getBorder() {
        return border;
    }

    public HighchartsCSS setBorder(String border) {
        this.border = border;
        return this;
    }

    public Integer getBorderRadius() {
        return borderRadius;
    }

    public HighchartsCSS setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public HighchartsColorString getColor() {
        return color;
    }

    public HighchartsCSS setColor(HighchartsColorString color) {
        this.color = color;
        return this;
    }

    public HighchartsCSS setColor(String colorString) {
        this.color = new HighchartsColorString(colorString);
        return this;
    }

    public HighchartsCursorValue getCursor() {
        return cursor;
    }

    public HighchartsCSS setCursor(HighchartsCursorValue cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public HighchartsCSS setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public String getFontSize() {
        return fontSize;
    }

    public HighchartsCSS setFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public HighchartsCSS setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public HighchartsCSS setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getLineWidth() {
        return lineWidth;
    }

    public HighchartsCSS setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public Integer getOpacity() {
        return opacity;
    }

    public HighchartsCSS setOpacity(Integer opacity) {
        this.opacity = opacity;
        return this;
    }

    public String getPadding() {
        return padding;
    }

    public HighchartsCSS setPadding(String padding) {
        this.padding = padding;
        return this;
    }

    public String getPointerEvents() {
        return pointerEvents;
    }

    public HighchartsCSS setPointerEvents(String pointerEvents) {
        this.pointerEvents = pointerEvents;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public HighchartsCSS setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getTextAlign() {
        return textAlign;
    }

    public HighchartsCSS setTextAlign(String textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public String getTextDecoration() {
        return textDecoration;
    }

    public HighchartsCSS setTextDecoration(String textDecoration) {
        this.textDecoration = textDecoration;
        return this;
    }

    public String getTextOutline() {
        return textOutline;
    }

    public HighchartsCSS setTextOutline(String textOutline) {
        this.textOutline = textOutline;
        return this;
    }

    public String getTextOverflow() {
        return textOverflow;
    }

    public HighchartsCSS setTextOverflow(String textOverflow) {
        this.textOverflow = textOverflow;
        return this;
    }

    public String getTop() {
        return top;
    }

    public HighchartsCSS setTop(String top) {
        this.top = top;
        return this;
    }

    public String getTransition() {
        return transition;
    }

    public HighchartsCSS setTransition(String transition) {
        this.transition = transition;
        return this;
    }

    public String getWhiteSpace() {
        return whiteSpace;
    }

    public HighchartsCSS setWhiteSpace(String whiteSpace) {
        this.whiteSpace = whiteSpace;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public HighchartsCSS setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public String deflateField(Field field, int tabLevel) {
        String s = delegateFieldDeflation(field, "width", width==null,
                () -> DrosteDeflater.getTabString(tabLevel) + "width:'" + width + "px'");
        return s!=null && s.equals(RTS)? DrosteDeflater.super.deflateField(field, tabLevel) : s;
    }
}
