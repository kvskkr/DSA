/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
public class ArrayCircularQueue {

    private final int[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayCircularQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {

        if (size == queue.length) {
            System.out.println("Queue Full");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {

        if (size == 0) {
            System.out.println("Queue Empty");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;

        return value;
    }

    public static void main(String[] args) {

        ArrayCircularQueue q = new ArrayCircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}