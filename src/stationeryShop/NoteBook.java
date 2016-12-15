package stationeryShop;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class NoteBook extends Product {
    private String format = "A5";
    private String coverColour = "Yellow";
    private String typeOfSheets = "line";
    private int countOfSheets = 96;
    private String type = "NoteBook";

    public NoteBook() {
    }

    public NoteBook(int count, double priceOfOne, String format, String coverColor, String typeOfSheets, int countOfSheets) {
        super(count, priceOfOne);
        this.format = format;
        this.coverColour = coverColor;
        this.typeOfSheets = typeOfSheets;
        this.countOfSheets = countOfSheets;
    }

    @Override
    public String toString() {
        return  type +" " +
                super.toString()+
                " " + format +
                " " + coverColour +
                " " + typeOfSheets +
                " " + countOfSheets;
    }

    public String getFormat() {
        return format;
    }

    public String getCoverColor() {
        return coverColour;
    }

    public String getTypeOfSheets() {
        return typeOfSheets;
    }

    public int getCountOfSheets() {
        return countOfSheets;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setCoverColor(String coverColor) {
        this.coverColour = coverColor;
    }

    public void setTypeOfSheets(String typeOfSheets) {
        this.typeOfSheets = typeOfSheets;
    }

    public void setCountOfSheets(int countOfSheets) {
        this.countOfSheets = countOfSheets;
    }
}

