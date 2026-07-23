import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 05-java-io-and-file-handling: FileReadWriteDemo.java
 * ====================================================
 * 💡 File Handling Made Easy (Beginner Friendly Guide)
 * ---------------------------------------------------
 * Analogy: School Notebook 📓
 * - Writing to File: Writing notes with a pen (`FileWriter`).
 * - Reading from File: Reading text from the notebook page (`Scanner`).
 */
public class Step01_FileReadWriteDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     Java File Read & Write Masterclass  ");
        System.out.println("=========================================");

        String fileName = "my_notes.txt";

        // Step 1: Create and Write to File
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello from Java File Handling!\n");
            writer.write("Java is awesome and easy to learn.\n");
            writer.close(); // Save and close file
            System.out.println("✅ Successfully wrote data to " + fileName);
        } catch (IOException e) {
            System.out.println("❌ An error occurred while writing to file.");
        }

        System.out.println("-----------------------------------------");

        // Step 2: Read Content from File
        try {
            File myFile = new File(fileName);
            Scanner reader = new Scanner(myFile);
            System.out.println("📖 Reading Content from " + fileName + ":\n");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println("  [LINE]: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("❌ File not found!");
        }

        System.out.println("=========================================");
    }
}
