package com.docker.test.countries.country;

import com.docker.test.countries.countryDTO.CountryDTO;
import com.docker.test.countries.countryDTO.CountryDTOService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private CountryRepository repository;
    private CountryDTOService service;

    public CountryController(CountryRepository repository, CountryDTOService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/{code}")
    public List<CountryDTO> findCountryByCode(@PathVariable String code) {
        List<String> list = repository.findByCode(code);
        return service.convertToDTOList(list);
    }


}