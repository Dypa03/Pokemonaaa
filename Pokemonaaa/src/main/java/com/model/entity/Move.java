package com.model.entity;


import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
public class Move {

	@Id
	@Column(name="move_id")
	private Integer moveId;
	
	@Column(name="move_name")
	private String moveName;
	
	private Type type;
	
	private Integer damage;
	
	private Integer precision;
	
	@Column(name="moveType")
	@Enumerated(EnumType.STRING)
	private MoveTypeEnum moveType;
	
	private Integer pp;
	
	//private String effect;
	
	@ManyToMany(mappedBy = "battleMoves")
	private List<Pokemon> battlingPokemons;
	
	@ManyToMany(mappedBy = "learningMoves")
	private Set<PokemonSpecie> learningPokemons;

	// Insert
	public Move(String moveName, Type type, Integer damage, Integer precision, MoveTypeEnum moveType, Integer pp) {
		this.moveName = moveName;
		this.type = type;
		this.damage = damage;
		this.precision = precision;
		this.moveType = moveType;
		this.pp = pp;
	}
	
}
