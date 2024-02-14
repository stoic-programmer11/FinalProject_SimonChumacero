import org.example.trees.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BinaryTreeTests {
  @Test
  public void testBinaryTreeInsert() {
    BinaryTree tree = new BinaryTree();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);


    assertEquals(7, tree.size());

  }


  @Test
  public void testBinaryTreeSearch() {
    BinaryTree tree = new BinaryTree();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);

    assertTrue(tree.search(5));
    assertTrue(tree.search(3));
    assertTrue(tree.search(7));
    assertTrue(tree.search(2));
    assertTrue(tree.search(4));
    assertTrue(tree.search(6));
    assertTrue(tree.search(8));
    assertFalse(tree.search(1));
    assertFalse(tree.search(9));
  }

  @Test
  public void testGetNode() {
    BinaryTree tree = new BinaryTree();
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);

    assertEquals(5, tree.getNode(5).data);
    assertEquals(3, tree.getNode(3).data);
    assertEquals(7, tree.getNode(7).data);
    assertEquals(2, tree.getNode(2).data);
    assertEquals(4, tree.getNode(4).data);
    assertEquals(6, tree.getNode(6).data);
    assertEquals(8, tree.getNode(8).data);
  }

  @Test
  public void testBinaryTreePreOrder() {
    BinaryTree tree = new BinaryTree(8);
    tree.insert(5);
    tree.insert(3);
    tree.insert(6);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(9);
    tree.insert(10);

    int[] expected = {8, 5, 3, 2, 4, 6, 7, 9, 10};
    assertArrayEquals(expected, tree.preOrder());
  }

  @Test
  public void testBinaryTreeInOrder() {
    BinaryTree tree = new BinaryTree(8);
    tree.insert(5);
    tree.insert(3);
    tree.insert(6);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(9);
    tree.insert(10);

    int[] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    assertArrayEquals(expected, tree.inOrder());
  }

  @Test
  public void testBinaryTreePostOrder() {
    BinaryTree tree = new BinaryTree(8);
    tree.insert(5);
    tree.insert(3);
    tree.insert(6);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(9);
    tree.insert(10);

    int[] expected = {2, 4, 3, 7, 6, 5, 10, 9, 8};
    assertArrayEquals(expected, tree.postOrder());
  }

  @Test
  public void testBinaryTreeDelete() {
    BinaryTree tree = new BinaryTree(8);
    tree.insert(5);
    tree.insert(3);
    tree.insert(6);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(9);
    tree.insert(10);

    tree.delete(5);
    assertFalse(tree.search(5));
    tree.delete(8);
    assertFalse(tree.search(8));
    tree.delete(9);
    assertFalse(tree.search(9));
    tree.delete(10);
    assertFalse(tree.search(10));
    tree.delete(3);
    assertFalse(tree.search(3));
    tree.delete(6);
    assertFalse(tree.search(6));
    tree.delete(7);
    assertFalse(tree.search(7));
    tree.delete(2);
    assertFalse(tree.search(2));
    tree.delete(4);
    assertFalse(tree.search(4));
  }
}
