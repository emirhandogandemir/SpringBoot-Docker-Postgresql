package com.example.bestcloudforme.domain;

import javax.persistence.*;

@Entity
@Table(name="cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="temperature",nullable = false)
    private double temperature;

    public City() {

    }

    public City(Long id, String name, double temperature) {
        this.id = id;
        this.name = name;
        this.temperature = temperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
