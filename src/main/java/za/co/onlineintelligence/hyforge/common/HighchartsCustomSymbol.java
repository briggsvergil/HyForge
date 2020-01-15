package za.co.onlineintelligence.hyforge.common;

/**
 * @author Sean Briggs.
 */
public class HighchartsCustomSymbol implements HighchartsSymbol, DrosteSeperation, DrosteDeflater {

    public HighchartsCustomSymbol() {
    }

    public HighchartsCustomSymbol(String name) {
        this.name = name;
    }

    private String name;
    private HighchartsCallbackFunction function;

    public String getName() {
        return name;
    }

    public HighchartsCustomSymbol setName(String name) {
        this.name = name;
        return this;
    }

    public HighchartsCallbackFunction getFunction() {
        return function;
    }

    public HighchartsCustomSymbol setFunction(HighchartsCallbackFunction function) {
        this.function = function;
        return this;
    }

    /**
     * An example of a Custom Symbol with the name as download
     * @return
     */
    public static HighchartsCustomSymbol downloadSymbol() {
        return new HighchartsCustomSymbol("download")
                .setFunction(new HighchartsCallbackFunction()
                        .setJsCallbackFunction("function (x, y, w, h) {\n" +
                                "    var path = [\n" +
                                "        // Arrow stem\n" +
                                "        'M', x + w * 0.5, y,\n" +
                                "        'L', x + w * 0.5, y + h * 0.7,\n" +
                                "        // Arrow head\n" +
                                "        'M', x + w * 0.3, y + h * 0.5,\n" +
                                "        'L', x + w * 0.5, y + h * 0.7,\n" +
                                "        'L', x + w * 0.7, y + h * 0.5,\n" +
                                "        // Box\n" +
                                "        'M', x, y + h * 0.9,\n" +
                                "        'L', x, y + h,\n" +
                                "        'L', x + w, y + h,\n" +
                                "        'L', x + w, y + h * 0.9\n" +
                                "    ];\n" +
                                "    return path;\n" +
                                "};"));
    }


    @Override
    public String hydrateClass() {
        return "Highcharts.SVGRenderer.prototype.symbols." + name + " = " + function;
    }

    @Override
    public String deflateClass() {
        return '\'' +  name + '\'';
    }
}
