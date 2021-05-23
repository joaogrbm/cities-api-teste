package com.github.joaogrbm.citiesapi.countries.repository;

import com.github.joaogrbm.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
