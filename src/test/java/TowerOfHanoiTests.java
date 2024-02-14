import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.hanoi.TowerOfHanoi;

public class TowerOfHanoiTests {
  private TowerOfHanoi towerOfHanoi;

  @BeforeEach
  void setUp() {
    // Initialize with 3 disks for testing
    towerOfHanoi = new TowerOfHanoi(3);
  }

  @Test
  void testTowerOfHanoiSolution() {
    towerOfHanoi.solve();

    // Verify tower A is empty
    assertEquals(0, towerOfHanoi.getTowerA().size());

    // Verify tower B is empty
    assertEquals(0, towerOfHanoi.getTowerB().size());

    // Verify tower C has 3 disks and they are ordered correctly
    assertEquals(3, towerOfHanoi.getTowerC().size());
    assertEquals(1, towerOfHanoi.getTowerC().pop());
    assertEquals(2, towerOfHanoi.getTowerC().pop());
    assertEquals(3, towerOfHanoi.getTowerC().pop());
  }
}
