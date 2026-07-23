# Phase 7: Modern Java Features (Java 8 to Java 21+) Roadmap

Welcome to **Phase 7** of the Java Core Roadmap! Modern Java has evolved rapidly with functional programming, pattern matching, records, and lightweight concurrency.

---

## 🎯 Core Learning Objectives

### 1. Java 8 Innovations (The Paradigm Shift)
- **Lambda Expressions** & Functional Interfaces (`@FunctionalInterface`, `Predicate`, `Function`, `Consumer`, `Supplier`).
- **Stream API**: `filter`, `map`, `flatMap`, `reduce`, `collect`, `parallelStream`.
- **Optional Class**: Avoiding `NullPointerException`.
- Method References (`Class::methodName`).
- New Date and Time API (`java.time.*`: `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`).

### 2. Java 9 to 11 Features
- Java Platform Module System (JPMS).
- Var Keyword (`var` local variable type inference in Java 10).
- New HttpClient API (Java 11).

### 3. Java 14 to 17 LTS Features
- Switch Expressions (`yield` and arrow syntax).
- Text Blocks (`"""` multi-line strings).
- **Records**: Immutable data carrier classes (`record Person(String name, int age) {}`).
- **Sealed Classes & Interfaces**: Controlled inheritance hierarchy (`sealed class Shape permits Circle, Square`).

### 4. Java 21+ LTS Innovations
- **Virtual Threads (Project Loom)**: Lightweight threads managed by JVM.
- **Pattern Matching for Switch**: Type patterns and record patterns in switch.
- Sequenced Collections (`SequencedCollection`, `SequencedSet`, `SequencedMap`).

---

## 📂 Topic Outline

| Topic | Key Concepts | Status |
| :--- | :--- | :--- |
| `01-LambdasAndFunctionalInterfaces.java` | Anonymous functions, built-in functional interfaces | ⏳ Upcoming |
| `02-StreamAPIMasterclass.java` | Filtering, mapping, reducing, collectors | ⏳ Upcoming |
| `03-OptionalAndDateTime.java` | Null safety, java.time package | ⏳ Upcoming |
| `04-RecordsAndSealedClasses.java` | Records syntax, sealed permits hierarchy | ⏳ Upcoming |
| `05-VirtualThreadsDemo.java` | Executors.newVirtualThreadPerTaskExecutor() | ⏳ Upcoming |
