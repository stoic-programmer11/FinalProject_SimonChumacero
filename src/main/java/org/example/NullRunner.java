package org.example;

import org.example.interfaces.IRunner;

public class NullRunner implements IRunner {

  /**
   * This method is used to run the NullManager.
   */
  @Override
  public void run() {
    System.out.println("I'm running NullManager.run");
    System.out.println("Wrong input or manager not implemented yet");

  }
}
