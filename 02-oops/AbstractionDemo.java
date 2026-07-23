/**
 * 02-object-oriented-programming: AbstractionDemo.java
 * ======================================================
 * 💡 What is Abstraction? (Beginner Friendly Guide)
 * -------------------------------------------------
 * Analogy: TV Remote Control 📺
 * When you press the "POWER" button on a TV remote, you only see the result (TV turns ON).
 * You don't need to know the complex circuit board wiring inside!
 *
 * Abstraction = Showing essential features while hiding internal details.
 * Achieved using:
 * 1. Abstract Class (`abstract` keyword)
 * 2. Interface (`interface` keyword)
 */

// Interface (100% Abstract Blueprint)
interface Playable {
    void play(); // Abstract method (no body)
    void stop();
}

// Abstract Parent Class
abstract class Shape {
    String color;

    // Abstract method: MUST be implemented by child classes
    abstract double calculateArea();

    // Concrete method
    public void displayColor() {
        System.out.println("Shape Color: " + color);
    }
}

// Concrete Child Class implementing Abstract Class
class Circle extends Shape {
    double radius;

    public Circle(String color, double r) {
        this.color = color;
        this.radius = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class implementing Interface
class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("▶️ Video is playing...");
    }

    @Override
    public void stop() {
        System.out.println("⏹️ Video stopped.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("        Abstraction Demo (Shapes & Remote)");
        System.out.println("=========================================");

        // Abstract Class Demo
        Circle myCircle = new Circle("Blue", 5.0);
        myCircle.displayColor();
        System.out.println("Calculated Circle Area: " + String.format("%.2f", myCircle.calculateArea()));

        System.out.println("-----------------------------------------");

        // Interface Demo
        Playable player = new VideoPlayer();
        player.play();
        player.stop();

        System.out.println("=========================================");
    }
}
