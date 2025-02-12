package queueinterface;

import java.util.*;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer>q){
        //if q is empty
        if(q.isEmpty()) return;

        //remove first element
        int frontElement = q.remove();

        reverseQueue(q);

        //add front element back to queue
        q.add(frontElement);

    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(new Integer[]{10, 20, 30}));

        System.out.println("original queue" + queue);


       reverseQueue(queue);

        System.out.println("reversed queue is " + queue);
    }
    }

