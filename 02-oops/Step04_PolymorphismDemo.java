/**
 * 02-object-oriented-programming: PolymorphismDemo.java
 * =======================================================
 * 💡 What is Polymorphism? (Beginner Friendly Guide)
 * --------------------------------------------------
 * Poly = Many | Morphism = Forms.
 * Polymorphism allows one method name to perform DIFFERENT actions!
 *
 * Two Types:
 * 1. Compile-Time Polymorphism (Method Overloading): Same method name, different parameters.
 * 2. Runtime Polymorphism (Method Overriding): Child class redefines a parent method using `@Override`.
 */

// Parent Class
class Calculator {
    // 1. Method Overloading: Add 2 numbers
    public int add(int a, int b) {
        return a + b;
    }

    // 1. Method Overloading: Add 3 numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Default message
    public void displaySound() {
        System.out.println("Generic calculator beep sound.");
    }
}

// Child Class
class MusicCalculator extends Calculator {
    // 2. Method Overriding: Changing behavior of parent method displaySound()
    @Override
    public void displaySound() {
        System.out.println("🎵 Playing musical chime tones on calculation!");
    }
}

public class Step04_PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("           Polymorphism Masterclass       ");
        System.out.println("=========================================");

        // Overloading Demo
        Calculator calc = new Calculator();
        System.out.println("Overloaded Add (2 params): 5 + 10      = " + calc.add(5, 10));
        System.out.println("Overloaded Add (3 params): 5 + 10 + 15 = " + calc.add(5, 10, 15));

        System.out.println("-----------------------------------------");

        // Overriding Demo
        Calculator basicCalc = new Calculator();
        Calculator musicalCalc = new MusicCalculator();

        System.out.print("Basic Calculator Sound   : ");
        basicCalc.displaySound();

        System.out.print("Musical Calculator Sound : ");
        musicalCalc.displaySound(); // Dynamic Method Dispatch

        System.out.println("=========================================");
    }
}
