package implementation;

import interfaces.IVehicle;

public class Car implements IVehicle {
    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void calculateMileage() {
        System.out.println("This car gives 20kmpl");
    }

    @Override
    public void calculatePickUp() {
       System.out.println("This car reaches 0-60 in 1 minute");
    }
    public static void main(String... args){
        Car car = new Car();
        car.calculateMileage ();
        car.calculatePickUp ();
    }
}
