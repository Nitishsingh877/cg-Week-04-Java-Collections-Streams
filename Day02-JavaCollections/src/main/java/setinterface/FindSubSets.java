package setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubSets {
    public static boolean CheckSubsets(Set<Integer>s1,Set<Integer>s2){
        if(s2.containsAll(s1)){
            return true;
        }return false;
    }
    public static void main(String[] args) {
        Set<Integer> integerSet1 = new HashSet<>(Arrays.asList(new Integer[] {2,3}));
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(new Integer[] {1,2,3,4}));

        System.out.println(CheckSubsets(integerSet1,integerSet2));

    }
}
