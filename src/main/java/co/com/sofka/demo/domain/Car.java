package co.com.sofka.demo.domain;

import org.springframework.data.annotation.Id;

public class Car {

    @Id
    private String plate;

    private String brand;
    private Integer Modelo;
    private Driver driver;

    public Car(String plate, String brand, Integer modelo, Driver driver) {
        this.plate = plate;
        this.brand = brand;
        Modelo = modelo;
        this.driver = driver;
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

    public Integer getModelo() {
        return Modelo;
    }

    public void setModelo(Integer modelo) {
        Modelo = modelo;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
