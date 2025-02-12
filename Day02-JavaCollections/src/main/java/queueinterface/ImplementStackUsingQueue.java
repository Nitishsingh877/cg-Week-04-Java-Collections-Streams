package queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementStackUsingQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static  Queue<Integer> q2 = new LinkedList<Integer>();

       // static int currSize;
        //add
        static void push(int x){
            //push x in q2
            q2.add(x);

            //push all the remaining element to q1 to q2
            while (!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }

            //swap the names
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop(){
            if(q1.isEmpty()) return;
            q1.remove();
        }
        static int top(){
            if(q1.isEmpty()) return -1;
            return q1.peek();

        }
        static int size(){
            return q1.size();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(6);
        s.push(3);
        s.push(2);

        System.out.println("current size is " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("size after calculations : "  + s.size());

    }

}
