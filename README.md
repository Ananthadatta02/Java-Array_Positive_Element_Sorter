# README - Sorting Positive Elements in an Array

## Overview
This Java program takes an array of integers from the user, identifies the positive elements, sorts those positive elements in ascending order, and places them back into the original array while keeping the non-positive elements (negative and zero) in their original positions.

---

## Step-by-step Explanation

### 1. Package Declaration
```java
package sortingOperations;
```
This declares that the class belongs to the `sortingOperations` package.

---

### 2. Import Statements
```java
import java.util.Arrays;
import java.util.Scanner;
```
- `Arrays` class is used to print the array easily.
- `Scanner` is used to take input from the user.

---

### 3. Class Declaration
```java
public class Sorting_Positive_Elements
```
This declares the main class where the logic resides.

---

### 4. Main Method
```java
public static void main(String[] args)
```
This is the entry point of the program.

---

### 5. Input Array Size
```java
System.out.println("Enter the Array Size");
int size = s.nextInt();
```
- `size` is the integer variable that stores the size of the array entered by the user.

---

### 6. Array Declaration
```java
int arr[] = new int[size];
```
- `arr` is the integer array that will hold the elements entered by the user.

---

### 7. Array Input
```java
System.out.println("Enter the Elements");
for(int i=0;i<=arr.length-1;i++)
{
    arr[i] = s.nextInt();
}
```
- This `for` loop iterates through the array to take input from the user for each index.

---

### 8. Print Original Array
```java
System.out.println(Arrays.toString(arr));
```
- This prints the original array entered by the user.

---

### 9. Count Positive Numbers
```java
int count = 0;
for(int i=0;i<=arr.length-1;i++)
{
    if(arr[i]>0)
        count++;
}
```
- `count` variable counts how many positive numbers are in the array.

---

### 10. Create New Array for Positives
```java
int newArr[] = new int[count];
```
- `newArr` is a new array that will store only the positive numbers.

---

### 11. Fill New Array with Positives
```java
int index = 0;
for(int i=0;i<=arr.length-1;i++)
{
    if(arr[i]>0)
        newArr[index++] = arr[i];
}
```
- `index` is used to track the position in `newArr` where the next positive number should go.

---

### 12. Sort New Array (Positive Numbers Only)
```java
for(int i=0;i<=newArr.length-1;i++)
{
    for(int j=0;j<=i-1;j++)
    {
        if(newArr[j]>newArr[i])
        {
            int temp = newArr[i];
            newArr[i] = newArr[j];
            newArr[j] = temp;
        }
    }
}
```
- This nested `for` loop implements **Bubble Sort** on `newArr` to sort the positive numbers in ascending order.

---

### 13. Place Sorted Positives Back into Original Array
```java
index = 0;
for(int i=0;i<=arr.length-1;i++)
{
    if(arr[i]>0)
    {
        arr[i] = newArr[index++];
    }
}
```
- This loop replaces the original positive numbers in `arr` with the sorted numbers from `newArr`.

---

### 14. Print Final Sorted Array
```java
System.out.println("Sorted Array" + Arrays.toString(arr));
```
- The final sorted array (with non-positive numbers in original positions and positive numbers sorted) is printed.

---

## Summary of Variables
| Variable | Type | Purpose |
|---|---|---|
| size | int | Stores size of the array |
| arr | int[] | Stores all user-entered numbers |
| count | int | Counts positive numbers |
| newArr | int[] | Stores only positive numbers |
| index | int | Tracks position in `newArr` |
| temp | int | Temporary variable for swapping during sort |

---

## Example Execution
```
Enter the Array Size
5
Enter the Elements
3 -2 5 0 1
[3, -2, 5, 0, 1]
Sorted Array[1, -2, 3, 0, 5]
```

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Array_Positive_Element_Sorter.git
```
