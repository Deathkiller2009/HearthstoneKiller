package ru.deathkiller2009.army;

import ru.deathkiller2009.factories.UnitFactory;
import ru.deathkiller2009.units.HeavyUnit;
import ru.deathkiller2009.units.Unit;

import java.util.Deque;
import java.util.LinkedList;

public class HeavyArmy implements ArmyMaker {
    private final UnitFactory unitFactory;

    public HeavyArmy(UnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }

    @Override
    public Army createArmy(int money) {
        Deque<Unit> units = new LinkedList<>();
        while (money > 0) {
            HeavyUnit heavyUnit = unitFactory.createHeavyUnit();
            units.push(heavyUnit);
            money -= heavyUnit.getCost();
        }
        return new Army(units);
    }
}
