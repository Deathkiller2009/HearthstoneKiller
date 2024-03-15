package ru.deathkiller2009;

import ru.deathkiller2009.army.Army;

public class Turn {
    private final Army army1;
    private final Army army2;
    private Army attacker;
    private Army defender;
    public Turn(Army army1, Army army2) {
        this.army1 = army1;
        this.army2 = army2;
    }
    public void makeTurn(int armyNumber){
        selectAttacker(armyNumber);
        armyAttack();
        updateArmy();
        resetState();
    }

    private void resetState() {
        attacker = null;
        defender = null;
    }

    private void updateArmy() {
        if (!isArmyFirstUnitNotDead(attacker)){
            attacker.army.poll();
        }
        if (!isArmyFirstUnitNotDead(defender)){
            defender.army.poll();
        }
    }

    private void armyAttack() {
        attacker.attackEnemyArmy(defender);
        if (isArmyFirstUnitNotDead(defender)){
            defender.attackEnemyArmy(attacker);
        }
    }

    private boolean isArmyFirstUnitNotDead(Army army) {
        return army.army.peek().getHealthPoints() > 0;
    }

    private void selectAttacker(int armyNumber) {
        switch (armyNumber) {
            case 1 -> {
                attacker = army1;
                defender = army2;
            }
            case 2 -> {
                attacker = army2;
                defender = army1;
            }
        }
    }

}
