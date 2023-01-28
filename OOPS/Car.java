package OOPS;

public class Car {
    String make;
    double price;
    int year;
    String color;

    public Car(String make, double price, int year, String color) {
        this.make = make;        
        this.price = price;        
        this.year = year;        
        this.color = color;
    }

    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
    }
}
