package listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateElementInList {
    public static void main(String[] args) {
        Integer[] n  ={10,20,30,40,50};
         List<Integer> al = Arrays.asList(n);
         int rotateBy = 2;
         //rotate using rotate method.
        Collections.rotate(al,-rotateBy);

        System.out.println("reversed list by -2 index");
        System.out.println(al);



    }

}
