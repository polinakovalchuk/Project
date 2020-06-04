package ua.edu.npu.lab02.task03;

public class Dog {
    int age;
    String name = "";

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Dog(){
        name = "Незнакомец";
        age = 0;
    }

    private void voice () {
        for(int i=0; i<age; i++){
            System.out.print("гав ");
        }
        System.out.println("");
    }

    public void dogInfo () {
        System.out.println("Имя: " + name + ", возраст: " + age + " лет");
        voice();
    }
}
