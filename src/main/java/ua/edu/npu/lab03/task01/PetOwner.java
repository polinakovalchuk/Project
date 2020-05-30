package ua.edu.npu.lab03.task01;

import java.util.ArrayList;

public class PetOwner {
    String name = new String();
    public PetOwner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    ArrayList<Pet> ownedPets = new ArrayList<>();

    public void petAdd (String petType, String petName, int age) {
        switch (petType){
            case "Dog":
                ownedPets.add(new Dog(name, petName, age));
                break;
            case "Fish":
                ownedPets.add(new Fish(name, petName, age));
                break;
            case "Cat":
                ownedPets.add(new Cat(name, petName, age));
                break;
            case "Duck":
                ownedPets.add(new Duck(name, petName, age));
                break;
            case "Turtle":
                ownedPets.add(new Turtle(name, petName, age));
                break;
            case "Eagle":
                ownedPets.add(new Eagle(name, petName, age));
                break;
        }
    }

    public void petRemove(String name, int age) {
        ownedPets.removeIf(pet -> pet.petName.equals(name) && pet.age == age);
    }

    public void showOwnedPets() {
        System.out.println("Владелец: " + name);
        for (int i=0; i<ownedPets.size(); i++) {
            System.out.println("Вид: " + ownedPets.get(i).petType() + "    Имя: " + ownedPets.get(i).getPetName() + "    Возраст: " + ownedPets.get(i).getAge());
        }
        System.out.println("");
    }
}
