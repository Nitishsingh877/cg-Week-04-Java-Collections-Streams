package multileveluniversitycoursemanagementsystem;

public class AssignmentCourse extends  CourseType{
    public AssignmentCourse() {
        super("Assignment Course");
    }



    @Override
    public void displayDetails() {
        System.out.println("assignment course!");
    }
}
