package com.gdstruct.Midterms;

import java.util.EmptyStackException;

public class CardStack {

    private Card[] stack;
    private int top;

    public CardStack(int capacity) {
        stack = new Card[capacity];
        top = 0;
    }

    public void push(Card card) {
        if (top == stack.length) {
            // grow array when full
            Card[] newStack = new Card[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = card;
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Card removed = stack[--top];
        stack[top] = null;   // clear reference
        return removed;
    }

    public Card peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }
}
