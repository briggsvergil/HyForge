package za.co.onlineintelligence.hyforge.navigation;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.Exportable;
import za.co.onlineintelligence.hyforge.common.HighchartsCallbackFunction;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * AnnotationsEvents HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Events implements Serializable, Exportable {


    public Events() {
    }

    /**
     * A `closePopup` event. Fired when Popup should be hidden, for example
     * when clicking on an annotation again.
     *
     * @since 7.0.0
     */
    private HighchartsCallbackFunction closePopup;

    /**
     * Event fired when button state should change, for example after
     * adding an annotation.
     *
     * @since 7.0.0
     */
    private HighchartsCallbackFunction deselectButton;

    /**
     * Event fired on a button click.
     *
     * @since 7.0.0
     */
    private HighchartsCallbackFunction selectButton;

    /**
     * A `showPopup` event. Fired when selecting for example an annotation.
     *
     * @since 7.0.0
     */
    private HighchartsCallbackFunction showPopup;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public HighchartsCallbackFunction getClosePopup() {
        return this.closePopup = getInstanceOf(HighchartsCallbackFunction.class, this.closePopup);
    }

    public Events setClosePopup(HighchartsCallbackFunction closePopup) {
        this.closePopup = closePopup;
        return this;
    }

    public HighchartsCallbackFunction getDeselectButton() {
        return this.deselectButton = getInstanceOf(HighchartsCallbackFunction.class, this.deselectButton);
    }

    public Events setDeselectButton(HighchartsCallbackFunction deselectButton) {
        this.deselectButton = deselectButton;
        return this;
    }

    public HighchartsCallbackFunction getSelectButton() {
        return this.selectButton = getInstanceOf(HighchartsCallbackFunction.class, this.selectButton);
    }

    public Events setSelectButton(HighchartsCallbackFunction selectButton) {
        this.selectButton = selectButton;
        return this;
    }

    public HighchartsCallbackFunction getShowPopup() {
        return this.showPopup = getInstanceOf(HighchartsCallbackFunction.class, this.showPopup);
    }

    public Events setShowPopup(HighchartsCallbackFunction showPopup) {
        this.showPopup = showPopup;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.closePopup);
        hash = 17 * hash + Objects.hashCode(this.deselectButton);
        hash = 17 * hash + Objects.hashCode(this.selectButton);
        hash = 17 * hash + Objects.hashCode(this.showPopup);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "closePopup:" + closePopup
                + ", deselectButton:" + deselectButton
                + ", selectButton:" + selectButton
                + ", showPopup:" + showPopup
                + '}';
    }


}
