package com.model.entity;


import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
public class Move {

	@Id
	@Column(name="move_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer moveId;
	
	@Column(name="move_name")
	private String moveName;
	
	@Enumerated(EnumType.STRING)
	private TypeEnum type;
	
	private Integer damage;
	
	@Column(name="move_precision")
	private Integer movePrecision;
	
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
	public Move(String moveName, TypeEnum type, Integer damage, Integer movePrecision, MoveTypeEnum moveType, Integer pp) {
		this.moveName = moveName;
		this.type = type;
		this.damage = damage;
		this.movePrecision = movePrecision;
		this.moveType = moveType;
		this.pp = pp;
	}
	
}
