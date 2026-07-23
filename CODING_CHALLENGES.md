# 💻 Top Solved Java Coding Challenges (Placement & Interview Masterlist)

This document contains **20 Essential Solved Coding Interview Problems** ranging from foundational array/string logic to algorithms, complexity analysis, and solution links!

---

## 📋 Table of Contents
1. [Array & Matrix Challenges](#1-array--matrix-challenges)
2. [Search & Sort Algorithm Challenges](#2-search--sort-algorithm-challenges)
3. [Mathematical & Number Logic Challenges](#3-mathematical--number-logic-challenges)
4. [String & Pattern Challenges](#4-string--pattern-challenges)
5. [Data Structures & OOP Challenges](#5-data-structures--oop-challenges)

---

## 1. Array & Matrix Challenges

### Challenge 1: Reverse an Array in-place (Two-Pointer Technique)
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Input**: `[10, 20, 30, 40, 50]` -> **Output**: `[50, 40, 30, 20, 10]`
- **Code Solution**: [`ArrayRev.java`](./01-java-basics/ArrayRev.java)

### Challenge 2: Find Maximum & Minimum Element in an Array
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Input**: `[12, 45, 2, 99, 67]` -> **Output**: `Max = 99`, `Min = 2`
- **Code Solution**: [`BiggestEleArray.java`](./01-java-basics/BiggestEleArray.java) & [`SmallestEleArray.java`](./01-java-basics/SmallestEleArray.java)

### Challenge 3: Matrix Addition & Transpose
- **Time Complexity**: $O(R \times C)$ | **Space Complexity**: $O(R \times C)$
- **Input**: Matrix $A$ (2x3) -> Transpose $A^T$ (3x2)
- **Code Solution**: [`MatrixOperations.java`](./01-java-basics/MatrixOperations.java)

### Challenge 4: Copy Array Elements
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(N)$
- **Code Solution**: [`CopyArrEle.java`](./01-java-basics/CopyArrEle.java)

---

## 2. Search & Sort Algorithm Challenges

### Challenge 5: Binary Search Algorithm (Iterative & Recursive)
- **Time Complexity**: **$O(\log N)$** | **Space Complexity**: $O(1)$ Iterative / $O(\log N)$ Recursive
- **Requirement**: Input array must be sorted!
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
- **Input**: `29` -> **Output**: `Prime`
- **Code Solution**: [`Prime.java`](./01-java-basics/Prime.java)

### Challenge 9: Prime Numbers in a Range
- **Time Complexity**: $O(N \sqrt{N})$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`PrimeNumBetweenTwo.java`](./01-java-basics/PrimeNumBetweenTwo.java)

### Challenge 10: Fibonacci Sequence (Iterative, Recursive, and Memoized DP)
- **Time Complexity**: Iterative $O(N)$, Naive Recursive $O(2^N)$, Memoized DP $O(N)$
- **Code Solution**: [`FibonacciSeries.java`](./01-java-basics/FibonacciSeries.java)

### Challenge 11: Euclidean GCD (HCF) & LCM Calculation
- **Time Complexity**: $O(\log(\min(a,b)))$ | **Space Complexity**: $O(1)$
- **Formula**: $LCM(a, b) = \frac{a \times b}{GCD(a, b)}$
- **Code Solution**: [`GCDandLCM.java`](./01-java-basics/GCDandLCM.java)

### Challenge 12: Palindrome Number Check
- **Time Complexity**: $O(\log_{10} N)$ | **Space Complexity**: $O(1)$
- **Input**: `12321` -> **Output**: `Palindrome`
- **Code Solution**: [`PalindromeNum.java`](./01-java-basics/PalindromeNum.java)

### Challenge 13: Armstrong Number Check
- **Time Complexity**: $O(\log_{10} N)$ | **Space Complexity**: $O(1)$
- **Input**: `153` ($1^3 + 5^3 + 3^3 = 153$) -> **Output**: `Armstrong`
- **Code Solution**: [`ArmstrongNum.java`](./01-java-basics/ArmstrongNum.java)

### Challenge 14: Perfect Number Check
- **Time Complexity**: $O(\sqrt{N})$ | **Space Complexity**: $O(1)$
- **Input**: `6` ($1 + 2 + 3 = 6$) -> **Output**: `Perfect Number`
- **Code Solution**: [`PerfectNum.java`](./01-java-basics/PerfectNum.java)

### Challenge 15: Factorial & Power Calculation
- **Time Complexity**: $O(N)$
- **Code Solution**: [`Factorial.java`](./01-java-basics/Factorial.java) & [`Power.java`](./01-java-basics/Power.java)

---

## 4. String & Pattern Challenges

### Challenge 16: Count Digits and Digit Sum
- **Time Complexity**: $O(\log_{10} N)$
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
