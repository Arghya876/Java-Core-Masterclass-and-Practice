/**
 * 02-object-oriented-programming: ClassAndObjectDemo.java
 * ========================================================
 * 💡 What is a Class & Object? (Beginner Friendly Guide)
 * ------------------------------------------------------
 * - Class: A BLUEPRINT or design (like a blueprint sketch of a house or car).
 * - Object: The REAL THING built from that blueprint (like a real red sports car parked outside).
 */

// Step 1: Define the Blueprint (Class)
class Car {
    // Attributes / Fields (What the car HAS)
    String color;
    String brand;
    int speed;

    // Behavior / Method (What the car CAN DO)
    void drive() {
        System.out.println("Vroom! The " + color + " " + brand + " is driving at " + speed + " km/h.");
    }

    void applyBrake() {
        speed = 0;
        System.out.println("Screeech! The " + brand + " has stopped. Current speed: " + speed + " km/h.");
    }
}

public class Step01_ClassAndObjectDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("      Class & Object Beginner Demo       ");
        System.out.println("=========================================");

        // Step 2: Create Object #1 from the Car Blueprint
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.color = "Red";
        car1.speed = 120;

        // Call methods on Object #1
        car1.drive();
        car1.applyBrake();

        System.out.println("-----------------------------------------");

        // Step 3: Create Object #2 from the same Car Blueprint
        Car car2 = new Car();
        car2.brand = "BMW";
        car2.color = "Black";
        car2.speed = 150;

        // Call methods on Object #2
        car2.drive();

        System.out.println("=========================================");
    }
}
