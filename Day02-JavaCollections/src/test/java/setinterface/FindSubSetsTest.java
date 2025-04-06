package setinterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FindSubSetsTest {
    @Test
            void testforSubsets() {
        Set<Integer> integerSet1 = new HashSet<>(Arrays.asList(new Integer[]{2, 3}));
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));

        boolean val = FindSubSets.CheckSubsets(integerSet1, integerSet2);

        assertTrue(val,"test failed");
        System.out.println("test passed");
    }
}