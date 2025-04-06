package listinterface.findfrequencyofelements;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RotateElementInListTest {
    @Test
    void testForRotate(){
        Integer[] n  ={10,20,30,40,50};
        List<Integer> al = Arrays.asList(n);
        int rotateBy = 2;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(30,40,50,10,20));
        //rotate using rotate method.
        Collections.rotate(al,-rotateBy);

        assertEquals(expected,al,"not expected output");
        System.out.println("test case passed!!");
    }

}