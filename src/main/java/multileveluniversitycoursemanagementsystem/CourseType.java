package multileveluniversitycoursemanagementsystem;

public abstract class CourseType {
    private String method;

    public CourseType(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public abstract void displayDetails();
}
