package org.example.trees;

public class BinaryTree implements IBinaryTree {

  BTNode root;

  public BinaryTree() {
    this.root = null;
  }

  public BinaryTree(int data) {
    this.root = new BTNode(data);
  }


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
    root = delete(root, data);
  }

  @Override
  public int[] inOrder() {
    int[] result = new int[size()];
    inOrder(root, result, 0);
    return result;
  }

  @Override
  public int[] preOrder() {
    int[] result = new int[size()];
    preOrder(root, result, 0);
    return result;
  }

  @Override
  public int[] postOrder() {
    int[] result = new int[size()];
    postOrder(root, result, 0);
    return result;
  }

  @Override
  public int height() {
    return height(root);
  }


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

  /**
   * Return the pre-order of the tree
   *
   * @return
   */
  private static int preOrder(BTNode root, int[] result, int index) {
    if (root == null) {
      return index;
    }
    result[index++] = root.data;
    index = preOrder(root.left, result, index);
    index = preOrder(root.right, result, index);
    return index;

  }


  /**
   * Return the in-order of the tree
   *
   * @return
   */
  private static int inOrder(BTNode root, int[] result, int index) {
    if (root == null) {
      return index;
    }
    index = inOrder(root.left, result, index);
    result[index++] = root.data;
    index = inOrder(root.right, result, index);
    return index;
  }


  /**
   * Return the post-order of the tree
   *
   * @return
   */
  private static int postOrder(BTNode root, int[] result, int index) {
    if (root == null) {
      return index;
    }
    index = postOrder(root.left, result, index);
    index = postOrder(root.right, result, index);
    result[index++] = root.data;
    return index;
  }

  /**
   * Delete a node with the given data from the tree
   *
   * @param data
   */
  private BTNode delete(BTNode root, int data) {
    if (root == null) {
      return root;
    }

    // Search for the node to delete
    if (data < root.data) {
      root.left = delete(root.left, data);
    } else if (data > root.data) {
      root.right = delete(root.right, data);
    } else {
      // Node found, perform deletion
      // Case 1: The node to delete is a leaf node (has no children)
      if (root.left == null && root.right == null) {
        return null;
      }
      // Case 2: The node to delete has only one child
      else if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }
      // Case 3: The node to delete has two children
      else {
        // Find the inorder successor (the smallest node in the right subtree)
        root.data = minValue(root.right);
        // Delete the inorder successor from the right subtree
        root.right = delete(root.right, root.data);
      }
    }
    return root;
  }

  /**
   * Return the minimum value in the tree
   */
  private int minValue(BTNode node) {
    int minValue = node.data;
    while (node.left != null) {
      minValue = node.left.data;
      node = node.left;
    }
    return minValue;
  }

}