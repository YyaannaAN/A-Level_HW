package ua.nezhura.hw6;


public class Task1Phone {
    int number;
    String model;
    int weight;

    public Task1Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Task1Phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 32;
    }

    public Task1Phone() {
        this.number = 13;
        this.model = "Samsung";
        this.weight = 33;
    }

    @Override
    public String toString() {
        return "number: " + this.number + ", model: " + this.model + ", weight: " + this.weight;
    }


    public void receiveCall(String name) {
        System.out.println("Звонит " + name);

    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Task1Phone phoneOne = new Task1Phone(11, "Nokia", 31);
        Task1Phone phoneTwo = new Task1Phone(12, "Apple");
        Task1Phone phoneThree = new Task1Phone();


        System.out.println("phoneOne: " + phoneOne.toString());
        System.out.println("phoneTwo: " + phoneTwo.toString());
        System.out.println("phoneThree: " + phoneThree.toString());
        phoneOne.receiveCall("Peter");
        phoneTwo.receiveCall("Jack");
        phoneThree.receiveCall("Andy");
        System.out.println("phoneOne number: " + phoneOne.getNumber());
        System.out.println("phoneTwo number: " + phoneTwo.getNumber());
        System.out.println("phoneThree number: " + phoneThree.getNumber());
    }

}

