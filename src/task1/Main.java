package task1;


public class Main {
    public static void main (String [] args) {
        // 1h - instantiate a new Driver, populating the fields with your own name and age
        Driver driver1 = new Driver("Daniel", 25);

        // 1i
        Car car1 = new Car("Mercedes", "c class", 2020, "coupe");


        // 1j
        car1.setDriver(driver1);

        // 1k
       // System.out.println(car1.getDriver().toString());
        //  System.out.println(car1.toString());

        // 1l / 1m
        Car car2 = new Car("honda", "yo", 1000, "hatchback");
      //  System.out.println(car2.getDriver().toString());
    }


}
