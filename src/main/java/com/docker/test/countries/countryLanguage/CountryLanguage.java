package com.docker.test.countries.countryLanguage;

import com.docker.test.countries.country.Country;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Set;

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
    private boolean is_official;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "country_code", insertable = false, updatable = false, nullable = false)
    private Country country;


    public CountryLanguage() {
    }

    public String getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isIs_official() {
        return is_official;
    }

    public String getCountry_Name() {
        return country.getName();
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
