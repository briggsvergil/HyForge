package za.co.onlineintelligence.hyforge.title;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

/**
 * @author Sean Briggs
 */
public class Title implements Serializable, DrosteDeflater {

    public Title() {
    }

    public Title(String text) {
        this.text = text;
    }

    /**
     * The pixel distance between the axis labels and the title. Positive values
     * are outside the axis line, negative are inside.
     */
    private Integer margin;

    /**
     * The rotation of the text in degrees. 0 is horizontal, 270 is vertical
     * reading from bottom to top.
     */
    private Integer rotation;

    /**
     * The actual text of the axis title. Horizontal texts can contain HTML, but
     * rotated texts are painted using vector techniques and must be clean text.
     * The Y axis title is disabled by setting the `text` option to `undefined`.
     */
    private String text;

    /**
     * Generic CSS styles for the legend title.
     *
     * @since 3.0.0
     */
    private HighchartsCSS style;

    /*
		Getters and Builder-ControlPointOptionsStyle Setters
     */
    public int getMargin() {
        return this.margin = getInstanceOf(int.class, this.margin);
    }

    public Title setMargin(int margin) {
        this.margin = margin;
        return this;
    }

    public int getRotation() {
        return this.rotation = getInstanceOf(int.class, this.rotation);
    }

    public Title setRotation(int rotation) {
        this.rotation = rotation;
        return this;
    }

    public String getText() {
        return this.text = getInstanceOf(String.class, this.text);
    }

    public Title setText(String text) {
        this.text = text;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public Title setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.margin);
        hash = 17 * hash + Objects.hashCode(this.rotation);
        hash = 17 * hash + Objects.hashCode(this.text);
        hash = 17 * hash + Objects.hashCode(this.style);

        return hash;
    }

    @Override
    public String toString() {
        return "Title{" +
                "margin=" + margin +
                ", rotation=" + rotation +
                ", text='" + text + '\'' +
                ", style=" + style +
                '}';
    }
}
