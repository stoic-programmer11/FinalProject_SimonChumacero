package org.example.linkedlists;

public class DoubleEdgeNode<T>{
  DoubleEdgeNode<T> prev;
  DoubleEdgeNode<T> next;
  T data;

  public DoubleEdgeNode(T data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}
