package com.docker.test.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    @Column(columnDefinition = "bpchar")
    private String code;
    private String name;
    private String continent;
    private Integer population;
    @Column(columnDefinition = "float4")
    private Double life_expectancy;

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Double getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(Double life_expectancy) {
        this.life_expectancy = life_expectancy;
    }
}
