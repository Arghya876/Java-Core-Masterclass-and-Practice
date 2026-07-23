/**
 * 06-multithreading-and-concurrency: SynchronizationAndLocks.java
 * ================================================================
 * Core Concepts Demonstrated:
 * 1. Race Condition: Multiple threads modifying shared mutable state concurrently.
 * 2. Critical Section protection using `synchronized` blocks/methods.
 * 3. Thread Safety & Intrinsic Locks (Monitors).
 */

class SharedCounter {
    private int count = 0;

    // Synchronized method guarantees thread-safe atomicity
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Step02_SynchronizationAndLocks {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=========================================");
        System.out.println("     Thread Synchronization Masterclass  ");
        System.out.println("=========================================");

        SharedCounter counter = new SharedCounter();

        // Thread 1: Increments counter 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        // Thread 2: Increments counter 1000 times
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish execution
        t1.join();
        t2.join();

        System.out.println("Expected Final Count : 2000");
        System.out.println("Actual Final Count   : " + counter.getCount() + " (Thread Safe!)");

        System.out.println("=========================================");
    }
}
