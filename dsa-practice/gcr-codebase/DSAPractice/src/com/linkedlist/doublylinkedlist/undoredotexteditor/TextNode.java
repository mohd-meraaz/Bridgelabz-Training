package com.linkedlist.doublylinkedlist.undoredotexteditor;

class TextNode {
    String text;          // stores text state
    TextNode prev;        // previous state (undo)
    TextNode next;        // next state (redo)

    TextNode(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}
