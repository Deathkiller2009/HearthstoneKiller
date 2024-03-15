package ru.deathkiller2009.units;

public abstract class HeavyUnit extends MeleeUnit {

    public HeavyUnit(int healthPoints, int defencePoints, int dodgePercent, int meleeAttackPower, int cost) {
        super(healthPoints, defencePoints, dodgePercent, meleeAttackPower, cost);
    }

}