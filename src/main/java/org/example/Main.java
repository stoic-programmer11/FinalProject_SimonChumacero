package org.example;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    printMenu();

    // Take input from user with Scanner
    Scanner scanner = new Scanner(System.in);
    int option = scanner.nextInt();

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
//    System.out.println("5. Tree");
//    System.out.println("6. Graph");
//    System.out.println("0. Exit");
  }
}