package com.model.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


@Entity
public class PokemonSpecie {
	
	@Id
	@Column(name = "pokedex_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pokedexId;
	
	@Column(name = "specie_name")
	private String specieName;
	
	@Column(name="primary_type")
	@NonNull
	private Type primaryType;
	
	@Column(name="secondary_type")
	@Nullable
	private Type secondaryType;
	
	@ManyToMany
	@JoinTable(name = "learning_moves", joinColumns = @JoinColumn(name = "pokedex_id"), inverseJoinColumns = @JoinColumn(name = "move_id"))
	private Set<Move> learningMoves;
	
	@Column(name="base_stats")
	private Map<StatsEnum, Integer> baseStats;
	
	@OneToMany(mappedBy = "specie")
	private List<Pokemon> pokemons;

	// Insert
	public PokemonSpecie(String specieName, Type primaryType, Type secondaryType, Set<Move> learningMoves,
			Map<StatsEnum, Integer> baseStats) {
		this.specieName = specieName;
		this.primaryType = primaryType;
		this.secondaryType = secondaryType;
		this.learningMoves = learningMoves;
		this.baseStats = baseStats;
	}
	
	
}
