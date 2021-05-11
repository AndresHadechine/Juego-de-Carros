package co.com.sofka.demo.service;

import co.com.sofka.demo.domain.Car;
import co.com.sofka.demo.domain.Displacement;
import co.com.sofka.demo.dto.DTOCar;
import co.com.sofka.demo.dto.DTODisplacement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.Objects;

@Service
public class Services {

    @Autowired
    private CarRepository repository;

    @Autowired
    private DisplacementRepository repositoryDisplacement;


    public Flux<Car> listAll(){
        return repository.findAll();
    }

    public Mono<DTOCar> save(DTOCar carDTO) {
        repository.findAll().filter(x -> x.getPlate() == carDTO.getPlate());
            repository.deleteById(carDTO.getPlate());
            return repository.save(carDTO);
    }

    public Mono<DTOCar> update(DTOCar carDTO){
        repository.findAll().filter(x -> x.getPlate() == carDTO.getPlate());
        repository.deleteById(carDTO.getPlate());
        return repository.save(carDTO);
    }

    public Mono<Void> delete (String place){
        return repository.deleteById(place);
    }

    public Flux<Displacement> ListDisplacementCar(String carPlate){
        return repositoryDisplacement.findAll().filter(displacement -> displacement.getCarPlate().contains(carPlate));
    }

    public Mono<DTODisplacement>saveDisplacement(DTODisplacement displacementDTO){
            displacementDTO.setCarPlate(displacementDTO.getCarPlate()+Math.random()*1000000+1);
            return repositoryDisplacement.save(Objects.requireNonNull(displacementDTO));
    }

}
