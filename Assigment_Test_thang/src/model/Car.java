/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author letha
 */
public class Car implements Comparable, Serializable {

    String carId;
    Brand brand;
    String color;
    String frameId;
    String engineId;

    public Car() {
    }

    public Car(String carId, Brand brand, String color, String frameId, String engineId) {
        this.carId = carId;
        this.brand = brand;
        this.color = color;
        this.frameId = frameId;
        this.engineId = engineId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameId() {
        return frameId;
    }

    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public String screenString() {
        return brand + "\n" + carId + ", " + color + ", " + frameId + ", " + engineId;
    }

    @Override
    public String toString() {
        return carId + ", " + brand.getBrandId() + ", " + color + ", " + frameId + ", " + engineId;
    }

    @Override
    public int compareTo(Object t) {
        Car car = (Car) t;
        return this.getBrand().getBrandName().compareTo(car.getBrand().getBrandName());
    }

}
