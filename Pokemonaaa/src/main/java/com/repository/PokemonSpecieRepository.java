package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.entity.PokemonSpecie;

public interface PokemonSpecieRepository extends JpaRepository<PokemonSpecie, Integer>{

}
