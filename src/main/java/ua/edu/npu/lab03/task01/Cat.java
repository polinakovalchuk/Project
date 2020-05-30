package ua.edu.npu.lab03.task01;

public class Cat extends Pet implements Talking, Walking {
    public void walk() {
        System.out.println("Котик идёт");
    }

    public void talk() {
        System.out.println("Мяу");
    }

    public String petType() {
        return "Котик";
    }

    public Cat (String owner, String name, int age) {
        super(owner, name, age);
    }
}
