import static org.junit.jupiter.api.Assertions.*;

import org.example.stacks.IStack;
import org.example.stacks.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTests {
  private IStack<String> stringStack;
  private IStack<Integer> integerStack;

  @BeforeEach
  void setUp() {
    stringStack = new Stack<>();
    integerStack = new Stack<>();
  }

  @Test
  void testStringStackPushAndPop() {
    stringStack.push("universidad");
    stringStack.push("usfx");
    assertEquals("usfx", stringStack.pop());
    assertEquals("universidad", stringStack.pop());
  }

  @Test
  void testStringStackTop() {
    stringStack.push("universidad");
    stringStack.push("usfx");
    assertEquals("usfx", stringStack.top());
  }

  @Test
  void testStringStackSize() {
    assertEquals(0, stringStack.size());
    stringStack.push("universidad");
    assertEquals(1, stringStack.size());
    stringStack.push("usfx");
    assertEquals(2, stringStack.size());
    stringStack.pop();
    assertEquals(1, stringStack.size());
  }

  @Test
  void testStringStackIsEmpty() {
    assertTrue(stringStack.isEmpty());
    stringStack.push("universidad");
    assertFalse(stringStack.isEmpty());
    stringStack.pop();
    assertTrue(stringStack.isEmpty());
  }

  @Test
  void testIntegerStackPushAndPop() {
    integerStack.push(5);
    integerStack.push(10);
    assertEquals(10, integerStack.pop());
    assertEquals(5, integerStack.pop());
  }

  @Test
  void testIntegerStackTop() {
    integerStack.push(5);
    integerStack.push(10);
    assertEquals(10, integerStack.top());
  }

  @Test
  void testIntegerStackSize() {
    assertEquals(0, integerStack.size());
    integerStack.push(5);
    assertEquals(1, integerStack.size());
    integerStack.push(10);
    assertEquals(2, integerStack.size());
    integerStack.pop();
    assertEquals(1, integerStack.size());
  }

  @Test
  void testIntegerStackIsEmpty() {
    assertTrue(integerStack.isEmpty());
    integerStack.push(5);
    assertFalse(integerStack.isEmpty());
    integerStack.pop();
    assertTrue(integerStack.isEmpty());
  }
}
