# Step 1: Java Introduction, Syntax & Main Entry Point 🚀

Welcome to **Step 1** of your Java learning journey! In this module, you will write your very first Java program and learn how Java runs on your computer.

---

## 💡 What You Will Learn
1. How a Java program is structured (`class` and `main` method).
2. How to print text to the screen using `System.out.println()`.
3. What happens behind the scenes when you compile (`javac`) and run (`java`) code.
4. Character Literals, ASCII values, and Escape Sequences.

---

## 🧠 Simple Analogy: Class & Main Method
Think of a **Java Class** as a recipe book, and the **`main()` method** as the **"START" button** on a microwave. Whenever Java executes your program, it looks specifically for the `main()` method to start cooking your code!

```java
public class HelloWorldAndJVM {
    // This is the START button for JVM!
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

## 📁 Practice Programs in this Step

| File Name | Beginner Description |
| :--- | :--- |
| [`HelloWorldAndJVM.java`](./HelloWorldAndJVM.java) | Your first Java program printing welcome messages & OS system info. |
| [`Literals.java`](./Literals.java) | Understanding raw values (numbers, text, boolean flags) in Java. |
| [`ASCII.java`](./ASCII.java) | How characters like `'A'`, `'a'`, `'0'` map to underlying numeric ASCII codes. |

---

## ⚠️ Common Beginner Mistakes to Avoid
1. **Case Sensitivity**: Java is case-sensitive! `System` must have a capital `S`, and `main` must be lowercase.
2. **Missing Semicolon `;`**: Every statement in Java must end with a semicolon `;`.
3. **File Name Matching**: The public class name MUST exactly match the file name (e.g., `public class HelloWorldAndJVM` must be saved as `HelloWorldAndJVM.java`).

---

## 🚀 How to Run These Programs
```bash
# 1. Navigate to this directory
cd 01-java-basics/step-01-introduction-and-syntax

# 2. Compile
javac HelloWorldAndJVM.java

# 3. Run
java HelloWorldAndJVM
```
