# ☕ Java Learning Concepts: Core Java, OOPs & Algorithms Masterclass

[![Java Version](https://img.shields.io/badge/Java-8%20%7C%2011%20%7C%2017%20%7C%2021-orange.svg?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)
[![Beginner Friendly](https://img.shields.io/badge/Beginner-Friendly-brightgreen.svg?style=for-the-badge)](./BEGINNER_JAVA_GUIDE.md)
[![Campus Placements](https://img.shields.io/badge/Campus_Placements-FAANG_Ready-purple.svg?style=for-the-badge)](./INTERVIEW_QA.md)

[![Author](https://img.shields.io/badge/Author-Arghya876-181717.svg?style=for-the-badge&logo=github)](https://github.com/Arghya876)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Arghya-0A66C2.svg?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/arghya-bhattacharjee876/)
[![Portfolio](https://img.shields.io/badge/Portfolio-Arghya.tech-FF5722.svg?style=for-the-badge&logo=google-chrome)](https://arghya.tech)

Welcome to **Java Learning Concepts** (`Java-Learning-Concepts`), a clean, production-grade Java master repository maintained by **[Arghya (Arghya876)](https://github.com/Arghya876)**.

Designed for students, job seekers, and developers to master **Core Java (JDK 8–21)**, **Object-Oriented Programming (OOPs)**, **Collections**, **Multithreading**, **Streams API**, **Virtual Threads**, **Technical Interview Q&As**, and **50+ Solved Programs**.

---

## 📂 Simplified Repository Structure

```
Java-Learning-Concepts/
├── 01-basics/                      # Core Syntax, Control Flow, Arrays & Math Logic
│   ├── 01-syntax/                  # Hello World, Variables, Scanner, Operators, Methods
│   ├── 02-control-flow/            # If-Else, Switch, Loops & Iteration
│   ├── 03-arrays/                  # 1D/2D Arrays, Searching, Sorting, Matrix Math
│   └── 04-math-logic/              # Primes, Fibonacci, Palindromes, GCD/LCM, Factorials
├── 02-oops/                        # Encapsulation, Inheritance, Polymorphism, Abstraction
├── 03-strings-exceptions/          # String SCP Pool, Custom Exceptions, Try-Catch
├── 04-collections/                 # ArrayList, HashMap, HashSet, TreeSet, PriorityQueue
├── 05-file-io/                     # File Reading & Writing (FileWriter, Scanner)
├── 06-multithreading/              # Thread Creation, Concurrency & Synchronization
├── 07-modern-java/                 # Records, Lambdas, Streams API, Virtual Threads
├── BEGINNER_JAVA_GUIDE.md          # Zero-jargon guide with real-world analogies
├── CODING_CHALLENGES.md            # 20 Solved placement & interview coding problems
└── INTERVIEW_QA.md                 # 25+ FAANG & campus placement technical Q&A
```

---

## 🗺️ 7-Phase Learning Roadmap

### 🟢 Phase 1: Java Basics ([`01-basics`](./01-basics))

| Category | Folder Link | Key Concepts & Solved Programs |
| :--- | :--- | :--- |
| **Syntax & Input** | [`01-basics/01-syntax`](./01-basics/01-syntax) | JVM internals, primitive types, type casting, `Scanner`, operators, method overloading |
| **Control Flow** | [`01-basics/02-control-flow`](./01-basics/02-control-flow) | `if-else` slabs, `switch-case`, `for` & `while` loops, range filtering |
| **Arrays & Sorting** | [`01-basics/03-arrays`](./01-basics/03-arrays) | Array reversal, Binary Search, Bubble Sort, Matrix addition/transpose |
| **Math Algorithms** | [`01-basics/04-math-logic`](./01-basics/04-math-logic) | Primality test, Fibonacci series, Palindrome, Euclidean GCD/LCM, Armstrong numbers |

---

### 🟡 Phase 2: Object-Oriented Programming ([`02-oops`](./02-oops))

| Program File | Core Concept |
| :--- | :--- |
| [`ClassAndObjectDemo.java`](./02-oops/ClassAndObjectDemo.java) | Blueprints (`Class`), instances (`Object`), constructors & methods. |
| [`EncapsulationDemo.java`](./02-oops/EncapsulationDemo.java) | Data hiding via `private` fields, getters, setters & validation. |
| [`InheritanceDemo.java`](./02-oops/InheritanceDemo.java) | Subclassing via `extends`, `super` keyword, code reuse. |
| [`PolymorphismDemo.java`](./02-oops/PolymorphismDemo.java) | Method Overloading vs Overriding (`@Override`). |
| [`AbstractionDemo.java`](./02-oops/AbstractionDemo.java) | `abstract` classes, abstract methods & system contracts. |
| [`InterfaceAndMultipleInheritance.java`](./02-oops/InterfaceAndMultipleInheritance.java) | `interface`, `implements`, `default` methods & resolving Diamond Problem. |

---

### 🔵 Phase 3: Strings & Exceptions ([`03-strings-exceptions`](./03-strings-exceptions))

| Program File | Core Concept |
| :--- | :--- |
| [`StringBasicsDemo.java`](./03-strings-exceptions/StringBasicsDemo.java) | String immutability, String Constant Pool (SCP), `StringBuilder` vs `StringBuffer`. |
| [`ExceptionHandlingDemo.java`](./03-strings-exceptions/ExceptionHandlingDemo.java) | Robust error handling using `try`, `catch`, `finally`, `throw`, `throws`. |

---

### 🟣 Phase 4: Java Collections ([`04-collections`](./04-collections))

| Program File | Core Concept |
| :--- | :--- |
| [`ArrayListDemo.java`](./04-collections/ArrayListDemo.java) | Dynamic auto-resizing list (`ArrayList`) operations. |
| [`HashMapDemo.java`](./04-collections/HashMapDemo.java) | Key-value store (`HashMap`), bucket index hashing & iteration patterns. |
| [`HashSetAndTreeSetDemo.java`](./04-collections/HashSetAndTreeSetDemo.java) | $O(1)$ `HashSet` vs sorted $O(\log N)$ `TreeSet`. |
| [`QueueAndPriorityQueueDemo.java`](./04-collections/QueueAndPriorityQueueDemo.java) | FIFO Queue & Min/Max-Heap using `PriorityQueue`. |

---

### 🟤 Phase 5: Java File I/O ([`05-file-io`](./05-file-io))

| Program File | Core Concept |
| :--- | :--- |
| [`FileReadWriteDemo.java`](./05-file-io/FileReadWriteDemo.java) | Creating, reading (`Scanner`), and writing (`FileWriter`) text files safely. |

---

### 🔴 Phase 6: Multithreading ([`06-multithreading`](./06-multithreading))

| Program File | Core Concept |
| :--- | :--- |
| [`ThreadBasicsDemo.java`](./06-multithreading/ThreadBasicsDemo.java) | Concurrent execution using `Thread` class & `Runnable` interface. |
| [`SynchronizationAndLocks.java`](./06-multithreading/SynchronizationAndLocks.java) | Protecting shared state against Race Conditions using `synchronized`. |

---

### ⚡ Phase 7: Modern Java (Java 8–21) ([`07-modern-java`](./07-modern-java))

| Program File | Core Concept |
| :--- | :--- |
| [`ModernJavaDemo.java`](./07-modern-java/ModernJavaDemo.java) | Records (`record`), Lambda Expressions (`->`), and Functional Interfaces. |
| [`StreamAPIMasterclass.java`](./07-modern-java/StreamAPIMasterclass.java) | Stream API (`filter`, `map`, `collect`, `reduce`, `groupingBy`). |

---

## ❓ Technical Interview Prep & Coding Challenges

- 📖 **[Beginner Java Guide](./BEGINNER_JAVA_GUIDE.md)**: Real-world analogies for absolute beginners.
- ❓ **[Interview Q&A Guide](./INTERVIEW_QA.md)**: FAANG & campus interview questions on JVM, GC, HashMaps, and Concurrency.
- 💻 **[Solved Coding Challenges](./CODING_CHALLENGES.md)**: 20 essential coding interview problems with time/space complexity analysis.

---

## 🚀 How to Run

```bash
# 1. Clone the repository
git clone https://github.com/Arghya876/Java-Learning-Concepts.git
cd Java-Learning-Concepts

# 2. Navigate to any module (e.g. Modern Java)
cd 07-modern-java

# 3. Compile & Run
javac StreamAPIMasterclass.java
java StreamAPIMasterclass
```

---

## 🌐 Author & Connect

Created with ❤️ by **[Arghya (Arghya876)](https://github.com/Arghya876)**.

| Platform | Official Link |
| :--- | :--- |
| 🐙 **GitHub** | [github.com/Arghya876](https://github.com/Arghya876) |
| 🌐 **Portfolio** | [arghya.tech](https://arghya.tech) |
| 💼 **LinkedIn** | [linkedin.com/in/arghya-bhattacharjee876](https://www.linkedin.com/in/arghya-bhattacharjee876/) |

⭐ **Star this repository** if you find it helpful!
