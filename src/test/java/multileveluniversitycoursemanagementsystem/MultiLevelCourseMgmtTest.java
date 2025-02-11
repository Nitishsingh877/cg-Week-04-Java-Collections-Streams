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
            
}