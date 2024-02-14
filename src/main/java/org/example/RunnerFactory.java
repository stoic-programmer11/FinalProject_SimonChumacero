package org.example;

import org.example.NullRunner;
import org.example.dequeue.DequeueRunner;
import org.example.graphs.MyGraphRunner;
import org.example.interfaces.IRunner;
import org.example.linkedlists.DoubleLinkedListRunner;
import org.example.linkedlists.LinkedListRunner;
import org.example.queues.QueueRunner;
import org.example.stacks.StackRunner;
import org.example.trees.BinaryTreeRunner;

public class RunnerFactory {

  public static IRunner getRunner(int structureID) {
    switch (structureID) {
      case 1:
        return new LinkedListRunner();
      case 2:
        return new DoubleLinkedListRunner<>();
      case 3:
        return new StackRunner();
      case 4:
        return new QueueRunner();
      case 5:
        return new DequeueRunner<>();
      case 6:
        return new BinaryTreeRunner();
      case 7:
        return new MyGraphRunner();
      default:
        return new NullRunner();
    }
  }
}
