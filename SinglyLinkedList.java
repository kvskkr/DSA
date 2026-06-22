/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void deleteFirst() {

        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void deleteLast() {

        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        list.insertBeginning(5);

        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();
    }
}
