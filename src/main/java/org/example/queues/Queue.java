package org.example.queues;

import org.example.linkedlists.LinkedList;
import org.example.linkedlists.Node;

import java.util.EmptyStackException;

public class Queue<E> implements IQueue<E> {
  private LinkedList<E> queue;

  // Initializes a queue using a linked list
  public Queue() {
    this.queue = new LinkedList<>();
  }

  // Adds the element to the end of the queue
  @Override
  public void enqueue(E e) {
    queue.addLast(e);
  }

  // Removes and returns the first element of the queue
  @Override
  public E dequeue() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    E deleted = queue.first().getData();
    queue.removeFirst();
    return deleted;
  }

  // Returns the first element of the queue without removing it
  @Override
  public E first() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return queue.first().getData();
  }

  // Checks if the queue is empty
  @Override
  public boolean isEmpty() {
    return queue.isEmpty();
  }

  // Returns the size of the queue (number of elements)
  @Override
  public int size() {
    return queue.size();
  }

  // Prints the queue
  public void printQueue() {
    System.out.print("[ ");
    Node<E> current = queue.first();
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
