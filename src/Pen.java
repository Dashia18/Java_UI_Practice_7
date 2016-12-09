import java.util.Arrays;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Pen extends Product {
    private int countOfPivotes;
    private PivotForPen[] Pivotes;

    public Pen() {

    }

    public Pen(double weith, int count, int countOfPivotes, double width, String type, String ...colors) {
        super(weith, count);
        this.countOfPivotes = countOfPivotes;
        Pivotes = new PivotForPen[countOfPivotes];
        int i =0;
        for (String color: colors){
            PivotForPen pivot = new PivotForPen(color, width,type);
            Pivotes[i] = pivot;
            i++;
        }
    }


    @Override
    public String toString() {
        return "Pen{" + "weith = "+
                super.getWeith()+", productCount = "+
                super.getCount()+
                ", countOfPivotes=" + countOfPivotes +
                ", Pivotes=" + Arrays.toString(Pivotes) +
                "} ";
    }
}
