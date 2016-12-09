/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Product {

    private int count;
    private double priceOfOne;

    public Product() {
    }

    public Product( int count, double priceOfOne) {
        this.count = count;
        this.priceOfOne = priceOfOne;
    }

    @Override
    public String toString() {
        return "Product{" +
                "count=" + count +
                ", priceOfOne=" + priceOfOne +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getpriceOfOne() {
        return priceOfOne;
    }

    public void setpriceOfOne(double priceOfOne) {
        this.priceOfOne = priceOfOne;
    }
}

