import org.example.dequeue.Dequeue;
import org.example.dequeue.IDequeue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DequeueTests {
  private IDequeue<String> stringDequeue;
  private IDequeue<Integer> integerDequeue;

  @BeforeEach
  void setUp() {
    stringDequeue = new Dequeue<>();
    integerDequeue = new Dequeue<>();
  }

  @Test
  void testStringDequeueAddFirstAndRemoveFirst() {
    stringDequeue.addFirst("universidad");
    stringDequeue.addFirst("usfx");
    assertEquals("usfx", stringDequeue.removeFirst());
    assertEquals("universidad", stringDequeue.removeFirst());
  }

  @Test
  void testStringDequeueAddLastAndRemoveLast() {
    stringDequeue.addLast("universidad");
    stringDequeue.addLast("usfx");
    assertEquals("usfx", stringDequeue.removeLast());
    assertEquals("universidad", stringDequeue.removeLast());
  }

  @Test
  void testStringDequeueFirstAndLast() {
    stringDequeue.addFirst("universidad");
    stringDequeue.addLast("usfx");
    assertEquals("universidad", stringDequeue.first());
    assertEquals("usfx", stringDequeue.last());
  }

  @Test
  void testStringDequeueSize() {
    assertEquals(0, stringDequeue.size());
    stringDequeue.addFirst("universidad");
    assertEquals(1, stringDequeue.size());
    stringDequeue.addLast("usfx");
    assertEquals(2, stringDequeue.size());
    stringDequeue.removeFirst();
    assertEquals(1, stringDequeue.size());
  }

  @Test
  void testStringDequeueIsEmpty() {
    assertTrue(stringDequeue.isEmpty());
    stringDequeue.addFirst("universidad");
    assertFalse(stringDequeue.isEmpty());
    stringDequeue.removeFirst();
    assertTrue(stringDequeue.isEmpty());
  }

  @Test
  void testIntegerDequeueAddFirstAndRemoveFirst() {
    integerDequeue.addFirst(5);
    integerDequeue.addFirst(10);
    assertEquals(10, integerDequeue.removeFirst());
    assertEquals(5, integerDequeue.removeFirst());
  }

  @Test
  void testIntegerDequeueAddLastAndRemoveLast() {
    integerDequeue.addLast(5);
    integerDequeue.addLast(10);
    assertEquals(10, integerDequeue.removeLast());
    assertEquals(5, integerDequeue.removeLast());
  }

  @Test
  void testIntegerDequeueFirstAndLast() {
    integerDequeue.addFirst(5);
    integerDequeue.addLast(10);
    assertEquals(5, integerDequeue.first());
    assertEquals(10, integerDequeue.last());
  }

  @Test
  void testIntegerDequeueSize() {
    assertEquals(0, integerDequeue.size());
    integerDequeue.addFirst(5);
    assertEquals(1, integerDequeue.size());
    integerDequeue.addLast(10);
    assertEquals(2, integerDequeue.size());
    integerDequeue.removeFirst();
    assertEquals(1, integerDequeue.size());
  }

  @Test
  void testIntegerDequeueIsEmpty() {
    assertTrue(integerDequeue.isEmpty());
    integerDequeue.addFirst(5);
    assertFalse(integerDequeue.isEmpty());
    integerDequeue.removeFirst();
    assertTrue(integerDequeue.isEmpty());
  }
}
