package org.example.stacks;

import org.example.linkedlists.LinkedList;

import java.util.EmptyStackException;

public class Stack<E> implements IStack<E> {
  private LinkedList<E> stack;

  // Inicializa una pila utilizando una lista enlazada
  public Stack() {
    this.stack = new LinkedList<>();
  }

  // Agrega el elemento en la parte superior del stack
  @Override
  public void push(E e) {
    stack.addFirst(e);
  }

  // Captura el elemento en la parte superior de la pila
  // Elimina el elemento en la parte superior de la pila
  // Devuelve el elemento eliminado
  @Override
  public E pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    E deleted = stack.first().getData();
    stack.removeFirst();
    return deleted;
  }

  // Devuelve el elemento en la parte superior de la pila (al principio de la lista enlazada) sin eliminarlo
  @Override
  public E top() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return stack.first().getData();
  }

  // Verifica si la pila está vacía
  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  // Devuelve el tamaño de la pila (cantidad de elementos)
  @Override
  public int size() {
    return stack.size();
  }
}
