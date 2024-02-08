package org.example.dequeue;

public interface IDequeue<E> {
  // Add e element to the front of the Dequeue
  void addFirst(E e);

  // Add e element to the end of the Dequeue
  void addLast(E e);

  /**
   * Remove and return the first element from the Dequeue (or null if the Dequeue is empty)
   * @return E
   */
  E removeFirst();

  /**
   * Remove and return the last element from the Dequeue (or null if the Dequeue is empty)
   * @return E
   */
  E removeLast();

  /**
   * Return the first element of the Dequeue, without removing it (or null if the Dequeue is empty)
   * @return E
   */
  E first();

  /**
   * Return the last element of the Dequeue, without removing it (or null if the Dequeue is empty)
   * @return E
   */
  E last();

  /**
   * Return true if the Dequeue is empty, and false otherwise
   * @return boolean
   */
  boolean isEmpty();

  /**
   * Return the number of elements in the Dequeue
   * @return int
   */
  int size();
}
