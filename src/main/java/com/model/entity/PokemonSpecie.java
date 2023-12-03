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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

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
	private TypeEnum primaryType;
	
	@Column(name="secondary_type")
	@Nullable
	private TypeEnum secondaryType;
	
	@ManyToMany
	@JoinTable(name = "learning_moves", joinColumns = @JoinColumn(name = "pokedex_id"), inverseJoinColumns = @JoinColumn(name = "move_id"))
	private Set<Move> learningMoves;
	
	private Integer hp;
	
	private Integer atk;
	
	private Integer def;
	
	@Column(name="sp_atk")
	private Integer spAtk;
	
	@Column(name="sp_def")
	private Integer spDef;
	
	private Integer spd;
	
	@OneToMany(mappedBy = "specie")
	private List<Pokemon> pokemons;

	// Insert
	public PokemonSpecie(String specieName, TypeEnum primaryType, TypeEnum secondaryType, Set<Move> learningMoves,
			Integer hp, Integer atk, Integer def, Integer spAtk, Integer spDef, Integer spd) {
		this.specieName = specieName;
		this.primaryType = primaryType;
		this.secondaryType = secondaryType;
		this.learningMoves = learningMoves;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.spAtk = spAtk;
		this.spDef = spDef;
		this.spd = spd;
	}
	
}
