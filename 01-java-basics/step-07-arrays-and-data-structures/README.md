# Step 7: Arrays & Data Structures 📊

Welcome to **Step 7**! An **Array** is a collection of items stored at contiguous memory locations under a single variable name.

---

## 💡 Key Concepts
1. **0-based Indexing**: Array indices start at `0` and go up to `length - 1`.
2. Fixed size: Once created (`new int[5]`), an array cannot change its size.
3. Accessing elements: `arr[0]`, `arr[1]`, etc.

```java
int[] numbers = {10, 20, 30, 40, 50}; // 5 elements
System.out.println("First element: " + numbers[0]); // 10
System.out.println("Array length: " + numbers.length); // 5
```

---

## 📁 Practice Programs in this Step

| File Name | Beginner Description |
| :--- | :--- |
| [`ArrayDemo.java`](./ArrayDemo.java) | Array creation, initialization, and iteration using for-loop & for-each loop. |
| [`SumArrayEle.java`](./SumArrayEle.java) | Sum all numbers in an array. |
| [`AveArray.java`](./AveArray.java) | Calculate average value of array elements. |
| [`BiggestEleArray.java`](./BiggestEleArray.java) | Find the maximum (largest) element in an array. |
| [`SmallestEleArray.java`](./SmallestEleArray.java) | Find the minimum (smallest) element in an array. |
| [`ArrayRev.java`](./ArrayRev.java) | Reverse array elements in-place using two pointers. |
| [`CopyArrEle.java`](./CopyArrEle.java) | Copy elements from one array into a new array. |
| [`ScearchEleInArr.java`](./ScearchEleInArr.java) | Linear search algorithm to find an element index. |
| [`SortArrayInAscending.java`](./SortArrayInAscending.java) | Sort array elements in ascending order (Bubble Sort). |
| [`SortArrayInDescending.java`](./SortArrayInDescending.java) | Sort array elements in descending order. |
| [`ArrayMethod.java`](./ArrayMethod.java) | Array helper utilities. |

---

## ⚠️ Watch Out: `ArrayIndexOutOfBoundsException`
If your array has length `5`, valid indices are `0, 1, 2, 3, 4`.
Trying to access `numbers[5]` will throw `ArrayIndexOutOfBoundsException`!
