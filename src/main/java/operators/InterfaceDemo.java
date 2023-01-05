package operators;

import implementation.Car;
import interfaces.IVehicle;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDemo {
    public static void main(String... args){
        Car car = new Car ();
        Car car2=new Car();
        Car car3=new Car();
      //  IVehicle vehicle = new Car();
       // vehicle.calculateMileage ();
        List<Car> carList = new ArrayList<Car>();

        System.out.println("List size "+carList.size());

         car.setName("Baleno");
         car.setModel("2017");
         carList.add(car);
        car2.setName("Baleno");
        car2.setModel("2020");
        car3.setName("Mercedes");
        car3.setModel("2022");
        carList.add(car2);
        carList.add(car3);
        for (Car car1 : carList) {
           System.out.println(" Car is "+car1.getName());
        }



        System.out.println("List size after adding "+carList.size());



    }
}
