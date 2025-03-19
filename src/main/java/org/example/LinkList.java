package org.example;

import java.awt.*;

public class LinkList {
    static LinkListNode head;

    public void insertFirst(int data){
        LinkListNode node = new LinkListNode(data);
        node.next = head;
        head = node;
    }

    public void insertAtLast(int data){
        LinkListNode temp = head;
        LinkListNode node = new LinkListNode(data);

        while (temp.next != null){
            temp = temp.next;
        }
        node.next = null;
        temp.next = node;

    }

    public void insertAtGivenIndex(int index, int data){
        LinkListNode node = new LinkListNode(data);
        LinkListNode temp = head;
        int num = 1;
        while (num != index){
            num ++;
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }


    public void deleteFirst(){
        LinkListNode node = head;
        head = node.next;
        node.next=null;
    }

    public void deleteLast(){
        LinkListNode node = head;
        while (node.next.next != null){
            node = node.next;
        }
        node.next = null;
//        System.out.println(node.val);

    }

    public void deleteAtGivenIndex(int index){
        LinkListNode node = head;
        int num =1;
        while ((num) != (index-1)){
            num ++;
            node = node.next;
        }
        node.next = node.next.next;
//        System.out.println(node.val);
    }

    public void removeNthfromEnd(int n){
        LinkListNode temp = head;
        int length = 1;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        System.out.println(length);
        int uptoPointer = length-1 - n;
        int i = 1;
        LinkListNode node = head;
        while (i != uptoPointer){
            node = node.next;
            i++;
        }
        node.next = node.next.next;

    }

    public void display(){
        LinkListNode node = head;
        while (node!= null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insertFirst(23);
        list.insertFirst(45);
        list.insertFirst(89);
        list.insertFirst(55);
        list.insertAtLast(12);
        list.insertFirst(87);

        list.insertAtGivenIndex(3,141);
        list.insertAtGivenIndex(4,42);

        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();list.deleteLast();
        list.display();list.deleteLast();
        list.display();list.deleteLast();
        list.display();list.deleteLast();
        list.display();list.deleteLast();
        list.display();list.deleteLast();
        list.display();

//        list.deleteAtGivenIndex(3);
//        list.display();
//
//
//        System.out.println("Deleting from n th index");
//        list.removeNthfromEnd(2);
//        list.display();

    }
}

class LinkListNode {
    int val;
    LinkListNode next;
    public LinkListNode(int val){
        this.val = val;
    }
    public LinkListNode(int val,LinkListNode next){
        this.val =val;
        this.next = next;
    }
}
