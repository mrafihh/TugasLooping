package LATIHAN.Inheritance;

public class product {
    //Superclass Parent Class
    private int number;
    private int quantity;
    private String name;
    private double price;
    
    public product() {
        number = 0;
        name = "";
        quantity = 0;
        price = 0.00;
    }

    //constructor parameter
    public product(int number, int quantity, String name, double price) {
        this.number = number;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Number : " +number );
        System.out.println("Name : " +name );
        System.out.println("Quantity : " +quantity );
        System.out.println("Price : " +price );
    }
}

