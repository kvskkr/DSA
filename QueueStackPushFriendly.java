/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPushFriendly {
    private Queue<Integer> pushQueue;
    private Queue<Integer> popQueue;

    public QueueStackPushFriendly() {
        pushQueue = new LinkedList<>();
        popQueue = new LinkedList<>();
    }

    public void push(int value) {
        pushQueue.offer(value);
    }

    public int pop() {

        if (pushQueue.isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }

        while (pushQueue.size() > 1) {
            popQueue.offer(pushQueue.poll());
        }

        int item = pushQueue.poll();

        Queue<Integer> temp = pushQueue;
        pushQueue = popQueue;
        popQueue = temp;

        return item;
    }

    public static void main(String[] args) {
        QueueStackPushFriendly stack = new QueueStackPushFriendly();

        stack.push(3);
        stack.push(5);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
