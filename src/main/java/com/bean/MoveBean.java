package com.bean;

import com.model.entity.Move;
import com.model.entity.MoveTypeEnum;
import com.model.entity.Type;
import com.model.entity.TypeEnum;

public class MoveBean {

	public static Move insertTackle() { return new Move("Tackle", TypeEnum.NORMAL, 40, 100, MoveTypeEnum.PHYSICAL, 40); }

	public static Move insertFlamethrower() { return new Move("Flamethrower", TypeEnum.FIRE, 90, 100, MoveTypeEnum.SPECIAL, 15); }

	public static Move insertThunderbolt() { return new Move("Thunderbolt", TypeEnum.ELECTRIC, 90, 100, MoveTypeEnum.SPECIAL, 15); }

	public static Move insertSolarBeam() { return new Move("Solar Beam", TypeEnum.GRASS, 120, 100, MoveTypeEnum.SPECIAL, 10); }

	public static Move insertWaterGun() { return new Move("Water Gun", TypeEnum.WATER, 40, 100, MoveTypeEnum.SPECIAL, 25); }

	public static Move insertIceBeam() { return new Move("Ice Beam", TypeEnum.ICE, 90, 100, MoveTypeEnum.SPECIAL, 10); }

	public static Move insertEarthquake() { return new Move("Earthquake", TypeEnum.GROUND, 100, 100, MoveTypeEnum.PHYSICAL, 10); }

	public static Move insertPsychic() { return new Move("Psychic", TypeEnum.PSYCHIC, 90, 100, MoveTypeEnum.SPECIAL, 10); }

	public static Move insertThunderPunch() { return new Move("Thunder Punch", TypeEnum.ELECTRIC, 75, 100, MoveTypeEnum.PHYSICAL, 15); }

	public static Move insertAerialAce() { return new Move("Aerial Ace", TypeEnum.FLYING, 60, 100, MoveTypeEnum.PHYSICAL, 20); }

	public static Move insertShadowBall() { return new Move("Shadow Ball", TypeEnum.GHOST, 80, 100, MoveTypeEnum.SPECIAL, 15); }

	public static Move insertBrickBreak() { return new Move("Brick Break", TypeEnum.FIGHTING, 75, 100, MoveTypeEnum.PHYSICAL, 15); }

	public static Move insertSurf() { return new Move("Surf", TypeEnum.WATER, 90, 100, MoveTypeEnum.SPECIAL, 15); }

	public static Move insertFireBlast() { return new Move("Fire Blast", TypeEnum.FIRE, 110, 85, MoveTypeEnum.SPECIAL, 5); }

	public static Move insertIcePunch() { return new Move("Ice Punch", TypeEnum.ICE, 75, 100, MoveTypeEnum.PHYSICAL, 15); }

	public static Move insertThunder() { return new Move("Thunder", TypeEnum.ELECTRIC, 110, 70, MoveTypeEnum.SPECIAL, 10); }

	public static Move insertEarthPower() { return new Move("Earth Power", TypeEnum.GROUND, 90, 100, MoveTypeEnum.SPECIAL, 10); }

	public static Move insertDragonPulse() { return new Move("Dragon Pulse", TypeEnum.DRAGON, 85, 100, MoveTypeEnum.SPECIAL, 10); }

	public static Move insertDarkPulse() { return new Move("Dark Pulse", TypeEnum.DARK, 80, 100, MoveTypeEnum.SPECIAL, 15); }

	public static Move insertPlayRough() { return new Move("Play Rough", TypeEnum.FAIRY, 90, 90, MoveTypeEnum.PHYSICAL, 10); }

	public static Move insertHydroPump() { return new Move("Hydro Pump", TypeEnum.WATER, 110, 85, MoveTypeEnum.SPECIAL, 5); }

	public static Move insertSludgeBomb() { return new Move("Sludge Bomb", TypeEnum.POISON, 90, 100, MoveTypeEnum.SPECIAL, 10); }

	public static Move insertSleepPowder() { return new Move("Sleep Powder", TypeEnum.GRASS, 0, 75, MoveTypeEnum.STATUS, 15); }

	public static Move insertCloseCombat() { return new Move("Close Combat", TypeEnum.FIGHTING, 120, 100, MoveTypeEnum.PHYSICAL, 5); }

	public static Move insertStoneEdge() { return new Move("Stone Edge", TypeEnum.ROCK, 100, 80, MoveTypeEnum.PHYSICAL, 5); }

	public static Move insertIronTail() { return new Move("Iron Tail", TypeEnum.STEEL, 100, 75, MoveTypeEnum.PHYSICAL, 10); }

	public static Move insertVoltTackle() { return new Move("Volt Tackle", TypeEnum.ELECTRIC, 120, 100, MoveTypeEnum.PHYSICAL, 5); }

	public static Move insertDragonDance() { return new Move("Dragon Dance", TypeEnum.DRAGON, 0, 0, MoveTypeEnum.STATUS, 20); }

	public static Move insertCrunch() { return new Move("Crunch", TypeEnum.DARK, 80, 100, MoveTypeEnum.PHYSICAL, 15); }

	public static Move insertFocusBlast() { return new Move("Focus Blast", TypeEnum.FIGHTING, 120, 70, MoveTypeEnum.SPECIAL, 5); }

	public static Move insertMoonblast() { return new Move("Moonblast", TypeEnum.FAIRY, 90, 100, MoveTypeEnum.SPECIAL, 15); }

	public static Move insertWaterfall() { return new Move("Waterfall", TypeEnum.WATER, 80, 100, MoveTypeEnum.PHYSICAL, 15); }

	public static Move insertIceFang() { return new Move("Ice Fang", TypeEnum.ICE, 65, 95, MoveTypeEnum.PHYSICAL, 15); }

	public static Move insertFlareBlitz() { return new Move("Flare Blitz", TypeEnum.FIRE, 120, 100, MoveTypeEnum.PHYSICAL, 5); }


	public static Move insertRockSlide() { return new Move("Rock Slide", TypeEnum.ROCK, 75, 90, MoveTypeEnum.PHYSICAL, 10); }

	public static Move insertProtect() { return new Move("Protect", TypeEnum.NORMAL, 0, 100, MoveTypeEnum.STATUS, 10); }
}
