import java.util.Scanner;

/**
 * 01-fundamentals: ScannerAndInput.java
 * =====================================
 * Core Concepts Demonstrated:
 * 1. Reading user input from console using `java.util.Scanner`.
 * 2. Parsing primitives (int, double, boolean) and Strings.
 * 3. Handling `nextLine()` buffer consuming issue.
 * 4. Closing resource streams cleanly.
 */
public class Step06_ScannerAndInput {

    public static void main(String[] args) {
        // Create Scanner object reading from System.in
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("      Interactive User Input Handler     ");
        System.out.println("=========================================");

        // Reading String token vs line
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // Reading integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Reading double
        System.out.print("Enter your GPA / Percentage: ");
        double gpa = scanner.nextDouble();

        // Clear newline leftover buffer before reading next string line
        scanner.nextLine();

        // Reading multi-word description
        System.out.print("Enter your favorite programming language: ");
        String favLang = scanner.nextLine();

        // Output summary
        System.out.println("\n--- User Profile Summary ---");
        System.out.println("Name               : " + name);
        System.out.println("Age                : " + age + " years old");
        System.out.println("GPA/Percentage     : " + gpa);
        System.out.println("Favorite Language  : " + favLang);

        System.out.println("=========================================");
        
        // Clean resource shutdown
        scanner.close();
    }
}
