package listinterface;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class FindNthElementFromEnd {
    public static void main(String[] args) {
        Character[] input = {'A','B','C','D','E'};
        LinkedList<Character> characterLinkedList = new LinkedList<>(Arrays.asList(input));
        int elementAtIndexFromEnd = 2;

        //using two pointer
        ListIterator<Character> first = characterLinkedList.listIterator();
        ListIterator<Character> second = characterLinkedList.listIterator();

        for(int i=0; i<elementAtIndexFromEnd;i++){
            if(!first.hasNext()){
                System.out.println("Invalid index");
                return;
            }
            first.next();
        }

        while (first.hasNext()){
            first.next();
            second.next();
        }

        //second is now at nth element
        System.out.println("Nth element from end is " + second.next());







    }
}
