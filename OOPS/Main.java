package OOPS;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2023, "Black");
        
        //Car dodge = new Car("Dodge", 11000, 2022, "White");
        Car dodge = new Car(nissan);

        System.out.println("This " + nissan.color +  " colored car is made by " + nissan.make + " in " + nissan.year + " priced at " + nissan.price);
        System.out.println("This " + dodge.color +  " colored car is made by " + dodge.make + " in " + dodge.year + " priced at " + dodge.price);
    }
}
