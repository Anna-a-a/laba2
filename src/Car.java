import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private String number;

    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.number = "Unknown";
    }

    public Car(String make, String model, String number){
        this.make = make;
        this.model = model;
        this.number = number;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void Start(Car car){
        System.out.println("Машина " + car.make + " " + car.model + " завелась");
    }

    public void Stop(Car car){
        System.out.println("Машина " + car.make + " " + car.model + " остановилась");
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Number: " + number);
    }

}
