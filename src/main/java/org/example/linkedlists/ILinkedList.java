package org.example.linkedlists;


public interface ILinkedList<T> {

  int size();

  boolean isEmpty();

  /**
   * Return but do not remove the first element
   * @return
   */
  Node<T> first();
  /**
   * Return but do not remove the last element
   * @return
   */
  Node<T> last();

  /**
   * Add a new node with data at the start of the list
   * @param data
   */
  void addFirst(T data);

  /**
   * Add a new node with data at the end of the list
   * @param data
   */
  void addLast(T data);

  /**
   * Remove the first node
   */
  void removeFirst();
}
