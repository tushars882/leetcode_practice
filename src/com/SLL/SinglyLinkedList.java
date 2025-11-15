package com.SLL;

public class SinglyLinkedList {


    Node head;

    static class Node{
        int data ;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtPos(int pos , Node newNode){
        int count  = 1;
        Node current = head;
        Node temp = head;
        while(count < pos-1){
            temp = temp.next;
            count++;
        }
        Node next = temp.next;
        temp.next = newNode;
        newNode.next = next;

    }
    public void printNode(){
        Node current  = head;
        while(current !=null){
            System.out.print(current.data +"-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void deleteByPos(int pos){
        Node current = head;
        int count = 1;
        while(count < pos-1){
            current = current.next;
            count++;
        }
        Node temp = current.next.next;
        current.next = temp;
    }


    public Node lc_203_removeElements(int val){

        while (head != null && head.data == val) {
            head = head.next;
        }
        if(head == null){
            return null;                            //7 -> 7 -> 7 -> 7 -> null
        }

        Node current = head.next;
        Node prev = head;
        Node temp = current;
        while(current != null) {


            if (current.data == val && current != null) {
                current = current.next;
                prev.next = current;
                temp.next = null;
                temp = current;
            } else {
                current = current.next;
                prev = prev.next;
                temp = current;
            }

        }
return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.head= new Node(7);
        Node second = new Node(7);
        Node third = new Node(7);
        Node fourth = new Node(7);
        sl.head.next = second;
        second.next = third;
        third.next = fourth;


//        System.out.println(sl.head.data + "-->" + second.data +"-->"+ third.data);

//        sl.insertAtPos(3,new Node(18));
//        sl.deleteByPos(3);
        sl.printNode();
        sl.lc_203_removeElements(7);
        System.out.println();
        sl.printNode();
    }


}

