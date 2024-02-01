package org.example.stacks;


public interface IStack<E> {
  // Add e element to the top of the Stack
  void push(E e);

  // Remove and return the top element from the stack (or null if the stack is empty)
  E pop();

  // Return the top element of the stack, without removing it (or null if the stack is empty)
  E top();

  // Return true if the stack is empty, and false otherwise
  boolean isEmpty();

  // Return the number of elements in the stack
  int size();
}
