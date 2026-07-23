import java.util.Arrays;
import java.util.List;

/**
 * 07-modern-java-features: ModernJavaDemo.java
 * ============================================
 * 💡 What are Modern Java Features? (Class 10 Beginner Guide)
 * -----------------------------------------------------------
 * Java has introduced awesome shortcuts:
 * 1. Lambda Expressions `(x -> x * 2)`: Compact function syntax.
 * 2. Stream API `.filter()` & `.map()`: Process lists in a single clean line!
 * 3. Records (`record Student(name, age)`): Clean immutable data carrier.
 */

// Modern Java 14+ Record feature
record Student(String name, int marks) {}

public class ModernJavaDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   Modern Java Features Masterclass      ");
        System.out.println("=========================================");

        // --- 1. Java Records (Zero Boilerplate!) ---
        Student st1 = new Student("Arghya", 95);
        Student st2 = new Student("Rohan", 82);

        System.out.println("Record Student #1  : " + st1.name() + " -> " + st1.marks());
        System.out.println("Record Student #2  : " + st2.name() + " -> " + st2.marks());

        System.out.println("-----------------------------------------");

        // --- 2. Streams & Lambda Expressions ---
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original Numbers   : " + numbers);

        System.out.println("\n--- Filtering Even Numbers & Doubling Them (Streams) ---");
        numbers.stream()
               .filter(num -> num % 2 == 0)   // Lambda expression: filter even numbers
               .map(num -> num * 10)           // Lambda expression: multiply by 10
               .forEach(val -> System.out.print(val + " "));
               
        System.out.println("\n=========================================");
    }
}
