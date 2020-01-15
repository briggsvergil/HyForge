package za.co.onlineintelligence.hyforge.exporting;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

public class HighchartsExportingMenuObject implements DrosteDeflater {

    public HighchartsExportingMenuObject() {
    }

    /**
     * The click handler for the menu item.
     */
    private HighchartsCallbackFunction onClick;
    /**
     * Indicates a separator line instead of an item.
     */
    private Boolean seperator;
    /**
     * The text for the menu item.
     */
    private String text;
    /**
     * If internationalization is required, the key to a language string.
     */
    private String textKey;

    public HighchartsCallbackFunction getOnClick() {
        return onClick;
    }

    public HighchartsExportingMenuObject setOnClick(HighchartsCallbackFunction onClick) {
        this.onClick = onClick;
        return this;
    }

    public Boolean getSeperator() {
        return seperator;
    }

    public HighchartsExportingMenuObject setSeperator(Boolean seperator) {
        this.seperator = seperator;
        return this;
    }

    public String getText() {
        return text;
    }

    public HighchartsExportingMenuObject setText(String text) {
        this.text = text;
        return this;
    }

    public String getTextKey() {
        return textKey;
    }

    public HighchartsExportingMenuObject setTextKey(String textKey) {
        this.textKey = textKey;
        return this;
    }
}
