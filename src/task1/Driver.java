package task1;

// 1a
public class Driver {
    String name;
    int age;

    // 1b
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Is driven by " + name;
    }

}