package org.example.linkedlists;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class DoubleLinkedListRunner<T> implements IRunner {
  private final DoubleLinkedList<T> doubleLinkedList;

  public DoubleLinkedListRunner() {
    this.doubleLinkedList = new DoubleLinkedList<>();
  }

  @Override
  public void run() {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("The size of the DoubleLinkedList is: " + doubleLinkedList.size());
          break;
        case 2:
          System.out.println("The DoubleLinkedList is empty? " + doubleLinkedList.isEmpty());
          break;
        case 3:
          DoubleEdgeNode<T> firstNode = doubleLinkedList.first();
          if (firstNode != null) {
            System.out.println("The first Node is: " + firstNode.getData());
          }
          break;
        case 4:
          DoubleEdgeNode<T> lastNode = doubleLinkedList.last();
          if (lastNode != null) {
            System.out.println("The last Node is: " + lastNode.getData());
          }
          break;
        case 5:
          System.out.println("Enter data to add at the start: ");
          T dataToAddStart = (T) scanner.next(); // Cast to T
          doubleLinkedList.addFirst(dataToAddStart);
          break;
        case 6:
          System.out.println("Enter data to add at the end: ");
          T dataToAddEnd = (T) scanner.next(); // Cast to T
          doubleLinkedList.addLast(dataToAddEnd);
          break;
        case 7:
          doubleLinkedList.removeFirst();
          System.out.println("First Node removed");
          break;
        case 8:
          System.out.println("Printing DoubleLinkedList: " + doubleLinkedList.toString());
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
    System.out.println("I'm running DoubleLinkedListRunner");
    System.out.println("1. Get Size");
    System.out.println("2. Is Empty? ");
    System.out.println("3. Return first Node");
    System.out.println("4. Return last Node");
    System.out.println("5. Add Node at the start");
    System.out.println("6. Add Node at the end");
    System.out.println("7. Remove first Node");
    System.out.println("8. Print DoubleLinkedList");
    System.out.println("9. Exit");
    System.out.print("Choose an option: ");
  }
}
