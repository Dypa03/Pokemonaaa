package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.entity.PokemonSpecie;
import com.model.entity.Type;
import com.repository.PokemonSpecieRepository;

@Service
public class PokemonSpecieServiceImpl implements PokemonSpecieService {

    @Autowired
    private PokemonSpecieRepository pokemonSpecieRepository;

    @Override
    public PokemonSpecie insertOrUpdateSpecie(PokemonSpecie specie) {
        if (specie == null) {
            throw new IllegalArgumentException("Data Integrity Error: Input Data was null");
        }
        return pokemonSpecieRepository.save(specie);
    }

    @Override
    public List<PokemonSpecie> selectAllSpecies() {
        return pokemonSpecieRepository.findAll();
    }

    @Override
    public void deleteSpecieById(Integer specieId) {
        if (specieId == null) {
            throw new IllegalArgumentException("Data Integrity Error: Input Data was null");
        }
        pokemonSpecieRepository.deleteById(specieId);
    }
}

