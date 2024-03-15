package ru.deathkiller2009.army;

import ru.deathkiller2009.Logger;
import ru.deathkiller2009.units.Unit;

import java.util.Deque;
import java.util.Objects;

public class Army {
    public Deque<Unit> army;

    public Army(Deque<Unit> army) {
        this.army = army;
    }

    public void attackEnemyArmy(Army enemies){
        Objects.requireNonNull(army.peek()).attack(enemies.army.peek());
        Logger.printAttackStatus(this, enemies);
    }
}
