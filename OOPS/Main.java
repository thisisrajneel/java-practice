package OOPS;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2023, "Black");
        
        //Car dodge = new Car("Dodge", 11000, 2022, "White");
        Car dodge = new Car(nissan);

        System.out.println("This " + nissan.getColor() +  " colored car is made by " + nissan.getMake() + " in " + nissan.getYear() + " priced at " + nissan.getPrice());
        System.out.println("This " + dodge.getColor() +  " colored car is made by " + dodge.getMake() + " in " + dodge.getYear() + " priced at " + dodge.getPrice());
    }
}
