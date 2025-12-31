package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_tutorial {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(20);
        arr.add(65);
        arr.add(57);
        arr.add(96);
        System.out.println(arr);
        int max = arr.stream().mapToInt(Integer :: intValue).max().getAsInt();
        int max2 = Collections.max(arr);
        System.out.println(max2);

        Stream<Integer> s1 = arr.stream().map(m->m*2);
        s1.forEach(num -> System.out.println(num));

//        creating stream add 34 then filter nums which are even and find the largest one
        int largest = arr.stream().map(m->m+34).filter(even -> even%2==0).mapToInt(Integer::intValue).max().getAsInt();

        List<Integer> list = arr.stream().map(m->m+34).filter(even -> even%2==0).toList();

//        finding largest num using reduce method
        Optional<Integer> num = arr.stream().reduce((num1, num2)-> num1 > num2 ? num1 : num2);

        System.out.println(list);
        System.out.println("Largest int "+largest);
        System.out.println("Largest int using reduce "+num);
    }
}
