package io.tutorial.spring.garageApp.service;

import io.tutorial.spring.garageApp.modele.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.tutorial.spring.garageApp.repository.GarageRepository;

import java.util.ArrayList;
import java.util.List;

@Service


public class GarageService {
    @Autowired
    private GarageRepository garageRepository;
   public List<Car> gatCars(){
       List<Car> cars =new ArrayList<>();
       garageRepository.findAll().forEach(car -> {
           cars.add(car);

       });
       return cars;
   }

    public Car gatCar(long id) {

       return garageRepository.findById(id).orElse(null);
    }

    public void deleCar(long id) {
       garageRepository.deleteById(id);
    }

    public Car addCar(Car car) {
        return garageRepository.save(car);
    }

    public Car updateCar(Car car, long id) {
        Car car1 = garageRepository.findById(id).orElse(null);
        car1.setModel(car.getModel());
        car1.setColor(car.getColor());
        car1.setBrand(car.getBrand());
        car1.setYear(car.getYear());
      return garageRepository.save(car1);
    }
}
