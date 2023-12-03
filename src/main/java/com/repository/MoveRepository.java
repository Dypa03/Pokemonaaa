package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.entity.Move;

public interface MoveRepository extends JpaRepository<Move, Integer> {

}
