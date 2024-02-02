package org.example;


import org.example.stacks.Stack;


public class TowerOfHanoi {
  private Stack<Integer> towerA;
  private Stack<Integer> towerB;
  private Stack<Integer> towerC;

  // Inicializamos las tres torres
  public TowerOfHanoi(int numDiscs) {
    towerA = new Stack<>();
    towerB = new Stack<>();
    towerC = new Stack<>();

    // Coloca los discos en la torre A
    for (int i = numDiscs; i >= 1; i--) {
      towerA.push(i);
    }
  }


  // Método recursivo para resolver el problema de las Torres de Hanoi
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

  // Método auxiliar para realizar el movimiento de un disco entre dos torres e imprimir el movimiento
  private void moveDisk(Stack<Integer> source, Stack<Integer> destination, char sourceTower, char destinationTower) {
    int disk = source.pop();
    destination.push(disk);
    System.out.println("Moviendo disco " + disk + " de la torre " + sourceTower + " a la torre " + destinationTower);
  }



  // Método para iniciar la solución del problema de las Torres de Hanoi
  public void solve() {
    solveHanoi(towerA.size(), towerA, towerC, towerB, 'A', 'C', 'B');
  }

  public static void main(String[] args) {
    int numDiscs = 3;
    TowerOfHanoi hanoi = new TowerOfHanoi(numDiscs);
    hanoi.solve();
  }
}