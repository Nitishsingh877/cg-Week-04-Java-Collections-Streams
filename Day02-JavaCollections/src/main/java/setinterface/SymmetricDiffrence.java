package setinterface;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDiffrence {

    public static Set<Integer> SymmDiffrence(Set<Integer>s1,Set<Integer>s2){
        //diff = union - intersection;
        Set<Integer> diffrence = new HashSet<>(s1);
        diffrence.addAll(s2);

        Set<Integer> intersection   = new HashSet<>(s1);
        intersection.retainAll(s2);

        diffrence.removeAll(intersection);
        return diffrence;
    }
    public static void main(String[] args) {
        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.addAll(Arrays.asList(new Integer[] {1,2,3}));

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.addAll(Arrays.asList(new Integer[] {3,4,5}));

        Set<Integer> DiffrenceSymmetric = SymmDiffrence(integerSet1,integerSet2);
        System.out.println(DiffrenceSymmetric);




    }
}