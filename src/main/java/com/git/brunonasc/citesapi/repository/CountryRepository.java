package com.git.brunonasc.citesapi.repository;

import com.git.brunonasc.citesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
