/**
 * 01-fundamentals: DataTypesAndCasting.java
 * =========================================
 * Core Concepts Demonstrated:
 * 1. 8 Primitive Data Types in Java (byte, short, int, long, float, double, char, boolean).
 * 2. Size and Range of Data Types.
 * 3. Implicit Type Casting (Widening Conversion).
 * 4. Explicit Type Casting (Narrowing Conversion) and Overflow/Underflow.
 */
public class Step04_DataTypesAndCasting {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       Java Data Types & Type Casting    ");
        System.out.println("=========================================");

        // --- 1. Primitive Data Types ---
        byte byteVal = 127;                  // 8-bit signed integer (-128 to 127)
        short shortVal = 32000;              // 16-bit signed integer
        int intVal = 2147483647;             // 32-bit signed integer
        long longVal = 9223372036854775807L; // 64-bit signed integer (L suffix required)
        
        float floatVal = 3.14159f;           // 32-bit IEEE 754 floating point (f suffix required)
        double doubleVal = 2.718281828459045;// 64-bit IEEE 754 floating point
        
        char charVal = 'J';                  // 16-bit Unicode character ('A', '\u0041')
        boolean boolVal = true;              // true or false

        System.out.println("\n--- Primitive Values ---");
        System.out.println("Byte Value   : " + byteVal + " [Size: " + Byte.BYTES + " byte]");
        System.out.println("Short Value  : " + shortVal + " [Size: " + Short.BYTES + " bytes]");
        System.out.println("Int Value    : " + intVal + " [Size: " + Integer.BYTES + " bytes]");
        System.out.println("Long Value   : " + longVal + " [Size: " + Long.BYTES + " bytes]");
        System.out.println("Float Value  : " + floatVal + " [Size: " + Float.BYTES + " bytes]");
        System.out.println("Double Value : " + doubleVal + " [Size: " + Double.BYTES + " bytes]");
        System.out.println("Char Value   : " + charVal + " (ASCII code: " + (int) charVal + ")");
        System.out.println("Boolean Value: " + boolVal);

        // --- 2. Widening Type Casting (Implicit) ---
        // byte -> short -> char -> int -> long -> float -> double
        System.out.println("\n--- Implicit (Widening) Type Casting ---");
        int myInt = 100;
        long myLong = myInt;       // Automatic int to long
        double myDouble = myLong;  // Automatic long to double

        System.out.println("Original int value    : " + myInt);
        System.out.println("Widened long value    : " + myLong);
        System.out.println("Widened double value  : " + myDouble);

        // --- 3. Narrowing Type Casting (Explicit) ---
        // double -> float -> long -> int -> char -> short -> byte
        System.out.println("\n--- Explicit (Narrowing) Type Casting ---");
        double piDouble = 3.14159265359;
        int piInt = (int) piDouble; // Manual truncation of decimal portion

        System.out.println("Original double value : " + piDouble);
        System.out.println("Narrowed int value    : " + piInt);

        // Overflow Demonstration
        int overflowVal = 130;
        byte narrowedByte = (byte) overflowVal; // 130 wraps around in byte (-128 to 127)
        System.out.println("int 130 cast to byte  : " + narrowedByte + " (Overflow Wrap-around!)");
        System.out.println("=========================================");
    }
}
