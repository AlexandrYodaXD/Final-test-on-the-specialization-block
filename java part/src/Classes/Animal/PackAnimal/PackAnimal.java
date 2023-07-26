package Classes.Animal.PackAnimal;

import Classes.Animal.Animal;

import java.util.Date;

public abstract class PackAnimal extends Animal {
    private int load_capacity;
    private int max_speed;

    public PackAnimal(int id, String name, String command, Date birthdate, int load_capacity, int max_speed) {
        super(id, name, command, birthdate);
        this.load_capacity = load_capacity;
        this.max_speed = max_speed;
    }

    public int getLoad_capacity() {
        return load_capacity;
    }

    public void setLoad_capacity(int load_capacity) {
        this.load_capacity = load_capacity;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", переносимый вес: " + load_capacity +
                ", макс. скорость: " + max_speed;
    }
}
