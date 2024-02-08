package org.example.dequeue;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class DequeueRunner<E> implements IRunner {
  private final Dequeue<E> dequeue;

  public DequeueRunner() {
    this.dequeue = new Dequeue<>();
  }

  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("The size of the Dequeue is: " + dequeue.size());
          break;
        case 2:
          System.out.println("The Dequeue is empty? " + dequeue.isEmpty());
          break;
        case 3:
          if (dequeue.first() != null) {
            System.out.println("The first element is: " + dequeue.first());
          } else {
            System.out.println("There is no first element");
          }
          break;
        case 4:
          if (dequeue.last() != null) {
            System.out.println("The last element is: " + dequeue.last());
          } else {
            System.out.println("There is no last element");
          }
          break;
        case 5:
          System.out.println("Enter data to add to the front of the Dequeue: ");
          E dataToAddFront = (E) scanner.next();
          dequeue.addFirst(dataToAddFront);
          break;
        case 6:
          System.out.println("Enter data to add to the end of the Dequeue: ");
          E dataToAddEnd = (E) scanner.next();
          dequeue.addLast(dataToAddEnd);
          break;
        case 7:
          try {
            System.out.println("Removed first element: " + dequeue.removeFirst());
          } catch (Exception e) {
            System.out.println("There is no first element to remove");
          }
          break;
        case 8:
          try {
            System.out.println("Removed last element: " + dequeue.removeLast());
          } catch (Exception e) {
            System.out.println("There is no last element to remove");
          }
          break;
        case 9:
          dequeue.printDeque();
          break;
        case 10:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid option");
      }
    }
  }

  private void printMenu() {
    System.out.println("I'm running DequeueRunner");
    System.out.println("1. Get Size");
    System.out.println("2. Is Empty? ");
    System.out.println("3. Return first element");
    System.out.println("4. Return last element");
    System.out.println("5. Add to the front");
    System.out.println("6. Add to the end");
    System.out.println("7. Remove from the front");
    System.out.println("8. Remove from the end");
    System.out.println("9. Print Dequeue");
    System.out.println("10. Exit");
    System.out.print("Choose an option: ");
  }
}
