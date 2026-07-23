import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * 04-collections-framework: HashSetAndTreeSetDemo.java
 * ====================================================
 * Core Concepts Demonstrated:
 * 1. `Set` interface features: Uniqueness (NO DUPLICATES ALLOWED!).
 * 2. `HashSet`: Unordered, constant time $O(1)$ operations via hashing.
 * 3. `LinkedHashSet`: Maintains insertion order.
 * 4. `TreeSet`: Sorted set (Red-Black Tree implementation), $O(\log N)$ operations.
 */
public class Step03_HashSetAndTreeSetDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     Set Implementations Comparison      ");
        System.out.println("=========================================");

        int[] inputData = {45, 12, 89, 12, 33, 45, 7, 99};

        // --- 1. HashSet (Unordered, O(1)) ---
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : inputData) hashSet.add(num);
        System.out.println("HashSet (Duplicates Removed, Unordered) : " + hashSet);

        // --- 2. LinkedHashSet (Preserves Insertion Order) ---
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        for (int num : inputData) linkedSet.add(num);
        System.out.println("LinkedHashSet (Preserves Insertion)    : " + linkedSet);

        // --- 3. TreeSet (Sorted Natural Order, O(log N)) ---
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : inputData) treeSet.add(num);
        System.out.println("TreeSet (Automatically Sorted)          : " + treeSet);

        // TreeSet Navigable Methods
        System.out.println("\n--- TreeSet Special Navigation Methods ---");
        System.out.println("First (Lowest) Element  : " + treeSet.first());
        System.out.println("Last (Highest) Element  : " + treeSet.last());
        System.out.println("Element higher than 33  : " + treeSet.higher(33));
        System.out.println("Element lower than 45   : " + treeSet.lower(45));

        System.out.println("=========================================");
    }
}
