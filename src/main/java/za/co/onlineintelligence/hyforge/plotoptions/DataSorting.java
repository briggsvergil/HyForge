package za.co.onlineintelligence.hyforge.plotoptions;

//package za.co.onlineintelligence.hyforge;

import java.io.Serializable;
import java.util.Objects;


/**
 * DataSorting HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class DataSorting implements Serializable {


    public DataSorting() {
    }

    /**
     * Enable or disable data sorting for the series. Use [xAxis.reversed](#xAxis.reversed) to change the sorting order.
     *
     * @since 8.0.0
     */
    private boolean enabled;

    /**
     * Whether to allow matching points by name in an update. If this option
     * is disabled, points will be matched by order.
     *
     * @since 8.0.0
     */
    private boolean matchByName;

    /**
     * Determines what data value should be used to sort by.
     *
     * @since 8.0.0
     */
    private String sortKey;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public boolean getEnabled() {
        return this.enabled;
    }

    public DataSorting setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public boolean getMatchByName() {
        return this.matchByName;
    }

    public DataSorting setMatchByName(boolean matchByName) {
        this.matchByName = matchByName;
        return this;
    }

    public String getSortKey() {
        return this.sortKey;
    }

    public DataSorting setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.matchByName);
        hash = 17 * hash + Objects.hashCode(this.sortKey);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "enabled:" + enabled
                + ", matchByName:" + matchByName
                + ", sortKey:" + sortKey
                + '}';
    }


}
