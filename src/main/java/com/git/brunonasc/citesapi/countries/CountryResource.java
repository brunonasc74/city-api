package com.git.brunonasc.citesapi.countries;

import com.git.brunonasc.citesapi.countries.Country;
import com.git.brunonasc.citesapi.countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repositoty) {
        this.repository = repositoty;
    }

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll((org.springframework.data.domain.Pageable) page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<? extends Object> getOne(@PathVariable Long id) {
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
