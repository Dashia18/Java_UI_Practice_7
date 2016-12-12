package stationeryShop;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class BladeForCutter {
    private String material="steel";
    private String type = "BladeForCutter";

    public BladeForCutter() {
    }

    public BladeForCutter(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return '\''+type +'\''+
                " '" + material + '\'';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
