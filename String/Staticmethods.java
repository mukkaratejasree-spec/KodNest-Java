package String;

// Car class with static and instance methods
class Car {
    // Static method
    static void convertKmIntoMiles(int km) {
        System.out.println("Converting " + km + " KM into Miles...");
    }

    // Instance method
    void calculateMileage() {
        System.out.println("Calculating Mileage...");
    }
}

public class Staticmethods {
    public static void main(String[] args) {
        // Calling static method using class name
        Car.convertKmIntoMiles(12);

        // Creating an instance of Car and calling instance method
        Car c = new Car();
        c.calculateMileage();
    }
}
