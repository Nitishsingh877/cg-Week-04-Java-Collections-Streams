package setinterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntersectionOfTwoSetsTest {

    @Test
    void testForInterSectionAndUnion(){
        Set<Integer> integerSet = new HashSet<>();

        integerSet.addAll(Arrays.asList(new Integer[] {1,2,3}));

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.addAll(Arrays.asList(new Integer[] {3,4,5}));

        Set<Integer> expexted = new HashSet<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> unionResult = UnionAndIntersectionOfTwoSets.Union(integerSet,integerSet2);

        assertEquals(expexted,unionResult, "not passed");
        System.out.println("test passed!");
    }

}