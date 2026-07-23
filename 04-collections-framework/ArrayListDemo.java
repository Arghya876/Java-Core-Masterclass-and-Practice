import java.util.ArrayList;

/**
 * 04-collections-framework: ArrayListDemo.java
 * =============================================
 * 💡 What is an ArrayList? (Class 10 Beginner Explanation)
 * ---------------------------------------------------------
 * Analogy: Dynamic Grocery Shopping List 🛒
 * Regular arrays have a fixed size (`int[] arr = new int[5]`).
 * An `ArrayList` grows and shrinks automatically as you add or remove items!
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     ArrayList Dynamic List Masterclass  ");
        System.out.println("=========================================");

        // 1. Create an ArrayList of Strings
        ArrayList<String> shoppingList = new ArrayList<>();

        // 2. Add elements (.add)
        shoppingList.add("Apples");
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");

        System.out.println("Shopping List      : " + shoppingList);
        System.out.println("Total Items Count  : " + shoppingList.size());

        // 3. Access elements (.get)
        System.out.println("First Item (Index 0): " + shoppingList.get(0));

        // 4. Update elements (.set)
        shoppingList.set(1, "Almond Milk"); // Replaces "Milk"
        System.out.println("Updated List       : " + shoppingList);

        // 5. Remove elements (.remove)
        shoppingList.remove("Bread");
        System.out.println("After Removing Bread: " + shoppingList);

        // 6. Iterate through List using For-Each loop
        System.out.println("\n--- Items to Buy ---");
        for (String item : shoppingList) {
            System.out.println("🛒 Buy: " + item);
        }

        System.out.println("=========================================");
    }
}
