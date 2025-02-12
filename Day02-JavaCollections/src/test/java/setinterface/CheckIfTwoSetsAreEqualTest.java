package setinterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfTwoSetsAreEqualTest {
    @Test
    void testForEqualElementInSet(){
        Integer[] set1 = {1,2,3,3};
        Integer[] set2 = {3,2,1};

        Set<Integer> Set1 = new HashSet<>(Arrays.asList(set1));
        Set<Integer> Set2 = new HashSet<>(Arrays.asList(set2));

       assertTrue(CheckIfTwoSetsAreEqual.setsEqual(Set1,Set2),"test not passed");
        System.out.println("test passed");
    }

    @Test
    void testForSetsEqual(){
        Integer[] set1 = {1,2,3,47};
        Integer[] set2 = {3,2,1};

        Set<Integer> Set1 = new HashSet<>(Arrays.asList(set1));
        Set<Integer> Set2 = new HashSet<>(Arrays.asList(set2));

        assertFalse(CheckIfTwoSetsAreEqual.setsEqual(Set1,Set2),"failed");
        System.out.println("passed test case");
    }

}