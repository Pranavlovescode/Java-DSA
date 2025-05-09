package org.example;

// Priority Queue as the name suggests that it gives the priority to the most highest value element in the queue according to the comparator function in the priority heap while creation of the queue
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new  PriorityQueue(6);

//        for (int i = 0; i < 6; i++) {
//            pq.add(i+9*7);
//        }
        pq.add(23);
        pq.add(84);
        pq.add(30);
        pq.add(14);
        pq.add(5);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
//        Checking the head of the Queue
        System.out.println("The head is "+pq.peek());
        Iterator iterator = pq.iterator();
        System.out.println("Printing pq using iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("The size is "+pq.size());
    }
}
