package ua.edu.npu.lab02.task04;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Майк", 4);
        Dog.dogsCreated();
        Dog dog3 = new Dog();
        Dog.dogsCreated();
    }
}
