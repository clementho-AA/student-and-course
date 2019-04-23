package main.java.org.training.course;

import main.java.org.training.student.Student;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private int studentNumber = 0;
    private ArrayList<Student> studentList;

    public Course(String courseName) {
        this.studentList = new ArrayList<>();
        this.courseName = courseName;
    }

    public boolean addStudent(Student student) {
        if (student == null || studentList.contains(student)) {
            return false;
        }

        studentList.add(student);
        return true;
    }

    public void showStudent() {
        for (Student s : studentList) {
            System.out.println("ID: " + s.getStudentID() + " - " + s.getStudentName());
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
