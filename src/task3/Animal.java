package task3;

// implement the interface AnimalSound
public class Animal implements AnimalSound {

    // private field called numberOfLegs
    private int numberOfLegs;

    // constructor containing the filed
    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    // getter for the numberOfLegs
    public int getNumberOfLegs() {
        return numberOfLegs;
    }


    // makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Undefined animal makes no sound.");
    }



}
