package com.d3.prac.geeks4geeks.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BTDeletion {

    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp) {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    public static Node deletionBT(Node root, int key) {
        Node nodeToBeSwapped = null;
        Node temp = null;

        temp = root;
        while(temp != null) {
            nodeToBeSwapped = temp;
            temp = temp.right;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if(temp.key == key){
                temp.key = nodeToBeSwapped.key;
                break;
            }

            if (temp.left.key == key) {
                temp.left.key = nodeToBeSwapped.key;
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right.key == key) {
                temp.right.key = nodeToBeSwapped.key;
                break;
            } else {
                q.add(temp.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);

        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print("Inorder traversal before deletion:");
        inorder(root);

        int key = 11;
        deletionBT(root, key);

        System.out.print("\nInorder traversal after deletion:");
        inorder(root);
    }
}
