package multileveluniversitycoursemanagementsystem;

public class ReasearchCourse extends CourseType{
    public ReasearchCourse(String method) {
        super("Research Course");
    }



    @Override
    public void displayDetails() {
        System.out.println("research course");
    }
}
