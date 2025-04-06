package multileveluniversitycoursemanagementsystem;

public class Course <T extends CourseType>{
    private String courseName;
    private int duration;
    private T type;

    public Course(String courseName, int duration, T type) {
        this.courseName = courseName;
        this.duration = duration;
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseDetails(){
        System.out.println("course name is " + courseName);
        System.out.println("duration in month is " + duration);
          type.displayDetails();

    }
}
