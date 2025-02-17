package com.nitish.excersize;

import java.util.ArrayList;

public class SuppressUnchekedWarnings {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Integer> al = new ArrayList<>();

        al.add(3);
        al.add(5);

        for (int num : al){
            System.out.println(num + " ");
        }
    }
}
