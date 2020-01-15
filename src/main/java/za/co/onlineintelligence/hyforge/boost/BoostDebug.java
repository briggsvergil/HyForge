package za.co.onlineintelligence.hyforge.boost;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;


/**
 * BoostDebug  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class BoostDebug implements Serializable, DrosteDeflater {


    public BoostDebug() {
    }

    /**
     * Show the number of points skipped through culling.
     * <p>
     * When set to true, the number of points skipped in series processing
     * is outputted. Points are skipped if they are closer than 1 pixel from
     * each other.
     */
    private Boolean showSkipSummary;

    /**
     * Time the WebGL to SVG buffer copy
     * <p>
     * After rendering, the result is copied to an image which is injected
     * into the SVG.
     * <p>
     * If this property is set to true, the time it takes for the buffer copy
     * to complete is outputted.
     */
    private Boolean timeBufferCopy;

    /**
     * Time the building of the k-d tree.
     * <p>
     * This outputs the time spent building the k-d tree used for
     * markers etc.
     * <p>
     * Note that the k-d tree is built async, and runs post-rendering.
     * Following, it does not affect the performance of the rendering itself.
     */
    private Boolean timeKDTree;

    /**
     * Time the series rendering.
     * <p>
     * This outputs the time spent on actual rendering in the console when
     * set to true.
     */
    private Boolean timeRendering;

    /**
     * Time the series processing.
     * <p>
     * This outputs the time spent on transforming the series data to
     * vertex buffers when set to true.
     */
    private Boolean timeSeriesProcessing;

    /**
     * Time the the WebGL setup.
     * <p>
     * This outputs the time spent on setting up the WebGL context,
     * creating shaders, and textures.
     */
    private Boolean timeSetup;

    /*
        Getters and Builder-Style Setters
    */
    public Boolean getShowSkipSummary() {
        return this.showSkipSummary;
    }

    public BoostDebug setShowSkipSummary(Boolean showSkipSummary) {
        this.showSkipSummary = showSkipSummary;
        return this;
    }

    public Boolean getTimeBufferCopy() {
        return this.timeBufferCopy;
    }

    public BoostDebug setTimeBufferCopy(Boolean timeBufferCopy) {
        this.timeBufferCopy = timeBufferCopy;
        return this;
    }

    public Boolean getTimeKDTree() {
        return this.timeKDTree;
    }

    public BoostDebug setTimeKDTree(Boolean timeKDTree) {
        this.timeKDTree = timeKDTree;
        return this;
    }

    public Boolean getTimeRendering() {
        return this.timeRendering;
    }

    public BoostDebug setTimeRendering(Boolean timeRendering) {
        this.timeRendering = timeRendering;
        return this;
    }

    public Boolean getTimeSeriesProcessing() {
        return this.timeSeriesProcessing;
    }

    public BoostDebug setTimeSeriesProcessing(Boolean timeSeriesProcessing) {
        this.timeSeriesProcessing = timeSeriesProcessing;
        return this;
    }

    public Boolean getTimeSetup() {
        return this.timeSetup;
    }

    public BoostDebug setTimeSetup(Boolean timeSetup) {
        this.timeSetup = timeSetup;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.showSkipSummary);
        hash = 17 * hash + Objects.hashCode(this.timeBufferCopy);
        hash = 17 * hash + Objects.hashCode(this.timeKDTree);
        hash = 17 * hash + Objects.hashCode(this.timeRendering);
        hash = 17 * hash + Objects.hashCode(this.timeSeriesProcessing);
        hash = 17 * hash + Objects.hashCode(this.timeSetup);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "showSkipSummary:" + showSkipSummary
                + ", timeBufferCopy:" + timeBufferCopy
                + ", timeKDTree:" + timeKDTree
                + ", timeRendering:" + timeRendering
                + ", timeSeriesProcessing:" + timeSeriesProcessing
                + ", timeSetup:" + timeSetup
                + '}';
    }


}
