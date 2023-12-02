package com.bean;

import java.util.List;

import com.model.entity.Type;
import com.model.entity.TypeEnum;

public class TypeBean {

    public static Type insertBug() {
        return new Type(TypeEnum.BUG); // Pray for him
    }

    public static Type insertDark() {
        return new Type(TypeEnum.DARK); // Tipo Negro
    }

    public static Type insertDragon() {
        return new Type(TypeEnum.DRAGON);
    }

    public static Type insertElectric() {
        return new Type(TypeEnum.ELECTRIC);
    }

    public static Type insertFairy() {
        return new Type(TypeEnum.FAIRY); // WTF IS THIS?
    }

    public static Type insertFighting() {
        return new Type(TypeEnum.FIGHTING);
    }

    public static Type insertFire() {
        return new Type(TypeEnum.FIRE);
    }

    public static Type insertFlying() {
        return new Type(TypeEnum.FLYING);
    }

    public static Type insertGhost() {
        return new Type(TypeEnum.GHOST);
    }

    public static Type insertGrass() {
        return new Type(TypeEnum.GRASS);
    }

    public static Type insertGround() {
        return new Type(TypeEnum.GROUND);
    }

    public static Type insertIce() {
        return new Type(TypeEnum.ICE);
    }

    public static Type insertNormal() {
        return new Type(TypeEnum.NORMAL);
    }

    public static Type insertPoison() {
        return new Type(TypeEnum.POISON);
    }

    public static Type insertPsychic() {
        return new Type(TypeEnum.PSYCHIC);
    }

    public static Type insertRock() {
        return new Type(TypeEnum.ROCK);
    }

    public static Type insertSteel() {
        return new Type(TypeEnum.STEEL); // NERF THIS SHIT
    }

    public static Type insertWater() {
        return new Type(TypeEnum.WATER);
    }
}
