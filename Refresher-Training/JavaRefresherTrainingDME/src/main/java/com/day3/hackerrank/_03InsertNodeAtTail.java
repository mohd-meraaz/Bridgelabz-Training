package com.day3.hackerrank;

public class _03InsertNodeAtTail {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(head == null){
            return newNode;
        }
        SinglyLinkedListNode current = head;
        while (current.next != null){
            current =current.next;
        }
        current.next = newNode;
        return head;
    }

}
