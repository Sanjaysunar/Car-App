package com.sanjay.cardatabase;

import com.sanjay.cardatabase.domain.Car;
import com.sanjay.cardatabase.domain.CarRepository;
import com.sanjay.cardatabase.domain.Owner;
import com.sanjay.cardatabase.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CarAppApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CarAppApplication.class);

    @Autowired
    private CarRepository repository;
    @Autowired
    private OwnerRepository orepository;

    public static void main(String[] args) {
        SpringApplication.run(CarAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add owner objects and save these to db
        Owner owner1 = new Owner("Sanjay" , "Sunar");
        Owner owner2 = new Owner("San" , "Tech");
        orepository.saveAll(Arrays.asList(owner1, owner2));

        // Add car object and link to owners and save these to db
        Car car1 = new Car("Ford", "Mustang", "Red",
                "ADF-1121", 2021, 59000, owner1);
        Car car2 = new Car("Nissan", "Leaf", "White",
                "SSJ-3002", 2019, 29000, owner2);
        Car car3 = new Car("Toyota", "Prius", "Silver",
                "KKO-0212", 2020, 39000, owner2);
        repository.saveAll(Arrays.asList(car1, car2, car3));

        // Fetch all cars and logs to console
        for (Car car : repository.findAll()) {
            logger.info(car.getBrand() + " " + car.getModel());
        }
    }
}
