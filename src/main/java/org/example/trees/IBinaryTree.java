package org.example.trees;

import java.lang.reflect.Array;

public interface IBinaryTree {

  /**
   * Insert a new node with the given data into the tree
   *
   * @param data
   */
  void insert(int data);

  /**
   * Search for a node with the given data in the tree
   *
   * @param data
   * @return
   */
  boolean search(int data);

  /**
   * Return the root node of the tree
   *
   * @return
   */

  BTNode getRoot();

  /**
   * Return the node with the given data
   * @param data
   * @return
   */
  BTNode getNode(int data);

  /**
   * Delete the node with the given data from the tree
   *
   * @param data
   */
  void delete(int data);

  /**
   * Return the in-order traversal of the tree
   *
   * @return
   */
  int[] inOrder();

  /**
   * Return the pre-order traversal of the tree
   *
   * @return
   */
  int[] preOrder();

  /**
   * Return the post-order traversal of the tree
   *
   * @return
   */
  int[] postOrder();

  /**
   * Return the level-order traversal of the tree
   *
   * @return
   */
  int height();

  /**
   * Return the height of the tree
   *
   * @return
   */
  int size();
}
