package za.co.onlineintelligence.hyforge.common;

public interface DrosteSeperation {


    /**
     * The method that will be called when calling HyChartForgeInstance.hydrateSeperations();
     *
     * @return
     */
    String hydrateClass();

    default String deflateClass() {
        return "";
    }

}
