package StudentGrade;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Scanner scanner) {
        Student student = addStudentDetails(scanner);
        if (student != null) {
            students.add(student);
            System.out.println("Student Added Successfully!");
        }
    }

    private Student addStudentDetails(Scanner scanner) {
        System.out.println("\nEnter student details:");

        String studentName = getName(scanner);

        String rollNumber = getRollNumber(scanner);

        return new Student(studentName, rollNumber);
    }

    private boolean isValidRollNumber(String rollNumber) {
        if (rollNumber.matches("[A-Za-z0-9]+") && !rollNumber.matches("[A-Za-z]+") && !rollNumber.matches("[^A-Za-z0-9]")) {
            return true;
        }
        return false;
    }

    private boolean isValidName(String name) {
        if (name.matches("[A-Za-z]+") && !name.matches("[0-9]+") && !name.matches("[^A-Za-z0-9]")) {
            return true;
        }
        return false;
    }

    public boolean getValidRollNumber(String rollNumber) {
        return isValidRollNumber(rollNumber);
    }

    // Check if the roll number exists
    private boolean isRollNumberExists(String rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                return true;
            }
        }
        return false;
    }

//    public boolean getRollNumberExist(String rollNumber){
//        return isRollNumberExists(rollNumber);
//    }
//
    public Student getStudentByRollNumber(String rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                return student;
            }
        }
        return null;
    }


    // Add subjects for a student
    public void addSubjects(Scanner scanner, Student student) {
        int numOfSubjects = -1;

        while (numOfSubjects <= 0) {
            try {
                System.out.print("Enter number of subjects: ");
                numOfSubjects = Integer.parseInt(scanner.nextLine());
                if (numOfSubjects <= 0) {
                    System.out.println("Number of subjects must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number of subjects.");
            }
        }

        for (int i = 1; i <= numOfSubjects; i++) {
            String subjectName = "";
            boolean isSubjectUnique = false;

            while (!isSubjectUnique) {
                System.out.print("Enter subject " + i + " name: ");
                subjectName = scanner.nextLine();

                if (!isValidSubjectName(subjectName)) {
                    System.out.println("Invalid subject name. It should only contain letters and spaces. Please try again.");
                } else if (isSubjectNameUnique(student, subjectName)) {
                    isSubjectUnique = true;
                } else {
                    System.out.println("Subject name must be unique. This subject already exists. Please enter a different name.");
                }
            }

            char absent = ' ';
            while (absent != 'y' && absent != 'Y' && absent != 'n' && absent != 'N') {
                System.out.print("Is the student absent for this subject? (y/n): ");
                absent = scanner.next().charAt(0);
                scanner.nextLine();

                if (absent != 'y' && absent != 'Y' && absent != 'n' && absent != 'N') {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            }

            if (absent == 'y' || absent == 'Y') {
                student.addSubject(subjectName, -1);  // If absent, mark as -1
            } else {
                int marks = -1;

                while (marks < 0 || marks > 100) {
                    try {
                        System.out.print("Enter marks for " + subjectName + " (0-100): ");
                        marks = Integer.parseInt(scanner.nextLine());
                        if (marks < 0 || marks > 100) {
                            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number for marks.");
                    }
                }
                student.addSubject(subjectName, marks);
            }
        }
        System.out.println("Subject and Marks added Successfully!");
    }

    private boolean isValidSubjectName(String subjectName) {
        return subjectName.matches("[A-Za-z ]+");
    }


    // Check if the subject name is unique for the student
    private boolean isSubjectNameUnique(Student student, String subjectName) {
        for (Subject subject : student.getSubjects()) {
            if (subject.getName().equalsIgnoreCase(subjectName)) {
                return false;
            }
        }
        return true;
    }

    public int getValidChoice(Scanner scanner) {
        int choice = -1;
        while (choice < 1 || choice > 4) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid input! Please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
            }
        }
        return choice;
    }

    private String getName(Scanner scanner) {
        String studentName = "";
        while (studentName.isEmpty() || !isValidName(studentName)) {
            System.out.print("Enter student name: ");
            studentName = scanner.nextLine();
            if (studentName.isEmpty()) {
                System.out.println("Student name is required. Please enter a valid name.");
            } else if (!isValidName(studentName)) {
                System.out.println("Invalid Name format. Please enter a valid Name.");
            }
        }
        return studentName;
    }

    private String getRollNumber(Scanner scanner) {
        String rollNumber = "";
        while (rollNumber.isEmpty() || !isValidRollNumber(rollNumber)) {
            System.out.print("Enter roll number: ");
            rollNumber = scanner.nextLine();
            if (rollNumber.isEmpty()) {
                System.out.println("Roll number is required. Please enter a valid roll number.");
            } else if (!isValidRollNumber(rollNumber)) {
                System.out.println("Invalid roll number format. Please enter a valid roll number.");
            } else if (isRollNumberExists(rollNumber)) {
                System.out.println("Error: A student with roll number " + rollNumber + " already exists.");
                rollNumber = "";
            }
        }
        return rollNumber;
    }
}
