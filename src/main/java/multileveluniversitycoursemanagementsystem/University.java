package multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class University{
    private List<Course<? extends CourseType>> courses= new ArrayList<>();
    
     
    public void addCourse(Course<? extends CourseType> course){
        courses.add(course);
    }
    public List<Course<? extends  CourseType>> getcourse(){
        return courses;
    }
    
    public void displayCourse(){
        System.out.println("Courses : ");
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course.getType().getMethod());
        }
    }
    
}
