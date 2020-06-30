package com.offer.stack_queue;

import java.util.Stack;

public class _09_用两个栈实现队列 {
    public Stack<Integer> inStack;
    public Stack<Integer> outStack;
    public _09_用两个栈实现队列() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (inStack.isEmpty() && outStack.isEmpty()) return -1;
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */