/**
 * 06-multithreading-and-concurrency: ThreadBasicsDemo.java
 * ========================================================
 * 💡 What is Multithreading? (Beginner Friendly Guide)
 * -----------------------------------------------------
 * Analogy: Multitasking in Real Life 🎧📝
 * Imagine listening to music on your phone while writing your homework!
 * Two tasks happening concurrently at the exact same time.
 *
 * In Java, a **Thread** is a mini-program running inside your main application.
 */

// Worker Task 1: Implements Runnable
class MusicTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("🎵 Playing Song Track #" + i + "...");
            try { Thread.sleep(1000); } catch (Exception e) {} // Pause 1 second
        }
    }
}

// Worker Task 2: Implements Runnable
class DownloadTask implements Runnable {
    @Override
    public void run() {
        for (int i = 20; i <= 100; i += 40) {
            System.out.println("⬇️ File Download Progress: " + i + "%");
            try { Thread.sleep(1000); } catch (Exception e) {} // Pause 1 second
        }
    }
}

public class Step01_ThreadBasicsDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   Multithreading Demo (Music & Download)");
        System.out.println("=========================================");

        // Create Threads for Tasks
        Thread musicThread = new Thread(new MusicTask());
        Thread downloadThread = new Thread(new DownloadTask());

        // Start Both Threads Simultaneously!
        musicThread.start();
        downloadThread.start();

        System.out.println("=========================================");
    }
}
