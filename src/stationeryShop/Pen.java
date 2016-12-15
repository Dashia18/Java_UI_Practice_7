package stationeryShop;

import java.util.Arrays;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Pen extends Product {
    private int countOfPivotes;
    private String type = "Pen";
    private PivotForPen[] Pivotes;

    public Pen() {

    }

    public Pen(int count, double priceOfOne, int countOfPivotes, double width, String type, String ...colors) {
        super(count, priceOfOne);
        this.countOfPivotes = countOfPivotes;
        this.Pivotes = new PivotForPen[countOfPivotes];
        int i =0;
        for (String color: colors){
            PivotForPen pivot = new PivotForPen(color, width,type);
            this.Pivotes[i] = pivot;
            i++;
        }
    }


    @Override
    public String toString() {
        return type + super.toString()+
                " " + countOfPivotes +
                " " + Arrays.toString(Pivotes);
    }

}
