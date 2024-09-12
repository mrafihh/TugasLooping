package LATIHAN.Inheritance;

public class dvd extends product {
    private int lenght;
    private String rating;
    private String studio;
    
    public dvd() {
        super(); //mengakses constructor superclass
        lenght = 0;
        rating = "";
        studio = "";
    }

    //Constructor parameter
    public dvd(int number, int quantity, String name, double price, int lenght, String rating, String studio) {
        super(number, quantity, name, price);
        this.lenght = lenght;
        this.rating = rating;
        this.studio = studio;
    }

    public int getLenght() {
        return lenght;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void print() {
        System.out.println("Length : " + lenght);
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
        System.out.println("==============================");
        System.out.println("");
    }

}
