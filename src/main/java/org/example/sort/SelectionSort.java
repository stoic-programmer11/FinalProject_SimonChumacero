package org.example.sort;

public class SelectionSort {
  public static void sort(int[] arr) {
    int n = arr.length;

    // Iterate through the entire array
    for (int i = 0; i < n - 1; i++) {
      // Find the index of the minimum element in the unsorted subarray
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      // Swap the minimum element with the first unsorted element
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
