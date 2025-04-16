package jenkinss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private List<String> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public List<String> getCourses() {
        return courses;
    }
}

public class StudentCourses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a student
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);
        
        // Add courses to the student
        System.out.print("Enter number of courses: ");
        int numberOfCourses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.print("Enter course name: ");
            String course = scanner.nextLine();
            student.addCourse(course);
        }
        
        // Display student information
        System.out.println("\nStudent Name: " + student.getName());
        System.out.println("Enrolled Courses:");
        for (String course : student.getCourses()) {
            System.out.println("- " + course);
        }
        
        scanner.close();
    }
}
