import static org.junit.jupiter.api.Assertions.*;

import org.example.linkedlists.ILinkedList;
import org.example.linkedlists.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListsTests {
  private ILinkedList<String> stringList;
  private ILinkedList<Integer> integerList;

  // @BeforeEach is an annotation that defines the method that will be run before each test
  @BeforeEach
  void setUp() {
    stringList = new LinkedList<>();
    integerList = new LinkedList<>();
  }

  // Test methods for String type
  @Test
  void testStringListSize() {
    assertEquals(0, stringList.size());
    stringList.addFirst("universidad");
    assertEquals(1, stringList.size());
    stringList.addLast("usfx");
    assertEquals(2, stringList.size());
    stringList.removeFirst();
    assertEquals(1, stringList.size());
  }

  @Test
  void testStringListIsEmpty() {
    assertTrue(stringList.isEmpty());
    stringList.addFirst("universidad");
    assertFalse(stringList.isEmpty());
    stringList.removeFirst();
    assertTrue(stringList.isEmpty());
  }

  @Test
  void testStringListFirst() {
    assertNull(stringList.first());
    stringList.addFirst("universidad");
    assertEquals("universidad", stringList.first().getData());
    stringList.addLast("usfx");
    assertEquals("universidad", stringList.first().getData());
    stringList.removeFirst();
    assertEquals("usfx", stringList.first().getData());
  }

  @Test
  void testStringListLast() {
    assertNull(stringList.last());
    stringList.addFirst("universidad");
    assertEquals("universidad", stringList.last().getData());
    stringList.addLast("usfx");
    assertEquals("usfx", stringList.last().getData());
    stringList.addLast("!");
    assertEquals("!", stringList.last().getData());
  }

  // Test methods for Integer type
  @Test
  void testIntegerListSize() {
    assertEquals(0, integerList.size());
    integerList.addFirst(5);
    assertEquals(1, integerList.size());
    integerList.addLast(10);
    assertEquals(2, integerList.size());
    integerList.removeFirst();
    assertEquals(1, integerList.size());
  }

  @Test
  void testIntegerListIsEmpty() {
    assertTrue(integerList.isEmpty());
    integerList.addFirst(5);
    assertFalse(integerList.isEmpty());
    integerList.removeFirst();
    assertTrue(integerList.isEmpty());
  }

  @Test
  void testIntegerListFirst() {
    assertNull(integerList.first());
    integerList.addFirst(5);
    assertEquals(5, integerList.first().getData());
    integerList.addLast(10);
    assertEquals(5, integerList.first().getData());
    integerList.removeFirst();
    assertEquals(10, integerList.first().getData());
  }

  @Test
  void testIntegerListLast() {
    assertNull(integerList.last());
    integerList.addFirst(5);
    assertEquals(5, integerList.last().getData());
    integerList.addLast(10);
    assertEquals(10, integerList.last().getData());
    integerList.addLast(15);
    assertEquals(15, integerList.last().getData());
  }

  @Test
  void testAddFirstAndAddLast() {
    // Adding to String list
    stringList.addFirst("universidad");
    stringList.addLast("usfx");
    assertEquals("universidad", stringList.first().getData());
    assertEquals("usfx", stringList.last().getData());

    // Adding to Integer list
    integerList.addFirst(5);
    integerList.addLast(10);
    assertEquals(5, integerList.first().getData());
    assertEquals(10, integerList.last().getData());
  }

  @Test
  void testRemoveFirst() {
    // Testing removeFirst on String list
    stringList.addFirst("universidad");
    stringList.addLast("usfx");
    stringList.removeFirst();
    assertEquals("usfx", stringList.first().getData());
    stringList.removeFirst();
    assertNull(stringList.first());

    // Testing removeFirst on Integer list
    integerList.addFirst(5);
    integerList.addLast(10);
    integerList.removeFirst();
    assertEquals(10, integerList.first().getData());
    integerList.removeFirst();
    assertNull(integerList.first());
  }
}
