package org.example.linkedlists;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T>{
  private DoubleEdgeNode<T> head;
  private DoubleEdgeNode<T> tail;

  public DoubleLinkedList() {
    DoubleEdgeNode<T> head = new DoubleEdgeNode<>(null);
    DoubleEdgeNode<T> tail = new DoubleEdgeNode<>(null);
    head.next = tail;
    tail.prev = head;

    this.head = head;
    this.tail = tail;
  }


  @Override
  public int size() {
    if (isEmpty()) {
      return 0;
    }
    int size = 0;
    DoubleEdgeNode<T> current = (DoubleEdgeNode<T>) head.next;
    while (current != tail) {
      size++;
      current = (DoubleEdgeNode<T>) current.next;
    }
    return size;
  }

  @Override
  public boolean isEmpty() {
    return head.next == tail;
  }

  @Override
  public DoubleEdgeNode<T> first() {
    // return but do not remove the first element
    if (isEmpty()) {
      return null;
    }
    return (DoubleEdgeNode<T>) head.next;
  }

  @Override
  public DoubleEdgeNode<T> last() {
    // return but do not remove the last element
    if (isEmpty()) {
      return null;
    }
    return (DoubleEdgeNode<T>) tail.prev;
  }


  @Override
  public void addFirst(T data) {
    // add a new node with data to the front of the list
    DoubleEdgeNode<T> newNode = new DoubleEdgeNode<>(data);
    newNode.next = head.next;
    newNode.prev = head;
    head.next.prev = newNode;
    head.next = newNode;
  }

  @Override
  public void addLast(T data) {
    // add a new node with data to the end of the list
    DoubleEdgeNode<T> newNode = new DoubleEdgeNode<>(data);
    newNode.next = tail;
    newNode.prev = tail.prev;
    tail.prev.next = newNode;
    tail.prev = newNode;
  }

  @Override
  public void removeFirst() {
    // remove the first node from the list
    if (isEmpty()) {
      return;
    }
    head.next = head.next.next;
    head.next.prev = head;
  }

  @Override
  public void removeLast() {
    // remove the last node from the list
    if (isEmpty()) {
      return;
    }
    tail.prev = tail.prev.prev;
    tail.prev.next = tail;
  }

  @Override
  public String toString() {
    if (isEmpty()) {
      return "DoubleLinkedList is empty";
    }

    StringBuilder sb = new StringBuilder();
    sb.append("[ ");
    DoubleEdgeNode<T> current = head.next;
    while (current != tail) {
      sb.append(current.getData());
      if (current.next != tail) {
        sb.append(", ");
      }
      current = current.next;
    }
    sb.append(" ]");
    return sb.toString();
  }
}


