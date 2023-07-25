package Classes.Animal.Pack_animal;
import java.util.Date;

public class Camel extends Pack_animal {
    public Camel(int id, String name, String command, Date birthdate, int load_capacity, int max_speed) {
        super(id, name, command, birthdate, load_capacity, max_speed);
    }

    @Override
    public void do_command() {
        System.out.println("Верблюд " + getName() + " выполняет команду: " + getCommand());
    }
}