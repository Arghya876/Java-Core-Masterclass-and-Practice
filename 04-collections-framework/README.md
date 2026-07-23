# Phase 4: Java Collections Framework (JCF) Roadmap

Welcome to **Phase 4** of the Java Core Roadmap! The Collections Framework provides standardized data structures and algorithms in Java.

---

## 🎯 Core Learning Objectives

### 1. Collection Hierarchy (`java.util.*`)
- **List Interface**: `ArrayList`, `LinkedList`, `Vector`, `Stack`.
- **Set Interface**: `HashSet`, `LinkedHashSet`, `TreeSet` (NavigableSet/SortedSet).
- **Queue & Deque**: `PriorityQueue`, `ArrayDeque`, `LinkedList`.

### 2. Map Hierarchy
- **Map Interface**: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`, `ConcurrentHashMap`.
- Internal working of `HashMap` (Hashing, Buckets, Collision handling, Treeifying in Java 8+).

### 3. Utility Classes & Iteration
- `Iterator`, `ListIterator`, `Fail-Fast` vs `Fail-Safe` iteration.
- `Comparable` (`compareTo`) vs `Comparator` (`compare`).
- `Collections` & `Arrays` utility methods (`sort`, `binarySearch`, `frequency`, `reverse`).

---

## 📂 Topic Outline

| Topic | Key Concepts | Status |
| :--- | :--- | :--- |
| `01-ArrayListVsLinkedList.java` | Performance analysis, indexed access vs insertion | ⏳ Upcoming |
| `02-SetImplementations.java` | Uniqueness, ordering, HashCode & Equals contract | ⏳ Upcoming |
| `03-HashMapDeepDive.java` | Bucket array, rehashing, custom key objects | ⏳ Upcoming |
| `04-ComparableVsComparator.java` | Custom sorting rules for domain objects | ⏳ Upcoming |
