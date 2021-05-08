package co.com.sofka.demo.service;

import co.com.sofka.demo.domain.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface CarRepository  extends ReactiveMongoRepository<Car, String> {
}
