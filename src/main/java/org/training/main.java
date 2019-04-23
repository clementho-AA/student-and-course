package main.java.org.training;

import main.java.org.training.course.Course;
import main.java.org.training.student.Student;

public class main {

    public static void main(String[] args) {
        Course cs = new Course("Computer Science");
        cs.addStudent(new Student(1, "Charles Xavier"));
        cs.addStudent(new Student(1, "Jon Snow"));
        cs.addStudent(new Student(2, "Jean Grey"));
        cs.addStudent(new Student(3, "Jean Grey"));

        System.out.println("Students enrolled in " + cs.getCourseName() + ":");
        cs.showStudent();
    }
}
