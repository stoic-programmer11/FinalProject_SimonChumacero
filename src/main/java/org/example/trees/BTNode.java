package org.example.trees;

public class BTNode {
  public int data;
  public BTNode left;
  public BTNode right;

  public BTNode(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public boolean isLeafNode() {
    return this.left == null && this.right == null;
  }
}
