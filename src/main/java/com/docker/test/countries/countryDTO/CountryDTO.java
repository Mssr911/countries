package com.docker.test.countries.countryDTO;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryDTO {

    public CountryDTO(){}
    @Id
    private String name;
    private String continent;
    private Integer population;
    private Double life_expectancy;
    private String country_language;
    private String is_official;

    public CountryDTO(String[] list) {
        if(list.length == 5) {
            name = list[0];
            continent = list[1];
            population = Integer.parseInt(list[2]);
            life_expectancy = Double.parseDouble(list[3]);
            country_language = list[4];
        }
        if(list.length == 3) {
            country_language = list[0];
            name = list[1];
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

    public Double getLife_expectancy() {
        return life_expectancy;
    }

    public String getCountry_language() {
        return country_language;
    }

    public void setCountry_language(String country_language) {
        this.country_language = country_language;
    }
}
