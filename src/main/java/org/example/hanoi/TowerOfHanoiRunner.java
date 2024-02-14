package org.example.hanoi;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class TowerOfHanoiRunner implements IRunner {
  public void run() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of discs: ");
    int numDiscs = scanner.nextInt();
    scanner.close();

    TowerOfHanoi hanoi = new TowerOfHanoi(numDiscs);
    hanoi.solve();

  }
}
