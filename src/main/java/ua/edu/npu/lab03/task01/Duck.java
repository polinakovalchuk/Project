package ua.edu.npu.lab03.task01;

public class Duck extends Pet implements  Flying, Swimming, Walking, Talking{
    public void walk() {
        System.out.println("Утка идёт");
    }

    public void talk() {
        System.out.println("Кря");
    }

    public void fly() {
        System.out.println("Утка летит");
    }

    public void swim() {
        System.out.println("Утка плывёт");
    }

    public String petType() {
        return "Утка";
    }

    public Duck (String owner, String name, int age) {
        super(owner, name, age);
    }
}
