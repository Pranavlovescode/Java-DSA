package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
//        So in this example we will learn about the java collections framework(especially ArrayList)
        ArrayList<Integer> list = new ArrayList<>();
//        Following are the functions that can be applied to the list to get the problem solved.

//        Adding the element in the list. So, here the elements will be added from the last.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

//        Adding the elements in between the list.
//        list.add(1, 10);
//        System.out.println("The newly added element is 10 and the list is " + list);


//        Getting the element in the list using it's index
        int i = list.get(2);
        System.out.println("The element at the 2 th index is " + i);

//        Removing the element from the list.
        System.out.println("Removing the element from the list " + list.remove(2));
        System.out.println("After removing the element the list is " + list);

//        Checking the list whether it is empty or not.
        System.out.println(list.isEmpty());

        System.out.println("The list is "+list);



//        Following is the code to iteratively remove the element from the list.
//        if (!list.isEmpty()) {
//            for (int j = 0; j < list.size(); j++) {
//                list.remove(j);
//                System.out.println(list);
//            }
//        }

//        Updating the particular element of a index in a list.
        list.set(0,100);
        System.out.println("Updating 0 th index to 10 "+"\nThe updated list is "+list);

//        Sorting the list.
        Collections.sort(list);
        System.out.println(list);

    }
}
