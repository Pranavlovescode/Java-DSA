package org.example;

import java.util.Vector;

public class Vector_implementation {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(3,2);
        v.add(24);
        v.add(46);
        v.add(78);
        v.add(62);
        v.add(60);
        for (int i:v){
            System.out.println(i);
        }
        v.add(2,50);
        System.out.println(v);
        v.remove(2);
        System.out.println(v);

    }
}
