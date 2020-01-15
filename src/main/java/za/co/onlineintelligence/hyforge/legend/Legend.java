package za.co.onlineintelligence.hyforge.legend;

import za.co.onlineintelligence.hyforge.accessibility.Accessibility;
import za.co.onlineintelligence.hyforge.common.*;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsAlignValue;
import za.co.onlineintelligence.hyforge.common.enums.HighchartsVerticalAlignValue;
import za.co.onlineintelligence.hyforge.title.Title;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Objects;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getInstanceOf;


/**
 * Legend HighchartsAPI Class
 *
 * @author Sean Briggs
 */
public class Legend implements Serializable, DrosteDeflater {


    public Legend() {
    }

    /**
     * Accessibility options for the legend. Requires the Accessibility
     * module.
     *
     * @since 7.1.0
     */
    private Accessibility accessibility;

    /**
     * The horizontal alignment of the legend box within the chart area.
     * Valid values are `left`, `center` and `right`.
     * <p>
     * In the case that the legend is aligned in a corner position, the
     * `layout` option will determine whether to place it above/below
     * or on the side of the plot area.
     *
     * @since 2.0.0
     */
    private HighchartsAlignValue align;

    /**
     * If the [layout](legend.layout) is `horizontal` and the legend items
     * span over two lines or more, whether to align the items into vertical
     * columns. Setting this to `false` makes room for more items, but will
     * look more messy.
     *
     * @since 6.1.0
     */
    private Boolean alignColumns;

    /**
     * The background color of the legend.
     */
    private HighchartsColor backgroundColor;

    /**
     * The color of the drawn border around the legend.
     */
    private HighchartsColor borderColor;

    /**
     * The border corner radius of the legend.
     */
    private Integer borderRadius;

    /**
     * The width of the drawn border around the legend.
     */
    private Integer borderWidth;

    /**
     * The bubble legend is an additional element in legend which
     * presents the scale of the bubble series. Individual bubble ranges
     * can be defined by user or calculated from series. In the case of
     * automatically calculated ranges, a 1px margin of error is
     * permitted.
     *
     * @since 7.0.0
     */
    private BubbleLegend bubbleLegend;

    /**
     * Enable or disable the legend. There is also a series-specific option,
     * [showInLegend](#plotOptions.series.showInLegend), that can hide the
     * series from the legend. In some series types this is `false` by
     * default, so it must set to `true` in order to show the legend for the
     * series.
     */
    private Boolean enabled;

    /**
     * When the legend is floating, the plot area ignores it and is allowed
     * to be placed below it.
     *
     * @since 2.1.0
     */
    private Boolean floating;

    /**
     * Default styling for the checkbox next to a legend item when
     * `showCheckbox` is true.
     */
    private HighchartsCSS itemCheckboxStyle;

    /**
     * In a legend with horizontal layout, the itemDistance defines the
     * pixel distance between each item.
     *
     * @since 3.0.3
     */
    private Integer itemDistance;

    /**
     * CSS styles for each legend item when the corresponding series or
     * point is hidden. Only a subset of CSS is supported, notably those
     * options related to text. Properties are inherited from `style`
     * unless overridden here.
     */
    private HighchartsCSS itemHiddenStyle;

    /**
     * CSS styles for each legend item in hover mode. Only a subset of
     * CSS is supported, notably those options related to text. Properties
     * are inherited from `style` unless overridden here.
     */
    private HighchartsCSS itemHoverStyle;

    /**
     * The pixel bottom margin for each legend item.
     *
     * @since 2.2.0
     */
    private Integer itemMarginBottom;

    /**
     * The pixel top margin for each legend item.
     *
     * @since 2.2.0
     */
    private Integer itemMarginTop;

    /**
     * CSS styles for each legend item. Only a subset of CSS is supported,
     * notably those options related to text. The default `textOverflow`
     * property makes long texts truncate. Set it to `undefined` to wrap
     * text instead. A `width` property can be added to control the text
     * width.
     */
    private HighchartsCSS itemStyle;

    /**
     * The width for each legend item. By default the items are laid out
     * successively. In a [horizontal layout](legend.layout), if the items
     * are laid out across two rows or more, they will be vertically aligned
     * depending on the [legend.alignColumns](legend.alignColumns) option.
     *
     * @since 2.0.0
     */
    private Integer itemWidth;

    /**
     * A [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting)
     * for each legend label. Available variables relates to properties on
     * the series, or the point in case of pies.
     *
     * @since 1.3.0
     */
    private String labelFormat;

    /**
     * Callback function to format each of the series' labels. The `this`
     * keyword refers to the series object, or the point object in case of
     * pie charts. By default the series or point name is printed.
     */
    private HighchartsCallbackFunction labelFormatter;

    /**
     * The layout of the legend items. Can be one of `horizontal` or
     * `vertical` or `proximate`. When `proximate`, the legend items will be
     * placed as close as possible to the graphs they're representing,
     * except in inverted charts or when the legend position doesn't allow
     * it.
     */
    private String layout;

    /**
     * Line height for the legend items. Deprecated as of 2.1\. Instead,
     * the line height for each item can be set using
     * `itemStyle.lineHeight`, and the padding between items using
     * `itemMarginTop` and `itemMarginBottom`.
     *
     * @since 2.0.0
     */
    private Integer lineHeight;

    /**
     * If the plot area sized is calculated automatically and the legend is
     * not floating, the legend margin is the space between the legend and
     * the axis labels or plot area.
     *
     * @since 2.1.0
     */
    private Integer margin;

    /**
     * Maximum pixel height for the legend. When the maximum height is
     * extended, navigation will show.
     *
     * @since 2.3.0
     */
    private Integer maxHeight;

    /**
     * Options for the paging or navigation appearing when the legend is
     * overflown. LegendNavigation works well on screen, but not in static
     * exported images. One way of working around that is to
     * [increase the chart height in
     * export](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-enabled-false/).
     */
    private LegendNavigation navigation;

    /**
     * The inner padding of the legend box.
     *
     * @since 2.2.0
     */
    private Integer padding;

    /**
     * Whether to reverse the order of the legend items compared to the
     * order of the series or points as defined in the configuration object.
     *
     * @since 1.2.5
     */
    private Boolean reversed;

    /**
     * Whether to show the symbol on the right side of the text rather than
     * the left side. This is common in Arabic and Hebraic.
     *
     * @since 2.2.0
     */
    private Boolean rtl;

    /**
     * Whether to apply a drop shadow to the legend. A `backgroundColor`
     * also needs to be applied for this to take effect. The shadow can be
     * an object configuration containing `color`, `offsetX`, `offsetY`,
     * `opacity` and `width`.
     */
    private HighchartsShadowOptionsObject shadow;

    /**
     * When this is true, the legend symbol width will be the same as
     * the symbol height, which in turn defaults to the font size of the
     * legend items.
     *
     * @since 5.0.0
     */
    private Boolean squareSymbol;

    /**
     * CSS styles for the legend area. In the 1.x versions the position
     * of the legend area was determined by CSS. In 2.x, the position is
     * determined by properties like `align`, `verticalAlign`, `x` and `y`,
     * but the styles are still parsed for backwards compatibility.
     */
    private HighchartsCSS style;

    /**
     * The pixel height of the symbol for series types that use a rectangle
     * in the legend. Defaults to the font size of legend items.
     *
     * @since 3.0.8
     */
    private Integer symbolHeight;

    /**
     * The pixel padding between the legend item symbol and the legend
     * item text.
     */
    private Integer symbolPadding;

    /**
     * The border radius of the symbol for series types that use a rectangle
     * in the legend. Defaults to half the `symbolHeight`.
     *
     * @since 3.0.8
     */
    private Integer symbolRadius;

    /**
     * The pixel width of the legend item symbol. When the `squareSymbol`
     * option is set, this defaults to the `symbolHeight`, otherwise 16.
     */
    private Integer symbolWidth;

    /**
     * A title to be added on top of the legend.
     *
     * @since 3.0.0
     */
    private Title title;

    /**
     * Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
     * to render the legend item texts.
     * <p>
     * Prior to 4.1.7, when using HTML, [legend.navigation](#legend.navigation) was disabled.
     */
    private Boolean useHTML;

    /**
     * The vertical alignment of the legend box. Can be one of `top`,
     * `middle` or `bottom`. Vertical position can be further determined
     * by the `y` option.
     * <p>
     * In the case that the legend is aligned in a corner position, the
     * `layout` option will determine whether to place it above/below
     * or on the side of the plot area.
     * <p>
     * When the [layout](#legend.layout) option is `proximate`, the
     * `verticalAlign` option doesn't apply.
     *
     * @since 2.0.0
     */
    private HighchartsVerticalAlignValue verticalAlign;

    /**
     * The width of the legend box. If a number is set, it translates to
     * pixels. Since v7.0.2 it allows setting a percent string of the full
     * chart width, for example `40%`.
     * <p>
     * Defaults to the full chart width from legends below or above the
     * chart, half the chart width for legends to the left and right.
     *
     * @since 2.0.0
     */
    private HighchartsSize width;

    /**
     * The x offset of the legend relative to its horizontal alignment
     * `align` within chart.spacingLeft and chart.spacingRight. Negative
     * x moves it to the left, positive x moves it to the right.
     *
     * @since 2.0.0
     */
    private Integer x;

    /**
     * The vertical offset of the legend relative to it's vertical alignment
     * `verticalAlign` within chart.spacingTop and chart.spacingBottom.
     * Negative y moves it up, positive y moves it down.
     *
     * @since 2.0.0
     */
    private Integer y;

    /*
        Getters and Builder-ControlPointOptionsStyle Setters
    */
    public Accessibility getAccessibility() {
        return this.accessibility = getInstanceOf(Accessibility.class, this.accessibility);
    }

    public Legend setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    public HighchartsAlignValue getAlign() {
        return this.align = getInstanceOf(HighchartsAlignValue.class, this.align);
    }

    public Legend setAlign(HighchartsAlignValue align) {
        this.align = align;
        return this;
    }

    public Boolean getAlignColumns() {
        return this.alignColumns = getInstanceOf(Boolean.class, this.alignColumns);
    }

    public Legend setAlignColumns(Boolean alignColumns) {
        this.alignColumns = alignColumns;
        return this;
    }

    public HighchartsColor getBackgroundColor() {
        return this.backgroundColor = getInstanceOf(HighchartsColor.class, this.backgroundColor);
    }

    public Legend setBackgroundColor(HighchartsColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public HighchartsColor getBorderColor() {
        return this.borderColor = getInstanceOf(HighchartsColor.class, this.borderColor);
    }

    public Legend setBorderColor(HighchartsColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return this.borderRadius = getInstanceOf(Integer.class, this.borderRadius);
    }

    public Legend setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return this.borderWidth = getInstanceOf(Integer.class, this.borderWidth);
    }

    public Legend setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public BubbleLegend getBubbleLegend() {
        return this.bubbleLegend = getInstanceOf(BubbleLegend.class, this.bubbleLegend);
    }

    public Legend setBubbleLegend(BubbleLegend bubbleLegend) {
        this.bubbleLegend = bubbleLegend;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled = getInstanceOf(Boolean.class, this.enabled);
    }

    public Legend setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getFloating() {
        return this.floating = getInstanceOf(Boolean.class, this.floating);
    }

    public Legend setFloating(Boolean floating) {
        this.floating = floating;
        return this;
    }

    public HighchartsCSS getItemCheckboxStyle() {
        return this.itemCheckboxStyle = getInstanceOf(HighchartsCSS.class, this.itemCheckboxStyle);
    }

    public Legend setItemCheckboxStyle(HighchartsCSS itemCheckboxStyle) {
        this.itemCheckboxStyle = itemCheckboxStyle;
        return this;
    }

    public Integer getItemDistance() {
        return this.itemDistance = getInstanceOf(Integer.class, this.itemDistance);
    }

    public Legend setItemDistance(Integer itemDistance) {
        this.itemDistance = itemDistance;
        return this;
    }

    public HighchartsCSS getItemHiddenStyle() {
        return this.itemHiddenStyle = getInstanceOf(HighchartsCSS.class, this.itemHiddenStyle);
    }

    public Legend setItemHiddenStyle(HighchartsCSS itemHiddenStyle) {
        this.itemHiddenStyle = itemHiddenStyle;
        return this;
    }

    public HighchartsCSS getItemHoverStyle() {
        return this.itemHoverStyle = getInstanceOf(HighchartsCSS.class, this.itemHoverStyle);
    }

    public Legend setItemHoverStyle(HighchartsCSS itemHoverStyle) {
        this.itemHoverStyle = itemHoverStyle;
        return this;
    }

    public Integer getItemMarginBottom() {
        return this.itemMarginBottom = getInstanceOf(Integer.class, this.itemMarginBottom);
    }

    public Legend setItemMarginBottom(Integer itemMarginBottom) {
        this.itemMarginBottom = itemMarginBottom;
        return this;
    }

    public Integer getItemMarginTop() {
        return this.itemMarginTop = getInstanceOf(Integer.class, this.itemMarginTop);
    }

    public Legend setItemMarginTop(Integer itemMarginTop) {
        this.itemMarginTop = itemMarginTop;
        return this;
    }

    public HighchartsCSS getItemStyle() {
        return this.itemStyle = getInstanceOf(HighchartsCSS.class, this.itemStyle);
    }

    public Legend setItemStyle(HighchartsCSS itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Integer getItemWidth() {
        return this.itemWidth = getInstanceOf(Integer.class, this.itemWidth);
    }

    public Legend setItemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public String getLabelFormat() {
        return this.labelFormat = getInstanceOf(String.class, this.labelFormat);
    }

    public Legend setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
        return this;
    }

    public HighchartsCallbackFunction getLabelFormatter() {
        return this.labelFormatter = getInstanceOf(HighchartsCallbackFunction.class, this.labelFormatter);
    }

    public Legend setLabelFormatter(HighchartsCallbackFunction labelFormatter) {
        this.labelFormatter = labelFormatter;
        return this;
    }

    public String getLayout() {
        return this.layout = getInstanceOf(String.class, this.layout);
    }

    public Legend setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    public Integer getLineHeight() {
        return this.lineHeight = getInstanceOf(Integer.class, this.lineHeight);
    }

    public Legend setLineHeight(Integer lineHeight) {
        this.lineHeight = lineHeight;
        return this;
    }

    public Integer getMargin() {
        return this.margin = getInstanceOf(Integer.class, this.margin);
    }

    public Legend setMargin(Integer margin) {
        this.margin = margin;
        return this;
    }

    public Integer getMaxHeight() {
        return this.maxHeight = getInstanceOf(Integer.class, this.maxHeight);
    }

    public Legend setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    public LegendNavigation getNavigation() {
        return this.navigation = getInstanceOf(LegendNavigation.class, this.navigation);
    }

    public Legend setNavigation(LegendNavigation navigation) {
        this.navigation = navigation;
        return this;
    }

    public Integer getPadding() {
        return this.padding = getInstanceOf(Integer.class, this.padding);
    }

    public Legend setPadding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public Boolean getReversed() {
        return this.reversed = getInstanceOf(Boolean.class, this.reversed);
    }

    public Legend setReversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public Boolean getRtl() {
        return this.rtl = getInstanceOf(Boolean.class, this.rtl);
    }

    public Legend setRtl(Boolean rtl) {
        this.rtl = rtl;
        return this;
    }

    public HighchartsShadowOptionsObject getShadow() {
        return this.shadow = getInstanceOf(HighchartsShadowOptionsObject.class, this.shadow);
    }

    public Legend setShadow(HighchartsShadowOptionsObject shadow) {
        this.shadow = shadow;
        return this;
    }

    public Boolean getSquareSymbol() {
        return this.squareSymbol = getInstanceOf(Boolean.class, this.squareSymbol);
    }

    public Legend setSquareSymbol(Boolean squareSymbol) {
        this.squareSymbol = squareSymbol;
        return this;
    }

    public HighchartsCSS getStyle() {
        return this.style = getInstanceOf(HighchartsCSS.class, this.style);
    }

    public Legend setStyle(HighchartsCSS style) {
        this.style = style;
        return this;
    }

    public Integer getSymbolHeight() {
        return this.symbolHeight = getInstanceOf(Integer.class, this.symbolHeight);
    }

    public Legend setSymbolHeight(Integer symbolHeight) {
        this.symbolHeight = symbolHeight;
        return this;
    }

    public Integer getSymbolPadding() {
        return this.symbolPadding = getInstanceOf(Integer.class, this.symbolPadding);
    }

    public Legend setSymbolPadding(Integer symbolPadding) {
        this.symbolPadding = symbolPadding;
        return this;
    }

    public Integer getSymbolRadius() {
        return this.symbolRadius = getInstanceOf(Integer.class, this.symbolRadius);
    }

    public Legend setSymbolRadius(Integer symbolRadius) {
        this.symbolRadius = symbolRadius;
        return this;
    }

    public Integer getSymbolWidth() {
        return this.symbolWidth = getInstanceOf(Integer.class, this.symbolWidth);
    }

    public Legend setSymbolWidth(Integer symbolWidth) {
        this.symbolWidth = symbolWidth;
        return this;
    }

    public Title getTitle() {
        return this.title = getInstanceOf(Title.class, this.title);
    }

    public Legend setTitle(Title title) {
        this.title = title;
        return this;
    }

    public Boolean getUseHTML() {
        return this.useHTML = getInstanceOf(Boolean.class, this.useHTML);
    }

    public Legend setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public HighchartsVerticalAlignValue getVerticalAlign() {
        return this.verticalAlign = getInstanceOf(HighchartsVerticalAlignValue.class, this.verticalAlign);
    }

    public Legend setVerticalAlign(HighchartsVerticalAlignValue verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public HighchartsSize getWidth() {
        return this.width = getInstanceOf(HighchartsSize.class, this.width);
    }

    public Legend setWidth(HighchartsSize width) {
        this.width = width;
        return this;
    }

    public Integer getX() {
        return this.x = getInstanceOf(Integer.class, this.x);
    }

    public Legend setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return this.y = getInstanceOf(Integer.class, this.y);
    }

    public Legend setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.accessibility);
        hash = 17 * hash + Objects.hashCode(this.align);
        hash = 17 * hash + Objects.hashCode(this.alignColumns);
        hash = 17 * hash + Objects.hashCode(this.backgroundColor);
        hash = 17 * hash + Objects.hashCode(this.borderColor);
        hash = 17 * hash + Objects.hashCode(this.borderRadius);
        hash = 17 * hash + Objects.hashCode(this.borderWidth);
        hash = 17 * hash + Objects.hashCode(this.bubbleLegend);
        hash = 17 * hash + Objects.hashCode(this.enabled);
        hash = 17 * hash + Objects.hashCode(this.floating);
        hash = 17 * hash + Objects.hashCode(this.itemCheckboxStyle);
        hash = 17 * hash + Objects.hashCode(this.itemDistance);
        hash = 17 * hash + Objects.hashCode(this.itemHiddenStyle);
        hash = 17 * hash + Objects.hashCode(this.itemHoverStyle);
        hash = 17 * hash + Objects.hashCode(this.itemMarginBottom);
        hash = 17 * hash + Objects.hashCode(this.itemMarginTop);
        hash = 17 * hash + Objects.hashCode(this.itemStyle);
        hash = 17 * hash + Objects.hashCode(this.itemWidth);
        hash = 17 * hash + Objects.hashCode(this.labelFormat);
        hash = 17 * hash + Objects.hashCode(this.labelFormatter);
        hash = 17 * hash + Objects.hashCode(this.layout);
        hash = 17 * hash + Objects.hashCode(this.lineHeight);
        hash = 17 * hash + Objects.hashCode(this.margin);
        hash = 17 * hash + Objects.hashCode(this.maxHeight);
        hash = 17 * hash + Objects.hashCode(this.navigation);
        hash = 17 * hash + Objects.hashCode(this.padding);
        hash = 17 * hash + Objects.hashCode(this.reversed);
        hash = 17 * hash + Objects.hashCode(this.rtl);
        hash = 17 * hash + Objects.hashCode(this.shadow);
        hash = 17 * hash + Objects.hashCode(this.squareSymbol);
        hash = 17 * hash + Objects.hashCode(this.style);
        hash = 17 * hash + Objects.hashCode(this.symbolHeight);
        hash = 17 * hash + Objects.hashCode(this.symbolPadding);
        hash = 17 * hash + Objects.hashCode(this.symbolRadius);
        hash = 17 * hash + Objects.hashCode(this.symbolWidth);
        hash = 17 * hash + Objects.hashCode(this.title);
        hash = 17 * hash + Objects.hashCode(this.useHTML);
        hash = 17 * hash + Objects.hashCode(this.verticalAlign);
        hash = 17 * hash + Objects.hashCode(this.width);
        hash = 17 * hash + Objects.hashCode(this.x);
        hash = 17 * hash + Objects.hashCode(this.y);

        return hash;
    }

    @Override
    public String toString() {
        return '{'
                + "accessibility:" + accessibility
                + ", align:" + align
                + ", alignColumns:" + alignColumns
                + ", backgroundColor:" + backgroundColor
                + ", borderColor:" + borderColor
                + ", borderRadius:" + borderRadius
                + ", borderWidth:" + borderWidth
                + ", bubbleLegend:" + bubbleLegend
                + ", enabled:" + enabled
                + ", floating:" + floating
                + ", itemCheckboxStyle:" + itemCheckboxStyle
                + ", itemDistance:" + itemDistance
                + ", itemHiddenStyle:" + itemHiddenStyle
                + ", itemHoverStyle:" + itemHoverStyle
                + ", itemMarginBottom:" + itemMarginBottom
                + ", itemMarginTop:" + itemMarginTop
                + ", itemStyle:" + itemStyle
                + ", itemWidth:" + itemWidth
                + ", labelFormat:" + labelFormat
                + ", labelFormatter:" + labelFormatter
                + ", layout:" + layout
                + ", lineHeight:" + lineHeight
                + ", margin:" + margin
                + ", maxHeight:" + maxHeight
                + ", navigation:" + navigation
                + ", padding:" + padding
                + ", reversed:" + reversed
                + ", rtl:" + rtl
                + ", shadow:" + shadow
                + ", squareSymbol:" + squareSymbol
                + ", style:" + style
                + ", symbolHeight:" + symbolHeight
                + ", symbolPadding:" + symbolPadding
                + ", symbolRadius:" + symbolRadius
                + ", symbolWidth:" + symbolWidth
                + ", title:" + title
                + ", useHTML:" + useHTML
                + ", verticalAlign:" + verticalAlign
                + ", width:" + width
                + ", x:" + x
                + ", y:" + y
                + '}';
    }

    @Override
    public String deflateField(Field field, int tabLevel) {
        String s = DrosteDeflater.super.delegateFieldDeflation(field, "shadow", shadow==null,
                () -> {
                    String shadow = this.shadow.deflateFields(true, "shadow", tabLevel + 1);
                    if (shadow.substring(shadow.indexOf('{') + 1, shadow.indexOf('}')).trim().length() > 0) {
                        return shadow;
                    } else {
                        return DrosteDeflater.getTabString(tabLevel) + "shadow: true,\n";
                    }
                });
        return s!=null && s.equals(RTS)? DrosteDeflater.super.deflateField(field, tabLevel) : s;
    }
}