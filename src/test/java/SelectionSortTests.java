import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.sort.SelectionSort;
import org.junit.jupiter.api.Test;

public class SelectionSortTests {

  @Test
  void testSelectionSort() {
    int[] arr = {5, 3, 8, 1, 2};
    int[] expected = {1, 2, 3, 5, 8};

    SelectionSort.sort(arr);

    assertArrayEquals(expected, arr);
  }
}
