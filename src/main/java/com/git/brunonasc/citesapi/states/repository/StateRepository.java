package com.git.brunonasc.citesapi.states.repository;

import com.git.brunonasc.citesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
