package ua.edu.npu.lab04.task03;

public class App {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.pop();
        arrayStack.push(9);
        arrayStack.push(1);
        arrayStack.push(6);
        arrayStack.push(3);
        arrayStack.push(4);
        System.out.println("Длинна стека " + arrayStack.getSize());
        System.out.println("Убран элемент " + arrayStack.pop());
        System.out.println("Убран элемент " + arrayStack.pop());
        System.out.println("Убран элемент " + arrayStack.pop());
        System.out.println("Убран элемент " + arrayStack.pop());
        System.out.println("Длинна стека " + arrayStack.getSize());
        arrayStack.push(10);
        arrayStack.clear();
        System.out.println("Длинна стека " + arrayStack.getSize());
    }
}
