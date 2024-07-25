package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        University university = new University();

        UndergraduateStudent uStudent = new UndergraduateStudent("U001", "DŨNG", 20, "Computer Science");
        GraduateStudent gStudent = new GraduateStudent("G001", "NAM", 24, "AI Research");
        InternationalStudent iStudent = new InternationalStudent("I001", "THÀNH", 22, "Business", "USA");

        university.addStudent(uStudent);
        university.addStudent(gStudent);
        university.addStudent(iStudent);

        university.displayAllStudents();
    }
}
