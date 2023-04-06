package com.sanjay.cardatabase.web;

import com.sanjay.cardatabase.domain.Car;
import com.sanjay.cardatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private CarRepository repository;

    @RequestMapping("/cars")
    public Iterable<Car> getCar(){
        return repository.findAll();
    }

}
