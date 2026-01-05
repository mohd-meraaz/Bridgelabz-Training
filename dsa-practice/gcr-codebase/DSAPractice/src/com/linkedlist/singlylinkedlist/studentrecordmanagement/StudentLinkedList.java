package com.linkedlist.singlylinkedlist.studentrecordmanagement;


//Using Linked List operations
class StudentLinkedList {
 private Student head;

 // Add at beginning
 public void addAtBeginning(int rollNo, String name, int age, char grade) {
     Student newNode = new Student(rollNo, name, age, grade);
     newNode.next = head;
     head = newNode;
     System.out.println("Student added at beginning");
 }

 // Add at end
 public void addAtEnd(int rollNo, String name, int age, char grade) {
     Student newNode = new Student(rollNo, name, age, grade);

     if (head == null) {
         head = newNode;
         return;
     }

     Student temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
     System.out.println("Student added at end");
 }

 // Delete by roll number
 public void deleteByRollNo(int rollNo) {
     if (head == null) {
         System.out.println("List is empty");
         return;
     }

     if (head.rollNo == rollNo) {
         head = head.next;
         System.out.println("Student deleted");
         return;
     }

     Student temp = head;
     while (temp.next != null && temp.next.rollNo != rollNo) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("Student not found");
     } else {
         temp.next = temp.next.next;
         System.out.println("Student deleted");
     }
 }

 // Search student
 public void searchStudent(int rollNo) {
     Student temp = head;

     while (temp != null) {
         if (temp.rollNo == rollNo) {
             System.out.println("Student Found:");
             System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found");
 }

 // Update grade
 public void updateGrade(int rollNo, char newGrade) {
     Student temp = head;

     while (temp != null) {
         if (temp.rollNo == rollNo) {
             temp.grade = newGrade;
             System.out.println("Grade updated");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found");
 }

 // Display all records
 public void display() {
     if (head == null) {
         System.out.println("No student records");
         return;
     }

     Student temp = head;
     while (temp != null) {
         System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
         temp = temp.next;
     }
 }
}
