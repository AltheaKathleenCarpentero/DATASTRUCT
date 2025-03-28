import java.util.Scanner;

public class StudentManagement {
    protected static Student[] students = new Student[100];
    protected static int studentCount = 0;
    protected static Scanner scan = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("\nStudent Management System");
        System.out.println("1. Add New Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Display All Students in Reverse");
        System.out.println("0. Exit/Terminate Program");
        System.out.print("Enter your choice: ");
    }

    public static void addNewStudent() {
        if (studentCount < students.length) {
            System.out.print("Enter ID Number: ");
            int id = scan.nextInt();
            scan.nextLine(); 
            System.out.print("Enter First Name: ");
            String firstName = scan.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scan.nextLine();

            System.out.print("Enter Course: ");
            String course = scan.nextLine();

            System.out.print("Enter Year Level: ");
            int year = scan.nextInt();
            scan.nextLine(); 
            
            students[studentCount++] = new Student(id, firstName, lastName, course, year);
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }

    public static void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\n--- All Students ---");
            for (int i = 0; i < studentCount; i++) {
                System.out.println(students[i]);
            }
        }
    }

    public static void displayStudentsReverse() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\n--- Students in Reverse Order ---");
            for (int i = studentCount - 1; i >= 0; i--) {
                System.out.println(students[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        int choice;
        do {
            StudentManagement.displayMenu();
            choice = StudentManagement.scan.nextInt();
            StudentManagement.scan.nextLine(); 

            switch (choice) {
                case 1:
                    StudentManagement.addNewStudent();
                    break;
                case 2:
                    StudentManagement.displayAllStudents();
                    break;
                case 3:
                    StudentManagement.displayStudentsReverse();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
