# Step 2: Variables, Data Types & Type Casting 📦

Welcome to **Step 2**! Here you will learn how Java stores information in computer memory using **Variables** and **Data Types**.

---

## 💡 What You Will Learn
1. The **8 Primitive Data Types** in Java.
2. Difference between Integer numbers (`int`, `long`) and Decimal numbers (`float`, `double`).
3. What is **Type Casting** (converting one type to another)?
4. Widening (Automatic) vs Narrowing (Manual) conversion.

---

## 🧠 Simple Analogy: Variables as Named Containers
Imagine variables as labeled storage boxes in a room:
- `byte` / `short` / `int` / `long` -> Small, medium, large boxes for whole numbers.
- `float` / `double` -> Boxes for decimal prices or floating numbers.
- `char` -> A tiny box holding a single character like `'A'`.
- `boolean` -> A light switch box that is either `true` (ON) or `false` (OFF).

```java
int age = 20;           // Box named 'age' holding integer 20
double price = 99.99;   // Box named 'price' holding 99.99
boolean isPassed = true;// Box holding true
```

---

## 📊 Summary Table of Primitive Data Types

| Data Type | Memory Size | Range / Storage | Default Value | Example |
| :--- | :---: | :--- | :---: | :--- |
| `byte` | 1 byte | -128 to 127 | `0` | `byte b = 100;` |
| `short` | 2 bytes | -32,768 to 32,767 | `0` | `short s = 5000;` |
| `int` | 4 bytes | -2 Billion to +2 Billion | `0` | `int count = 42;` |
| `long` | 8 bytes | Very large integers | `0L` | `long dist = 900000L;` |
| `float` | 4 bytes | 6-7 decimal digits precision | `0.0f` | `float pi = 3.14f;` |
| `double` | 8 bytes | 15 decimal digits precision | `0.0` | `double d = 9.81;` |
| `char` | 2 bytes | Single 16-bit Unicode character | `'\u0000'` | `char grade = 'A';` |
| `boolean` | 1 bit | `true` or `false` | `false` | `boolean active = true;` |

---

## 📁 Practice Programs in this Step

| File Name | Beginner Description |
| :--- | :--- |
| [`DataTypesAndCasting.java`](./DataTypesAndCasting.java) | Master primitive data types, memory limits, widening & narrowing type casting. |
| [`Average.java`](./Average.java) | Practical average calculation using `double` and division operations. |

---

## ⚠️ Common Beginner Pitfalls
- **Forgetting `f` suffix for float**: `float x = 3.14;` fails because Java defaults decimals to `double`. You must write `float x = 3.14f;`.
- **Data Loss in Narrowing**: Casting a big `double` to an `int` removes the decimal digits! `(int) 5.9` becomes `5`.
