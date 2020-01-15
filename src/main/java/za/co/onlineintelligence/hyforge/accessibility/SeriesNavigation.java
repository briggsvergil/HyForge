package za.co.onlineintelligence.hyforge.accessibility;
//package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;

import java.io.Serializable;
import java.util.Objects;


/**
 * SeriesNavigation HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class SeriesNavigation implements Serializable, DrosteDeflater {


    public SeriesNavigation() {
    }

    /**
     * Set the keyboard navigation mode for the chart. Can be
     * "normal" or "serialize". In normal mode, left/right arrow
     * keys move between points in a series, while up/down arrow
     * keys move between series. Up/down navigation acts
     * intelligently to figure out which series makes sense to move
     * to from any given point.
     * <p>
     * In "serialize" mode, points are instead navigated as a single
     * list. Left/right behaves as in "normal" mode. Up/down arrow
     * keys will behave like left/right. This can be useful for
     * unifying navigation behavior with/without screen readers
     * enabled.
     *
     * @since 8.0.0
     */
    private String mode;

    /**
     * When a series contains more points than this, we no longer
     * allow keyboard navigation for it.
     * <p>
     * ...Set to `false` to disable.
     * Set to null to disable
     *
     * @since 8.0.0
     */
    private Integer pointNavigationEnabledThreshold;

    /**
     * Skip null points when navigating through points with the
     * keyboard.
     *
     * @since 8.0.0
     */
    private boolean skipNullPoints;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public String getMode() {
        return this.mode;
    }

    public SeriesNavigation setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public Integer getPointNavigationEnabledThreshold() {
        return this.pointNavigationEnabledThreshold;
    }

    public SeriesNavigation setPointNavigationEnabledThreshold(Integer pointNavigationEnabledThreshold) {
        this.pointNavigationEnabledThreshold = pointNavigationEnabledThreshold;
        return this;
    }

    public boolean getSkipNullPoints() {
        return this.skipNullPoints;
    }

    public SeriesNavigation setSkipNullPoints(boolean skipNullPoints) {
        this.skipNullPoints = skipNullPoints;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.mode);
        hash = 17 * hash + Objects.hashCode(this.pointNavigationEnabledThreshold);
        hash = 17 * hash + Objects.hashCode(this.skipNullPoints);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "mode:" + mode
                + ", pointNavigationEnabledThreshold:" + pointNavigationEnabledThreshold
                + ", skipNullPoints:" + skipNullPoints
                + '}';
    }


}
