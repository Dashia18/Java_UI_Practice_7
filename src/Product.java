/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Product {
    private double weith;
    private int count;

    public Product() {
    }

    public Product(double weith, int count) {
        this.weith = weith;
        this.count = count;
    }

    public double getWeith() {
        return weith;
    }

    public int getCount() {
        return count;
    }

    public void setWeith(double weith) {
        this.weith = weith;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

