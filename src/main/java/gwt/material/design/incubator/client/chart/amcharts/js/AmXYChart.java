package gwt.material.design.incubator.client.chart.amcharts.js;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off

/**
 *
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts")
public class AmXYChart {

    @JsProperty
    public String dataDateFormat;

    @JsProperty
    public boolean hideXScrollbar;

    @JsProperty
    public boolean hideYScrollbar;

    @JsProperty
    public int maxValue;

    @JsProperty
    public int maxZoomFactor;

    @JsProperty
    public int minValue;

    @JsMethod
    public native void zoomOut();
}