package multileveluniversitycoursemanagementsystem;

public class ReasearchCourse extends CourseType{
    public ReasearchCourse() {
        super("Research Course");
    }



    @Override
    public void displayDetails() {
        System.out.println("research course");
    }
}
