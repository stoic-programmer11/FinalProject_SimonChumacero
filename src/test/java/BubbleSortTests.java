import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.sort.BubbleSort;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {

  @Test
  void testBubbleSort() {
    int[] arr = {5, 3, 8, 1, 2};
    int[] expected = {1, 2, 3, 5, 8};

    BubbleSort.sort(arr);

    assertArrayEquals(expected, arr);
  }
}
