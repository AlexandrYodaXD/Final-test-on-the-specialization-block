package Classes.Animal;

import Interfaces.Command;

import java.util.Date;

public abstract class Animal implements Command {
    private int id;
    private String name;
    private String command;
    private Date birthdate;

    // Конструктор
    public Animal(int id, String name, String command, Date birthdate) {
        this.id = id;
        this.name = name;
        this.command = command;
        this.birthdate = birthdate;
    }

    // Геттеры и Сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

}