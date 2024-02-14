package org.example.sort;

public class BubbleSort {
  public static void sort(int[] arr) {
    int n = arr.length;

    // Iterate through the entire array
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        // Compare elements
        if (arr[j] > arr[j + 1]) {
          // Swap if the element at position j is greater than the next one
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void printArray(int[] arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i != arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }
}
