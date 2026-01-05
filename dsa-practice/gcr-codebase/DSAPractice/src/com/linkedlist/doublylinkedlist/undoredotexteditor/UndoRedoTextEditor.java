package com.linkedlist.doublylinkedlist.undoredotexteditor;

public class UndoRedoTextEditor {

    private TextNode head;        // first state
    private TextNode current;     // current text state
    private int size;             // total states
    private final int LIMIT = 10; // max undo/redo history

    // Constructor
    public UndoRedoTextEditor() {
        head = null;
        current = null;
        size = 0;
    }

    // Add new text state
    public void addState(String text) {

        TextNode newNode = new TextNode(text);

        // If list is empty
        if (head == null) {
            head = newNode;
            current = newNode;
            size = 1;
            return;
        }

        // Remove redo history
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
        }

        // Add new node
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
        size++;

        // Limit history to last 10 states
        if (size > LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Display current text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("Editor is empty.");
        }
    }
}
