package co.com.sofka.demo.dto;

import co.com.sofka.demo.domain.Car;
import co.com.sofka.demo.domain.Driver;

public class DTOCar extends Car {

    public DTOCar(String plate, String brand, Integer modelo, Driver driver) {
        super(plate, brand, modelo, driver);
    }
}
