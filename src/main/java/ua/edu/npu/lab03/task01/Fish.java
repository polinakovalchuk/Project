package ua.edu.npu.lab03.task01;

public class Fish extends Pet implements Swimming {
    public void swim() {
        System.out.println("Рыбка плывёт");
    }

    public String petType() {
        return "Рыбка";
    }

    public Fish(String owner, String name, int age) {
        super(owner, name, age);
    }
}
