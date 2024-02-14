package org.example;

import org.example.NullRunner;
import org.example.dequeue.DequeueRunner;
import org.example.graphs.MyGraphRunner;
import org.example.hanoi.TowerOfHanoiRunner;
import org.example.interfaces.IRunner;
import org.example.linkedlists.DoubleLinkedListRunner;
import org.example.linkedlists.LinkedListRunner;
import org.example.queues.QueueRunner;
import org.example.sort.SelectionSortRunner;
import org.example.stacks.StackRunner;
import org.example.trees.BinaryTreeRunner;
import org.example.sort.BubbleSortRunner;

public class RunnerFactory {

  /**
   * This method is used to get the runner based on the structureID
   *
   * @param structureID the structureID to get the runner for
   * @return the runner for the structureID.
   */
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
      case 8:
        return new BubbleSortRunner();
      case 9:
        return new SelectionSortRunner();
      case 10:
        return new TowerOfHanoiRunner();
      default:
        return new NullRunner();
    }
  }
}
