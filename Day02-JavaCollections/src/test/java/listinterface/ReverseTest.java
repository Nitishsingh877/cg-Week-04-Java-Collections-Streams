package listinterface;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {


    @Test
    void testForArrayListReverse(){
        int[] arr = {4,7,8,3,7,2,9};
        ArrayList<Integer> al = new ArrayList<>();

        for(int it : arr){
            al.add(it);
        }
        Collections.reverse(al);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(9,2,7,3,8,7,4));

        assertEquals(expected , al);
    }
}