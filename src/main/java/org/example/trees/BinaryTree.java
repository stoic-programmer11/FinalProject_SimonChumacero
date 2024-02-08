package org.example.trees;

public class BinaryTree implements IBinaryTree {

  BTNode root;

  public BinaryTree() {
    this.root = null;
  }


  /**
   * Insert a new node with the given data into the tree
   * If the tree is empty, the new node becomes the root
   * If the tree is not empty, the new node is inserted in the appropriate position
   * left if the data is less than the root, right if the data is greater than the root
   * and so on until the new node is inserted
   *
   * @param data
   */
  private BTNode insert(BTNode root, int data) {
    if (root == null) {
      return new BTNode(data);
    }
    if (data < root.data) {
      root.left = insert(root.left, data);
    } else if (data > root.data) {
      root.right = insert(root.right, data);
    }
    return root;
  }

}





