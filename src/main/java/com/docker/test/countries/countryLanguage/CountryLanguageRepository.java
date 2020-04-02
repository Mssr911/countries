package com.docker.test.countries.countryLanguage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {

    @Query("select l.language, l.country.name from CountryLanguage l where l.language = :language")
    List<String> findByLanguage(String language);
}
