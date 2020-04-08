package com.docker.test.countries.country;

import com.docker.test.countries.country_dto.CountryDTO;
import com.docker.test.countries.country_dto.CountryDTOService;
import com.docker.test.countries.country_language.CountryLanguageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private CountryRepository countryRepository;
    private CountryDTOService service;
    private CountryLanguageRepository languageRepository;

    public CountryController(CountryRepository repository, CountryDTOService service, CountryLanguageRepository languageRepository) {
        this.countryRepository = repository;
        this.service = service;
        this.languageRepository = languageRepository;
    }

    @GetMapping("/{code}")
    public List<CountryDTO> findCountryByCode(@PathVariable String code) {
        List<String> list = countryRepository.findUsingCode(code);
        return service.convertToDTOList(list);
    }

    @GetMapping("/name/{name}")
    public Country findByName(@PathVariable String name) {

        return countryRepository.findByName(name);
    }

    @GetMapping("/lang/{lang}")
    public List<CountryDTO> findByLang(@PathVariable String lang) {
        List<String> list = languageRepository.findUsingLanguage(lang);
        return service.convertToDTOList(list);
    }
}
