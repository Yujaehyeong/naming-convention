package com.example.demo;

public class Student {

    private String studentName;
    private int studentAge;
    private String studentContact;

    public Student(String studentName, int studentAge, String studentContact) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentContact = studentContact;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentContact() {
        return studentContact;
    }

}
