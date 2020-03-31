package com.docker.test.countries.countryLanguage;

import com.docker.test.countries.country.Country;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country_language")
public class CountryLanguage {


    @Column(name = "country_code", columnDefinition = "bpchar")
    private String code;
    @Id
    @Column(name = "language")
    private String language;
    @Column(name = "is_official")
    private boolean is_official;

    @ManyToOne
    @JoinColumn(name = "country_code", insertable = false, updatable = false, nullable = false)
    private Country country;


    public CountryLanguage() {
    }
}
