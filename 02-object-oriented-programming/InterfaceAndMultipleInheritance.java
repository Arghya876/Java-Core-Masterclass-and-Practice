/**
 * 02-object-oriented-programming: InterfaceAndMultipleInheritance.java
 * ======================================================================
 * Core Concepts Demonstrated:
 * 1. Multiple Interface Implementation (Achieving Multiple Inheritance in Java).
 * 2. Java 8+ Default Methods in Interfaces (`default void log()`).
 * 3. Static Methods in Interfaces (`static void info()`).
 * 4. Resolving Diamond Problem when two interfaces have identical default methods.
 */

interface Printable {
    void print();

    // Java 8+ Default Method
    default void showStatus() {
        System.out.println("Status: Printing document...");
    }
}

interface Scannable {
    void scan();

    // Java 8+ Default Method with potential collision
    default void showStatus() {
        System.out.println("Status: Scanning document...");
    }

    // Java 8+ Static Method
    static void displayResolution() {
        System.out.println("Scanner Resolution: 600 DPI");
    }
}

// Multi-Function Printer implementing both Printable and Scannable
class AllInOnePrinter implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("🖨️ Printing high-resolution physical page...");
    }

    @Override
    public void scan() {
        System.out.println("📄 Scanning physical document to PDF...");
    }

    // Resolving Diamond Problem by overriding colliding default method
    @Override
    public void showStatus() {
        System.out.println("Status: All-In-One Printer is Ready!");
        // Optionally call specific interface default method:
        Printable.super.showStatus();
    }
}

public class InterfaceAndMultipleInheritance {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("    Interface & Multiple Inheritance     ");
        System.out.println("=========================================");

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();
        printer.showStatus();

        // Calling interface static method
        Scannable.displayResolution();

        System.out.println("=========================================");
    }
}
