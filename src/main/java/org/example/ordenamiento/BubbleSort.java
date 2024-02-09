package org.example.ordenamiento;


public class BubbleSort {


  public static void sort(int[] arr) {
    int n = arr.length;

    // Iterar todo el array
    for (int i = 0; i < n - 1; i++) {
      // Últimos i elementos ya están en su lugar correcto
      for (int j = 0; j < n - i - 1; j++) {
        // Comparar elementos
        if (arr[j] > arr[j + 1]) {
          // Intercambiar si el elemento en la posición j es mayor que el siguiente
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }


  // Método para imprimir un array
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

  // Probar BubbleSort
  public static void main(String[] args) {
    int[] arr = {5, 25, 10, 7, 11};
    System.out.println("Array original:");
    printArray(arr);

    sort(arr);

    System.out.println("Array ordenado:");
    printArray(arr);
  }
}
