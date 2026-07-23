# Phase 3: Exception Handling & String Processing Roadmap

Welcome to **Phase 3** of the Java Core Roadmap! This module focuses on robust error handling, memory safety, and comprehensive String manipulation in Java.

---

## 🎯 Core Learning Objectives

### 1. Exception Handling Hierarchy
- `Throwable` -> `Exception` & `Error`.
- **Checked Exceptions** (Compile-time: `IOException`, `SQLException`).
- **Unchecked Exceptions** (Runtime: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`).
- `try-catch-finally` blocks and Execution flow.
- Multi-catch blocks (Java 7+).
- `try-with-resources` (`AutoCloseable` interface for automatic resource cleanup).
- `throw` vs `throws` keywords.
- Creating Custom User-Defined Exceptions.

### 2. String Architecture & Memory Management
- `String` Immutability & String Constant Pool (SCP).
- `String` vs `StringBuilder` vs `StringBuffer`.
- Performance comparison: String concatenation vs `StringBuilder` append in loops.
- Common String methods (`substring`, `split`, `replace`, `indexOf`, `trim`, `formatted`).

---

## 📂 Topic Outline

| Topic | Key Concepts | Status |
| :--- | :--- | :--- |
| `01-TryCatchFinally.java` | Exception propagation, handling runtime errors | ⏳ Upcoming |
| `02-TryWithResources.java` | Automatic resource closing with AutoCloseable | ⏳ Upcoming |
| `03-CustomExceptionDemo.java` | Extending Exception/RuntimeException | ⏳ Upcoming |
| `04-StringImmutabilitySCP.java` | String pool memory, equals() vs == operator | ⏳ Upcoming |
| `05-StringBuilderVsBuffer.java` | Thread safety, performance benchmarking | ⏳ Upcoming |
