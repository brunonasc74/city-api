package com.git.brunonasc.citesapi;

import com.git.brunonasc.citesapi.countries.Country;
import com.git.brunonasc.citesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repositoty;

    public CountryResource(CountryRepository repositoty) {
        this.repositoty = repositoty;
    }

    @GetMapping
    public List<Country> countries() {
        return repositoty.findAll();
    }
}
