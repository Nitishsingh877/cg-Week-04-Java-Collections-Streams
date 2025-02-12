package setinterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricDiffrenceTest {
    @Test
    void testForSymmetricDiffrence(){
        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.addAll(Arrays.asList(new Integer[] {1,2,3}));

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.addAll(Arrays.asList(new Integer[] {3,4,5}));

        Set<Integer> expexted = new HashSet<>(Arrays.asList(new Integer[] {1,2,4,5}));
        Set<Integer> DiffrenceSymmetric = CheckIfTwoSetsAreEqual.SymmetricDiffrence.SymmDiffrence(integerSet1,integerSet2);

        assertEquals(expexted,DiffrenceSymmetric,"not passed");
        System.out.println("test passed");

    }

}