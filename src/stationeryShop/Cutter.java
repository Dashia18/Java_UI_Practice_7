package stationeryShop;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Cutter extends Product {

    private String colourOfBody = "Yellow";
    private BladeForCutter blade;
    private String type = "Cutter";

    public Cutter(int count, double priceOfOne, String colourOfBody,String material) {
        super(count, priceOfOne);
        this.blade = new BladeForCutter(material);
        this.colourOfBody = colourOfBody;
    }

    @Override
    public String toString() {
        return type + super.toString()+
                " " + colourOfBody +
                " " + blade ;
    }

    public String getColourOfBody() {
        return colourOfBody;
    }

    public BladeForCutter getBlade() {
        return blade;
    }

    public void setColourOfBody(String colourOfBody) {
        this.colourOfBody = colourOfBody;
    }

    public void setBlade(BladeForCutter blade) {
        this.blade = blade;
    }
}
