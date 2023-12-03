package com.bean;

import com.model.entity.Move;
import com.model.entity.MoveTypeEnum;
import com.model.entity.Type;

public class MoveBean {

    public static Move insertTackle() {
        return new Move("Tackle", TypeBean.insertNormal(), 40, 100, MoveTypeEnum.PHYSICAL, 40);
    }

    public static Move insertFlamethrower() {
        return new Move("Flamethrower", TypeBean.insertFire(), 90, 100, MoveTypeEnum.SPECIAL, 15);
    }

    public static Move insertThunderbolt() {
        return new Move("Thunderbolt", TypeBean.insertElectric(), 90, 100, MoveTypeEnum.SPECIAL, 15);
    }

    public static Move insertSolarBeam() {
        return new Move("Solar Beam", TypeBean.insertGrass(), 120, 100, MoveTypeEnum.SPECIAL, 10);
    }

    public static Move insertWaterGun() {
        return new Move("Water Gun", TypeBean.insertWater(), 40, 100, MoveTypeEnum.SPECIAL, 25);
    }

    public static Move insertIceBeam() {
        return new Move("Ice Beam", TypeBean.insertIce(), 90, 100, MoveTypeEnum.SPECIAL, 10);
    }

    public static Move insertEarthquake() {
        return new Move("Earthquake", TypeBean.insertGround(), 100, 100, MoveTypeEnum.PHYSICAL, 10);
    }

    public static Move insertPsychic() {
        return new Move("Psychic", TypeBean.insertPsychic(), 90, 100, MoveTypeEnum.SPECIAL, 10);
    }

    public static Move insertThunderPunch() {
        return new Move("Thunder Punch", TypeBean.insertElectric(), 75, 100, MoveTypeEnum.PHYSICAL, 15);
    }

    public static Move insertAerialAce() {
        return new Move("Aerial Ace", TypeBean.insertFlying(), 60, 100, MoveTypeEnum.PHYSICAL, 20);
    }

    public static Move insertShadowBall() {
        return new Move("Shadow Ball", TypeBean.insertGhost(), 80, 100, MoveTypeEnum.SPECIAL, 15);
    }

    public static Move insertBrickBreak() {
        return new Move("Brick Break", TypeBean.insertFighting(), 75, 100, MoveTypeEnum.PHYSICAL, 15);
    }

    public static Move insertSurf() {
        return new Move("Surf", TypeBean.insertWater(), 90, 100, MoveTypeEnum.SPECIAL, 15);
    }

    public static Move insertFireBlast() {
        return new Move("Fire Blast", TypeBean.insertFire(), 110, 85, MoveTypeEnum.SPECIAL, 5);
    }

    public static Move insertIcePunch() {
        return new Move("Ice Punch", TypeBean.insertIce(), 75, 100, MoveTypeEnum.PHYSICAL, 15);
    }

    public static Move insertThunder() {
        return new Move("Thunder", TypeBean.insertElectric(), 110, 70, MoveTypeEnum.SPECIAL, 10);
    }

    public static Move insertEarthPower() {
        return new Move("Earth Power", TypeBean.insertGround(), 90, 100, MoveTypeEnum.SPECIAL, 10);
    }

    public static Move insertDragonPulse() {
        return new Move("Dragon Pulse", TypeBean.insertDragon(), 85, 100, MoveTypeEnum.SPECIAL, 10);
    }

    public static Move insertDarkPulse() {
        return new Move("Dark Pulse", TypeBean.insertDark(), 80, 100, MoveTypeEnum.SPECIAL, 15);
    }

    public static Move insertPlayRough() {
        return new Move("Play Rough", TypeBean.insertFairy(), 90, 90, MoveTypeEnum.PHYSICAL, 10);
    }

    public static Move insertHydroPump() {
        return new Move("Hydro Pump", TypeBean.insertWater(), 110, 85, MoveTypeEnum.SPECIAL, 5);
    }

    public static Move insertSludgeBomb() {
        return new Move("Sludge Bomb", TypeBean.insertPoison(), 90, 100, MoveTypeEnum.SPECIAL, 10);
    }

    public static Move insertSleepPowder() {
        return new Move("Sleep Powder", TypeBean.insertGrass(), 0, 75, MoveTypeEnum.STATUS, 15);
    }

    public static Move insertCloseCombat() {
        return new Move("Close Combat", TypeBean.insertFighting(), 120, 100, MoveTypeEnum.PHYSICAL, 5);
    }

    public static Move insertStoneEdge() {
        return new Move("Stone Edge", TypeBean.insertRock(), 100, 80, MoveTypeEnum.PHYSICAL, 5);
    }

    public static Move insertIronTail() {
        return new Move("Iron Tail", TypeBean.insertSteel(), 100, 75, MoveTypeEnum.PHYSICAL, 10);
    }

    public static Move insertVoltTackle() {
        return new Move("Volt Tackle", TypeBean.insertElectric(), 120, 100, MoveTypeEnum.PHYSICAL, 5);
    }

    public static Move insertDragonDance() {
        return new Move("Dragon Dance", TypeBean.insertDragon(), 0, 0, MoveTypeEnum.STATUS, 20);
    }

    public static Move insertCrunch() {
        return new Move("Crunch", TypeBean.insertDark(), 80, 100, MoveTypeEnum.PHYSICAL, 15);
    }

    public static Move insertFocusBlast() {
        return new Move("Focus Blast", TypeBean.insertFighting(), 120, 70, MoveTypeEnum.SPECIAL, 5);
    }

    public static Move insertMoonblast() {
        return new Move("Moonblast", TypeBean.insertFairy(), 90, 100, MoveTypeEnum.SPECIAL, 15);
    }

    public static Move insertWaterfall() {
        return new Move("Waterfall", TypeBean.insertWater(), 80, 100, MoveTypeEnum.PHYSICAL, 15);
    }

    public static Move insertIceFang() {
        return new Move("Ice Fang", TypeBean.insertIce(), 65, 95, MoveTypeEnum.PHYSICAL, 15);
    }

    public static Move insertFlareBlitz() {
        return new Move("Flare Blitz", TypeBean.insertFire(), 120, 100, MoveTypeEnum.PHYSICAL, 5);
    }
    
    public static Move insertRockSlide() {
        return new Move("Rock Slide", TypeBean.insertRock(), 75, 90, MoveTypeEnum.PHYSICAL, 10);
    }

    public static Move insertProtect() {
        return new Move("Protect", TypeBean.insertNormal(), 0, 100, MoveTypeEnum.STATUS, 10);
    }
}
