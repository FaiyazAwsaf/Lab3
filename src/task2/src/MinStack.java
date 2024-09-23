package task2.src;

import java.util.Stack;

public class MinStack {
    public int minElement;
    Stack<Integer> stack = new Stack<>();
    public void push(Integer x)
    {
        if (stack.isEmpty()) {
            minElement = x;
            stack.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        if (x < minElement) {
            minElement = x;
        }
        else
            stack.push(x);

        System.out.println("Number Inserted: " + x);
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("The Stack is empty!");
            return;
        }

        int removedValue = stack.pop();
        System.out.println(removedValue);
//        if (!stack.isEmpty() && removedValue == stack.peek()) {
//            stack.pop();
//            System.out.println("The top element " + removedValue + " is removed");
//        }

    }

    public void min() {
        System.out.println("The minimum value is: " + minElement);
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
