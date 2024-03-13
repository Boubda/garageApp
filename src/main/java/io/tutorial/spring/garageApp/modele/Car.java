 package io.tutorial.spring.garageApp.modele;

 import com.fasterxml.jackson.annotation.JsonTypeId;
 import jakarta.persistence.Column;
 import jakarta.persistence.Entity;
 import jakarta.persistence.Id;
 import org.springframework.boot.autoconfigure.domain.EntityScan;

 import javax.lang.model.element.Name;

 @Entity

public class Car {
     @Id

    private long id;
    private String model;
    private String brand;
     @Column(name = "released_year")
    private int year;
    private Color color;
    public Car() {

    }

    public Car(long id,String model, String brand, int year, Car.Color color) {
        super();
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public enum Color{
        red,
        bleu,
        green,
        yellow
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car.Color getColor() {
        return color;
    }

    public void setColor(Car.Color color) {
        this.color = color;
    }

}
