# Step 6: Loops & Iterations 🔁

Welcome to **Step 6**! Loops allow you to repeat a block of code multiple times without rewriting lines.

---

## 💡 The 3 Types of Loops in Java

1. **`for` loop**: Use when you know exactly how many times to repeat (e.g. 1 to 10).
   ```java
   for (int i = 1; i <= 10; i++) {
       System.out.println(i);
   }
   ```

2. **`while` loop**: Use when repetition depends on a condition (repeat while true).
   ```java
   while (condition) {
       // code block
   }
   ```

3. **`do-while` loop**: Guaranteed to execute **at least once** before checking condition!
   ```java
   do {
       // runs at least 1 time!
   } while (condition);
   ```

---

## 📁 Practice Programs in this Step

| File Name | Beginner Description |
| :--- | :--- |
| [`NaturalNum.java`](./NaturalNum.java) | Print sequence of N natural numbers using `for` loop. |
| [`OddNumInRange.java`](./OddNumInRange.java) | Filter and print all odd numbers in a given range. |
| [`MulTable.java`](./MulTable.java) | Generate multiplication table (e.g. 5x1=5 to 5x10=50). |
| [`SumNNum.java`](./SumNNum.java) | Accumulate sum of first N numbers ($1 + 2 + \dots + N$). |
| [`CharPrint.java`](./CharPrint.java) | Iterate through characters and print alphabets from 'A' to 'Z'. |
