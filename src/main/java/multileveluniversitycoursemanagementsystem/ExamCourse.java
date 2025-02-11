package multileveluniversitycoursemanagementsystem;

public class ExamCourse extends CourseType{
    public ExamCourse(String method) {
        super("Exam-Based Approach");
    }
    @Override
    public void displayDetails() {
        System.out.println("Exam Based approach");
    }
}
