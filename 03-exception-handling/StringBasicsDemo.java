/**
 * 03-strings-and-exception-handling: StringBasicsDemo.java
 * ==========================================================
 * 💡 Mastering Java Strings (Beginner Friendly Guide)
 * ----------------------------------------------------
 * A `String` is a sequence of text characters inside double quotes `"Hello"`.
 *
 * Essential Methods:
 * - `.length()` -> Returns number of characters
 * - `.toUpperCase()` / `.toLowerCase()` -> Changes case
 * - `.charAt(index)` -> Gets character at specific index
 * - `.substring(start, end)` -> Extracts part of the string
 * - `.equals(other)` -> Compares text content
 */
public class StringBasicsDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("      Java String Operations Guide       ");
        System.out.println("=========================================");

        String greeting = "Hello, Java Programmers!";

        // 1. Length
        System.out.println("Original Text     : " + greeting);
        System.out.println("Total Length      : " + greeting.length() + " characters");

        // 2. Uppercase & Lowercase
        System.out.println("Uppercase         : " + greeting.toUpperCase());
        System.out.println("Lowercase         : " + greeting.toLowerCase());

        // 3. Character at position (0-indexed)
        System.out.println("Character at index 0: " + greeting.charAt(0));
        System.out.println("Character at index 7: " + greeting.charAt(7));

        // 4. Substring (Extract portion)
        String sub = greeting.substring(7, 11); // Extract "Java"
        System.out.println("Extracted Substring (7 to 11): " + sub);

        // 5. String Comparison (.equals vs ==)
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println("str1 == str2      : " + (str1 == str2) + " (Compares memory addresses)");
        System.out.println("str1.equals(str2) : " + str1.equals(str2) + " (Compares text content)");

        System.out.println("=========================================");
    }
}
