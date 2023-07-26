package Classes.Animal.PetRegistry;

class Counter implements AutoCloseable {
    private int count ;

    public Counter() {
        this.count  = 0;
    }

    public int getValue() {
        return count ;
    }

    public int add() {
        return ++count;
    }

    @Override
    public void close() {
        System.out.println("Завершение работы счетчика");
    }
}