package za.co.onlineintelligence.hyforge.exporting;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;

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
        return this.onClick = getInstanceOf(HighchartsCallbackFunction.class, this.onClick);
    }

    public HighchartsExportingMenuObject setOnClick(HighchartsCallbackFunction onClick) {
        this.onClick = onClick;
        return this;
    }

    public Boolean getSeperator() {
        return this.seperator = getInstanceOf(Boolean.class, this.seperator);
    }

    public HighchartsExportingMenuObject setSeperator(Boolean seperator) {
        this.seperator = seperator;
        return this;
    }

    public String getText() {
        return this.text = getInstanceOf(String.class, this.text);
    }

    public HighchartsExportingMenuObject setText(String text) {
        this.text = text;
        return this;
    }

    public String getTextKey() {
        return this.textKey = getInstanceOf(String.class, this.textKey);
    }

    public HighchartsExportingMenuObject setTextKey(String textKey) {
        this.textKey = textKey;
        return this;
    }
}
