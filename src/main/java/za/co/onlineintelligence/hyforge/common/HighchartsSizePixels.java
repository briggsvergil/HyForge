package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;

/**
 *
 * @author Sean
 */
public class HighchartsSizePixels implements Serializable, HighchartsSize
{

    private int pixels;

    public HighchartsSizePixels()
    {
    }

    public HighchartsSizePixels(int pixels)
    {
        this.pixels = pixels;
    }

    public int getPixels()
    {
        return pixels;
    }

    public void setPixels(int pixels)
    {
        this.pixels = pixels;
    }

    @Override
    public String toString()
    {
        return pixels + "";
    }

}
