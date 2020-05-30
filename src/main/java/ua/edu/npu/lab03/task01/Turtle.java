package ua.edu.npu.lab03.task01;

public class Turtle extends Pet implements Swimming, Walking {
    public void walk() {
        System.out.println("Черепашка идёт");
    }

    public void swim() {
        System.out.println("Черепшка плывёт");
    }

    public String petType() {
        return "Черепашка";
    }

    public Turtle (String owner, String name, int age) {
        super(owner, name, age);
    }
}
