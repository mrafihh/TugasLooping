package LATIHAN.Inheritance;

public class cd extends product {
    private String artist;
    private int numSong;
    private String label;
    
    public cd() {
        super();//mengakses constructor superclass
        artist = "";
        numSong = 0;
        label = "";
        }

        //constructor parameter
        public cd(int number, int quantity, String name, double price, String artist, int numSong, String label) {
            super(number, quantity, name, price);
            this.artist = artist;            
            this.numSong = numSong;
            this.label = label;
        }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getNumSong() {
        return numSong;
    }
    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    @Override //membuat method yang sama
    public void print () {
        System.out.println("Artist : "+ artist);
        System.out.println("Total song : "+ numSong);
        System.out.println("Label : "+ label);
        System.out.println("==============================");
        System.out.println("");
    }
}