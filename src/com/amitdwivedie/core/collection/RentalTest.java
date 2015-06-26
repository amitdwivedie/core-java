package com.amitdwivedie.core.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class RentalTest {

    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("Audi");

        List<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);

        RentalGeneric<Car> rentalGeneric = new RentalGeneric<>(cars, 2);
        Car carToRent = rentalGeneric.getRental();
        System.out.println(carToRent);
        rentalGeneric.returnRental(carToRent);

        cars.add(new Car("Honda"));
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + "]";
    }

}

class Bike {
    private String name;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bike [name=" + name + "]";
    }

}