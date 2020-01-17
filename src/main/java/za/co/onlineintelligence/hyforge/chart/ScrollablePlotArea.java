package za.co.onlineintelligence.hyforge.chart;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean Briggs
 */
public class ScrollablePlotArea implements Serializable {

    public ScrollablePlotArea() {
    }

    /**
     * The minimum height for the plot area. If it gets smaller than this, the
     * plot area will become scrollable.
     *
     * @since 6.1.0
     */
    private int minHeight;

    /**
     * The minimum width for the plot area. If it gets smaller than this, the
     * plot area will become scrollable.
     *
     * @since 6.1.0
     */
    private int minWidth;

    /**
     * The opacity of mask applied on one of the sides of the plot area.
     *
     * @since 7.1.1
     */
    private int opacity;

    /**
     * The initial scrolling position of the scrollable plot area. LegendRangeOptions from 0
     * to 1, where 0 aligns the plot area to the left and 1 aligns it to the
     * right. Typically we would use 1 if the chart has right aligned Y axes.
     *
     * @since 6.1.0
     */
    private int scrollPositionX;

    /**
     * The initial scrolling position of the scrollable plot area. LegendRangeOptions from 0
     * to 1, where 0 aligns the plot area to the top and 1 aligns it to the
     * bottom.
     *
     * @since 6.1.0
     */
    private int scrollPositionY;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public int getMinHeight() {
        return this.minHeight = getInstanceOf(int.class, this.minHeight);
    }

    public ScrollablePlotArea setMinHeight(int minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    public int getMinWidth() {
        return this.minWidth = getInstanceOf(int.class, this.minWidth);
    }

    public ScrollablePlotArea setMinWidth(int minWidth) {
        this.minWidth = minWidth;
        return this;
    }

    public int getOpacity() {
        return this.opacity = getInstanceOf(int.class, this.opacity);
    }

    public ScrollablePlotArea setOpacity(int opacity) {
        this.opacity = opacity;
        return this;
    }

    public int getScrollPositionX() {
        return this.scrollPositionX = getInstanceOf(int.class, this.scrollPositionX);
    }

    public ScrollablePlotArea setScrollPositionX(int scrollPositionX) {
        this.scrollPositionX = scrollPositionX;
        return this;
    }

    public int getScrollPositionY() {
        return this.scrollPositionY = getInstanceOf(int.class, this.scrollPositionY);
    }

    public ScrollablePlotArea setScrollPositionY(int scrollPositionY) {
        this.scrollPositionY = scrollPositionY;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.minHeight);
        hash = 17 * hash + Objects.hashCode(this.minWidth);
        hash = 17 * hash + Objects.hashCode(this.opacity);
        hash = 17 * hash + Objects.hashCode(this.scrollPositionX);
        hash = 17 * hash + Objects.hashCode(this.scrollPositionY);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "minHeight:" + minHeight
                + ", minWidth:" + minWidth
                + ", opacity:" + opacity
                + ", scrollPositionX:" + scrollPositionX
                + ", scrollPositionY:" + scrollPositionY
                + '}';
    }

}
