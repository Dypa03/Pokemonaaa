package com.bean;

import com.model.entity.Move;
import com.model.entity.Pokemon;
import com.model.entity.PokemonSpecie;
import com.model.entity.StatsEnum;
import com.model.entity.Type;
import com.model.entity.TypeEnum;

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

//        Map<StatsEnum, Integer> baseStats = new HashMap<>();
//        baseStats.put(StatsEnum.HP, 78);
//        baseStats.put(StatsEnum.ATK, 84);
//        baseStats.put(StatsEnum.DEF, 78);
//        baseStats.put(StatsEnum.SP_ATK, 109);
//        baseStats.put(StatsEnum.SP_DEF, 85);
//        baseStats.put(StatsEnum.SPD, 100);

        return new PokemonSpecie("Charizard", TypeEnum.FIRE, TypeEnum.FLYING, moves, 78,84,78,109,85,100);
    }

    public static PokemonSpecie insertBlastoise() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertWaterGun()); moves.add(MoveBean.insertHydroPump()); moves.add(MoveBean.insertIceBeam()); moves.add(MoveBean.insertEarthquake());
    return new PokemonSpecie("Blastoise", TypeEnum.WATER, null, moves, 79, 83, 100, 85, 105, 78); }

    public static PokemonSpecie insertVenusaur() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertSolarBeam()); moves.add(MoveBean.insertSludgeBomb()); moves.add(MoveBean.insertEarthquake()); moves.add(MoveBean.insertSleepPowder());

    return new PokemonSpecie("Venusaur", TypeEnum.GRASS, TypeEnum.POISON, moves, 80, 82, 83, 100, 100, 80); }


    public static PokemonSpecie insertInfernape() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertFlareBlitz()); moves.add(MoveBean.insertCloseCombat()); moves.add(MoveBean.insertThunderPunch()); moves.add(MoveBean.insertStoneEdge());

    return new PokemonSpecie("Infernape", TypeEnum.FIRE, TypeEnum.FIGHTING, moves, 76, 104, 71, 104, 71, 108); }


    public static PokemonSpecie insertGyarados() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertWaterfall()); moves.add(MoveBean.insertDragonDance()); moves.add(MoveBean.insertEarthquake()); moves.add(MoveBean.insertIceFang());

    return new PokemonSpecie("Gyarados", TypeEnum.WATER, TypeEnum.FLYING, moves, 95, 125, 79, 60, 100, 81); }

    public static PokemonSpecie insertAlakazam() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertPsychic()); moves.add(MoveBean.insertFocusBlast()); moves.add(MoveBean.insertShadowBall()); moves.add(MoveBean.insertThunderbolt());

    return new PokemonSpecie("Alakazam", TypeEnum.PSYCHIC, null, moves, 55, 50, 45, 135, 95, 120); }


    public static PokemonSpecie insertGardevoir() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertPsychic()); moves.add(MoveBean.insertMoonblast()); moves.add(MoveBean.insertShadowBall()); moves.add(MoveBean.insertThunderbolt());

    return new PokemonSpecie("Gardevoir", TypeEnum.PSYCHIC,TypeEnum.FAIRY, moves, 68, 65, 65, 125, 115, 80); }

    public static PokemonSpecie insertGengar() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertShadowBall()); moves.add(MoveBean.insertSludgeBomb()); moves.add(MoveBean.insertThunderbolt()); moves.add(MoveBean.insertFocusBlast());

    return new PokemonSpecie("Gengar", TypeEnum.GHOST, TypeEnum.POISON, moves, 60, 65, 60, 130, 75, 110); }

    public static PokemonSpecie insertTyranitar() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertCrunch()); moves.add(MoveBean.insertStoneEdge()); moves.add(MoveBean.insertEarthquake()); moves.add(MoveBean.insertFireBlast());

    return new PokemonSpecie("Tyranitar", TypeEnum.ROCK, TypeEnum.DARK, moves, 100, 134, 110, 95, 100, 61); }


    public static PokemonSpecie insertSwampert() { Set<Move> moves = new HashSet<>(); moves.add(MoveBean.insertWaterfall()); moves.add(MoveBean.insertEarthquake()); moves.add(MoveBean.insertRockSlide()); moves.add(MoveBean.insertProtect());

    return new PokemonSpecie("Swampert", TypeEnum.WATER, TypeEnum.GROUND, moves, 100, 110, 90, 85, 90, 60); }
}
