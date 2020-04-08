package com.docker.test.countries.country_language;

import com.docker.test.countries.country.Country;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "country_language")
public class CountryLanguage {

    @Id
    @Column(name = "country_code", columnDefinition = "bpchar")
    @JsonIgnore
    private String code;
    @Column(name = "language")
    private String language;
    @Column(name = "is_official")
    private boolean isOfficial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_code", insertable = false, updatable = false, nullable = false)
    private Country country;


    public CountryLanguage() {          // Hibernate requires empty constructor and getters
    }

    public String getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isIsOfficial() {
        return isOfficial;
    }

}
