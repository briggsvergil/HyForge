package za.co.onlineintelligence.hyforge.accessibility;

import za.co.onlineintelligence.hyforge.common.Exportable;

import java.io.Serializable;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Accessibility HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Accessibility implements Serializable, Exportable {


    public Accessibility() {
    }

    /**
     * Options for announcing new data to screen reader users. Useful
     * for dynamic data applications and drilldown.
     * <p>
     * Keep in mind that frequent announcements will not be useful to
     * users, as they won't have time to explore the new data. For these
     * applications, consider making snapshots of the data accessible, and
     * do the announcements in batches.
     *
     * @since 7.1.0
     */
    private AnnounceNewData announceNewData;

    /**
     * A hook for adding custom components to the accessibility module.
     * Should be an object mapping component names to instances of classes
     * inheriting from the Highcharts.AccessibilityComponent base class.
     * Remember to add the component to the
     * [keyboardNavigation.order](#accessibility.keyboardNavigation.order)
     * for the keyboard navigation to be usable.
     *
     * @since 7.1.0
     */
    private String customComponents;

    /**
     * A text description of the chart.
     * <p>
     * *Note: Prefer using [linkedDescription](#accessibility.linkedDescription)
     * or [caption](#caption.text) instead.**
     * <p>
     * If the Accessibility module is loaded, this option is included by
     * default as a long description of the chart in the hidden screen
     * reader information region.
     * <p>
     * Note: Since Highcharts now supports captions and linked descriptions,
     * it is preferred to define the description using those methods, as a
     * visible caption/description benefits all users. If the
     * `accessibility.description` option is defined, the linked description
     * is ignored, and the caption is hidden from screen reader users.
     *
     * @since 5.0.0
     */
    private String description;

    /**
     * Enable accessibility functionality for the chart.
     *
     * @since 5.0.0
     */
    private Boolean enabled;

    /**
     * Theme to apply to the chart when Windows High Contrast Mode is
     * detected. By default, a high contrast theme matching the high
     * contrast system system colors is used.
     *
     * @since 7.1.3
     */
    private HighContrastTheme highContrastTheme;

    /**
     * Options for keyboard navigation.
     *
     * @since 5.0.0
     */
    private KeyboardNavigation keyboardNavigation;

    /**
     * Amount of landmarks/regions to create for screen reader users. More
     * landmarks can make navigation with screen readers easier, but can
     * be distracting if there are lots of charts on the page. Three modes
     * are available:
     * - `all`: Adds regions for all series, legend, menu, information
     * region.
     * - `one`: Adds a single landmark per chart.
     * - `disabled`: No landmarks are added.
     *
     * @since 7.1.0
     */
    private String landmarkVerbosity;

    /**
     * Link the chart to an HTML element describing the contents of the
     * chart.
     * <p>
     * It is always recommended to describe charts using visible text, to
     * improve SEO as well as accessibility for users with disabilities.
     * This option lets an HTML element with a description be linked to the
     * chart, so that screen reader users can connect the two.
     * <p>
     * By setting this option to a string, Highcharts runs the string as an
     * HTML selector query on the entire document. If there is only a single
     * match, this element is linked to the chart. The content of the linked
     * element will be included in the chart description for screen reader
     * users.
     * <p>
     * By default, the chart looks for an adjacent sibling element with the
     * `highcharts-description` class.
     * <p>
     * The feature can be disabled by setting the option to an empty string,
     * or overridden by providing the
     * [accessibility.description](#accessibility.description) option.
     * Alternatively, the HTML element to link can be passed in directly as
     * an HTML node.
     * <p>
     * If you need the description to be part of the exported image,
     * consider using the [caption](#caption) feature.
     * <p>
     * If you need the description to be hidden visually, use the
     * [accessibility.description](#accessibility.description) option.
     *
     * @since 8.0.0
     */
    private String linkedDescription;

    /**
     * Options for descriptions of individual data points.
     *
     * @since 8.0.0
     */
    private AccessibilityPoint point;

    /**
     * Accessibility options for the screen reader information sections
     * added before and after the chart.
     *
     * @since 8.0.0
     */
    private ScreenReaderSection screenReaderSection;

    /**
     * Accessibility options global to all data series. Individual series
     * can also have specific [accessibility options](#plotOptions.series.accessibility)
     * set.
     *
     * @since 8.0.0
     */
    private SeriesAccessibilityOptions series;

    /**
     * A text description of the chart type.
     * <p>
     * If the Accessibility module is loaded, this will be included in the
     * description of the chart in the screen reader information region.
     * <p>
     * Highcharts will by default attempt to guess the chart type, but for
     * more complex charts it is recommended to specify this property for
     * clarity.
     *
     * @since 5.0.0
     */
    private String typeDescription;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public AnnounceNewData getAnnounceNewData() {
        return this.announceNewData = getInstanceOf(AnnounceNewData.class, this.announceNewData);
    }

    public Accessibility setAnnounceNewData(AnnounceNewData announceNewData) {
        this.announceNewData = announceNewData;
        return this;
    }

    public String getCustomComponents() {
        return this.customComponents = getInstanceOf(String.class, this.customComponents);
    }

    public Accessibility setCustomComponents(String customComponents) {
        this.customComponents = customComponents;
        return this;
    }

    public String getDescription() {
        return this.description = getInstanceOf(String.class, this.description);
    }

    public Accessibility setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean getEnabled() {
        return this.enabled = getInstanceOf(boolean.class, this.enabled);
    }

    public Accessibility setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HighContrastTheme getHighContrastTheme() {
        return this.highContrastTheme = getInstanceOf(HighContrastTheme.class, this.highContrastTheme);
    }

    public Accessibility setHighContrastTheme(HighContrastTheme highContrastTheme) {
        this.highContrastTheme = highContrastTheme;
        return this;
    }

    public KeyboardNavigation getKeyboardNavigation() {
        return this.keyboardNavigation = getInstanceOf(KeyboardNavigation.class, this.keyboardNavigation);
    }

    public Accessibility setKeyboardNavigation(KeyboardNavigation keyboardNavigation) {
        this.keyboardNavigation = keyboardNavigation;
        return this;
    }

    public String getLandmarkVerbosity() {
        return this.landmarkVerbosity = getInstanceOf(String.class, this.landmarkVerbosity);
    }

    public Accessibility setLandmarkVerbosity(String landmarkVerbosity) {
        this.landmarkVerbosity = landmarkVerbosity;
        return this;
    }

    public String getLinkedDescription() {
        return this.linkedDescription = getInstanceOf(String.class, this.linkedDescription);
    }

    public Accessibility setLinkedDescription(String linkedDescription) {
        this.linkedDescription = linkedDescription;
        return this;
    }

    public AccessibilityPoint getPoint() {
        return this.point = getInstanceOf(AccessibilityPoint.class, this.point);
    }

    public Accessibility setPoint(AccessibilityPoint point) {
        this.point = point;
        return this;
    }

    public ScreenReaderSection getScreenReaderSection() {
        return this.screenReaderSection = getInstanceOf(ScreenReaderSection.class, this.screenReaderSection);
    }

    public Accessibility setScreenReaderSection(ScreenReaderSection screenReaderSection) {
        this.screenReaderSection = screenReaderSection;
        return this;
    }

    public SeriesAccessibilityOptions getSeries() {
        return this.series = getInstanceOf(SeriesAccessibilityOptions.class, this.series);
    }

    public Accessibility setSeries(SeriesAccessibilityOptions series) {
        this.series = series;
        return this;
    }

    public String getTypeDescription() {
        return this.typeDescription = getInstanceOf(String.class, this.typeDescription);
    }

    public Accessibility setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.announceNewData);
        hash = 17 * hash + Objects.hashCode(this.customComponents);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.highContrastTheme);
        hash = 17 * hash + Objects.hashCode(this.keyboardNavigation);
        hash = 17 * hash + Objects.hashCode(this.landmarkVerbosity);
        hash = 17 * hash + Objects.hashCode(this.linkedDescription);
        hash = 17 * hash + Objects.hashCode(this.point);
        hash = 17 * hash + Objects.hashCode(this.screenReaderSection);
        hash = 17 * hash + Objects.hashCode(this.series);
        hash = 17 * hash + Objects.hashCode(this.typeDescription);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "announceNewData:" + announceNewData
                + ", customComponents:" + customComponents
                + ", description:" + description
                + ", enabled:" + enabled
                + ", highContrastTheme:" + highContrastTheme
                + ", keyboardNavigation:" + keyboardNavigation
                + ", landmarkVerbosity:" + landmarkVerbosity
                + ", linkedDescription:" + linkedDescription
                + ", point:" + point
                + ", screenReaderSection:" + screenReaderSection
                + ", series:" + series
                + ", typeDescription:" + typeDescription
                + '}';
    }


}