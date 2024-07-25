package com.company;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> studentList;

    public University() {
        this.studentList = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void displayAllStudents() {
        for (Student student : studentList) {
            System.out.println("Student ID: " + student.studentId + ", Name: " + student.name + ", Age: " + student.age);
        }
    }
}
