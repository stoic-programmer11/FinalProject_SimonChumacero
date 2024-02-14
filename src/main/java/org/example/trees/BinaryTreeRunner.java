package org.example.trees;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class BinaryTreeRunner implements IRunner {
  private final BinaryTree binaryTree;

  public BinaryTreeRunner() {
    this.binaryTree = new BinaryTree();
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMenu();
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("Enter data to insert into the tree: ");
          int dataToInsert = scanner.nextInt();
          binaryTree.insert(dataToInsert);
          break;
        case 2:
          System.out.println("Enter data to search in the tree: ");
          int dataToSearch = scanner.nextInt();
          boolean isFound = binaryTree.search(dataToSearch);
          if (isFound) {
            System.out.println("Data " + dataToSearch + " is found in the tree");
          } else {
            System.out.println("Data " + dataToSearch + " is not found in the tree");
          }
          break;
        case 3:
          System.out.println("Enter data to delete from the tree: ");
          int dataToDelete = scanner.nextInt();
          binaryTree.delete(dataToDelete);
          break;
        case 4:
          System.out.println("preOrder:");
          binaryTree.printPreOrder();
          System.out.println();
          break;
        case 5:
          System.out.println("inOrder:");
          binaryTree.printInOrder();
          System.out.println();
          break;
        case 6:
          System.out.println("postOrder:");
          binaryTree.printPostOrder();
          System.out.println();
          break;
        case 7:
          System.out.println("Height of the tree: " + binaryTree.height());
          break;
        case 8:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid option");
      }
    }
  }

  private void printMenu() {
    System.out.println("I'm running BinaryTreeRunner");
    System.out.println("1. Insert");
    System.out.println("2. Search");
    System.out.println("3. Delete");
    System.out.println("4. Print preOrder");
    System.out.println("5. Print inOrder");
    System.out.println("6. Print postOrder");
    System.out.println("7. Get Height");
    System.out.println("8. Exit");
    System.out.print("Choose an option: ");
  }

  public static void main(String[] args) {
    BinaryTreeRunner binaryTreeRunner = new BinaryTreeRunner();
    binaryTreeRunner.run();
  }
}
