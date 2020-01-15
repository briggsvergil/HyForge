package za.co.onlineintelligence.hyforge.common;

/**
 *
 * @author Sean
 */
public class HighchartsSizePercentage implements java.io.Serializable, HighchartsSize
{

    private String percentage;

    public HighchartsSizePercentage()
    {
    }

    public HighchartsSizePercentage(String percentage)
    {
        this.percentage = percentage;
    }

    public String getPercentage()
    {
        return percentage;
    }

    public void setPercentage(String percentage)
    {
        this.percentage = percentage;
    }

    @Override
    public String toString()
    {
        return percentage + "'%'";
    }

}
