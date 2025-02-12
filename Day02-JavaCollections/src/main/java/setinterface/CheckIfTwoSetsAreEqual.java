package setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

public class CheckIfTwoSetsAreEqual {

    public static boolean setsEqual(Set<Integer>s1, Set<Integer>s2){
        if( s1.equals(s2)){
            return true;
        }return false;
    }
    public static void main(String[] args) {
        Integer[] set1 = {1,2,3,3};
        Integer[] set2 = {3,2,1};

        Set<Integer> Set1 = new HashSet<>(Arrays.asList(set1));
        System.out.println(Set1);
        Set<Integer> Set2 = new HashSet<>(Arrays.asList(set2));
        System.out.println(Set2);

        System.out.println("result is below");

        System.out.println(setsEqual(Set1,Set2));

    }



}
