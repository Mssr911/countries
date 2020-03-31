package com.docker.test.countries.country;


import com.docker.test.countries.countryLanguage.CountryLanguage;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "code", columnDefinition = "bpchar")
    private String code;
    @Column(name = "name")
    private String name;
    private String continent;
    private Integer population;
    @Column(columnDefinition = "float4")
    private Double life_expectancy;

    @OneToMany(mappedBy = "country")
    private Set<CountryLanguage> countryLanguage;

    public Country() {
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
}