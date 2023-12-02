package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.bean.MoveBean;
import com.bean.PokemonSpecieBean;
import com.bean.TypeBean;
import com.model.entity.Move;
import com.model.entity.Pokemon;
import com.model.entity.PokemonSpecie;
import com.model.entity.Type;
import com.service.MoveService;
import com.service.PokemonSpecieService;

@SpringBootApplication
public class PokemonaaaApplication implements CommandLineRunner{
	
	@Autowired
	private PokemonSpecieService pokemonSpecieService;
	
	@Autowired
	private MoveService moveService;
	
	public static void main(String[] args) {
		SpringApplication.run(PokemonaaaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		populateDB();
		
	}
	
	private void populateDB() {
	    // Popola i tipi nel database}

	    // Popola le mosse nel database
	    List<Move> moves = List.of(
	            MoveBean.insertTackle(),
	            MoveBean.insertFlamethrower(),
	            MoveBean.insertThunderbolt(),
	            MoveBean.insertSolarBeam(),
	            MoveBean.insertWaterGun(),
	            MoveBean.insertIceBeam(),
	            MoveBean.insertEarthquake(),
	            MoveBean.insertPsychic(),
	            MoveBean.insertThunderPunch(),
	            MoveBean.insertAerialAce(),
	            MoveBean.insertShadowBall(),
	            MoveBean.insertBrickBreak(),
	            MoveBean.insertSurf(),
	            MoveBean.insertFireBlast(),
	            MoveBean.insertIcePunch(),
	            MoveBean.insertThunder(),
	            MoveBean.insertEarthPower(),
	            MoveBean.insertDragonPulse(),
	            MoveBean.insertDarkPulse(),
	            MoveBean.insertPlayRough(),
	            MoveBean.insertHydroPump(),
	            MoveBean.insertSludgeBomb(),
	            MoveBean.insertSleepPowder(),
	            MoveBean.insertCloseCombat(),
	            MoveBean.insertStoneEdge(),
	            MoveBean.insertIronTail(),
	            MoveBean.insertVoltTackle(),
	            MoveBean.insertDragonDance(),
	            MoveBean.insertCrunch(),
	            MoveBean.insertFocusBlast(),
	            MoveBean.insertMoonblast(),
	            MoveBean.insertWaterfall(),
	            MoveBean.insertIceFang(),
	            MoveBean.insertFlareBlitz()
	    );
	    for (Move move : moves) {
	        moveService.insertOrUpdateMove(move);
	    }

	    // Popola i Pokemon nel database
	    List<PokemonSpecie> pokemonSpecies = List.of(
	            PokemonSpecieBean.insertCharizard(),
	            PokemonSpecieBean.insertBlastoise(),
	            PokemonSpecieBean.insertVenusaur(),
	            PokemonSpecieBean.insertAlakazam(),
	            PokemonSpecieBean.insertGardevoir(),
	            PokemonSpecieBean.insertGengar(),
	            PokemonSpecieBean.insertGyarados(),
	            PokemonSpecieBean.insertInfernape(),
	            PokemonSpecieBean.insertTyranitar(),
	            PokemonSpecieBean.insertSwampert()
	    );
	    for (PokemonSpecie pokemon : pokemonSpecies) {
	        pokemonSpecieService.insertOrUpdateSpecie(pokemon);
	    }
	}


	

}
