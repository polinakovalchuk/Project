package ua.edu.npu.lab03.task01;

public class Eagle extends Pet implements Flying, Walking, Talking {
    public void walk() {
        System.out.println("Орёл идёт");
    }

    public void talk() {
        System.out.println("*звук орла*");
    }

    public void fly() {
        System.out.println("Орёл летит");
    }

    public String petType() {
        return "Орёл";
    }

    public Eagle (String owner, String name, int age) {
        super(owner, name, age);
    }
}
