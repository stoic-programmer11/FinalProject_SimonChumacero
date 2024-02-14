package org.example.sort;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class SelectionSortRunner implements IRunner {
  public void run() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println("Original Array:");
    SelectionSort.printArray(arr);

    SelectionSort.sort(arr);

    System.out.println("Sorted Array:");
    SelectionSort.printArray(arr);

    scanner.close();
  }
}
