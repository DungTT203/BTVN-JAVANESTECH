package com.company;

// Abstract class Student
public abstract class Student {
    protected String studentId;
    protected String name;
    protected int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate GPA
    public abstract double calculateGPA();
}

