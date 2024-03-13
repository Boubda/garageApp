package io.tutorial.spring.garageApp.controleur;

import io.tutorial.spring.garageApp.modele.Car;
import io.tutorial.spring.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class GarageControleur {
    @Autowired
    private GarageService garageService;
   // private String model;

    @RequestMapping("/hello")
  public String sayHello() {
       return("hello world");
   }
   @RequestMapping("/cars")
    public List<Car> getCard() {
       return garageService.gatCars();
    }
    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable("id") long id){
        return garageService.gatCar(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/car/{id}")
    public void deleterCar(@PathVariable long id){
        garageService.deleCar(id);
    }
    @RequestMapping(method = RequestMethod.POST,value="/car")
    public Car addCar(@RequestBody Car car){
       return garageService.addCar(car);
    }
    @RequestMapping(method = RequestMethod.PUT,value="/car/{id}")
    public Car updateCar(@RequestBody Car car,@PathVariable long id){
        return garageService.updateCar(car, id);
    }
}
