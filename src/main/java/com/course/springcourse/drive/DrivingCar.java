package com.course.springcourse.drive;

public class DrivingCar {

    private Car car;

    public DrivingCar(Car car) {
        this.car = car;
    }

    public void driveCar() {
        System.out.println("Choosen: " + car.typeTransmission());
    }
}
