package Classes.Animal.Pet;

import Classes.Animal.Animal;

import java.util.Date;

public abstract class Pet extends Animal {
    private String breed;
    private Boolean trained;

    public Pet(int id, String name, String command, Date birthdate, String breed, Boolean trained) {
        super(id, name, command, birthdate);
        this.breed = breed;
        this.trained = trained;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Boolean getTrained() {
        return trained;
    }

    public void setTrained(Boolean trained) {
        this.trained = trained;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", порода: " + breed +
                ", дрессирован: " + trained;
    }
}
