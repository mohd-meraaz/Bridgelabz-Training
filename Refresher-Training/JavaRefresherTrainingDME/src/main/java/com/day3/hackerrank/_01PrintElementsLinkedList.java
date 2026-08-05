package com.day3.hackerrank;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}


public class _01PrintElementsLinkedList {
    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }


    }
}
