package StudentGrade;

import java.util.ArrayList;

public class Student {
    private String name;
    private String rollNumber;
    private ArrayList<Subject> subjects;
    private Result result;
    private boolean hasSubjectsAdded;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new ArrayList<>();
        this.result = new Result();
        this.hasSubjectsAdded = false;
    }

    public boolean hasSubjectsAdded() {
        return hasSubjectsAdded;
    }

    public void addSubject(String subjectName, int marks) {
        subjects.add(new Subject(subjectName, marks));
        this.hasSubjectsAdded = true;
        calculateResult();
    }

    public void calculateResult() {
        int totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        result.calculateTotalMarks(totalMarks);
        result.calculateAverageMarks(totalMarks, subjects.size());
        result.assignGrade();
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        if (subjects.isEmpty()) {
            System.out.println("No subjects added yet.");
        } else {
            System.out.println("Subjects and Marks:");
            for (Subject subject : subjects) {
                subject.displaySubjectDetails();
            }
        }
    }

    public void displayResult() {
        if (!subjects.isEmpty()) {
            result.displayResult();
        } else {
            System.out.println("No marks to display.");
        }
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

}
