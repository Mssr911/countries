package com.docker.test.countries.country_language;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {

    @Query("select l.country.name from CountryLanguage l where l.language = :language")
    List<String> findUsingLanguage(String language);

    List<CountryLanguage> findAllByCode(String code);

}
