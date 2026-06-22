/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
import java.util.Stack;

public class StackQueueDequeueFriendly {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public StackQueueDequeueFriendly() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {

        if (stack1.isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        return stack1.pop();
    }

    public static void main(String[] args) {

        StackQueueDequeueFriendly queue = new StackQueueDequeueFriendly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}