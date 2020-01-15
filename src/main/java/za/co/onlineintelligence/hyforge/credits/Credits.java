package za.co.onlineintelligence.hyforge.credits;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;
import za.co.onlineintelligence.hyforge.common.HighchartsAlignObject;


/**
 * Credits HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Credits implements Serializable, DrosteDeflater {


    public Credits() {
    }

    /**
     * Whether to show the credits text.
     */
    private Boolean enabled;

    /**
     * The URL for the credits label.
     */
    private String href;

    /**
     * Credits for map source to be concatenated with conventional credit
     * text. By default this is a format string that collects copyright
     * information from the map if available.
     *
     * @since 4.2.2
     */
    private String mapText;

    /**
     * Detailed credits for map source to be displayed on hover of credits
     * text. By default this is a format string that collects copyright
     * information from the map if available.
     *
     * @since 4.2.2
     */
    private String mapTextFull;

    /**
     * Position configuration for the credits label.
     *
     * @since 2.1.0
     */
    private HighchartsAlignObject position;

    /**
     * CSS styles for the credits label.
     */
    private HighchartsCSS style;

    /**
     * The text for the credits label.
     */
    private String text;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public Credits setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getHref() {
        return this.href;
    }

    public Credits setHref(String href) {
        this.href = href;
        return this;
    }

    public String getMapText() {
        return this.mapText;
    }

    public Credits setMapText(String mapText) {
        this.mapText = mapText;
        return this;
    }

    public String getMapTextFull() {
        return this.mapTextFull;
    }

    public Credits setMapTextFull(String mapTextFull) {
        this.mapTextFull = mapTextFull;
        return this;
    }

    public HighchartsAlignObject getPosition() {
        return this.position;
    }

    public Credits setPosition(HighchartsAlignObject position) {
        this.position = position;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style;
    }

    public Credits setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Credits setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.href);
        hash = 17 * hash + Objects.hashCode(this.mapText);
        hash = 17 * hash + Objects.hashCode(this.mapTextFull);
        hash = 17 * hash + Objects.hashCode(this.position);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.text);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "enabled:" + enabled
                + ", href:" + href
                + ", mapText:" + mapText
                + ", mapTextFull:" + mapTextFull
                + ", position:" + position
                + ", style:" + style
                + ", text:" + text
                + '}';
    }


}