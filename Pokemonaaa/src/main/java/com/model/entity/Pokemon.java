package com.model.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Pokemon {

	@Id
	@Column(name = "pokemon_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pokemonId;
	
	@ManyToOne
	@JoinColumn(name = "pokedex_id")
	private PokemonSpecie specie;
	
	private String nickname = specie.getSpecieName();
	
	@ManyToMany
	@JoinTable(name = "battle_moves", joinColumns = @JoinColumn(name = "pokemon_id"), inverseJoinColumns = @JoinColumn(name = "move_id"))
	private Set<Move> battleMoves = null;
	
	
	//private String ability;
	
	@Column(name="iv_spread")
	private Map<StatsEnum, Integer> ivSpread;
	
	@Column(name="ev_spread")
	private Map<StatsEnum, Integer> evSpread;

	// Insert
	public Pokemon(Integer pokemonId, PokemonSpecie specie) {
		this.pokemonId = pokemonId;
		this.specie = specie;
		
		this.ivSpread = new HashMap<>();
		ivSpread.put(StatsEnum.HP, 31);
		ivSpread.put(StatsEnum.ATK, 31);
		ivSpread.put(StatsEnum.DEF, 31);
		ivSpread.put(StatsEnum.SP_ATK, 31);
		ivSpread.put(StatsEnum.SP_DEF, 31);
		ivSpread.put(StatsEnum.SPD, 31);
		
		this.evSpread = new HashMap<>();
		evSpread.put(StatsEnum.HP, 0);
		evSpread.put(StatsEnum.ATK, 0);
		evSpread.put(StatsEnum.DEF, 0);
		evSpread.put(StatsEnum.SP_ATK, 0);
		evSpread.put(StatsEnum.SP_DEF, 0);
		evSpread.put(StatsEnum.SPD, 0);
	}
}
