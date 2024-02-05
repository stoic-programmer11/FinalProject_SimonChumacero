package org.example.stacks;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class StackRunner implements IRunner {
  private final Stack<String> stack;

  public StackRunner() {
    this.stack = new Stack<>();
  }

  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("The size of the Stack is: " + stack.size());
          break;
        case 2:
          System.out.println("The Stack is empty? " + stack.isEmpty());
          break;
        case 3:
          try {
            System.out.println("The top element is: " + stack.top());
          } catch (Exception e) {
            System.out.println("There is no top element");
          }
          break;
        case 4:
          try {
            System.out.println("Popped element: " + stack.pop());
          } catch (Exception e) {
            System.out.println("There is no top element to pop");
          }
          break;
        case 5:
          System.out.println("Enter data to push onto the Stack: ");
          String dataToPush = scanner.next();
          stack.push(dataToPush);
          break;
        case 6:
          stack.printStack();
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
    System.out.println("I'm running StackRunner");
    System.out.println("1. Get Size");
    System.out.println("2. Is Empty? ");
    System.out.println("3. Return top element");
    System.out.println("4. Pop element");
    System.out.println("5. Push element");
    System.out.println("6. Print Stack");
    System.out.println("7. Exit");
    System.out.print("Choose an option: ");
  }
}
