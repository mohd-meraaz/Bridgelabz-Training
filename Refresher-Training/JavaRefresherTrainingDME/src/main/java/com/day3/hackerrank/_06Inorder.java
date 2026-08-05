package com.day3.hackerrank;


    import java.io.*;
import java.util.*;

    public class _06Inorder {

        static class Node {
            int data;
            Node left, right;

            Node(int data) {
                this.data = data;
            }
        }

        public static Node insert(Node root, int data) {
            if (root == null) {
                return new Node(data);
            }

            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }

            return root;
        }

        public static void inOrder(Node root) {
            if (root == null)
                return;

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            Node root = null;

            for (int i = 0; i < n; i++) {
                root = insert(root, sc.nextInt());
            }

            inOrder(root);

            sc.close();
        }
    }

