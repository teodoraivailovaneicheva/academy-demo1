package org.example;

import org.example.model.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        Car car = new Car();
        Car car2 = new Car();
        car.setBrand("Honda");
        car.equals(car2);
        //Car car3 = new Car.CarBuilder()
//                .engineVolume("2.2")
//                .brand("Honda")
//                .model("Accord").build();

    }
}