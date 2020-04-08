package com.docker.test.countries.country_dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDTO {

    private String name;
    private String continent;
    private Integer population;
    private Double lifeExpectancy;
    private String countryLanguage;

    public CountryDTO(String[] list) {
        if (list.length == 5) {
            name = list[0];
            continent = list[1];
            population = Integer.parseInt(list[2]);
            lifeExpectancy = Double.parseDouble(list[3]);
            countryLanguage = list[4];
        }
        if (list.length == 1) {
            name = list[0];
        }
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public Double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public String getCountryLanguage() {
        return countryLanguage;
    }
}
