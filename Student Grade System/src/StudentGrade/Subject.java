package StudentGrade;

public class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void displaySubjectDetails() {
        if (marks == -1) {
            System.out.println(name + ": Absent");
        } else {
            System.out.println(name + ": " + marks);
        }
    }
}
