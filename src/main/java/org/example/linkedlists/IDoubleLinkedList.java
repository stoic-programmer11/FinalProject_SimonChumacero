package org.example.linkedlists;

public interface IDoubleLinkedList<T> {
  // Return the number of elements in the list
  int size();
  // Return if the list is empty
  boolean isEmpty();

  /**
   * Return but do not remove the first element
   * @return
   */
  DoubleEdgeNode<T> first();
  /**
   * Return but do not remove the last element
   * @return
   */
  DoubleEdgeNode<T> last();
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
  /**
   * Remove the last node
   */
  void removeLast();
}
