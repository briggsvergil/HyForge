package za.co.onlineintelligence.hyforge.common;

/**
 * Wrapper for JS function string that can be used as a callback on events.
 *
 * This class deliberately does not implement the Exportable interface as the functions should not be serialized as
 * string objects, but injected directly into the JSON.
 * @author Sean
 */
public class HighchartsCallbackFunction implements java.io.Serializable
{

    private String jsCallbackFunction;

    public HighchartsCallbackFunction()
    {
    }

    public HighchartsCallbackFunction(String jsCallbackFunction)
    {
        this.jsCallbackFunction = jsCallbackFunction;
    }

    public String getJsCallbackFunction()
    {
        return jsCallbackFunction;
    }

    public HighchartsCallbackFunction setJsCallbackFunction(String jsCallbackFunction)
    {
        this.jsCallbackFunction = jsCallbackFunction;
        return this;
    }

    @Override
    public String toString()
    {
        return jsCallbackFunction;
    }

}
