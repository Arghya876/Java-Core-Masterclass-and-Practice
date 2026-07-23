# 💻 Top Solved Java Coding Challenges (Placement & Interview Masterlist)

This document contains **20 Essential Solved Coding Interview Problems** ranging from foundational array/string logic to data structures, complexity analysis, and direct solution code links!

---

## 📊 Solved Challenges Master Index

| # | Challenge Name | Category | Time Complexity | Space Complexity | Solution Link |
| :-: | :--- | :--- | :-: | :-: | :--- |
| 1 | **Reverse Array In-Place** | Array | $O(N)$ | $O(1)$ | [`ArrayRev.java`](./01-java-basics/ArrayRev.java) |
| 2 | **Max & Min Element in Array** | Array | $O(N)$ | $O(1)$ | [`BiggestEleArray.java`](./01-java-basics/BiggestEleArray.java) |
| 3 | **Matrix Operations & Transpose** | Matrix | $O(R \times C)$ | $O(R \times C)$ | [`MatrixOperations.java`](./01-java-basics/MatrixOperations.java) |
| 4 | **Copy Array Elements** | Array | $O(N)$ | $O(N)$ | [`CopyArrEle.java`](./01-java-basics/CopyArrEle.java) |
| 5 | **Binary Search Algorithm** | Searching | $O(\log N)$ | $O(1)$ | [`BinarySearchDemo.java`](./01-java-basics/BinarySearchDemo.java) |
| 6 | **Bubble Sort (Asc/Desc)** | Sorting | $O(N^2)$ | $O(1)$ | [`SortArrayInAscending.java`](./01-java-basics/SortArrayInAscending.java) |
| 7 | **Linear Search Algorithm** | Searching | $O(N)$ | $O(1)$ | [`ScearchEleInArr.java`](./01-java-basics/ScearchEleInArr.java) |
| 8 | **Optimized Primality Test** | Math | $O(\sqrt{N})$ | $O(1)$ | [`Prime.java`](./01-java-basics/Prime.java) |
| 9 | **Prime Numbers in Range** | Math | $O(N \sqrt{N})$ | $O(1)$ | [`PrimeNumBetweenTwo.java`](./01-java-basics/PrimeNumBetweenTwo.java) |
| 10 | **Fibonacci Sequence** | Math / DP | $O(N)$ | $O(1)$ | [`FibonacciSeries.java`](./01-java-basics/FibonacciSeries.java) |
| 11 | **Euclidean GCD & LCM** | Math | $O(\log(\min(a,b)))$ | $O(1)$ | [`GCDandLCM.java`](./01-java-basics/GCDandLCM.java) |
| 12 | **Palindrome Number Check** | Math | $O(\log_{10} N)$ | $O(1)$ | [`PalindromeNum.java`](./01-java-basics/PalindromeNum.java) |
| 13 | **Armstrong Number Check** | Math | $O(\log_{10} N)$ | $O(1)$ | [`ArmstrongNum.java`](./01-java-basics/ArmstrongNum.java) |
| 14 | **Perfect Number Check** | Math | $O(\sqrt{N})$ | $O(1)$ | [`PerfectNum.java`](./01-java-basics/PerfectNum.java) |
| 15 | **Factorial & Power** | Math | $O(N)$ | $O(1)$ | [`Factorial.java`](./01-java-basics/Factorial.java) |
| 16 | **Count Digits & Digit Sum** | Math | $O(\log_{10} N)$ | $O(1)$ | [`CountDigits.java`](./01-java-basics/CountDigits.java) |
| 17 | **Vowel / Consonant Check** | Strings | $O(1)$ | $O(1)$ | [`VowelConsonant.java`](./01-java-basics/VowelConsonant.java) |
| 18 | **String Operations & SCP** | Strings | $O(N)$ | $O(N)$ | [`StringBasicsDemo.java`](./03-exception-handling/StringBasicsDemo.java) |
| 19 | **ArrayList & HashMap Operations** | Collections | $O(1)$ amortized | $O(N)$ | [`ArrayListDemo.java`](./04-collections-framework/ArrayListDemo.java) |
| 20 | **Encapsulation Bank Account** | OOPs | $O(1)$ | $O(1)$ | [`EncapsulationDemo.java`](./02-object-oriented-programming/EncapsulationDemo.java) |

---

## 1. Array & Matrix Challenges

### Challenge 1: Reverse an Array in-place (Two-Pointer Technique)
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Input**: `[10, 20, 30, 40, 50]` $\rightarrow$ **Output**: `[50, 40, 30, 20, 10]`
- **Code Solution**: [`ArrayRev.java`](./01-java-basics/ArrayRev.java)

### Challenge 2: Find Maximum & Minimum Element in an Array
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Input**: `[12, 45, 2, 99, 67]` $\rightarrow$ **Output**: `Max = 99`, `Min = 2`
- **Code Solution**: [`BiggestEleArray.java`](./01-java-basics/BiggestEleArray.java) & [`SmallestEleArray.java`](./01-java-basics/SmallestEleArray.java)

### Challenge 3: Matrix Addition & Transpose
- **Time Complexity**: $O(R \times C)$ | **Space Complexity**: $O(R \times C)$
- **Code Solution**: [`MatrixOperations.java`](./01-java-basics/MatrixOperations.java)

### Challenge 4: Copy Array Elements
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(N)$
- **Code Solution**: [`CopyArrEle.java`](./01-java-basics/CopyArrEle.java)

---

## 2. Search & Sort Algorithm Challenges

### Challenge 5: Binary Search Algorithm
- **Time Complexity**: $O(\log N)$ | **Space Complexity**: $O(1)$ Iterative
- **Requirement**: Array must be sorted prior to search.
- **Code Solution**: [`BinarySearchDemo.java`](./01-java-basics/BinarySearchDemo.java)

### Challenge 6: Bubble Sort (Ascending & Descending Order)
- **Time Complexity**: $O(N^2)$ worst-case | **Space Complexity**: $O(1)$
- **Code Solution**: [`SortArrayInAscending.java`](./01-java-basics/SortArrayInAscending.java) & [`SortArrayInDescending.java`](./01-java-basics/SortArrayInDescending.java)

### Challenge 7: Linear Search Algorithm
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`ScearchEleInArr.java`](./01-java-basics/ScearchEleInArr.java)

---

## 3. Mathematical & Number Logic Challenges

### Challenge 8: Optimized Primality Test
- **Time Complexity**: $O(\sqrt{N})$ | **Space Complexity**: $O(1)$
- **Input**: `29` $\rightarrow$ **Output**: `Prime`
- **Code Solution**: [`Prime.java`](./01-java-basics/Prime.java)

### Challenge 9: Prime Numbers in a Range
- **Time Complexity**: $O(N \sqrt{N})$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`PrimeNumBetweenTwo.java`](./01-java-basics/PrimeNumBetweenTwo.java)

### Challenge 10: Fibonacci Sequence (Iterative & DP)
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`FibonacciSeries.java`](./01-java-basics/FibonacciSeries.java)

### Challenge 11: Euclidean GCD & LCM Calculation
- **Time Complexity**: $O(\log(\min(a,b)))$ | **Space Complexity**: $O(1)$
- **Formula**: $LCM(a, b) = \frac{a \times b}{GCD(a, b)}$
- **Code Solution**: [`GCDandLCM.java`](./01-java-basics/GCDandLCM.java)

### Challenge 12: Palindrome Number Check
- **Time Complexity**: $O(\log_{10} N)$ | **Space Complexity**: $O(1)$
- **Input**: `12321` $\rightarrow$ **Output**: `Palindrome`
- **Code Solution**: [`PalindromeNum.java`](./01-java-basics/PalindromeNum.java)

### Challenge 13: Armstrong Number Check
- **Time Complexity**: $O(\log_{10} N)$ | **Space Complexity**: $O(1)$
- **Input**: `153` ($1^3 + 5^3 + 3^3 = 153$) $\rightarrow$ **Output**: `Armstrong`
- **Code Solution**: [`ArmstrongNum.java`](./01-java-basics/ArmstrongNum.java)

### Challenge 14: Perfect Number Check
- **Time Complexity**: $O(\sqrt{N})$ | **Space Complexity**: $O(1)$
- **Input**: `6` ($1 + 2 + 3 = 6$) $\rightarrow$ **Output**: `Perfect Number`
- **Code Solution**: [`PerfectNum.java`](./01-java-basics/PerfectNum.java)

### Challenge 15: Factorial & Power Calculation
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Factorial.java`](./01-java-basics/Factorial.java) & [`Power.java`](./01-java-basics/Power.java)

---

## 4. String & Pattern Challenges

### Challenge 16: Count Digits and Digit Sum
- **Code Solution**: [`CountDigits.java`](./01-java-basics/CountDigits.java) & [`SumDigit.java`](./01-java-basics/SumDigit.java)

### Challenge 17: Character Vowel / Consonant Classification
- **Code Solution**: [`VowelConsonant.java`](./01-java-basics/VowelConsonant.java)

### Challenge 18: String Operations & Substring Extraction
- **Code Solution**: [`StringBasicsDemo.java`](./03-exception-handling/StringBasicsDemo.java)

---

## 5. Data Structures & OOP Challenges

### Challenge 19: Dynamic ArrayList & HashMap Operations
- **Code Solution**: [`ArrayListDemo.java`](./04-collections-framework/ArrayListDemo.java) & [`HashMapDemo.java`](./04-collections-framework/HashMapDemo.java)

### Challenge 20: Encapsulation Bank Account Protection
- **Code Solution**: [`EncapsulationDemo.java`](./02-object-oriented-programming/EncapsulationDemo.java)
