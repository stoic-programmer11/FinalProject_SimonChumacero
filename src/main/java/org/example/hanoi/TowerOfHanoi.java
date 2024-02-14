package org.example.hanoi;

import org.example.dequeue.IDequeue;
import org.example.stacks.Stack;

public class TowerOfHanoi {
  private Stack<Integer> towerA;
  private Stack<Integer> towerB;
  private Stack<Integer> towerC;

  public TowerOfHanoi(int numDiscs) {
    towerA = new Stack<>();
    towerB = new Stack<>();
    towerC = new Stack<>();

    for (int i = numDiscs; i >= 1; i--) {
      towerA.push(i);
    }
  }

  // This method is used to solve the Tower of Hanoi problem
  private void solveHanoi(int numDiscs, Stack<Integer> source, Stack<Integer> destination, Stack<Integer> auxiliary,
                          char sourceTower, char destinationTower, char auxiliaryTower) {
    if (numDiscs == 1) {
      moveDisk(source, destination, sourceTower, destinationTower);
    } else {
      solveHanoi(numDiscs - 1, source, auxiliary, destination, sourceTower, auxiliaryTower, destinationTower);
      moveDisk(source, destination, sourceTower, destinationTower);
      solveHanoi(numDiscs - 1, auxiliary, destination, source, auxiliaryTower, destinationTower, sourceTower);
    }
  }

  // This method is used to move the disk from one tower to another
  private void moveDisk(Stack<Integer> source, Stack<Integer> destination, char sourceTower, char destinationTower) {
    int disk = source.pop();
    destination.push(disk);
    System.out.println("Moviendo disco " + disk + " de la torre " + sourceTower + " a la torre " + destinationTower);
  }

  public void solve() {
    solveHanoi(towerA.size(), towerA, towerC, towerB, 'A', 'C', 'B');
  }

  public Stack<Integer> getTowerA() {
    return towerA;
  }

  public Stack<Integer> getTowerB() {
    return towerB;
  }

  public Stack<Integer> getTowerC() {
    return towerC;
  }

}
