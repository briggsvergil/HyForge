package za.co.onlineintelligence.hyforge;

import za.co.onlineintelligence.hyforge.mapnavigation.MapNavigation;
import za.co.onlineintelligence.hyforge.series.Series;

public class HighmapsOptions extends ChartOptions<HighmapsOptions> {
    /**
     * TODO: Still to be implemented
     */

    /**
     * NOTE: HIGHMAPS SPECIFIC
     */
    private MapNavigation mapNavigation;

    /*
        GETTERS AND BUILDER-STYLE SETTERS
     */

    public MapNavigation getMapNavigation() {
        return mapNavigation;
    }

    public HighmapsOptions setMapNavigation(MapNavigation mapNavigation) {
        this.mapNavigation = mapNavigation;
        return this;
    }

    @Override
    public HighmapsOptions addSeries(Series series) {
        return null;
    }
}
