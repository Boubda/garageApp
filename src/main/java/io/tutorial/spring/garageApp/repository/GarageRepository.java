package io.tutorial.spring.garageApp.repository;

import io.tutorial.spring.garageApp.modele.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car,Long> {
}
