package queueinterface;

import java.util.*;

class  Patient {
    String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name  + " : " + priority;
    }
}
class sortByPriority implements Comparator<Patient>{
    public int compare(Patient p, Patient q){
        //ascending
      //  return p.priority - q.priority;
        //descending
        return q.priority - p.priority;

    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {
        List<Patient> priorityQueue = new ArrayList<>();

        priorityQueue.add(new Patient("Jhon",3));
        priorityQueue.add(new Patient("Alice",5));
        priorityQueue.add(new Patient("Bob",2));

        Collections.sort(priorityQueue, new sortByPriority());

        System.out.println("printing data in priority");
        for (Patient it : priorityQueue){
            System.out.println(it + " ");
        }
    }

}
