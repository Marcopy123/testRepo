package org.example;

public class Student {
    int rollNo;
    String name;
    static String collegeName = "Vanier";

    static void change() {
        collegeName = "BDB";

        System.out.println("New college name is " + collegeName);
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Student name " + name + " rollNo is" + rollNo + " College " + collegeName);
    }
}


