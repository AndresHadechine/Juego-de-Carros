package co.com.sofka.demo.controller;

import co.com.sofka.demo.domain.Car;
import co.com.sofka.demo.dto.DTOCar;
import co.com.sofka.demo.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {

    @Autowired
    Services service;

    @GetMapping(value = "/ListAll")
    public Flux<Car> list(){
        return service.listAll();
    }

    @PostMapping("/save")
    public Mono<DTOCar> save(@RequestBody DTOCar carDTO) {
        return service.save(carDTO);
    }

    @PutMapping("/update")
    public Mono<DTOCar> update(@RequestBody DTOCar carDTO) {
        return service.update(carDTO);
    }

    @DeleteMapping("/delete/{plate}")
    public Mono<Void> delete(@PathVariable("plate") String plate){
        return service.delete(plate);
    }

}

