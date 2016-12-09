/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class PivotForPen {
    private String color = "blue";
    private double width = 0.5;
    private String type = "Gel";

    public PivotForPen() {

    }

    public PivotForPen(String color, double width, String type) {
        this.color = color;
        this.width = width;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PivotForPen{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", type='" + type + '\'' +
                '}';
    }
}
