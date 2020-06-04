package ua.edu.npu.lab02.task02;

public class Dog {
    int age;
    String name = "";

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void voice () {
        System.out.println(name);
        for(int i=0; i<age; i++){
            System.out.print("гав ");
        }
        System.out.println("");
    }
}
