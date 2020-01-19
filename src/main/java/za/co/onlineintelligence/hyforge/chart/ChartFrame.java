package za.co.onlineintelligence.hyforge.chart;

import za.co.onlineintelligence.hyforge.common.Exportable;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean Briggs
 */
public class ChartFrame implements Serializable, Exportable {

    public ChartFrame() {
    }

    /**
     * The back side of the frame around a 3D chart.
     *
     * @since 4.0.0
     */
    private HighchartFrame back;

    /**
     * The bottom of the frame around a 3D chart.
     *
     * @since 4.0.0
     */
    private HighchartFrame bottom;

    /**
     * The front of the frame around a 3D chart.
     *
     * @since 4.0.0
     */
    private HighchartFrame front;

    /**
     * The left side of the frame around a 3D chart.
     *
     * @since 4.0.0
     */
    private HighchartFrame left;

    /**
     * The right of the frame around a 3D chart.
     *
     * @since 4.0.0
     */
    private HighchartFrame right;

    @Deprecated
    /**
     * The side for the frame around a 3D chart.
     *
     * @Deprecated As of v5.0.12, `frame.left` or `frame.right` should be used
     * instead.
     *
     * @since 4.0.0
     */
    private HighchartFrame side;

    /**
     * General pixel thickness for the frame faces.
     *
     * @since 4.0.0
     */
    private int size;

    /**
     * The top of the frame around a 3D chart.
     *
     * @since 4.0.0
     */
    private HighchartFrame top;

    /**
     * Whether the frames are visible.
     *
     * @since 4.0.0
     */
    private String visible;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public HighchartFrame getBack() {
        return this.back = getInstanceOf(HighchartFrame.class, this.back);
    }

    public ChartFrame setBack(HighchartFrame back) {
        this.back = back;
        return this;
    }

    public HighchartFrame getBottom() {
        return this.bottom = getInstanceOf(HighchartFrame.class, this.bottom);
    }

    public ChartFrame setBottom(HighchartFrame bottom) {
        this.bottom = bottom;
        return this;
    }

    public HighchartFrame getFront() {
        return this.front = getInstanceOf(HighchartFrame.class, this.front);
    }

    public ChartFrame setFront(HighchartFrame front) {
        this.front = front;
        return this;
    }

    public HighchartFrame getLeft() {
        return this.left = getInstanceOf(HighchartFrame.class, this.left);
    }

    public ChartFrame setLeft(HighchartFrame left) {
        this.left = left;
        return this;
    }

    public HighchartFrame getRight() {
        return this.right = getInstanceOf(HighchartFrame.class, this.right);
    }

    public ChartFrame setRight(HighchartFrame right) {
        this.right = right;
        return this;
    }

    public HighchartFrame getSide() {
        return this.side = getInstanceOf(HighchartFrame.class, this.side);
    }

    public ChartFrame setSide(HighchartFrame side) {
        this.side = side;
        return this;
    }

    public int getSize() {
        return this.size = getInstanceOf(int.class, this.size);
    }

    public ChartFrame setSize(int size) {
        this.size = size;
        return this;
    }

    public HighchartFrame getTop() {
        return this.top = getInstanceOf(HighchartFrame.class, this.top);
    }

    public ChartFrame setTop(HighchartFrame top) {
        this.top = top;
        return this;
    }

    public String getVisible() {
        return this.visible = getInstanceOf(String.class, this.visible);
    }

    public ChartFrame setVisible(String visible) {
        this.visible = visible;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.back);
        hash = 17 * hash + Objects.hashCode(this.bottom);
        hash = 17 * hash + Objects.hashCode(this.front);
        hash = 17 * hash + Objects.hashCode(this.left);
        hash = 17 * hash + Objects.hashCode(this.right);
        hash = 17 * hash + Objects.hashCode(this.side);
        hash = 17 * hash + Objects.hashCode(this.size);
        hash = 17 * hash + Objects.hashCode(this.top);
        hash = 17 * hash + Objects.hashCode(this.visible);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "back:" + back
                + ", bottom:" + bottom
                + ", front:" + front
                + ", left:" + left
                + ", right:" + right
                + ", side:" + side
                + ", size:" + size
                + ", top:" + top
                + ", visible:" + visible
                + '}';
    }

}
