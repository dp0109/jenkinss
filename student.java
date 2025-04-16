// Student.java
class Student {
    // Attributes
    private String name;
    private int age;
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 20, "S12345");

        // Display student details
        student.displayDetails();
    }
}
