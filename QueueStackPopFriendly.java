/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPopFriendly {
    private Queue<Integer> pushQueue;
    private Queue<Integer> popQueue;

    public QueueStackPopFriendly() {
        pushQueue = new LinkedList<>();
        popQueue = new LinkedList<>();
    }

    public void push(int value) {
        pushQueue.offer(value);

        while (!popQueue.isEmpty()) {
            pushQueue.offer(popQueue.poll());
        }

        Queue<Integer> temp = pushQueue;
        pushQueue = popQueue;
        popQueue = temp;
    }

    public int pop() {
        if (popQueue.isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return popQueue.poll();
    }

    public static void main(String[] args) {
        QueueStackPopFriendly stack = new QueueStackPopFriendly();

        stack.push(3);
        stack.push(5);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}