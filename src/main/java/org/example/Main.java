package org.example;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    printMenu();

    // Take input from user with Scanner
    Scanner scanner = new Scanner(System.in);
    int option = scanner.nextInt();

    // Create a runner based on the user's choice
    IRunner runner = RunnerFactory.getRunner(option);
    runner.run();


  }

  private static void printMenu() {
    System.out.println("Choose a data structure to work with:");
    System.out.println("1. LinkedList");
    System.out.println("2. DoubleLinkedList");
    System.out.println("3. Stack");
    System.out.println("4. Queue");
    System.out.println("5. Dequeue (Double-ended queue)");
    System.out.println("6. Binary Tree");
    System.out.println("7. Graph");
    System.out.println("8. BubbleSort");
    System.out.println("9. SelectionSort");
    System.out.println("10. Tower of Hanoi");
  }
}