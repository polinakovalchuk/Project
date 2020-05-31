package ua.edu.npu.lab04.task02;

public class App {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(4);
        System.out.println(arrayStack.pop());
        arrayStack.push(7);
        arrayStack.push(56);
        arrayStack.push(2);
        arrayStack.push(9);
        arrayStack.push(1);
        System.out.println("Убран элемент " + arrayStack.pop());
        System.out.println("Размер стека " + arrayStack.getSize());
        arrayStack.clear();
        System.out.println(arrayStack.pop());
    }
}
