package com.nitish.Junit.basictesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class TestingListOperations {
    public static List<Integer> add(List<Integer> list, int element){
        list.add(element);
        return list;
    }
    public static List<Integer> remove(List<Integer>list, int element){
       list.remove(Integer.valueOf(element));
        return list;
    }

    public static int size(List<Integer>list){
        return list.size();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4));

        System.out.println(" added 5 to list"+add(list,5));
        System.out.println(" added 7 to list"+add(list,7));
        System.out.println(" remove 7 to list"+remove(list,7));
        System.out.println("Size is  " + size(list));

    }
}
