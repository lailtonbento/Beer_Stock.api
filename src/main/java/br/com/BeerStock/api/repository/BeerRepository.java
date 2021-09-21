package br.com.BeerStock.api.repository;

import br.com.BeerStock.api.model.Beer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface BeerRepository extends MongoRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
