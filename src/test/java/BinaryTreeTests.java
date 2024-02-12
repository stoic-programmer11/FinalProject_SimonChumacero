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
}
