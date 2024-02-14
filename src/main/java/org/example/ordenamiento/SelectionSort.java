package org.example.ordenamiento;

public class SelectionSort {


  public static void sort(int[] arr) {
    int n = arr.length;

    // Iterar todo el array
    for (int i = 0; i < n - 1; i++) {
      // Encontrar el índice del elemento mínimo en el subarray sin ordenar
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      // Intercambiar el elemento mínimo con el primer elemento no ordenado
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

  // Método main para probar la clase SelectionSort
  public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};
    System.out.println("Array original:");
    printArray(arr);

    sort(arr);

    System.out.println("Array ordenado:");
    printArray(arr);
  }
}
