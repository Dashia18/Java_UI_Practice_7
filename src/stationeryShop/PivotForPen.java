package stationeryShop;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class PivotForPen {
    private String color = "blue";
    private double width = 0.5;
    private String pivotForPenType = "Gel";
    private String type = "PivotForPen";

    public PivotForPen() {

    }

    public PivotForPen(String color, double width, String pivotForPenType) {
        this.color = color;
        this.width = width;
        this.pivotForPenType = pivotForPenType;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public String getType() {
        return pivotForPenType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setType(String pivotForPenType) {
        this.pivotForPenType = pivotForPenType;
    }

    @Override
    public String toString() {
        return type +
                " " + color +
                " " + width +
                " " + pivotForPenType;
    }
}
