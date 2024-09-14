package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Implementation {
    public static void main(String[] args) {
        System.out.println("This is Queue Implementation");
        Queue<Integer> queue = new LinkedList<>();
//        Adding an element in the queue
        queue.offer(23);
        queue.offer(234);
        queue.offer(546);
        queue.offer(2);
        System.out.println(queue);

//        Removing an element from the queue
        queue.poll(); // This method can return the element even after the function is called
        System.out.println(queue);
        System.out.println(queue.poll());

//        Returning the first element in the queue
        System.out.println("The first element in the queue is "+queue.peek());
    }
}
