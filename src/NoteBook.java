/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class NoteBook extends Product {
    private String format = "A5";
    private String coverColor = "Yellow";
    private String typeOfSheets = "line";
    private int countOfSheets = 96;

    public NoteBook() {
    }

    public NoteBook(int count, double priceOfOne, String format, String coverColor, String typeOfSheets, int countOfSheets) {
        super(count, priceOfOne);
        this.format = format;
        this.coverColor = coverColor;
        this.typeOfSheets = typeOfSheets;
        this.countOfSheets = countOfSheets;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                super.toString()+
                " format='" + format + '\'' +
                ", coverColor='" + coverColor + '\'' +
                ", typeOfSheets='" + typeOfSheets + '\'' +
                ", countOfSheets=" + countOfSheets +
                "} ";
    }

    public String getFormat() {
        return format;
    }

    public String getCoverColor() {
        return coverColor;
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
        this.coverColor = coverColor;
    }

    public void setTypeOfSheets(String typeOfSheets) {
        this.typeOfSheets = typeOfSheets;
    }

    public void setCountOfSheets(int countOfSheets) {
        this.countOfSheets = countOfSheets;
    }
}

