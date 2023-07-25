package Classes.Animal.Pack_animal;

import Classes.Animal.Animal;

import java.util.Date;

public abstract class Pack_animal extends Animal {
    private int load_capacity;
    private int max_speed;

    public Pack_animal(int id, String name, String command, Date birthdate, int load_capacity, int max_speed) {
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
}
