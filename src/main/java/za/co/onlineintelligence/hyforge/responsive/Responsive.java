package za.co.onlineintelligence.hyforge.responsive;

import java.io.Serializable;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.common.DrosteDeflater;


/**
 * Responsive  HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Responsive implements Serializable, DrosteDeflater {


    public Responsive() {
    }

    /**
     * A set of rules for responsive settings. The rules are executed from
     * the top down.
     *
     * @since 5.0.0
     */
    private ResponsiveRule[] rules;

    /*
        Getters and Builder-Style Setters
    */
    public ResponsiveRule[] getRules() {
        return this.rules;
    }

    public Responsive setRules(ResponsiveRule[] rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.rules);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "rules:" + rules
                + '}';
    }


}