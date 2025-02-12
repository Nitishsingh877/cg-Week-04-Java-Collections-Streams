package setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfTwoSets {
    public static   Set<Integer> Union (Set<Integer>s1,Set<Integer>s2){
        //to find union
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("Union of two sets");
        return (union);
    }

    public static Set<Integer> Intersection(Set<Integer>s1, Set<Integer>s2){
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("intersection of two set is : ");
        return intersection;
    }
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        integerSet.addAll(Arrays.asList(new Integer[] {1,2,3}));

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.addAll(Arrays.asList(new Integer[] {3,4,5}));

        Set<Integer> unionResult = Union(integerSet,integerSet2);
        System.out.println(unionResult);

        System.out.println("---------------");
        Set<Integer> intersectionResult = Intersection(integerSet,integerSet2);
        System.out.println(intersectionResult);


    }

}
