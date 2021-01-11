package com.javisoft.ejercicios52.ej57;

import java.util.Arrays;

public class Ej57 {
    public static void main(String[] args) {
        Car kitt = new Car("black", "Pontiac", "Firebird Trans Am", 420, 2, "1234ABC");
        Car niceCar = new Car("red", "Ferrari", "F40", 471, 2, "420BLAZEIT");
        Car functionalCar = new Car("white", "Toyota", "Corolla", 120, 4, "0000ZZZ");
        Car[] carArr = {kitt, niceCar, functionalCar};

        Arrays.stream(carArr).forEach(car -> System.out.println(car.toString()));
    }
}
