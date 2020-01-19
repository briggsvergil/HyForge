package za.co.onlineintelligence.hyforge.common;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Sean
 */
public class HighchartsColorGradient implements Serializable, HighchartsColor, Exportable {

    public HighchartsColorGradient() {
    }

    private LinearGradientColor linearGradient;
    private Stop[] stops;

    private static class LinearGradientColor {

        private int x1, x2, y1, y2;

        public LinearGradientColor() {
        }

        public LinearGradientColor(int x1, int x2, int y1, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

        public int getX1() {
            return x1;
        }

        public void setX1(int x1) {
            this.x1 = x1;
        }

        public int getX2() {
            return x2;
        }

        public void setX2(int x2) {
            this.x2 = x2;
        }

        public int getY1() {
            return y1;
        }

        public void setY1(int y1) {
            this.y1 = y1;
        }

        public int getY2() {
            return y2;
        }

        public void setY2(int y2) {
            this.y2 = y2;
        }

        @Override
        public String toString() {
            return "{" + "x1:" + x1 + ", x2:" + x2 + ", y1:" + y1 + ", y2:" + y2 + '}';
        }

    }

    private static class Stop {

        private double number;
        private String colorString;

        public Stop() {
        }

        public double getNumber() {
            return number;
        }

        public void setNumber(double number) {
            this.number = number;
        }

        public String getColorString() {
            return colorString;
        }

        public void setColorString(String colorString) {
            this.colorString = colorString;
        }

        @Override
        public String toString() {
            return "[" + number + ", '" + colorString + "']";
        }

    }

    public LinearGradientColor getLinearGradient() {
        return linearGradient;
    }

    public void setLinearGradient(LinearGradientColor linearGradient) {
        this.linearGradient = linearGradient;
    }

    public Stop[] getStops() {
        return stops;
    }

    public void setStops(Stop[] stops) {
        this.stops = stops;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.linearGradient);
        hash = 97 * hash + Objects.hashCode(this.stops);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HighchartsColorGradient other = (HighchartsColorGradient) obj;
        if (!Objects.equals(this.linearGradient, other.linearGradient)) {
            return false;
        }
        return Objects.equals(this.stops, other.stops);
    }

    @Override
    public String toString() {
        return "{" + "linearGradient:" + linearGradient + ", stops:" + stops + '}';
    }

}
