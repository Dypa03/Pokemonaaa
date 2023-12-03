package com.service;

import java.util.List;

import com.model.entity.PokemonSpecie;

public interface PokemonSpecieService {

	PokemonSpecie insertOrUpdateSpecie(PokemonSpecie specie);
	
	List<PokemonSpecie> selectAllSpecies();
	
	void deleteSpecieById(Integer specieId);
}
