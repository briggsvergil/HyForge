package za.co.onlineintelligence.hyforge.common.enums;

public enum HighchartsExportingMimeTypeValue {
    image_png , image_jpeg , application_pdf , image_svg$xml;


    @Override
    public String toString() {
        return this.name().replace('_', '/').replace('$', '+');
    }
}
