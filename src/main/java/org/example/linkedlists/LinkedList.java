package org.example.linkedlists;

public class LinkedList<T> implements ILinkedList<T>{

  Node<T> head;

  @Override
  public int size() {
    if(isEmpty()){
      return 0;
    } else {
      int size = 1;
      Node<T> current = head;
      while(current.next != null){
        size++;
        current = current.next;
      }
      return size;
    }
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }

  @Override
  public Node<T> first() {
    if (isEmpty()) {
      return null;
    } else {
      return head;
    }
  }

  @Override
  public Node<T> last() {
    if (isEmpty()) {
      return null;
    } else {
      Node<T> current = head;
      while (current.next != null) {
        current = current.next;
      }
      return current;
    }
  }

  @Override
  public void addFirst(T data) {
    Node<T> newNode = new Node<T>(data);
    if (isEmpty()) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  @Override
  public void addLast(T data) {
    Node<T> newNode = new Node<T>(data);
    if (isEmpty()) {
      head = newNode;
    } else {
      Node<T> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  @Override
  public void removeFirst() {
    if (!isEmpty()) {
      head = head.next;
    }
  }
}
