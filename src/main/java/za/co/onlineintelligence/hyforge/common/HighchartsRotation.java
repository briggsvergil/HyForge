package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Sean
 */
public class HighchartsRotation implements Serializable
{

    private int[] rotationValues;
    private boolean enabled;

    public HighchartsRotation()
    {
    }

    public int[] getRotationValues()
    {
        return rotationValues;
    }

    public void setRotationValues(int[] rotationValues)
    {
        this.rotationValues = rotationValues;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    @Override
    public String toString()
    {
        return enabled ? Arrays.toString(rotationValues) : "false";
    }

}
