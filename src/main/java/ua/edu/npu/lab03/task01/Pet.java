package ua.edu.npu.lab03.task01;

public abstract class Pet {
    String petName = new String();
    String owner = new String();
    int age;

    abstract public String petType();

    public Pet(String owner, String petName, int age) {
        this.petName = petName;
        this.owner = owner;
        this.age = age;
    }

    public Pet() {
        petName = "Незнакомец";
        owner = "Неизвестен";
        age = 0;
    }

    public int getAge() {
        return age;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwner() {
        return owner;
    }
}
