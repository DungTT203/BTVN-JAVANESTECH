package com.company;

public class InternationalStudent extends UndergraduateStudent {
    private String country;
    public InternationalStudent(String studentId, String name, int age, String major, String country) {
        super(studentId, name, age, major);
        this.country = country;
    }

    @Override
    public double calculateGPA() {
        // Logic to calculate GPA for international student
        return 0.0; // Placeholder
    }
}
