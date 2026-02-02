package objectOrientedProgramming.inheritance;

class Persons {
    String name;
    int id;

    // Constructor
    Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties();
}


class Chef extends Persons implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is preparing meals.");
    }
}


class Waiter extends Persons implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers.");
    }
}


public class RestaurantTest {
    public static void main(String[] args) {

        Chef chef = new Chef("Ravi", 101);
        Waiter waiter = new Waiter("Amit", 102);

        System.out.println("---- Chef ----");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\n---- Waiter ----");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
