package ua.edu.npu.lab04.task03;

public class ArrayStack implements Stack {
    private int startSize = 4;
    private int cutRate = 2;
    private Integer[] stack = new Integer[startSize];
    private int top = 0;

    public void push(int data) {
        if(top == stack.length-1) {
            resize(stack.length * 2);
        }
        stack[top++] = data;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Невозможно убрать данные, стек пуст");
        }
        else {
            stack[top--] = null;
            if (stack.length > startSize && top < stack.length / cutRate)
                resize(stack.length / 2);
        }
        if(stack[top] == null){
            return 0;
        }
        else {
            return stack[top];
        }
    }

    public int getSize() {
        return top;
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public void clear() {
        while (top != 0) {
            stack[top--] = null;
        }
        resize(startSize);
        System.out.println("Стек очищен");
    }

    private void resize (int newLength) {
        Integer[] newStack = new Integer[newLength];
        System.arraycopy(stack, 0, newStack, 0, top+1);
        stack = newStack;
    }
}
