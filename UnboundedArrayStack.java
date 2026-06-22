/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author KR
 */
public class UnboundedArrayStack {

    private int[] arr;
    private int top;

    public UnboundedArrayStack() {
        arr = new int[5];
        top = -1;
    }

    private void expandArray() {
        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    private void shrinkArray() {

        if (arr.length <= 5) {
            return;
        }

        int[] newArr = new int[arr.length / 2];

        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    public void push(int value) {

        if (top == arr.length - 1) {
            expandArray();
        }

        arr[++top] = value;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack Empty");
            return -1;
        }

        int value = arr[top--];

        if (top + 1 < arr.length / 2) {
            shrinkArray();
        }

        return value;
    }

    public int peek() {

        if (top == -1) {
            return -1;
        }

        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {

        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.size());
    }
}
