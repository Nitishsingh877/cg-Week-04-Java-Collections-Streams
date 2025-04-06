package listinterface;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Integer[] arr = {3,1,2,2,3,4};
        //it will sort too
//        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(arr));
        //it will remove duplicates and maintains insertion order.
      LinkedHashSet<Integer> map = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(map);
    }
}
