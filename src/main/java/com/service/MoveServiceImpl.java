package com.service;

import java.util.List;
import com.model.entity.Move;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.entity.Move;
import com.repository.MoveRepository;

@Service
public class MoveServiceImpl implements MoveService {

    @Autowired
    private MoveRepository moveRepository;

    @Override
    public Move insertOrUpdateMove(Move move) {
        if (move == null) {
            throw new IllegalArgumentException("Data Integrity Error: Input Data was null");
        }
        return moveRepository.save(move);
    }

    @Override
    public List<Move> selectAllMoves() {
        return moveRepository.findAll();
    }

    @Override
    public void deleteMoveById(Integer moveId) {
        if (moveId == null) {
            throw new IllegalArgumentException("Data Integrity Error: Input Data was null");
        }
        moveRepository.deleteById(moveId);
    }
}
