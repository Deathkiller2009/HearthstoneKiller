package ru.deathkiller2009.units;

public abstract class Unit {
    private int healthPoints;
    private int defencePoints;
    private int dodgePercent;
    private int cost;

    public Unit(int healthPoints, int defencePoints, int dodgePercent, int cost) {
        this.healthPoints = healthPoints;
        this.defencePoints = defencePoints;
        this.dodgePercent = dodgePercent;
        this.cost = cost;
    }

    public abstract void attack(Unit target);

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }


    public int getDodgePercent() {
        return dodgePercent;
    }

    public void setDodgePercent(int dodgePercent) {
        this.dodgePercent = dodgePercent;
    }

    @Override
    public String toString() {
        return
                "healthPoints=" + healthPoints +
                        ", defencePoints=" + defencePoints +
                        ", dodgePercent=" + dodgePercent
                ;
    }
}
