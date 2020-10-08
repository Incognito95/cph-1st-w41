package task3;

public class Main {
    public static void main(String [] args) {
        Zoo københavn = new Zoo();
        lion Peter = new lion(4);
        københavn.addAnimal(Peter);

        elephant Daniel = new elephant(4);
        københavn.addAnimal(Daniel);

        cheetah Jaan = new cheetah(4);
        københavn.addAnimal(Jaan);
        københavn.makeAllSounds();
        københavn.printNumberOfLegs();

    }
}
