package co.com.sofka.demo.service;

import co.com.sofka.demo.domain.Car;
import co.com.sofka.demo.dto.DTOCar;
import co.com.sofka.demo.repository.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class Services {

    @Autowired
    private CarRepository repository;

    public Flux<Car> listAll(){
        return repository.findAll();
    }

    public Mono<DTOCar> save(DTOCar carDTO) {
        repository.findAll().filter(x -> x.getPlate() == carDTO.getPlate());
            repository.deleteById(carDTO.getPlate());
            return repository.save(carDTO);
    }
    public Mono<Void> delete (String place){
        return repository.deleteById(place);
    }


}
