package org.example.linkedlists;

import org.example.interfaces.IRunner;

public class DoubleLinkedListRunner<T> implements IRunner {

  private final DoubleLinkedList<T> doubleLinkedList;

  public DoubleLinkedListRunner(){
    this.doubleLinkedList = new DoubleLinkedList<>();
  }

  @Override
  public void run() {
    System.out.println("I'm running DoubleLinkedListRunner");

  }
}
