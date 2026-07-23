/**
 * 01-fundamentals: HelloWorldAndJVM.java
 * =====================================
 * Core Concepts Demonstrated:
 * 1. Java application entry point (`public static void main`).
 * 2. Structure of a Java Class.
 * 3. Printing output using `System.out.println()` and `System.out.print()`.
 * 4. Understanding how JVM loads and executes bytecode (.class file).
 */
public class Step01_HelloWorldAndJVM {
    
    public static void main(String[] args) {
        // Output to standard console output stream
        System.out.println("=========================================");
        System.out.println("   Welcome to Java Core Basics Roadmap!   ");
        System.out.println("=========================================");
        
        System.out.println("Hello, World! Java is running on JVM.");
        
        // Demonstrating formatted and unformatted output
        System.out.print("Java Version in use: ");
        System.out.println(System.getProperty("java.version"));
        
        System.out.print("Operating System: ");
        System.out.println(System.getProperty("os.name"));
        
        // Command-line arguments inspection
        System.out.println("\n--- Command Line Arguments ---");
        if (args.length == 0) {
            System.out.println("No command-line arguments passed.");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Arg [" + i + "]: " + args[i]);
            }
        }
        System.out.println("=========================================");
    }
}
