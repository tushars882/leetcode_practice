package com.pp;

public class Node {

    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList{
    Node head = null;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display(){
        Node current  = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtPos(int pos , int data){
        Node newNode = new Node(data);
        Node prev = head;
        int count  = 1;
        if(pos == 1){
            head.next = newNode;
        }else{
            while(count < pos-1){
                prev = prev.next;
                count++;
            }
            Node temp = prev.next;
            prev.next = newNode;
            newNode.next = temp;
        }
    }
}

class MainList{
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(10);
        sll.insert(20);
        sll.insert(32);

        sll.display();


        sll.insertAtPos(3 , 11);

        sll.display();
    }
}
