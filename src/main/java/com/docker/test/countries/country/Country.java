package com.docker.test.countries.country;


import com.docker.test.countries.countryDTO.CountryDTO;
import com.docker.test.countries.countryLanguage.CountryLanguage;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "code", columnDefinition = "bpchar")
    private String code;
    @Column(name = "name")
    public String name;
    private String continent;
    private Integer population;
    @Column(columnDefinition = "float4")
    private Double life_expectancy;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "country")
    private Set<CountryLanguage> countryLanguage;

    public Country() {
    }

    public Country(String name, String continent, Integer population, Double life_expectancy, String country_language) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.life_expectancy = life_expectancy;
        this.countryLanguage.toArray()[0] = country_language;
    }

    public String getCode() {
        return code;
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

    public Set<CountryLanguage> getCountryLanguage() { return countryLanguage; }

}