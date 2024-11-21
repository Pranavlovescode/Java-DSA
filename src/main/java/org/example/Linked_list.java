package org.example;

import java.util.LinkedList;

public class Linked_list {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public LinkedList<Integer> createLinkedList() {
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }

    public LinkedList<Integer> addANewElement(LinkedList<Integer> list, int input){
        list.addLast(input);
        return list;
    }

    public LinkedList<Integer> deleteElementFromLinkedList(LinkedList<Integer> list, int input){
        list.remove(input);
        return list;
    }

    public LinkedList<Integer> updateElementInTheLinkedList(LinkedList<Integer> list, int index, int input){
        list.set(index, input);
        return list;
    }

    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        System.out.println(list.createLinkedList());
        System.out.println(list.getLinkedList());
        System.out.println(list.addANewElement(list.getLinkedList(), 10));
        System.out.println(list.deleteElementFromLinkedList(list.getLinkedList(), 10));
        System.out.println(list.updateElementInTheLinkedList(list.getLinkedList(),5,45));
    }
}
