package task1;

// 1c
public class Car {
    String make;
    String model;
    int year;
    String bodystyle;
    Driver driver;


    // 1d - constructor that populates all the fields above, except the Driver
    public Car(String make, String model, int year, String bodystyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodystyle = bodystyle;
    }

    // 1e - Getter and a Setter for the Driver variable
    // Getter
    public Driver getDriver() {
        return driver;
    }

    // setter
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // 1f - override toString method in Car class returning:
    //  return "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle;
    @Override
    public String toString() {
        return "Make: " + make + ". Model: " + model + " (" + year + "), bodystyle: " + bodystyle;
    }

        // 1g - override toString method in the Driver class returning:
        // " is driven by "+name
        // public String toString () {
        // return;
        // }

    }
