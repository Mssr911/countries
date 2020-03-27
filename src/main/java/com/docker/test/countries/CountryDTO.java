package com.docker.test.countries;

import javax.persistence.Id;
import java.util.List;

public class CountryDTO {
    @Id
    private String name;
    private String continent;
    private String population;
    private String life_expectancy;
    private String country_language;

    public CountryDTO(String[] list) {
        name = list[0];
        continent = list[1];
        population = list[2];
        life_expectancy = list[3];
        country_language = list[4];

    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getPopulation() {
        return population;
    }

    public String getLife_expectancy() {
        return life_expectancy;
    }

    public String getCountry_language() {
        return country_language;
    }
}
