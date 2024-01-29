package org.example;

import org.example.interfaces.IRunner;

public class NullRunner implements IRunner {

  @Override
  public void run() {
    System.out.println("I'm running NullManager.run");
    System.out.println("Wrong input or manager not implemented yet");

  }

  // public  void printMenu() {
  //   // Example
  //   System.out.println("Don't have a menu yet");

  // }
}
