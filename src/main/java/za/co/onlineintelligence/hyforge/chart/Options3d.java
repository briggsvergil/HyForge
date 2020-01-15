package za.co.onlineintelligence.hyforge.chart;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean Briggs
 */
public class Options3d implements Serializable {

    public Options3d() {
    }

    /**
     * One of the two rotation angles for the chart.
     *
     * @since 4.0.0
     */
    private int alpha;

    /**
     * Set it to `"auto"` to automatically move the labels to the best edge.
     *
     * @since 5.0.12
     */
    private String axisLabelPosition;

    /**
     * One of the two rotation angles for the chart.
     *
     * @since 4.0.0
     */
    private int beta;

    /**
     * The total depth of the chart.
     *
     * @since 4.0.0
     */
    private int depth;

    /**
     * Wether to render the chart using the 3D functionality.
     *
     * @since 4.0.0
     */
    private boolean enabled;

    /**
     * Whether the 3d box should automatically adjust to the chart plot area.
     *
     * @since 4.2.4
     */
    private boolean fitToPlot;

    /**
     * Provides the option to draw a frame around the charts by defining a
     * bottom, front and back panel.
     *
     * @since 4.0.0
     */
    private ChartFrame frame;

    /**
     * Defines the distance the viewer is standing in front of the chart, this
     * setting is important to calculate the perspective effect in column and
     * scatter charts. It is not used for 3D pie charts.
     *
     * @since 4.0.0
     */
    private int viewDistance;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public int getAlpha() {
        return getInstanceOf(int.class, this.alpha);
    }

    public Options3d setAlpha(int alpha) {
        this.alpha = alpha;
        return this;
    }

    public String getAxisLabelPosition() {
        return getInstanceOf(String.class, this.axisLabelPosition);
    }

    public Options3d setAxisLabelPosition(String axisLabelPosition) {
        this.axisLabelPosition = axisLabelPosition;
        if (this.axisLabelPosition != null && !this.axisLabelPosition.equalsIgnoreCase("auto")) {
            this.axisLabelPosition = "auto";
        }
        return this;
    }

    public int getBeta() {
        return getInstanceOf(int.class, this.beta);
    }

    public Options3d setBeta(int beta) {
        this.beta = beta;
        return this;
    }

    public int getDepth() {
        return getInstanceOf(int.class, this.depth);
    }

    public Options3d setDepth(int depth) {
        this.depth = depth;
        return this;
    }

    public boolean getEnabled() {
        return getInstanceOf(boolean.class, this.enabled);
    }

    public Options3d setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public boolean getFitToPlot() {
        return getInstanceOf(boolean.class, this.fitToPlot);
    }

    public Options3d setFitToPlot(boolean fitToPlot) {
        this.fitToPlot = fitToPlot;
        return this;
    }

    public ChartFrame getFrame() {
        return getInstanceOf(ChartFrame.class, this.frame);
    }

    public Options3d setFrame(ChartFrame frame) {
        this.frame = frame;
        return this;
    }

    public int getViewDistance() {
        return getInstanceOf(int.class, this.viewDistance);
    }

    public Options3d setViewDistance(int viewDistance) {
        this.viewDistance = viewDistance;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.alpha);
        hash = 17 * hash + Objects.hashCode(this.axisLabelPosition);
        hash = 17 * hash + Objects.hashCode(this.beta);
        hash = 17 * hash + Objects.hashCode(this.depth);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.fitToPlot);
        hash = 17 * hash + Objects.hashCode(this.frame);
        hash = 17 * hash + Objects.hashCode(this.viewDistance);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "alpha:" + alpha
                + ", axisLabelPosition:" + axisLabelPosition
                + ", beta:" + beta
                + ", depth:" + depth
                + ", enabled:" + enabled
                + ", fitToPlot:" + fitToPlot
                + ", frame:" + frame
                + ", viewDistance:" + viewDistance
                + '}';
    }

}
