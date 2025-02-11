package multileveluniversitycoursemanagementsystem;

public class MultiLevelCourseMgmt {
    public static void main(String[] args) {
        //create university
        University university = new University();
        Course<ExamCourse> gate = new Course<>("GATE", 6, new ExamCourse());
        Course<AssignmentCourse> Jee = new Course<>("JEE",12,new AssignmentCourse());
        Course<ReasearchCourse> PHD = new Course<>("PHD",24,new ReasearchCourse());

        university.addCourse(gate);
        university.addCourse(Jee);
        university.addCourse(PHD);

        gate.displayCourseDetails();
        Jee.displayCourseDetails();
        PHD.displayCourseDetails();
        System.out.println("----------------");

        university.displayCourse();
    }


}
