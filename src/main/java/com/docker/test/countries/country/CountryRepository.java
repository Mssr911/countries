package com.docker.test.countries.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("SELECT c.name, c.continent, c.population, c.life_expectancy, c.code " +
            "from Country c JOIN c.countryLanguage l where c.code = :code and l.is_official=true")
    List<String> findByCode(String code);

    Country findByName(String name);

}
