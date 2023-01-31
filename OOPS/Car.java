package OOPS;
import java.util.*;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;        
        this.price = price;        
        this.year = year;        
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length); // not referencing the same object
    }
    
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length); // not referencing the same object
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length); // not referencing the same object
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length); // not referencing the same object
    }

    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + "!");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    @Override
    public String toString() {
        String s = "";
        s = s +  "Make : " + this.make + "\n";
        s = s +  "Price : " + this.price + "\n";
        s = s +  "Year : " + this.year + "\n";
        s = s +  "Color : " + this.color + "\n";
        s = s +  "Parts : ";
        for (int i = 0; i < this.parts.length; i++) {
            s = s + this.parts[i] + " "; 
        }
        s+="\n";
        return s;
    }
}
