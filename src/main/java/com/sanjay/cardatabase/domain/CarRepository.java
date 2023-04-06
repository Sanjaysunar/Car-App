package com.sanjay.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CarRepository extends CrudRepository<Car, Long> {
}
