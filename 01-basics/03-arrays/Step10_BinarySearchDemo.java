/**
 * 01-java-basics/step-07-arrays-and-data-structures: BinarySearchDemo.java
 * =========================================================================
 * Core Concepts Demonstrated:
 * 1. Linear Search ($O(N)$) vs Binary Search ($O(\log N)$).
 * 2. Binary Search Requirement: Array MUST be sorted!
 * 3. Divide & Conquer strategy using `low`, `high`, and `mid`.
 * 4. Iterative and Recursive implementations.
 */
public class Step10_BinarySearchDemo {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     Binary Search Algorithm Masterclass ");
        System.out.println("=========================================");

        // Sorted Array
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        System.out.print("Sorted Array: ");
        for (int val : sortedArray) System.out.print(val + " ");
        System.out.println("\nTarget to Search: " + target);

        // --- Iterative Binary Search ---
        int iterativeResult = binarySearchIterative(sortedArray, target);
        if (iterativeResult != -1) {
            System.out.println("✅ [Iterative] Target found at Index: " + iterativeResult);
        } else {
            System.out.println("❌ Target not found in array.");
        }

        // --- Recursive Binary Search ---
        int recursiveResult = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        if (recursiveResult != -1) {
            System.out.println("✅ [Recursive] Target found at Index: " + recursiveResult);
        } else {
            System.out.println("❌ Target not found in array.");
        }

        System.out.println("=========================================");
    }

    // Iterative Binary Search (O(log N) Time, O(1) Space)
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential integer overflow!

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Not found
    }

    // Recursive Binary Search (O(log N) Time, O(log N) Stack Space)
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high);
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1);
        }
    }
}
