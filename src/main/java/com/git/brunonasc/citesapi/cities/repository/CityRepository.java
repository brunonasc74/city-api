package com.git.brunonasc.citesapi.cities.repository;

import com.git.brunonasc.citesapi.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
