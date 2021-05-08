package co.com.sofka.demo.dto;

import co.com.sofka.demo.domain.Car;
import co.com.sofka.demo.domain.Driver;

public class DTOCar extends Car {

    public DTOCar(String plate, String brand, Integer model, Driver driver) {
        super(plate, brand, model, driver);
    }

    public DTOCar() {

    }

    public Car convertInCar(){
        Car car = new Car();
        car.setPlate(this.getPlate());
        car.setBrand(this.getBrand());
        car.setModel(this.getModel());
        car.setDriver(this.getDriver());
        return car;
    }

    public void convertInDTO(Car car){
        setPlate(car.getPlate());
        setBrand(car.getBrand());
        setModel(car.getModel());
        setDriver(car.getDriver());
    }
}
