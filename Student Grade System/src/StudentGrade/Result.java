package StudentGrade;

public class Result {
    private int totalMarks;
    private double averageMarks;
    private String grade;

    public void calculateTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void calculateAverageMarks(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects != 0) {
            this.averageMarks = totalMarks / (double) numberOfSubjects;
        } else {
            this.averageMarks = 0;
        }
    }

    public void assignGrade() {
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 80) {
            grade = "B";
        } else if (averageMarks >= 70) {
            grade = "C";
        } else if (averageMarks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public void displayResult() {
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }
}
