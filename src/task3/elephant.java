package task3;

public class elephant extends Animal {
    public elephant (int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("wooooooo!!!!");
    }
}