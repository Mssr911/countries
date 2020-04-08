package com.docker.test.countries.country;


import com.docker.test.countries.country_language.CountryLanguage;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "code", columnDefinition = "bpchar")
    private String code;
    @Column(name = "name")
    public String name;
    @Column(name = "continent")
    private String continent;
    @Column(name = "population")
    private Integer population;
    @Column(name = "life_expectancy", columnDefinition = "float4")
    private Double lifeExpectancy;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "country")
    private Set<CountryLanguage> countryLanguage;

    public Country() {              // Hibernate requires empty constructor and getters
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

    public Double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public Set<CountryLanguage> getCountryLanguage() { return countryLanguage; }

}