package org.example.queues;

public interface IQueue<E> {
  // Add e element to the end of the Queue
  void enqueue(E e);

  // Remove and return the first element from the queue (or null if the queue is empty)
  E dequeue();

  // Return the first element of the queue, without removing it (or null if the queue is empty)
  E first();

  // Return true if the queue is empty, and false otherwise
  boolean isEmpty();

  // Return the number of elements in the queue
  int size();
}
