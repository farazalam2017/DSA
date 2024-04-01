/* Preorder build:- O(n)*/

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePreOrder {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static class BinaryTree {
      static int index=-1;

      public Node buildTree(int nodes[]) {
        index++;
        if (nodes[index] == -1) {
          return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
      }
      //PreOrder
      //traversal:- O(n)
      public void preOrder(Node root) {
        if (root == null) {
          // System.out.print("-1");//to print the traversal with -1 value as in node[]
          return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

      }
      //Inorder:- O(n)
      public void inorder(Node root) {
        if (root == null) {
          return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
      }
      //Postorder:- O(n)
      public void postOrder(Node root) {
        if (root == null) {
          return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
      }
      //level order :- O(n)
      public void levelOrder(Node root) {
        if (root == null) {
          return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
          Node currNode = q.remove();
          if (currNode == null) {
            System.out.println();
            if (q.isEmpty()) {
              break;
            } else {
              q.add(null);
            }
          } else {
            System.out.print(currNode.data + " ");
            if (currNode.left != null) {
              q.add(currNode.left);
            }
            if (currNode.right != null) {
              q.add(currNode.right);
            }
          }
        }
      }
    }
    public static void main(String[] args) {
      int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
      BinaryTree tree = new BinaryTree();
      Node root = tree.buildTree(nodes);
      System.out.println(root.data);
      tree.preOrder(root);
      System.out.println();
      tree.inorder(root);
      System.out.println();
      tree.postOrder(root);
      System.out.println();
      tree.levelOrder(root);
   }
}
