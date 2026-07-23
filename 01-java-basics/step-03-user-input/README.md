# Step 3: Interactive User Input using Scanner ⌨️

Welcome to **Step 3**! Programs become much more interesting when users can type inputs from their keyboard. In Java, we use the `Scanner` class from `java.util` package.

---

## 💡 What You Will Learn
1. How to import and create a `Scanner` object.
2. How to read integers (`nextInt()`), decimals (`nextDouble()`), and text (`nextLine()`).
3. How to handle the famous "Scanner Newline Buffer Issue".

---

## 🧠 Code Snippet Guide
```java
import java.util.Scanner; // Step 1: Import Scanner

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 2: Create Scanner
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Step 3: Read integer
        
        System.out.println("You are " + age + " years old.");
        sc.close(); // Step 4: Always close scanner!
    }
}
```

---

## 📁 Practice Programs in this Step

| File Name | Beginner Description |
| :--- | :--- |
| [`ScannerAndInput.java`](./ScannerAndInput.java) | Interactive program demonstrating name, age, GPA, and favorite language inputs with clean resource handling. |

---

## ⚠️ The Famous "Scanner Newline Bug" & Fix!
When you call `sc.nextInt()` and then call `sc.nextLine()`, `nextLine()` instantly skips! Why?
Because pressing `ENTER` leaves a hidden `\n` character in the buffer stream.

**The Fix**: Add an extra `sc.nextLine();` right after `nextInt()` to clear the buffer!
```java
int age = sc.nextInt();
sc.nextLine(); // Clear newline buffer!
String name = sc.nextLine(); // Now reads text properly!
```
