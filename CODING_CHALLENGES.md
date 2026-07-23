# 💻 Top Solved Java Coding Challenges (Placement & Interview Masterlist)

This document contains **20 Essential Solved Coding Interview Problems** ranging from foundational array/string logic to data structures, complexity analysis, and direct solution code links!

---

## 📊 Solved Challenges Master Index

| # | Challenge Name | Category | Time Complexity | Space Complexity | Solution Link |
| :-: | :--- | :--- | :-: | :-: | :--- |
| 1 | **Reverse Array In-Place** | Array | $O(N)$ | $O(1)$ | [`Step07_ArrayRev.java`](./01-basics/03-arrays/Step07_ArrayRev.java) |
| 2 | **Max & Min Element in Array** | Array | $O(N)$ | $O(1)$ | [`Step05_BiggestEleArray.java`](./01-basics/03-arrays/Step05_BiggestEleArray.java) |
| 3 | **Matrix Operations & Transpose** | Matrix | $O(R \times C)$ | $O(R \times C)$ | [`Step13_MatrixOperations.java`](./01-basics/03-arrays/Step13_MatrixOperations.java) |
| 4 | **Copy Array Elements** | Array | $O(N)$ | $O(N)$ | [`Step08_CopyArrEle.java`](./01-basics/03-arrays/Step08_CopyArrEle.java) |
| 5 | **Binary Search Algorithm** | Searching | $O(\log N)$ | $O(1)$ | [`Step10_BinarySearchDemo.java`](./01-basics/03-arrays/Step10_BinarySearchDemo.java) |
| 6 | **Bubble Sort (Asc/Desc)** | Sorting | $O(N^2)$ | $O(1)$ | [`Step11_SortArrayInAscending.java`](./01-basics/03-arrays/Step11_SortArrayInAscending.java) |
| 7 | **Linear Search Algorithm** | Searching | $O(N)$ | $O(1)$ | [`Step09_SearchEleInArr.java`](./01-basics/03-arrays/Step09_SearchEleInArr.java) |
| 8 | **Optimized Primality Test** | Math | $O(\sqrt{N})$ | $O(1)$ | [`Step07_Prime.java`](./01-basics/04-math-logic/Step07_Prime.java) |
| 9 | **Prime Numbers in Range** | Math | $O(N \sqrt{N})$ | $O(1)$ | [`Step08_PrimeNumBetweenTwo.java`](./01-basics/04-math-logic/Step08_PrimeNumBetweenTwo.java) |
| 10 | **Fibonacci Sequence** | Math / DP | $O(N)$ | $O(1)$ | [`Step09_FibonacciSeries.java`](./01-basics/04-math-logic/Step09_FibonacciSeries.java) |
| 11 | **Euclidean GCD & LCM** | Math | $O(\log(\min(a,b)))$ | $O(1)$ | [`Step10_GCDandLCM.java`](./01-basics/04-math-logic/Step10_GCDandLCM.java) |
| 12 | **Palindrome Number Check** | Math | $O(\log_{10} N)$ | $O(1)$ | [`Step04_PalindromeNum.java`](./01-basics/04-math-logic/Step04_PalindromeNum.java) |
| 13 | **Armstrong Number Check** | Math | $O(\log_{10} N)$ | $O(1)$ | [`Step11_ArmstrongNum.java`](./01-basics/04-math-logic/Step11_ArmstrongNum.java) |
| 14 | **Perfect Number Check** | Math | $O(\sqrt{N})$ | $O(1)$ | [`Step12_PerfectNum.java`](./01-basics/04-math-logic/Step12_PerfectNum.java) |
| 15 | **Factorial & Power** | Math | $O(N)$ | $O(1)$ | [`Step05_Factorial.java`](./01-basics/04-math-logic/Step05_Factorial.java) |
| 16 | **Count Digits & Digit Sum** | Math | $O(\log_{10} N)$ | $O(1)$ | [`Step01_CountDigits.java`](./01-basics/04-math-logic/Step01_CountDigits.java) |
| 17 | **Vowel / Consonant Check** | Strings | $O(1)$ | $O(1)$ | [`Step04_VowelConsonant.java`](./01-basics/02-control-flow/Step04_VowelConsonant.java) |
| 18 | **String Operations & SCP** | Strings | $O(N)$ | $O(N)$ | [`Step01_StringBasicsDemo.java`](./03-strings-exceptions/Step01_StringBasicsDemo.java) |
| 19 | **ArrayList & HashMap Operations** | Collections | $O(1)$ amortized | $O(N)$ | [`Step01_ArrayListDemo.java`](./04-collections/Step01_ArrayListDemo.java) |
| 20 | **Encapsulation Bank Account** | OOPs | $O(1)$ | $O(1)$ | [`Step02_EncapsulationDemo.java`](./02-oops/Step02_EncapsulationDemo.java) |

---

## 1. Array & Matrix Challenges

### Challenge 1: Reverse an Array in-place (Two-Pointer Technique)
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step07_ArrayRev.java`](./01-basics/03-arrays/Step07_ArrayRev.java)

### Challenge 2: Find Maximum & Minimum Element in an Array
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step05_BiggestEleArray.java`](./01-basics/03-arrays/Step05_BiggestEleArray.java) & [`Step06_SmallestEleArray.java`](./01-basics/03-arrays/Step06_SmallestEleArray.java)

### Challenge 3: Matrix Addition & Transpose
- **Time Complexity**: $O(R \times C)$ | **Space Complexity**: $O(R \times C)$
- **Code Solution**: [`Step13_MatrixOperations.java`](./01-basics/03-arrays/Step13_MatrixOperations.java)

### Challenge 4: Copy Array Elements
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(N)$
- **Code Solution**: [`Step08_CopyArrEle.java`](./01-basics/03-arrays/Step08_CopyArrEle.java)

---

## 2. Search & Sort Algorithm Challenges

### Challenge 5: Binary Search Algorithm
- **Time Complexity**: $O(\log N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step10_BinarySearchDemo.java`](./01-basics/03-arrays/Step10_BinarySearchDemo.java)

### Challenge 6: Bubble Sort (Ascending & Descending Order)
- **Time Complexity**: $O(N^2)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step11_SortArrayInAscending.java`](./01-basics/03-arrays/Step11_SortArrayInAscending.java) & [`Step12_SortArrayInDescending.java`](./01-basics/03-arrays/Step12_SortArrayInDescending.java)

### Challenge 7: Linear Search Algorithm
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step09_SearchEleInArr.java`](./01-basics/03-arrays/Step09_SearchEleInArr.java)

---

## 3. Mathematical & Number Logic Challenges

### Challenge 8: Optimized Primality Test
- **Time Complexity**: $O(\sqrt{N})$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step07_Prime.java`](./01-basics/04-math-logic/Step07_Prime.java)

### Challenge 9: Prime Numbers in a Range
- **Time Complexity**: $O(N \sqrt{N})$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step08_PrimeNumBetweenTwo.java`](./01-basics/04-math-logic/Step08_PrimeNumBetweenTwo.java)

### Challenge 10: Fibonacci Sequence (Iterative & DP)
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step09_FibonacciSeries.java`](./01-basics/04-math-logic/Step09_FibonacciSeries.java)

### Challenge 11: Euclidean GCD & LCM Calculation
- **Time Complexity**: $O(\log(\min(a,b)))$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step10_GCDandLCM.java`](./01-basics/04-math-logic/Step10_GCDandLCM.java)

### Challenge 12: Palindrome Number Check
- **Time Complexity**: $O(\log_{10} N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step04_PalindromeNum.java`](./01-basics/04-math-logic/Step04_PalindromeNum.java)

### Challenge 13: Armstrong Number Check
- **Time Complexity**: $O(\log_{10} N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step11_ArmstrongNum.java`](./01-basics/04-math-logic/Step11_ArmstrongNum.java)

### Challenge 14: Perfect Number Check
- **Time Complexity**: $O(\sqrt{N})$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step12_PerfectNum.java`](./01-basics/04-math-logic/Step12_PerfectNum.java)

### Challenge 15: Factorial & Power Calculation
- **Time Complexity**: $O(N)$ | **Space Complexity**: $O(1)$
- **Code Solution**: [`Step05_Factorial.java`](./01-basics/04-math-logic/Step05_Factorial.java) & [`Step06_Power.java`](./01-basics/04-math-logic/Step06_Power.java)

---

## 4. String & Pattern Challenges

### Challenge 16: Count Digits and Digit Sum
- **Code Solution**: [`Step01_CountDigits.java`](./01-basics/04-math-logic/Step01_CountDigits.java) & [`Step02_SumDigit.java`](./01-basics/04-math-logic/Step02_SumDigit.java)

### Challenge 17: Character Vowel / Consonant Classification
- **Code Solution**: [`Step04_VowelConsonant.java`](./01-basics/02-control-flow/Step04_VowelConsonant.java)

### Challenge 18: String Operations & Substring Extraction
- **Code Solution**: [`Step01_StringBasicsDemo.java`](./03-strings-exceptions/Step01_StringBasicsDemo.java)

---

## 5. Data Structures & OOP Challenges

### Challenge 19: Dynamic ArrayList & HashMap Operations
- **Code Solution**: [`Step01_ArrayListDemo.java`](./04-collections/Step01_ArrayListDemo.java) & [`Step02_HashMapDemo.java`](./04-collections/Step02_HashMapDemo.java)

### Challenge 20: Encapsulation Bank Account Protection
- **Code Solution**: [`Step02_EncapsulationDemo.java`](./02-oops/Step02_EncapsulationDemo.java)
