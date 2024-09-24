package task2.src;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(Integer x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }

        System.out.println("Number Inserted: " + x);
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("The Stack is empty!");
            return;
        }

        int removedValue = stack.pop();
        System.out.println("The top element " + removedValue + " is removed");

        if (!minStack.isEmpty() && removedValue == minStack.peek()) {
            minStack.pop();
        }
    }

    // Get the minimum element
    public void min() {
        if (minStack.isEmpty()) {
            System.out.println("The Stack is empty, no minimum value.");
        } else {
            System.out.println("The minimum value is: " + minStack.peek());
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(20);
        ms.push(30);
        ms.push(120);
        ms.push(90);
        ms.push(10);
        ms.min();
        ms.pop();
        ms.min();
    }

}
