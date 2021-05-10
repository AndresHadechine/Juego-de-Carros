package co.com.sofka.demo.domain;

import org.springframework.data.annotation.Id;

public class Car {

    @Id
    private String plate;

    private String brand;
    private Integer Model;
    private Driver driver;

    public Car(String plate, String brand, Integer model, Driver driver) {
        this.plate = plate;
        this.brand = brand;
        Model = model;
        this.driver = driver;
    }

    public Car() {
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getModel() {
        return Model;
    }

    public void setModel(Integer model) {
        Model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
