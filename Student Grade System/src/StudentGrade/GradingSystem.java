package StudentGrade;

import java.util.Scanner;

public class GradingSystem {

    private StudentManager studentManager;

    public GradingSystem() {
        this.studentManager = new StudentManager();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                displayMenu();

                int choice = studentManager.getValidChoice(scanner);
                handleUserChoice(choice, scanner);
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }

    private void displayMenu() {
        System.out.println("*** Menu ***");
        System.out.println("1. Add Student\n2. Add subjects for a student\n3. Display Student Details\n4. Exit");
        System.out.println("---------------------------------------------------------");
        System.out.print("Choose an option: ");
    }

    private void handleUserChoice(int choice, Scanner scanner) {
        try {
            switch (choice) {
                case 1:
                    studentManager.addStudent(scanner);
                    break;
                case 2:
                    handleAddSubjects(scanner);
                    break;
                case 3:
                    displayStudentDetails(scanner);
                    break;
                case 4:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private void handleAddSubjects(Scanner scanner) {
        String rollNumber = "";

        while (true) {
            try {
                System.out.print("\nEnter roll number to add subjects: ");
                rollNumber = scanner.nextLine();

                // Check if roll number is empty or invalid
                if (rollNumber.isEmpty() || !studentManager.getValidRollNumber(rollNumber)) {
                    System.out.println("Roll number cannot be empty (Or) Please enter a valid roll number.");
                    continue;
                }

                Student student = studentManager.getStudentByRollNumber(rollNumber);

                if (student != null) {
                    if (student.hasSubjectsAdded()) {
                        System.out.println("Subjects have already been added for this student.");
                        break;
                    } else {
                        studentManager.addSubjects(scanner, student);
                        break;
                    }
                } else {
                    System.out.println("Student with roll number " + rollNumber + " not found.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("An error occurred while adding subjects: " + e.getMessage());
            }
        }
    }

    private void displayStudentDetails(Scanner scanner) {
        String rollNumber = "";

        while (true) {
            try {
                System.out.print("\nEnter roll number to search: ");
                rollNumber = scanner.nextLine();

                if (rollNumber.isEmpty()) {
                    System.out.println("Roll number cannot be empty.");
                    continue;
                }

                Student student = studentManager.getStudentByRollNumber(rollNumber);

                if (student != null) {
                    student.displayStudentDetails();
                    student.displayResult();
                    break;
                } else {
                    if (!studentManager.getValidRollNumber(rollNumber)) {
                        System.out.println("Invalid Roll number!");
                        continue;
                    }
                    System.out.println("Student with roll number " + rollNumber + " not found.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("An error occurred while displaying student details: " + e.getMessage());
            }
        }
    }

    private void exitProgram() {
        System.out.println("Exit...");
        System.exit(0);
    }
}
