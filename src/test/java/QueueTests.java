import static org.junit.jupiter.api.Assertions.*;

import org.example.queues.IQueue;
import org.example.queues.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTests {
  private IQueue<String> stringQueue;
  private IQueue<Integer> integerQueue;

  @BeforeEach
  void setUp() {
    stringQueue = new Queue<>();
    integerQueue = new Queue<>();
  }

  @Test
  void testStringQueueEnqueueAndDequeue() {
    stringQueue.enqueue("universidad");
    stringQueue.enqueue("usfx");
    assertEquals("universidad", stringQueue.dequeue());
    assertEquals("usfx", stringQueue.dequeue());
  }

  @Test
  void testStringQueueFirst() {
    stringQueue.enqueue("universidad");
    stringQueue.enqueue("usfx");
    assertEquals("universidad", stringQueue.first());
  }

  @Test
  void testStringQueueSize() {
    assertEquals(0, stringQueue.size());
    stringQueue.enqueue("universidad");
    assertEquals(1, stringQueue.size());
    stringQueue.enqueue("usfx");
    assertEquals(2, stringQueue.size());
    stringQueue.dequeue();
    assertEquals(1, stringQueue.size());
  }

  @Test
  void testStringQueueIsEmpty() {
    assertTrue(stringQueue.isEmpty());
    stringQueue.enqueue("universidad");
    assertFalse(stringQueue.isEmpty());
    stringQueue.dequeue();
    assertTrue(stringQueue.isEmpty());
  }

  @Test
  void testIntegerQueueEnqueueAndDequeue() {
    integerQueue.enqueue(5);
    integerQueue.enqueue(10);
    assertEquals(5, integerQueue.dequeue());
    assertEquals(10, integerQueue.dequeue());
  }

  @Test
  void testIntegerQueueFirst() {
    integerQueue.enqueue(5);
    integerQueue.enqueue(10);
    assertEquals(5, integerQueue.first());
  }

  @Test
  void testIntegerQueueSize() {
    assertEquals(0, integerQueue.size());
    integerQueue.enqueue(5);
    assertEquals(1, integerQueue.size());
    integerQueue.enqueue(10);
    assertEquals(2, integerQueue.size());
    integerQueue.dequeue();
    assertEquals(1, integerQueue.size());
  }

  @Test
  void testIntegerQueueIsEmpty() {
    assertTrue(integerQueue.isEmpty());
    integerQueue.enqueue(5);
    assertFalse(integerQueue.isEmpty());
    integerQueue.dequeue();
    assertTrue(integerQueue.isEmpty());
  }
}
