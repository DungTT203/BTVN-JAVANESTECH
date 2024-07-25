package com.company;

public class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent(String studentId, String name, int age, String major) {
        super(studentId, name, age);
        this.major = major;
    }

    @Override
    public double calculateGPA() {
        // Logic to calculate GPA for undergraduate student
        return 0.0; // Placeholder
    }
}
