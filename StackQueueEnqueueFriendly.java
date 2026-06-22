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

public class StackQueueEnqueueFriendly {

    private final Stack<Integer> inputStack;
    private final Stack<Integer> outputStack;

    public StackQueueEnqueueFriendly() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void enqueue(int value) {
        inputStack.push(value);
    }

    public int dequeue() {

        if (outputStack.isEmpty()) {

            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        if (outputStack.isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        return outputStack.pop();
    }

    public static void main(String[] args) {

        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}