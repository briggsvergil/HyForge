package za.co.onlineintelligence.hyforge.common;

import java.util.Objects;

/**
 *
 * @author Sean
 */
public class HighchartsColorPattern implements java.io.Serializable, HighchartsColor
{

    private Path path;
    private int width;
    private int height;
    private String color;
    private double opacity;

    private static class Path
    {

        private String d;
        private String fill;

        public Path()
        {
        }

        public String getD()
        {
            return d;
        }

        public void setD(String d)
        {
            this.d = d;
        }

        public String getFill()
        {
            return fill;
        }

        public void setFill(String fill)
        {
            this.fill = fill;
        }

        @Override
        public String toString()
        {
            return "{" + "d:'" + d + "', fill:'" + fill + "'}";
        }

    }

    public Path getPath()
    {
        return path;
    }

    public void setPath(Path path)
    {
        this.path = path;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getOpacity()
    {
        return opacity;
    }

    public void setOpacity(double opacity)
    {
        this.opacity = opacity;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.path);
        hash = 47 * hash + this.width;
        hash = 47 * hash + this.height;
        hash = 47 * hash + Objects.hashCode(this.color);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.opacity) ^ (Double.doubleToLongBits(this.opacity) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final HighchartsColorPattern other = (HighchartsColorPattern) obj;
        if (this.width != other.width)
        {
            return false;
        }
        if (this.height != other.height)
        {
            return false;
        }
        if (Double.doubleToLongBits(this.opacity) != Double.doubleToLongBits(other.opacity))
        {
            return false;
        }
        if (!Objects.equals(this.color, other.color))
        {
            return false;
        }
        return Objects.equals(this.path, other.path);
    }

    @Override
    public String toString()
    {
        return "{" + "path:" + path + ", width:" + width + ", height:" + height + ", color:'" + color + "', opacity:" + opacity + '}';
    }

}
