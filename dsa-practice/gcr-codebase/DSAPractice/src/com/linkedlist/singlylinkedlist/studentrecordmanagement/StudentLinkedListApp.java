package com.linkedlist.singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;
//Main class
public class StudentLinkedListApp {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     StudentLinkedList list = new StudentLinkedList();
     int choice;

     do {
         System.out.println("\n--- Student Record Management ---");
         System.out.println("1. Add at Beginning");
         System.out.println("2. Add at End");
         System.out.println("3. Delete by Roll No");
         System.out.println("4. Search Student");
         System.out.println("5. Update Grade");
         System.out.println("6. Display All");
         System.out.println("7. Exit");
         System.out.print("Enter choice: ");

         choice = sc.nextInt();

         switch (choice) {
             case 1:
             case 2:
                 System.out.print("Roll No: ");
                 int roll = sc.nextInt();
                 System.out.print("Name: ");
                 String name = sc.next();
                 System.out.print("Age: ");
                 int age = sc.nextInt();
                 System.out.print("Grade: ");
                 char grade = sc.next().charAt(0);

                 if (choice == 1)
                     list.addAtBeginning(roll, name, age, grade);
                 else
                     list.addAtEnd(roll, name, age, grade);
                 break;

             case 3:
                 System.out.print("Enter Roll No to delete: ");
                 list.deleteByRollNo(sc.nextInt());
                 break;

             case 4:
                 System.out.print("Enter Roll No to search: ");
                 list.searchStudent(sc.nextInt());
                 break;

             case 5:
                 System.out.print("Roll No: ");
                 int r = sc.nextInt();
                 System.out.print("New Grade: ");
                 char g = sc.next().charAt(0);
                 list.updateGrade(r, g);
                 break;

             case 6:
                 list.display();
                 break;

             case 7:
                 System.out.println("Program exited");
                 break;

             default:
                 System.out.println("Invalid choice");
         }
     } while (choice != 7);

     sc.close();
 }
}