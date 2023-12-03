package com.service;

import java.util.List;

import com.model.entity.Move;

public interface MoveService {

	Move insertOrUpdateMove(Move move);
	
	List<Move> selectAllMoves();
	
	void deleteMoveById(Integer moveId);
}
