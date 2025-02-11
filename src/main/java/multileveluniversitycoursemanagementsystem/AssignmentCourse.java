package multileveluniversitycoursemanagementsystem;

public class AssignmentCourse extends  CourseType{
    public AssignmentCourse(String method) {
        super("Assignment Course");
    }



    @Override
    public void displayDetails() {
        System.out.println("assignment course!");
    }
}
