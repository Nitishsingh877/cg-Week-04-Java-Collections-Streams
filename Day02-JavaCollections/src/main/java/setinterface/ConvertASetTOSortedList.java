package setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertASetTOSortedList {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>(Arrays.asList(new Integer[] {5,3,9,1}));

        Set<Integer> ts = new TreeSet<>(hs);

        System.out.println(ts);

    }
}
