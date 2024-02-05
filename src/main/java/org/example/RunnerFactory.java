package org.example;

import org.example.NullRunner;
import org.example.interfaces.IRunner;
import org.example.linkedlists.DoubleLinkedListRunner;
import org.example.linkedlists.LinkedListRunner;

public class RunnerFactory {

  public static IRunner getRunner(int structureID) {
    switch (structureID) {
      case 1:
        return new LinkedListRunner();
      case 2:
        return new DoubleLinkedListRunner<>();
//      case "3":
//        return new StackRunner();
//      case "4":
//        return new QueueRunner();
//      case "5":
//        return new TreeRunner();
//      case "6":
//        return new GraphRunner();
      default:
        return new NullRunner();
    }
  }
}
