package za.co.onlineintelligence.hyforge.series;

import za.co.onlineintelligence.hyforge.plotoptions.HighchartsSeriesPlotOptions;

import java.util.Arrays;
import java.util.Optional;

/**
 * This Enumeration is for reference as to what the available types of charts
 * are, specific to the Highcharts product.
 *
 * @author Sean Briggs
 */
@SuppressWarnings("unchecked")
public enum HighchartsSeriesType {

    AREA("area") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    AREA_RANGE("arearange") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    AREA_SPLINE("areaspline") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    AREA_SPLINE_RANGE("areasplinerange") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    BAR("bar") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    BELL_CURVE("bellcurve") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    BOX_PLOT("boxplot") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    BUBBLE("bubble") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    BULLET("bullet") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    COLUMN("column") {
        @Override
        public Series<ColumnChartOptions> createSeriesInstance() {
            return new Series<ColumnChartOptions>().setType(this.getType()).setOptions(new ColumnChartOptions());
        }
    },
    COLUMN_PYRAMID("columnpyramid") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    COLUMN_RANGE("columnrange") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    CYLINDER("cylinder") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    DEPENDENCY_WHEEL("dependencywheel") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    ERROR_BAR("errorbar") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    FUNNEL("funnel") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    FUNNEL_3D("funnel3d") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    GAUGE("gauge") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    HEATMAP("heatmap") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    HISTOGRAM("histogram") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    ITEM("item") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    LINE("line") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    NETWORK_GRAPH("networkgraph") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    ORGANIZATION("organization") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    PARETO("pareto") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    PIE("pie") {
        @Override
        public Series<PieChartOptions> createSeriesInstance() {
            return new Series<PieChartOptions>().setType(this.getType()).setOptions(new PieChartOptions());
        }
    },
    POLYGON("polygon") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    PYRAMID("pyramid") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    PYRAMID_3D("pyramid3d") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    SANKEY("sankey") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    SCATTER("scatter") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    SCATTER_3D("scatter3d") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    SOLID_GAUGE("solidgauge") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    SPLINE("spline") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    STREAM_GRAPH("streamgraph") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    SUNBURST("sunburst") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    TILE_MAP("tilemap") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    TIMELINE("timeline") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    TREEMAP("treemap") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    VARIABLE_PIE("variablepie") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    VARIWIDE("variwide") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    VECTOR("vector") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    VENN("venn") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    WATERFALL("waterfall") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    WINDBARB("windbarb") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    WORDCLOUD("wordcloud") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    X_RANGE("xrange") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    LOW_MED_HIGH("lowmedhigh") {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setType(this.getType()).setOptions(new HighchartsSeriesPlotOptions());
        }
    },
    /**
     * Untyped series.
     */
    DEFAULT(null) {
        @Override
        public Series createSeriesInstance() {
            return new Series<>().setOptions(new HighchartsSeriesPlotOptions());
        }
    };

    protected String getType() {
        return this.type;
    }

    private String type;

    HighchartsSeriesType(String type) {
        this.type = type;
    }

    public static HighchartsSeriesType getInstance(String type) {
        if(type == null || type.isEmpty()) {
            return HighchartsSeriesType.DEFAULT;
        }
        Optional<HighchartsSeriesType> seriesType = Arrays.stream(HighchartsSeriesType.values())
                .filter(t -> type.equalsIgnoreCase(t.type))
                .findFirst();
        return seriesType.orElse(HighchartsSeriesType.DEFAULT);
    }

    public abstract <O extends HighchartsSeriesPlotOptions> Series<O> createSeriesInstance();

}
