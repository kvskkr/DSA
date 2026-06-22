/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
public class DoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void insertBeginning(int data) {

        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data) {

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
        newNode.prev = current;
    }

    public void deleteFirst() {

        if (head == null) {
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
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

        while (current.next != null) {
            current = current.next;
        }

        current.prev.next = null;
    }

    public void displayForward() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        list.insertBeginning(5);

        list.displayForward();

        list.deleteFirst();
        list.displayForward();

        list.deleteLast();
        list.displayForward();
    }
}
