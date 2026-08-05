package com.day3.hackerrank;

public class _04ReverseLL {
    class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = llist;
        SinglyLinkedListNode next = null;

        while (curr != null ){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next ;

        }
        return prev;

    }
}
