package co.com.sofka.demo.controller;

import co.com.sofka.demo.domain.Car;
import co.com.sofka.demo.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {

    @Autowired
    Services service;

    @GetMapping(value = "api/ListAll")
    public Flux<Car> list(){
        return service.listAll();
    }




}

