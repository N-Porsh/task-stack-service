package com.task.stack;

import java.util.*;

public class ArrayListStack implements StackInterface {

    protected ArrayList<Object> stack;

    public ArrayListStack() {
        stack = new ArrayList<Object>();
    }

    @Override
    public void push(Object element) {
        stack.add(element);
    }

    @Override
    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        stack.remove(stack.size() - 1);
    }

    @Override
    public Object top() {
        Object topOfStack = null;
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        topOfStack = stack.get(stack.size() - 1);
        return topOfStack;
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public void reset() {
        stack.clear();
    }
}
