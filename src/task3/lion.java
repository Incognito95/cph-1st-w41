package task3;

public class lion extends Animal {
    public lion (int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("Rawrr rawrr!!!");
    }
}
