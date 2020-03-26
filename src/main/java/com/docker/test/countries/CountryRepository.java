package com.docker.test.countries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Query("SELECT c.name, c.continent, c.population, c.life_expectancy, l.language " +
            "from Country c, CountryLanguage l where c.code = ?1 AND l.code = ?1")
    Object findByCode(String code);




}
