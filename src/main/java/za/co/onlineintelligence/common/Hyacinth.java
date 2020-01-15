package za.co.onlineintelligence.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.javatuples.Pair;
import za.co.onlineintelligence.hyforge.HighchartsFactory;
import za.co.onlineintelligence.hyforge.HyForgeFactory;
import za.co.onlineintelligence.hyforge.HighchartsOptions;
import za.co.onlineintelligence.hyforge.accessibility.Accessibility;
import za.co.onlineintelligence.hyforge.axis.Axis;
import za.co.onlineintelligence.hyforge.axis.AxisLabels;
import za.co.onlineintelligence.hyforge.axis.AxisTitle;
import za.co.onlineintelligence.hyforge.chart.Chart;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;
import za.co.onlineintelligence.hyforge.common.HighchartsColorString;
import za.co.onlineintelligence.hyforge.common.HighchartsShadowOptionsObject;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAxisTitleAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsVerticalAlignValue;
import za.co.onlineintelligence.hyforge.credits.Credits;
import za.co.onlineintelligence.hyforge.legend.Legend;
import za.co.onlineintelligence.hyforge.plotoptions.*;
import za.co.onlineintelligence.hyforge.series.Series;
import za.co.onlineintelligence.hyforge.subtitle.Subtitle;
import za.co.onlineintelligence.hyforge.title.Title;
import za.co.onlineintelligence.hyforge.tooltip.Tooltip;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.GZIPOutputStream;

/**
 * Hyacinth:
 * <p>
 * The test and example class for Highcharts, HyForgeOptions, HighchartsFactory etc.
 *
 * @author Sean Briggs.
 */
public class Hyacinth {


    private static final HighchartsFactory factory = new HyForgeFactory();
    private static final String CREATED_SUBTITLE = "Made By Sean Briggs.";
    private static final String URL = "http://localhost:2020/chart";
    private final HighchartsOptions forge;

    public Hyacinth() {
        this.forge = (HighchartsOptions) factory.createChartOptions();
    }

    private static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return out.toString("UTF-8");
    }

    public static void PostRequest(String body) {
        try {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost post = new HttpPost(URL);
            String encodedString = Base64.getEncoder().encodeToString(body.getBytes());
            StringEntity input = new StringEntity("{ \"chartData\": \"" + encodedString + "\" }");
//            StringEntity input = new StringEntity("{ \"body\": \"" + compress(body) + "\" }");
            post.setHeader("Accept", "application/json");
            post.setHeader("Content-Type", "application/json");
            post.setEntity(input);
            System.out.println("POST REQUEST: [" + post.toString() + "]");
            HttpResponse response = client.execute(post);
            System.out.println("Post Response: " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createComboScatterAndLine() {
        this.forge
                .setTitle(new Title()
                        .setText("Scatter plot with regression line")
                )
                .setXAxis(new Axis[]{
                        new Axis()
                                .setMin(-0.5)
                                .setMax(5.5)
                })
                .setYAxis(new Axis[]{
                        new Axis()
                                .setMin(0.0)
                });
        Series s1 = factory.createSeries("line")
                .setName("Regression Line")
                .setData_X_Y_Pairs(Pair.with(0, 1.11), Pair.with(5, 4.51));
        s1.getOptions()
                .setMarker(new Marker()
                        .setEnabled(false)
                )
                .setStates(new States()
                        .setHover(new Hover()
                                .setLineWidth(0)
                        )
                )
                .setEnableMouseTracking(false);
        this.forge.addSeries(s1);
        Series s2 = factory.createSeries("scatter")
                .setName("Observations")
                .setData(new Double[]{1.0, 1.5, 2.8, 3.5, 3.9, 4.2});
        s2.getOptions()
                .setMarker(new Marker()
                        .setRadius(4)
                );
        this.forge.addSeries(s2);
    }

    private void createBasicBarChart(String title) {
        this.forge
                .setChart(new Chart("bar"))
                .setTitle(new Title(title))
                .setSubtitle(new Subtitle(CREATED_SUBTITLE))
                .setXAxis(new Axis()
                        .setCategories(new String[]
                                {
                                        "Africa", "America", "Asia", "Europe", "Oceania"
                                })
                        .setTitle(new AxisTitle().setText("Countries"))
                )
                .setYAxis(new Axis()
                        .setMin(0.0)
                        .setTitle(new AxisTitle().setText("Population (millions)")
                                .setAlign(HighchartsAxisTitleAlignValue.high))
                        .setLabels(new AxisLabels().setOverflow("justify"))
                )
                .setTooltip(new Tooltip()
                        .setFormatter(new HighchartsCallbackFunction("function (point) {\n" +
                                "                var index = point.index + 1,\n" +
                                "                    category = point.category,\n" +
                                "                    val = Math.abs(point.y),\n" +
                                "                    series = point.series.name;\n" +
                                "\n" +
                                "                return index + ', Age ' + category + ', ' + val + '%. ' + series + '.';\n" +
                                "            }"))
                        .setValueSuffix(" millions")
                )
                .setPlotOptions(new PlotOptions()
                        .setBar(new HighchartsSeriesPlotOptions()
                                .setDataLabels(new DataLabel()
                                        .setEnabled(true)))
                )
                .setLegend(new Legend()
                        .setLayout("vertical")
                        .setAlign(HighchartsAlignValue.right)
                        .setVerticalAlign(HighchartsVerticalAlignValue.top)
                        .setX(-40)
                        .setY(80)
                        .setFloating(true)
                        .setBorderWidth(1)
                        .setBackgroundColor(new HighchartsColorString("#FFFFFF"))
                        .setShadow(new HighchartsShadowOptionsObject())

                )
                .setCredits(new Credits().setEnabled(false))
                .setSeries(new Series[]{
                        new Series()
                                .setName("Year 1800")
                                .setData_Y_Values(107, 31, 635, 203, 2),
                        new Series()
                                .setName("Year 1900")
                                .setData_Y_Values(133, 156, 947, 408, 6),
                        new Series()
                                .setName("Year 2000")
                                .setData_Y_Values(814, 841, 3714, 727, 31),
                        new Series()
                                .setName("Year 2016")
                                .setData_Y_Values(1216, 1001, 4436, 738, 40),
                });
    }

    public void createScatterPlot(String title) {
        this.forge
                .setChart(new Chart()
                        .setType("scatter")
                        .setZoomType("xy"))
                .setTitle(new Title()
                        .setText(title))
                .setSubtitle(new Subtitle()
                        .setText(CREATED_SUBTITLE))
                .setAccessibility(new Accessibility()
                        .setDescription("Height versus weight of genders...."))
                .setXAxis(new Axis[]{
                        new Axis().setTitle(new AxisTitle("Height (cm)"))
                                .setStartOnTick(true)
                                .setEndOnTick(true)
                                .setShowLastLabel(true)
                })
                .setYAxis(new Axis[]{
                        new Axis().setTitle(new AxisTitle("Weight (kg)"))
                })
                .setLegend(new Legend()
                        .setLayout("vertical")
                        .setAlign(HighchartsAlignValue.left)
                        .setVerticalAlign(HighchartsVerticalAlignValue.top)
                        .setX(100)
                        .setY(70)
                        .setFloating(true)
                        .setBorderWidth(1))
                .setPlotOptions(new PlotOptions()
                        .setScatter(new HighchartsSeriesPlotOptions()
                                .setMarker(new Marker()
                                        .setRadius(5)
                                        .setStates(new States()
                                                .setHover(new Hover()
                                                        .setEnabled(true)
                                                        .setLineColor("rgb(100,100,100)")
                                                )
                                        )
                                )
                                .setStates(new States()
                                        .setHover(new Hover()
                                                .setEnabled(true)
                                        )
                                )
                                .setTooltip(new Tooltip()
                                        .setHeaderFormat("<b>{series.name}</b><br>")
                                        .setPointFormat("{point.x} cm, {point.y} kg"))
                        )
                )
                .setSeries(new Series[]{
                        new Series("Female")
                                .setOptions(new HighchartsSeriesPlotOptions()
                                        .setColor("rgba(223, 83, 83, 0.5)"))
                                .setData_X_Y_Pairs(Hydrangea.femaleData),
                        new Series("Male")
                                .setOptions(new HighchartsSeriesPlotOptions()
                                        .setColor("rgba(119, 152, 191, 0.5)"))
                                .setData_X_Y_Pairs(Hydrangea.maleData)
                });

    }

    public static void main(String[] args) {
        Hyacinth instance = new Hyacinth();
//        instance.createBasicBarChart("Basic Bar Chart Using Highcharts");
//        instance.createScatterPlot("Height Versus Weight of 507 Individuals by Gender");
//        instance.createComboScatterAndLine();
//        String s = instance.forge.hydrate();
        JsonElement vueFormGenerator = DrosteDeflater.deIonize(HighchartsSeriesPlotOptions.class, "");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String gsonS = gson.toJson(vueFormGenerator);
        System.out.println("Vue Forms Generator: " + gsonS);
//        PostRequest(s);
//        System.out.println("Chart data sent to Node Server at: " + URL);
//        System.out.println("CHART TEST: \n" + s);

    }
}
