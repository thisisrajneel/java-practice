package OOPS;

public class Dealership {
    private Car[] cars;


    public Dealership(Car[] cars) {
        // this creates shallow copies. the new copy array has references to the same car objects
        // this.cars = Arrays.copyOf(cars, cars.length);

        // DEEP COPIES
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.cars.length; i++) {
            s = s + this.cars[i].toString();
        }
        return s;
    }

}
