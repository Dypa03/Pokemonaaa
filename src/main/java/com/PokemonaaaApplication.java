package com;

import java.util.List;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.MoveBean;
import com.bean.PokemonSpecieBean;
import com.bean.TypeBean;
import com.model.entity.Move;
import com.model.entity.MoveTypeEnum;
import com.model.entity.Pokemon;
import com.model.entity.PokemonSpecie;
import com.model.entity.Type;
import com.model.entity.TypeEnum;
import com.service.MoveService;
import com.service.PokemonSpecieService;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class PokemonaaaApplication implements CommandLineRunner{
	
	@Autowired
	private PokemonSpecieService pokemonSpecieService;
	
	@Autowired
	private MoveService moveService;
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

    
	
	public static void main(String[] args) {
		SpringApplication.run(PokemonaaaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		resetDB();
		populateDB();
	}
	
	@Transactional
    private void resetDB() {
        // Elimina tutti i record dalle tabelle
        jdbcTemplate.execute("DELETE FROM move");
        jdbcTemplate.execute("DELETE FROM pokemon_specie");

        // Resetti auto incrementatore a 1 per le tabelle
        jdbcTemplate.execute("ALTER TABLE move AUTO_INCREMENT = 1");
        jdbcTemplate.execute("ALTER TABLE pokemon_specie AUTO_INCREMENT = 1");
    }
	
	private void populateDB() {

		// Istanzia le mosse
		Move tackle = new Move("Tackle", TypeEnum.NORMAL, 40, 100, MoveTypeEnum.PHYSICAL, 40);
		Move flamethrower = new Move("Flamethrower", TypeEnum.FIRE, 90, 100, MoveTypeEnum.SPECIAL, 15);
		Move thunderbolt = new Move("Thunderbolt", TypeEnum.ELECTRIC, 90, 100, MoveTypeEnum.SPECIAL, 15);
		Move solarBeam = new Move("Solar Beam", TypeEnum.GRASS, 120, 100, MoveTypeEnum.SPECIAL, 10);
		Move waterGun = new Move("Water Gun", TypeEnum.WATER, 40, 100, MoveTypeEnum.SPECIAL, 25);
		Move iceBeam = new Move("Ice Beam", TypeEnum.ICE, 90, 100, MoveTypeEnum.SPECIAL, 10);
		Move earthquake = new Move("Earthquake", TypeEnum.GROUND, 100, 100, MoveTypeEnum.PHYSICAL, 10);
		Move psychic = new Move("Psychic", TypeEnum.PSYCHIC, 90, 100, MoveTypeEnum.SPECIAL, 10);
		Move thunderPunch = new Move("Thunder Punch", TypeEnum.ELECTRIC, 75, 100, MoveTypeEnum.PHYSICAL, 15);
		Move aerialAce = new Move("Aerial Ace", TypeEnum.FLYING, 60, 100, MoveTypeEnum.PHYSICAL, 20);
		Move shadowBall = new Move("Shadow Ball", TypeEnum.GHOST, 80, 100, MoveTypeEnum.SPECIAL, 15);
		Move brickBreak = new Move("Brick Break", TypeEnum.FIGHTING, 75, 100, MoveTypeEnum.PHYSICAL, 15);
		Move surf = new Move("Surf", TypeEnum.WATER, 90, 100, MoveTypeEnum.SPECIAL, 15);
		Move fireBlast = new Move("Fire Blast", TypeEnum.FIRE, 110, 85, MoveTypeEnum.SPECIAL, 5);
		Move icePunch = new Move("Ice Punch", TypeEnum.ICE, 75, 100, MoveTypeEnum.PHYSICAL, 15);
		Move thunder = new Move("Thunder", TypeEnum.ELECTRIC, 110, 70, MoveTypeEnum.SPECIAL, 10);
		Move earthPower = new Move("Earth Power", TypeEnum.GROUND, 90, 100, MoveTypeEnum.SPECIAL, 10);
		Move dragonPulse = new Move("Dragon Pulse", TypeEnum.DRAGON, 85, 100, MoveTypeEnum.SPECIAL, 10);
		Move darkPulse = new Move("Dark Pulse", TypeEnum.DARK, 80, 100, MoveTypeEnum.SPECIAL, 15);
		Move playRough = new Move("Play Rough", TypeEnum.FAIRY, 90, 90, MoveTypeEnum.PHYSICAL, 10);
		Move hydroPump = new Move("Hydro Pump", TypeEnum.WATER, 110, 85, MoveTypeEnum.SPECIAL, 5);
		Move sludgeBomb = new Move("Sludge Bomb", TypeEnum.POISON, 90, 100, MoveTypeEnum.SPECIAL, 10);
		Move sleepPowder = new Move("Sleep Powder", TypeEnum.GRASS, 0, 75, MoveTypeEnum.STATUS, 15);
		Move closeCombat = new Move("Close Combat", TypeEnum.FIGHTING, 120, 100, MoveTypeEnum.PHYSICAL, 5);
		Move stoneEdge = new Move("Stone Edge", TypeEnum.ROCK, 100, 80, MoveTypeEnum.PHYSICAL, 5);
		Move ironTail = new Move("Iron Tail", TypeEnum.STEEL, 100, 75, MoveTypeEnum.PHYSICAL, 10);
		Move voltTackle = new Move("Volt Tackle", TypeEnum.ELECTRIC, 120, 100, MoveTypeEnum.PHYSICAL, 5);
		Move dragonDance = new Move("Dragon Dance", TypeEnum.DRAGON, 0, 0, MoveTypeEnum.STATUS, 20);
		Move crunch = new Move("Crunch", TypeEnum.DARK, 80, 100, MoveTypeEnum.PHYSICAL, 15);
		Move focusBlast = new Move("Focus Blast", TypeEnum.FIGHTING, 120, 70, MoveTypeEnum.SPECIAL, 5);
		Move moonblast = new Move("Moonblast", TypeEnum.FAIRY, 90, 100, MoveTypeEnum.SPECIAL, 15);
		Move waterfall = new Move("Waterfall", TypeEnum.WATER, 80, 100, MoveTypeEnum.PHYSICAL, 15);
		Move iceFang = new Move("Ice Fang", TypeEnum.ICE, 65, 95, MoveTypeEnum.PHYSICAL, 15);
		Move flareBlitz = new Move("Flare Blitz", TypeEnum.FIRE, 120, 100, MoveTypeEnum.PHYSICAL, 5);
		Move rockSlide = new Move("Rock Slide", TypeEnum.ROCK, 75, 90, MoveTypeEnum.PHYSICAL, 10);
		Move protect = new Move("Protect", TypeEnum.NORMAL, 0, 100, MoveTypeEnum.STATUS, 10);

		// Salva le mosse nel database
		moveService.insertOrUpdateMove(tackle);
		moveService.insertOrUpdateMove(flamethrower);
		moveService.insertOrUpdateMove(thunderbolt);
		moveService.insertOrUpdateMove(solarBeam);
		moveService.insertOrUpdateMove(waterGun);
		moveService.insertOrUpdateMove(iceBeam);
		moveService.insertOrUpdateMove(earthquake);
		moveService.insertOrUpdateMove(psychic);
		moveService.insertOrUpdateMove(thunderPunch);
		moveService.insertOrUpdateMove(aerialAce);
		moveService.insertOrUpdateMove(shadowBall);
		moveService.insertOrUpdateMove(brickBreak);
		moveService.insertOrUpdateMove(surf);
		moveService.insertOrUpdateMove(fireBlast);
		moveService.insertOrUpdateMove(icePunch);
		moveService.insertOrUpdateMove(thunder);
		moveService.insertOrUpdateMove(earthPower);
		moveService.insertOrUpdateMove(dragonPulse);
		moveService.insertOrUpdateMove(darkPulse);
		moveService.insertOrUpdateMove(playRough);
		moveService.insertOrUpdateMove(hydroPump);
		moveService.insertOrUpdateMove(sludgeBomb);
		moveService.insertOrUpdateMove(sleepPowder);
		moveService.insertOrUpdateMove(closeCombat);
		moveService.insertOrUpdateMove(stoneEdge);
		moveService.insertOrUpdateMove(ironTail);
		moveService.insertOrUpdateMove(voltTackle);
		moveService.insertOrUpdateMove(dragonDance);
		moveService.insertOrUpdateMove(crunch);
		moveService.insertOrUpdateMove(focusBlast);
		moveService.insertOrUpdateMove(moonblast);
		moveService.insertOrUpdateMove(waterfall);
		moveService.insertOrUpdateMove(iceFang);
		moveService.insertOrUpdateMove(flareBlitz);
		moveService.insertOrUpdateMove(rockSlide);
		moveService.insertOrUpdateMove(protect);

	    // Popola i Pokemon nel database
		PokemonSpecie charizard = new PokemonSpecie("Charizard", TypeEnum.FIRE, TypeEnum.FLYING, Set.of(
		        solarBeam,
		        flamethrower,
		        dragonPulse,
		        aerialAce
		), 78, 84, 78, 109, 85, 100);

		// ...

		PokemonSpecie blastoise = new PokemonSpecie("Blastoise", TypeEnum.WATER, null, Set.of(
		        waterGun,
		        hydroPump,
		        iceBeam,
		        earthquake
		), 79, 83, 100, 85, 105, 78);

		// ...

		PokemonSpecie venusaur = new PokemonSpecie("Venusaur", TypeEnum.GRASS, TypeEnum.POISON, Set.of(
		        solarBeam,
		        sludgeBomb,
		        earthquake,
		        sleepPowder
		), 80, 82, 83, 100, 100, 80);

		// ...

		PokemonSpecie infernape = new PokemonSpecie("Infernape", TypeEnum.FIRE, TypeEnum.FIGHTING, Set.of(
		        flareBlitz,
		        closeCombat,
		        thunderPunch,
		        stoneEdge
		), 76, 104, 71, 104, 71, 108);

		// ...

		PokemonSpecie gyarados = new PokemonSpecie("Gyarados", TypeEnum.WATER, TypeEnum.FLYING, Set.of(
		        waterfall,
		        dragonDance,
		        earthquake,
		        iceFang
		), 95, 125, 79, 60, 100, 81);

		// ...

		PokemonSpecie alakazam = new PokemonSpecie("Alakazam", TypeEnum.PSYCHIC, null, Set.of(
		        psychic,
		        focusBlast,
		        shadowBall,
		        thunderbolt
		), 55, 50, 45, 135, 95, 120);

		// ...

		PokemonSpecie gardevoir = new PokemonSpecie("Gardevoir", TypeEnum.PSYCHIC, TypeEnum.FAIRY, Set.of(
		        psychic,
		        moonblast,
		        shadowBall,
		        thunderbolt
		), 68, 65, 65, 125, 115, 80);

		// ...

		PokemonSpecie gengar = new PokemonSpecie("Gengar", TypeEnum.GHOST, TypeEnum.POISON, Set.of(
		        shadowBall,
		        sludgeBomb,
		        thunderbolt,
		        focusBlast
		), 60, 65, 60, 130, 75, 110);

		// ...

		PokemonSpecie tyranitar = new PokemonSpecie("Tyranitar", TypeEnum.ROCK, TypeEnum.DARK, Set.of(
		        crunch,
		        stoneEdge,
		        earthquake,
		        fireBlast
		), 100, 134, 110, 95, 100, 61);

		// ...

		PokemonSpecie swampert = new PokemonSpecie("Swampert", TypeEnum.WATER, TypeEnum.GROUND, Set.of(
		        waterfall,
		        earthquake,
		        rockSlide,
		        protect
		), 100, 110, 90, 85, 90, 60);
		
		pokemonSpecieService.insertOrUpdateSpecie(charizard);
		pokemonSpecieService.insertOrUpdateSpecie(blastoise);
		pokemonSpecieService.insertOrUpdateSpecie(venusaur);
		pokemonSpecieService.insertOrUpdateSpecie(infernape);
		pokemonSpecieService.insertOrUpdateSpecie(gyarados);
		pokemonSpecieService.insertOrUpdateSpecie(alakazam);
		pokemonSpecieService.insertOrUpdateSpecie(gardevoir);
		pokemonSpecieService.insertOrUpdateSpecie(gengar);
		pokemonSpecieService.insertOrUpdateSpecie(tyranitar);
		pokemonSpecieService.insertOrUpdateSpecie(swampert);
		
	}


	

}
