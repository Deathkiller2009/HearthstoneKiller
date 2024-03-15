package ru.deathkiller2009.units;

public abstract class MeleeUnit extends Unit implements MeleeAttack {
    private int meleeAttackPower;

    public MeleeUnit(int healthPoints, int defencePoints, int dodgePercent, int meleeAttackPower, int cost) {
        super(healthPoints, defencePoints, dodgePercent, cost);
        this.meleeAttackPower = meleeAttackPower;
    }

    public int getMeleeAttackPower() {
        return meleeAttackPower;
    }

    public void setMeleeAttackPower(int meleeAttackPower) {
        this.meleeAttackPower = meleeAttackPower;
    }
    @Override
    public void attack(Unit target) {
        target.setHealthPoints(target.getHealthPoints() - getMeleeAttackPower() + target.getDefencePoints() + target.getDodgePercent());
    }
    @Override
    public String toString() {
        return super.toString() +
                ", meleeAttackPower=" + meleeAttackPower;
    }
}
