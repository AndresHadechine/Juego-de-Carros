package co.com.sofka.demo.service;

import co.com.sofka.demo.domain.Displacement;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DisplacementRepository extends ReactiveMongoRepository<Displacement, String> {
}
