package com.day13.practiceset;

public class _08MultiLevelInheritance {
    public class Person {
        public String name;
        public int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println(name);
            System.out.println(age);
        }
    }

    public class Student extends Person {
        String course;
        public Student(String name, int age, String course) {
            super(name, age);
            this.course = course;
        }

        @Override
        public void display() {
            super.display();
            System.out.println(course);
        }
    }
    public class GraduateStudent extends Student {
        String thesisTitle;
        public GraduateStudent(String name, int age,String course, String thesisTitle) {
            super(name, age, course);
            this.thesisTitle = thesisTitle;
        }

        @Override
        public void display() {
            super.display();
            System.out.println(thesisTitle);
        }
    }

    void main(){
        Person person = new Person("Meraaz" , 22);
        Student student = new Student("Ali" , 24 , "MCA");
        GraduateStudent graduateStudent = new GraduateStudent("Titu" , 22, "BTech" , "SocialMedia");

        person.display();
        student.display();
        graduateStudent.display();
    }
}
