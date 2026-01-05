package com.linkedlist.doublylinkedlist.undoredotexteditor;

import java.util.Scanner;

// Main class using user input
public class TextEditorApp {

    public static void main(String[] args) {

        UndoRedoTextEditor editor = new UndoRedoTextEditor();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Text Editor Undo/Redo Menu ---");
            System.out.println("1. Add New Text State");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current Text");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    editor.addState(text);
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.displayCurrentState();
                    break;

                case 0:
                    System.out.println("Exiting Text Editor...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
