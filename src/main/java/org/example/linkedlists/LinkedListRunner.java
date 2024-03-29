package org.example.linkedlists;

import org.example.interfaces.IRunner;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListRunner implements IRunner {
  private final LinkedList<String> linkedList;

  public LinkedListRunner() {
    this.linkedList = new LinkedList<>();
  }

  @Override
  public void run() {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("The size of the LinkedList is: " + linkedList.size());
          break;
        case 2:
          System.out.println("The LinkedList is empty? " + linkedList.isEmpty());
          break;
        case 3:
          System.out.println("The first Node is: " + linkedList.getFirst());
          break;
        case 4:
          System.out.println("The last Node is: " + linkedList.getLast());
          break;
        case 5:
          System.out.println("Enter data for the Node to add at the start: ");
          String dataToAddStart = scanner.next();
          linkedList.addFirst(dataToAddStart);
          break;
        case 6:
          System.out.println("Enter data for the Node to add at the end: ");
          String dataToAddEnd = scanner.next();
          linkedList.addLast(dataToAddEnd);
          break;
        case 7:
          linkedList.removeFirst();
          System.out.println("First Node removed.");
          break;
        case 8:
          System.out.println("Printing LinkedList: " + linkedList);
          break;
        case 9:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid option");
      }
    }
  }

  private void printMenu() {
    System.out.println("I'm running LinkedListRunner");
    System.out.println("1. Get Size");
    System.out.println("2. Is Empty? ");
    System.out.println("3. Return first Node");
    System.out.println("4. Return last Node");
    System.out.println("5. Add Node at the start");
    System.out.println("6. Add Node at the end");
    System.out.println("7. Remove first Node");
    System.out.println("8. Print LinkedList");
    System.out.println("9. Exit");
    System.out.print("Choose an option: ");
  }
}