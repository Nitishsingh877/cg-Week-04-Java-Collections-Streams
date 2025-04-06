package queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.SplittableRandom;

public class GenrateBinaryNumber {
    public static void genrate(int n){
        Queue<String> q = new ArrayDeque<>();
        q.add("1");

        //run n time
        int i = 1;
        while (i++ <=n){
            // append 0 and 1 to the front element of the queue and
            // enqueue both strings
            q.add(q.peek() + '0');
            q.add(q.peek() + '1');

            //remove first element and print
            System.out.println(q.poll()+ " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        genrate(n);
    }
}
