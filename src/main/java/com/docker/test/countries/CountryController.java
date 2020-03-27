package com.docker.test.countries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    private CountryRepository repository;

    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{code}")
    public List<CountryDTO> findCountryByCode(@PathVariable String code) {
        List<String> list = repository.findByCode(code);
        List<CountryDTO> listDTO = new ArrayList<>();
        for (String l : list) {
            listDTO.add(new CountryDTO(l.split(",")));
        }
        return listDTO;
    }

}
