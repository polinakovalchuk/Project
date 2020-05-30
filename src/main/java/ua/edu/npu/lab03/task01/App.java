package ua.edu.npu.lab03.task01;

import java.util.ArrayList;

public class App {
    public static int ownerName(String ownName, ArrayList<PetOwner> owners) {
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getName().equals(ownName)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<PetOwner> ownersArray = new ArrayList<>();
        ownersArray.add(new PetOwner("Джон"));
        ownersArray.get(ownerName("Джон", ownersArray)).petAdd("Dog", "Саймон", 6);
        ownersArray.get(ownerName("Джон", ownersArray)).showOwnedPets();
        ownersArray.add(new PetOwner("Алекс"));
        ownersArray.get(ownerName("Алекс", ownersArray)).petAdd("Duck", "Арнольд", 3);
        ownersArray.get(ownerName("Джон", ownersArray)).petAdd("Turtle", "Тефтелька", 12);
        ownersArray.get(ownerName("Джон", ownersArray)).showOwnedPets();
        ownersArray.get(ownerName("Алекс", ownersArray)).showOwnedPets();
        ownersArray.get(ownerName("Джон", ownersArray)).petRemove("Саймон", 6);
        ownersArray.get(ownerName("Джон", ownersArray)).showOwnedPets();
    }


}
