# 💻 Top Java Basic & Core Coding Interview Challenges

This document provides a list of essential **Coding Interview Problems** for Java Basics. Master these problems to build a rock-solid foundation for coding assessments and technical interview rounds!

---

## 📋 Table of Contents
1. [Array & Search Challenges](#1-array--search-challenges)
2. [Mathematical & Number Logic Challenges](#2-mathematical--number-logic-challenges)
3. [String & Pattern Challenges](#3-string--pattern-challenges)

---

## 1. Array & Search Challenges

### Challenge 1: Reverse an Array in-place (Two-Pointer Technique)
- **Problem Statement**: Given an array of integers, reverse the array in-place without using extra memory array.
- **Input**: `[10, 20, 30, 40, 50]`
- **Output**: `[50, 40, 30, 20, 10]`
- **Logic Hint**: Use two pointers (`start = 0`, `end = length - 1`). Swap elements at `start` and `end`, then increment `start` and decrement `end` until `start >= end`.
- **Code Solution**: See [`ArrayRev.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/04-arrays/ArrayRev.java)

---

### Challenge 2: Find Maximum & Minimum Element in an Array
- **Problem Statement**: Find the largest and smallest element in an integer array in a single traversal ($O(N)$ time).
- **Input**: `[12, 45, 2, 99, 67, 34]`
- **Output**: `Max = 99`, `Min = 2`
- **Logic Hint**: Initialize `max = arr[0]` and `min = arr[0]`. Iterate through array from index 1 to N-1 and update `max` and `min`.
- **Code Solution**: See [`BiggestEleArray.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/04-arrays/BiggestEleArray.java) & [`SmallestEleArray.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/04-arrays/SmallestEleArray.java)

---

### Challenge 3: Sort an Array in Ascending Order (Bubble Sort)
- **Problem Statement**: Sort an un-sorted array of integers in ascending order using Bubble Sort algorithm.
- **Input**: `[5, 1, 4, 2, 8]`
- **Output**: `[1, 2, 4, 5, 8]`
- **Time Complexity**: $O(N^2)$ worst-case.
- **Code Solution**: See [`SortArrayInAscending.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/04-arrays/SortArrayInAscending.java)

---

## 2. Mathematical & Number Logic Challenges

### Challenge 4: Check for Prime Number (Optimized Primality Test)
- **Problem Statement**: Determine whether a given integer $N > 1$ is a prime number.
- **Input**: `N = 29` -> **Output**: `True (Prime)`
- **Input**: `N = 15` -> **Output**: `False (Not Prime)`
- **Logic Hint**: Instead of checking up to $N-1$, check divisibility up to $\sqrt{N}$. If $N \% i == 0$, then $N$ is composite.
- **Code Solution**: See [`Prime.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/05-math-and-number-programs/Prime.java)

---

### Challenge 5: Check for Palindrome Number
- **Problem Statement**: Check if an integer reads the same forwards and backwards.
- **Input**: `12321` -> **Output**: `True (Palindrome)`
- **Input**: `12345` -> **Output**: `False`
- **Logic Hint**: Extract last digit using `n % 10`, build reversed number `rev = rev * 10 + digit`, and divide `n /= 10`. Compare `rev` with original `n`.
- **Code Solution**: See [`PalindromeNum.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/05-math-and-number-programs/PalindromeNum.java)

---

### Challenge 6: Armstrong Number Check
- **Problem Statement**: An Armstrong (Narcissistic) number of $D$ digits is equal to the sum of its digits raised to the power $D$.
- **Input**: `153` ($1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153$) -> **Output**: `True`
- **Input**: `9474` ($9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474$) -> **Output**: `True`
- **Code Solution**: See [`ArmstrongNum.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/05-math-and-number-programs/ArmstrongNum.java)

---

### Challenge 7: Factorial of a Number (Iterative & Recursive)
- **Problem Statement**: Calculate $N! = N \times (N-1) \times \dots \times 1$.
- **Input**: `N = 5` -> **Output**: `120`
- **Code Solution**: See [`Factorial.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/05-math-and-number-programs/Factorial.java) & [`MethodBasics.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/06-methods-and-scope/MethodBasics.java)

---

## 3. String & Pattern Challenges

### Challenge 8: Count Digits and Sum of Digits
- **Problem Statement**: Calculate the total number of digits and their sum for any integer.
- **Input**: `N = 4567`
- **Output**: `Count = 4`, `Sum = 22`
- **Code Solution**: See [`CountDigits.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/05-math-and-number-programs/CountDigits.java) & [`SumDigit.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/05-math-and-number-programs/SumDigit.java)

---

### Challenge 9: Vowel or Consonant Classifier
- **Problem Statement**: Classify an input character as Vowel, Consonant, or Non-alphabet character using `switch-case`.
- **Input**: `'e'` -> **Output**: `Vowel`
- **Code Solution**: See [`VowelConsonant.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/02-operators-and-control-flow/VowelConsonant.java)

---

### Challenge 10: Multi-Tier Income Tax Calculator
- **Problem Statement**: Compute tax payable based on income brackets using conditional logic (`if-else if`).
- **Code Solution**: See [`TaxCal.java`](file:///d:/Arghya/Codes/VS%20Code/Java/Basic%20Practice%20Programs%20in%20Java/01-basics/02-operators-and-control-flow/TaxCal.java)
