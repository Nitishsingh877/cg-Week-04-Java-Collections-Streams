package listinterface.findfrequencyofelements;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest
{


    @Test
    void testForDuplicatesRemove(){
        Integer[] arr = {3,1,2,2,3,4};
        LinkedHashSet<Integer> map = new LinkedHashSet<>(Arrays.asList(arr));

     LinkedHashSet<Integer> expected = new LinkedHashSet<>(Arrays.asList(3,1,2,4));

        assertEquals(expected,map,"not matched");
        System.out.println("test case passed");
    }
}