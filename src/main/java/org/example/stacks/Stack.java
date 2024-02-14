package org.example.stacks;

import org.example.linkedlists.LinkedList;
import org.example.linkedlists.Node;

import java.util.EmptyStackException;

public class Stack<E> implements IStack<E> {
  private LinkedList<E> stack;

  // Initializes a stack using a linked list
  public Stack() {
    this.stack = new LinkedList<>();
  }

  // Adds the element to the top of the stack
  @Override
  public void push(E e) {
    stack.addFirst(e);
  }

  // Retrieves the element at the top of the stack
  // Removes the element at the top of the stack
  // Returns the removed element
  @Override
  public E pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    E deleted = stack.first().getData();
    stack.removeFirst();
    return deleted;
  }

  // Returns the element at the top of the stack (beginning of the linked list) without removing it
  @Override
  public E top() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return stack.first().getData();
  }

  // Checks if the stack is empty
  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  // Returns the size of the stack (number of elements)
  @Override
  public int size() {
    return stack.size();
  }

  // Print the stack
  public void printStack() {
    System.out.print("[ ");
    Node<E> current = stack.first();
    while (current != null) {
      System.out.print(current.getData());
      current = current.getNext();
      if (current != null) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }
}
