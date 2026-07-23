# Phase 5: Multithreading & Concurrency Roadmap

Welcome to **Phase 5** of the Java Core Roadmap! Multithreading allows concurrent execution of two or more parts of a program for maximum CPU utilization.

---

## 🎯 Core Learning Objectives

### 1. Thread Basics & Lifecycle
- `Thread` class vs `Runnable` interface vs `Callable` interface.
- Thread Lifecycle States: `NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING`, `TERMINATED`.
- Thread operations: `start()`, `run()`, `sleep()`, `join()`, `yield()`, `interrupt()`.

### 2. Synchronization & Concurrency Control
- Race Conditions & Critical Sections.
- `synchronized` methods & blocks (Intrinsic Locks / Monitors).
- Inter-Thread Communication: `wait()`, `notify()`, `notifyAll()`.
- Volatile Keyword (`volatile`) & Java Memory Model (JMM) visibility.
- Atomic Classes (`AtomicInteger`, `AtomicReference`).

### 3. Modern Concurrency (`java.util.concurrent`)
- Executor Framework (`ExecutorService`, `ThreadPoolExecutor`, `Executors` factory).
- `Future` and `CompletableFuture`.
- Explicit Locks (`ReentrantLock`, `ReadWriteLock`, `Condition`).

---

## 📂 Topic Outline

| Topic | Key Concepts | Status |
| :--- | :--- | :--- |
| `01-ThreadCreation.java` | Extending Thread vs Implementing Runnable | ⏳ Upcoming |
| `02-SynchronizationDemo.java` | Resolving race conditions with synchronized blocks | ⏳ Upcoming |
| `03-ProducerConsumer.java` | Inter-thread communication using wait() / notify() | ⏳ Upcoming |
| `04-ExecutorServiceDemo.java` | Thread pooling, submitting tasks, futures | ⏳ Upcoming |
