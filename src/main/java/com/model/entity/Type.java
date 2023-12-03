package com.model.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class Type {
	
	@Enumerated(EnumType.STRING)
	private TypeEnum typeName;
	
	private List<String> resitances;
	
	private List<String> immunities;
	
	private List<String> weaknesses;

	public Type(TypeEnum typeName) {
		this.typeName = typeName;
	}
	
}
