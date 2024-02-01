package org.example.linkedlists;

public class Node<T> {
  T data;
  Node next;

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node(T data) {
    this.data = data;
    this.next = null;
  }
}
