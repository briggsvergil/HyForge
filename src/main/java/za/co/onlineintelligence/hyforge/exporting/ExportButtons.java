package za.co.onlineintelligence.hyforge.exporting;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * ExportButtons  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class ExportButtons implements Serializable, DrosteDeflater {


    public ExportButtons() {
    }

    /**
     * Options for the export button.
     * <p>
     * In styled mode, export button styles can be applied with the
     * `.highcharts-contextbutton` class.
     */
    private ContextButton contextButton;

    /*
        Getters and Builder-Style Setters
    */
    public ContextButton getContextButton() {
        return this.contextButton = getInstanceOf(ContextButton.class, this.contextButton);
    }

    public ExportButtons setContextButton(ContextButton contextButton) {
        this.contextButton = contextButton;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.contextButton);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "contextButton:" + contextButton
                + '}';
    }


}