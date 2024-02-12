package org.example.trees;

public class BinaryTree implements IBinaryTree {

  BTNode root;

  public BinaryTree() {
    this.root = null;
  }

  public BinaryTree(int data) {
    this.root = new BTNode(data);
  }


  // ok
  @Override
  public void insert(int data) {
    root = insert(root, data);
  }

  @Override
  public boolean search(int data) {
    return search(root, data);
  }

  @Override
  public BTNode getRoot() {
    return root;
  }

  @Override
  public BTNode getNode(int data) {
    return getNode(root, data);
  }

  @Override
  public void delete(int data) {

  }

  @Override
  public int[] inOrder() {
    return new int[0];
  }

  @Override
  public int[] preOrder() {
    return new int[0];
  }

  @Override
  public int[] postOrder() {
    return new int[0];
  }

  @Override
  public int height() {
    return height(root);
  }


  // ok
  @Override
  public int size() {
    return size(root);
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
  private static BTNode insert(BTNode root, int data) {
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


  /**
   * Search for a node with the given data in the tree
   *
   * @param data
   * @return
   */
  private static boolean search(BTNode root, int data) {
    if (root == null) {
      return false;
    }

    if (root.data == data) {
      return true;
    }

    if (data < root.data) {
      return search(root.left, data);
    }

    return search(root.right, data);
  }

  private static BTNode getNode(BTNode root, int data) {
    if (root == null) {
      return null;
    }

    if (root.data == data) {
      return root;
    }

    if (data < root.data) {
      return getNode(root.left, data);
    }

    return getNode(root.right, data);
  }

  /**
   * Return the size of the tree
   * The size of the tree is the number of nodes in the tree
   *
   * @return
   */
  private static int size(BTNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + size(root.left) + size(root.right);
  }


  public void printPreOrder() {
    var preOrder = preOrder();
    for (int i : preOrder) {
      System.out.print(i + " ");
    }
  }

  public void printInOrder() {
    var inOrder = inOrder();
    for (int i : inOrder) {
      System.out.print(i + " ");
    }
  }

  public void printPostOrder() {
    var postOrder = postOrder();
    for (int i : postOrder) {
      System.out.print(i + " ");
    }
  }

  private static int height(BTNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(height(root.left), height(root.right));
  }
}