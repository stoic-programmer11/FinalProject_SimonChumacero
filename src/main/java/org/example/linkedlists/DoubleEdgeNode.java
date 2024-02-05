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

  public DoubleEdgeNode<T> getPrev() {
    return prev;
  }

  public void setPrev(DoubleEdgeNode<T> prev) {
    this.prev = prev;
  }

  public DoubleEdgeNode<T> getNext() {
    return next;
  }

  public void setNext(DoubleEdgeNode<T> next) {
    this.next = next;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
