package setinterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ConvertASetTOSortedListTest {
    @Test
            void testforSortedList() {
        Set<Integer> hs = new HashSet<>(Arrays.asList(new Integer[]{5, 3, 9, 1}));

        Set<Integer> ts = new TreeSet<>(hs);

        Set<Integer> expected = new TreeSet<>(Arrays.asList(new Integer[] {1,3,5,9}));

        assertEquals(expected,ts,"test failed");
        System.out.println("test passed!!");


    }
}