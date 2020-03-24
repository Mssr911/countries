package com.docker.test.countries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private CountryRepository repository;

    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{code}")
    public Country findCountryByCode(@PathVariable String code) {
        return repository.findByCode(code);
    }
}
