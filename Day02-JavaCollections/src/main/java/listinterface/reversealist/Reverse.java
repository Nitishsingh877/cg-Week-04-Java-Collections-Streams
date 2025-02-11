package listinterface.reversealist;

import java.util.ArrayList;
import java.util.Collections;


    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }temp.next = node;
    }

        public  void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
}

//reverse ll

class LinkedListReverser {
    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null){
            next = current.next; // Store next node
            current.next = prev; // Reverse link
            prev = current;      // Move prev forward
            current = next;      // Move current forward
        }
        return prev;
    }
}




public class Reverse {

    public  static ArrayList<Integer> ReverseWithArrayList(ArrayList<Integer> al){
         ArrayList<Integer> reverseList = new ArrayList<>();
          for (int i= al.size() - 1; i>=0;i--){
              reverseList.add(al.get(i));
          } return reverseList;
    }

    public static void addToLinkedList(LinkedList list, int[] arr) {
        for (int num : arr){
            list.add(num);
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,7,8,3,7,2,9};
        ArrayList<Integer> al = new ArrayList<>();
//add to al
        for(int it : arr){
            al.add(it);
        }

        ArrayList<Integer> reversed = ReverseWithArrayList(al);
        System.out.println(reversed);

// add to ll
        LinkedList list = new LinkedList();
        addToLinkedList(list,arr);

        System.out.println("original Linked list : ");
        list.printList();

        //reverse of linked list
        list.head = LinkedListReverser.reverse(list.head);

        System.out.println("reverse Linked List");
        list.printList();



    }

}
