package com.company;

public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String studentId, String name, int age, String researchTopic) {
        super(studentId, name, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public double calculateGPA() {
        // Logic to calculate GPA for graduate student
        return 0.0; // Placeholder
    }
}
