package com.bean;

import com.model.entity.Move;
import com.model.entity.Pokemon;
import com.model.entity.PokemonSpecie;
import com.model.entity.StatsEnum;
import com.model.entity.Type;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PokemonSpecieBean {

    public static PokemonSpecie insertCharizard() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertFlamethrower());
        moves.add(MoveBean.insertDragonPulse());
        moves.add(MoveBean.insertEarthquake());
        moves.add(MoveBean.insertAerialAce());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 78);
        baseStats.put(StatsEnum.ATK, 84);
        baseStats.put(StatsEnum.DEF, 78);
        baseStats.put(StatsEnum.SP_ATK, 109);
        baseStats.put(StatsEnum.SP_DEF, 85);
        baseStats.put(StatsEnum.SPD, 100);

        return new PokemonSpecie("Charizard", TypeBean.insertFire(), TypeBean.insertFlying(), moves, baseStats);
    }

    public static PokemonSpecie insertBlastoise() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertWaterGun());
        moves.add(MoveBean.insertHydroPump());
        moves.add(MoveBean.insertIceBeam());
        moves.add(MoveBean.insertEarthquake());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 79);
        baseStats.put(StatsEnum.ATK, 83);
        baseStats.put(StatsEnum.DEF, 100);
        baseStats.put(StatsEnum.SP_ATK, 85);
        baseStats.put(StatsEnum.SP_DEF, 105);
        baseStats.put(StatsEnum.SPD, 78);

        return new PokemonSpecie("Blastoise", TypeBean.insertWater(), null, moves, baseStats);
    }

    public static PokemonSpecie insertVenusaur() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertSolarBeam());
        moves.add(MoveBean.insertSludgeBomb());
        moves.add(MoveBean.insertEarthquake());
        moves.add(MoveBean.insertSleepPowder());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 80);
        baseStats.put(StatsEnum.ATK, 82);
        baseStats.put(StatsEnum.DEF, 83);
        baseStats.put(StatsEnum.SP_ATK, 100);
        baseStats.put(StatsEnum.SP_DEF, 100);
        baseStats.put(StatsEnum.SPD, 80);

        return new PokemonSpecie("Venusaur", TypeBean.insertGrass(), TypeBean.insertPoison(), moves, baseStats);
    }
    
    public static PokemonSpecie insertInfernape() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertFlareBlitz());
        moves.add(MoveBean.insertCloseCombat());
        moves.add(MoveBean.insertThunderPunch());
        moves.add(MoveBean.insertStoneEdge());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 76);
        baseStats.put(StatsEnum.ATK, 104);
        baseStats.put(StatsEnum.DEF, 71);
        baseStats.put(StatsEnum.SP_ATK, 104);
        baseStats.put(StatsEnum.SP_DEF, 71);
        baseStats.put(StatsEnum.SPD, 108);

        return new PokemonSpecie("Infernape", TypeBean.insertFire(), TypeBean.insertFighting(), moves, baseStats);
    }
    
//    this.specieName = specieName;
//	this.primaryType = primaryType;
//	this.secondaryType = secondaryType;
//	this.learningMoves = learningMoves;
//	this.baseStats = baseStats;
    
    public static PokemonSpecie insertGyarados() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertWaterfall());
        moves.add(MoveBean.insertDragonDance());
        moves.add(MoveBean.insertEarthquake());
        moves.add(MoveBean.insertIceFang());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 95);
        baseStats.put(StatsEnum.ATK, 125);
        baseStats.put(StatsEnum.DEF, 79);
        baseStats.put(StatsEnum.SP_ATK, 60);
        baseStats.put(StatsEnum.SP_DEF, 100);
        baseStats.put(StatsEnum.SPD, 81);

        return new PokemonSpecie("Gyarados", TypeBean.insertWater(), TypeBean.insertFlying(), moves, baseStats);
    }

    public static PokemonSpecie insertAlakazam() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertPsychic());
        moves.add(MoveBean.insertFocusBlast());
        moves.add(MoveBean.insertShadowBall());
        moves.add(MoveBean.insertThunderbolt());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 55);
        baseStats.put(StatsEnum.ATK, 50);
        baseStats.put(StatsEnum.DEF, 45);
        baseStats.put(StatsEnum.SP_ATK, 135);
        baseStats.put(StatsEnum.SP_DEF, 95);
        baseStats.put(StatsEnum.SPD, 120);

        return new PokemonSpecie("Alakazam", TypeBean.insertPsychic(), null, moves, baseStats);
    }
    
    public static PokemonSpecie insertGardevoir() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertPsychic());
        moves.add(MoveBean.insertMoonblast());
        moves.add(MoveBean.insertShadowBall());
        moves.add(MoveBean.insertThunderbolt());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 68);
        baseStats.put(StatsEnum.ATK, 65);
        baseStats.put(StatsEnum.DEF, 65);
        baseStats.put(StatsEnum.SP_ATK, 125);
        baseStats.put(StatsEnum.SP_DEF, 115);
        baseStats.put(StatsEnum.SPD, 80);

        return new PokemonSpecie("Gardevoir", TypeBean.insertPsychic(), TypeBean.insertFairy(), moves, baseStats);
    }

    public static PokemonSpecie insertGengar() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertShadowBall());
        moves.add(MoveBean.insertSludgeBomb());
        moves.add(MoveBean.insertThunderbolt());
        moves.add(MoveBean.insertFocusBlast());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 60);
        baseStats.put(StatsEnum.ATK, 65);
        baseStats.put(StatsEnum.DEF, 60);
        baseStats.put(StatsEnum.SP_ATK, 130);
        baseStats.put(StatsEnum.SP_DEF, 75);
        baseStats.put(StatsEnum.SPD, 110);

        return new PokemonSpecie("Gengar", TypeBean.insertGhost(), TypeBean.insertPoison(), moves, baseStats);
    }

    public static PokemonSpecie insertTyranitar() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertCrunch());
        moves.add(MoveBean.insertStoneEdge());
        moves.add(MoveBean.insertEarthquake());
        moves.add(MoveBean.insertFireBlast());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 100);
        baseStats.put(StatsEnum.ATK, 134);
        baseStats.put(StatsEnum.DEF, 110);
        baseStats.put(StatsEnum.SP_ATK, 95);
        baseStats.put(StatsEnum.SP_DEF, 100);
        baseStats.put(StatsEnum.SPD, 61);

        return new PokemonSpecie("Tyranitar", TypeBean.insertRock(), TypeBean.insertDark(), moves, baseStats);
    }
    
    public static PokemonSpecie insertSwampert() {
        Set<Move> moves = new HashSet<>();
        moves.add(MoveBean.insertWaterfall());
        moves.add(MoveBean.insertEarthquake());
        moves.add(MoveBean.insertRockSlide());
        moves.add(MoveBean.insertProtect());

        Map<StatsEnum, Integer> baseStats = new HashMap<>();
        baseStats.put(StatsEnum.HP, 100);
        baseStats.put(StatsEnum.ATK, 110);
        baseStats.put(StatsEnum.DEF, 90);
        baseStats.put(StatsEnum.SP_ATK, 85);
        baseStats.put(StatsEnum.SP_DEF, 90);
        baseStats.put(StatsEnum.SPD, 60);

        return new PokemonSpecie("Swampert", TypeBean.insertWater(), TypeBean.insertGround(), moves, baseStats);
    }
}
