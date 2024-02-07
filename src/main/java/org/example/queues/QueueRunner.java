package org.example.queues;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class QueueRunner<E> implements IRunner {
  private final Queue<E> queue;

  public QueueRunner() {
    this.queue = new Queue<>();
  }

  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("The size of the Queue is: " + queue.size());
          break;
        case 2:
          System.out.println("The Queue is empty? " + queue.isEmpty());
          break;
        case 3:
          try {
            System.out.println("The first element is: " + queue.first());
          } catch (Exception e) {
            System.out.println("There is no first element");
          }
          break;
        case 4:
          try {
            System.out.println("Dequeued element: " + queue.dequeue());
          } catch (Exception e) {
            System.out.println("There is no element to dequeue");
          }
          break;
        case 5:
          System.out.println("Enter data to enqueue into the Queue: ");
          E dataToEnqueue = (E) scanner.next(); // Casting necesario para convertir a E
          queue.enqueue(dataToEnqueue);
          break;
        case 6:
          queue.printQueue();
          break;
        case 7:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid option");
      }
    }
  }

  private void printMenu() {
    System.out.println("I'm running QueueRunner");
    System.out.println("1. Get Size");
    System.out.println("2. Is Empty? ");
    System.out.println("3. Return first element");
    System.out.println("4. Dequeue element");
    System.out.println("5. Enqueue element");
    System.out.println("6. Print Queue");
    System.out.println("7. Exit");
    System.out.print("Choose an option: ");
  }
}
