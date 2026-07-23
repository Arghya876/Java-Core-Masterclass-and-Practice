import java.util.HashMap;

/**
 * 04-collections-framework: HashMapDemo.java
 * ===========================================
 * 💡 What is a HashMap? (Beginner Friendly Guide)
 * -----------------------------------------------
 * Analogy: Phonebook / Student Roll Call 📞
 * A `HashMap` stores data in **Key-Value Pairs** (`Key -> Value`).
 *
 * Example:
 * `"Alice"` -> `98` (Name -> Marks)
 * `"Bob"` -> `85`
 */
public class Step02_HashMapDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       HashMap Key-Value Pairs Demo      ");
        System.out.println("=========================================");

        // Create HashMap (Student Name -> Test Marks)
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // 1. Insert key-value pairs (.put)
        studentMarks.put("Alice", 95);
        studentMarks.put("Bob", 88);
        studentMarks.put("Charlie", 92);

        System.out.println("Student Marks Map  : " + studentMarks);

        // 2. Retrieve value by key (.get)
        System.out.println("Alice's Marks      : " + studentMarks.get("Alice"));

        // 3. Check if key exists (.containsKey)
        if (studentMarks.containsKey("Bob")) {
            System.out.println("Bob is present in the exam record!");
        }

        // 4. Iterate over Key-Value pairs
        System.out.println("\n--- Exam Results ---");
        for (String name : studentMarks.keySet()) {
            System.out.println("Student: " + name + " | Score: " + studentMarks.get(name) + "/100");
        }

        System.out.println("=========================================");
    }
}
