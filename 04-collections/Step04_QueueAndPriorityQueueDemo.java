import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 04-collections-framework: QueueAndPriorityQueueDemo.java
 * =========================================================
 * Core Concepts Demonstrated:
 * 1. Queue interface: First-In-First-Out (FIFO) ordering.
 * 2. `LinkedList` and `ArrayDeque` as Queues.
 * 3. `PriorityQueue`: Elements ordered by priority (Min-Heap by default, Max-Heap using Comparator).
 */
public class Step04_QueueAndPriorityQueueDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     Queue & Priority Queue Masterclass  ");
        System.out.println("=========================================");

        // --- 1. FIFO Queue (LinkedList implementation) ---
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.offer("Customer 1 (Alice)");
        customerQueue.offer("Customer 2 (Bob)");
        customerQueue.offer("Customer 3 (Charlie)");

        System.out.println("Initial FIFO Queue         : " + customerQueue);
        System.out.println("Serving Front Customer     : " + customerQueue.poll()); // Removes Alice
        System.out.println("Queue After Serving        : " + customerQueue);

        // --- 2. ArrayDeque Queue Implementation ---
        System.out.println("\n--- ArrayDeque Queue Demo ---");
        Queue<String> dequeQueue = new ArrayDeque<>();
        dequeQueue.offer("Task A");
        dequeQueue.offer("Task B");
        System.out.println("ArrayDeque Queue           : " + dequeQueue);
        System.out.println("Polling Task               : " + dequeQueue.poll());

        // --- 3. PriorityQueue (Min-Heap: Smallest Number Has Highest Priority) ---
        System.out.println("\n--- Min-Heap PriorityQueue ---");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(40);
        minHeap.offer(10);
        minHeap.offer(30);
        minHeap.offer(5);

        System.out.print("Polling Min-Heap (Ascending Priority): ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        // --- 4. PriorityQueue (Max-Heap: Largest Number Has Highest Priority) ---
        System.out.println("\n\n--- Max-Heap PriorityQueue ---");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(40);
        maxHeap.offer(10);
        maxHeap.offer(30);
        maxHeap.offer(5);

        System.out.print("Polling Max-Heap (Descending Priority): ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        System.out.println("\n=========================================");
    }
}
