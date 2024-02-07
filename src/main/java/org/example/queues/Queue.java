package org.example.queues;

import org.example.linkedlists.LinkedList;
import org.example.linkedlists.Node;

import java.util.EmptyStackException;

public class Queue<E> implements IQueue<E> {
  private LinkedList<E> queue;

  // Inicializa una cola utilizando una lista enlazada
  public Queue() {
    this.queue = new LinkedList<>();
  }

  // Agrega el elemento al final de la cola
  @Override
  public void enqueue(E e) {
    queue.addLast(e);
  }

  // Elimina y devuelve el primer elemento de la cola
  @Override
  public E dequeue() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    E deleted = queue.first().getData();
    queue.removeFirst();
    return deleted;
  }

  // Devuelve el primer elemento de la cola sin eliminarlo
  @Override
  public E first() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return queue.first().getData();
  }

  // Verifica si la cola está vacía
  @Override
  public boolean isEmpty() {
    return queue.isEmpty();
  }

  // Devuelve el tamaño de la cola (cantidad de elementos)
  @Override
  public int size() {
    return queue.size();
  }

  // Imprime la cola
  public void printQueue() {
    System.out.print("[ ");
    Node<E> current = queue.first();
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
