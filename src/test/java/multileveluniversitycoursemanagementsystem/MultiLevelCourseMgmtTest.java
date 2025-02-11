package multileveluniversitycoursemanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiLevelCourseMgmtTest {
   private University university;
        @BeforeEach

                public void setUniversity() {
            university = new University();
            Course<ExamCourse> gate = new Course<>("GATE", 6, new ExamCourse());
            Course<AssignmentCourse> Jee = new Course<>("JEE", 12, new AssignmentCourse());
            Course<ReasearchCourse> PHD = new Course<>("PHD", 24, new ReasearchCourse());

            university.addCourse(gate);
            university.addCourse(Jee);
            university.addCourse(PHD);
        }

            @Test
            public void testforCourseNumber () {
                assertEquals(3, university.getcourse().size());
                System.out.println("length is equal to three");
            }
    @Test
    public void testProductInfoFail(){
        assertAll("product info",
                () -> assertEquals("Gate", university.getcourse().get(0).getCourseName()),
                () -> assertEquals("Jee", university.getcourse().get(1).getCourseName()),
                () -> assertEquals("PHD" , university.getcourse().get(2).getCourseName())
        );
    }
    @Test
    public void testProductInfo(){
        assertAll("product info",
                () -> assertEquals("GATE", university.getcourse().get(0).getCourseName()),
                () -> assertEquals("JEE", university.getcourse().get(1).getCourseName()),
                () -> assertEquals("PHD" , university.getcourse().get(2).getCourseName())
        );
        System.out.println("test case passed");
    }

}