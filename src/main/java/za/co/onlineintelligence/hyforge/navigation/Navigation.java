package za.co.onlineintelligence.hyforge.navigation;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import za.co.onlineintelligence.hyforge.annotations.Annotations;
import za.co.onlineintelligence.hyforge.common.DrosteDeflater;
import za.co.onlineintelligence.hyforge.common.HighchartsCSS;
import za.co.onlineintelligence.hyforge.common.HighchartsStockToolsBindingsObject;


/**
 * Navigation HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Navigation implements Serializable, DrosteDeflater {


    public Navigation() {
    }

    /**
     * Additional options to be merged into all annotations.
     */
    private Annotations annotationsOptions;

    /**
     * Bindings definitions for custom HTML buttons. Each binding implements
     * simple event-driven interface:
     * <p>
     * - `className`: classname used to bind event to
     * <p>
     * - `init`: initial event, fired on button click
     * <p>
     * - `start`: fired on first click on a chart
     * <p>
     * - `steps`: array of sequential events fired one after another on each
     * of users clicks
     * <p>
     * - `end`: last event to be called after last step event
     *
     * @since 7.0.0
     */
    private List<HighchartsStockToolsBindingsObject> bindings;

    /**
     * A CSS class name where all bindings will be attached to. Multiple
     * charts on the same page should have separate class names to prevent
     * duplicating events.
     * <p>
     * Default value of versions < 7.0.4 `highcharts-bindings-wrapper`
     *
     * @since 7.0.0
     */
    private String bindingsClassName;

    /**
     * A collection of options for buttons appearing in the exporting
     * module.
     * <p>
     * In styled mode, the buttons are styled with the
     * `.highcharts-contextbutton` and `.highcharts-button-symbol` classes.
     */
    private ButtonOptions buttonOptions;

    /**
     * AnnotationsEvents to communicate between Stock Tools and custom GUI.
     *
     * @since 7.0.0
     */
    private Events events;

    /**
     * Path where Highcharts will look for icons. Change this to use icons
     * from a different server.
     *
     * @since 7.1.3
     */
    private String iconsURL;

    /**
     * CSS styles for the hover state of the individual items within the
     * popup menu appearing by default when the export icon is clicked. The
     * menu items are rendered in HTML.
     *
     * @since 2.0.0
     */
    private HighchartsCSS menuItemHoverStyle;

    /**
     * CSS styles for the individual items within the popup menu appearing
     * by default when the export icon is clicked. The menu items are
     * rendered in HTML. Font size defaults to `11px` on desktop and `14px`
     * on touch devices.
     *
     * @since 2.0.0
     */
    private HighchartsCSS menuItemStyle;

    /**
     * CSS styles for the popup menu appearing by default when the export
     * icon is clicked. This menu is rendered in HTML.
     *
     * @since 2.0.0
     */
    private HighchartsCSS menuStyle;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public Annotations getAnnotationsOptions() {
        return this.annotationsOptions;
    }

    public Navigation setAnnotationsOptions(Annotations annotationsOptions) {
        this.annotationsOptions = annotationsOptions;
        return this;
    }

    public List<HighchartsStockToolsBindingsObject> getBindings() {
        return this.bindings;
    }

    public Navigation setBindings(List<HighchartsStockToolsBindingsObject> bindings) {
        this.bindings = bindings;
        return this;
    }

    public String getBindingsClassName() {
        return this.bindingsClassName;
    }

    public Navigation setBindingsClassName(String bindingsClassName) {
        this.bindingsClassName = bindingsClassName;
        return this;
    }

    public ButtonOptions getButtonOptions() {
        return this.buttonOptions;
    }

    public Navigation setButtonOptions(ButtonOptions buttonOptions) {
        this.buttonOptions = buttonOptions;
        return this;
    }

    public Events getEvents() {
        return this.events;
    }

    public Navigation setEvents(Events events) {
        this.events = events;
        return this;
    }

    public String getIconsURL() {
        return this.iconsURL;
    }

    public Navigation setIconsURL(String iconsURL) {
        this.iconsURL = iconsURL;
        return this;
    }

    public HighchartsCSS getMenuItemHoverStyle() {
        return this.menuItemHoverStyle;
    }

    public Navigation setMenuItemHoverStyle(HighchartsCSS menuItemHoverStyle) {
        this.menuItemHoverStyle = menuItemHoverStyle;
        return this;
    }

    public HighchartsCSS getMenuItemStyle() {
        return this.menuItemStyle;
    }

    public Navigation setMenuItemStyle(HighchartsCSS menuItemStyle) {
        this.menuItemStyle = menuItemStyle;
        return this;
    }

    public HighchartsCSS getMenuStyle() {
        return this.menuStyle;
    }

    public Navigation setMenuStyle(HighchartsCSS menuStyle) {
        this.menuStyle = menuStyle;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.annotationsOptions);
        hash = 17 * hash + Objects.hashCode(this.bindings);
        hash = 17 * hash + Objects.hashCode(this.bindingsClassName);
        hash = 17 * hash + Objects.hashCode(this.buttonOptions);
        hash = 17 * hash + Objects.hashCode(this.events);
        hash = 17 * hash + Objects.hashCode(this.iconsURL);
        hash = 17 * hash + Objects.hashCode(this.menuItemHoverStyle);
        hash = 17 * hash + Objects.hashCode(this.menuItemStyle);
        hash = 17 * hash + Objects.hashCode(this.menuStyle);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "annotationsOptions:" + annotationsOptions
                + ", bindings:" + bindings
                + ", bindingsClassName:" + bindingsClassName
                + ", buttonOptions:" + buttonOptions
                + ", events:" + events
                + ", iconsURL:" + iconsURL
                + ", menuItemHoverStyle:" + menuItemHoverStyle
                + ", menuItemStyle:" + menuItemStyle
                + ", menuStyle:" + menuStyle
                + '}';
    }


}