package com.docker.test.countries.countryLanguage;

import com.docker.test.countries.country.Country;

import javax.persistence.*;

@Entity
@Table(name = "country_language")
public class CountryLanguage {

    @Id
    @Column(name = "country_code")
    private String code;
    @Column(name = "language")
    private String language;
    @Column(name = "is_official")
    private boolean is_official;

    @OneToOne
    @MapsId
    private Country country;


    public CountryLanguage() {
    }
}
