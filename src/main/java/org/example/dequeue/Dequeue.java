package org.example.dequeue;

import org.example.linkedlists.DoubleLinkedList;
import org.example.linkedlists.DoubleEdgeNode;

public class Dequeue<E> implements IDequeue<E> {
  private DoubleLinkedList<E> deque;


  public Dequeue() {
    this.deque = new DoubleLinkedList<>();
  }

  /**
   * Add e element to the front of the Dequeue
   *
   * @param e
   */
  @Override
  public void addFirst(E e) {
    deque.addFirst(e);
  }

  /**
   * Add e element to the end of the Dequeue
   *
   * @param e
   */
  @Override
  public void addLast(E e) {
    deque.addLast(e);
  }

  /**
   * Remove and return the first element from the Dequeue (or null if the Dequeue is empty)
   *
   * @return E
   */
  @Override
  public E removeFirst() {
    DoubleEdgeNode<E> node = deque.first();
    if (node != null) {
      deque.removeFirst();
      return node.getData();
    }
    return null;
  }

  /**
   * Remove and return the last element from the Dequeue (or null if the Dequeue is empty)
   *
   * @return E
   */
  @Override
  public E removeLast() {
    DoubleEdgeNode<E> node = deque.last();
    if (node != null) {
      deque.removeLast();
      return node.getData();
    }
    return null;
  }

  /**
   * Return the first element of the Dequeue, without removing it (or null if the Dequeue is empty)
   *
   * @return E
   */
  @Override
  public E first() {
    DoubleEdgeNode<E> node = deque.first();
    if (node != null) {
      return node.getData();
    }
    return null;
  }

  /**
   * Return the last element of the Dequeue, without removing it (or null if the Dequeue is empty)
   *
   * @return E
   */
  @Override
  public E last() {
    DoubleEdgeNode<E> node = deque.last();
    if (node != null) {
      return node.getData();
    }
    return null;
  }

  /**
   * Return true if the Dequeue is empty, and false otherwise
   *
   * @return boolean
   */
  @Override
  public boolean isEmpty() {
    return deque.isEmpty();
  }

  /**
   * Return the number of elements in the Dequeue
   *
   * @return int
   */
  @Override
  public int size() {
    return deque.size();
  }

  /**
   * Print the elements of the Dequeue from front to end
   */
  public void printDeque() {
    System.out.print("Deque: [ ");
    DoubleEdgeNode<E> current = deque.first();
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
