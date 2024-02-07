package org.example.linkedlists;

public class Node<T> {
  T get;
  Node next;

  public T getData() {
    return get;
  }

  public void setData(T data) {
    this.get = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node(T data) {
    this.get = data;
    this.next = null;
  }
}
