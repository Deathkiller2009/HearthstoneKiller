package ru.deathkiller2009.army;

import ru.deathkiller2009.factories.UnitFactory;
import ru.deathkiller2009.units.LightUnit;
import ru.deathkiller2009.units.Unit;

import java.util.Deque;
import java.util.LinkedList;

public class LightArmy implements ArmyMaker{
    private final UnitFactory unitFactory;

    public LightArmy(UnitFactory unitFactory) {
        this.unitFactory = unitFactory;
    }

    @Override
    public Army createArmy(int money) {
        Deque<Unit> units = new LinkedList<>();
        while (money > 0){
            LightUnit lightUnit = unitFactory.createLightUnit();
            units.push(lightUnit);
            money -= lightUnit.getCost();
        }
        return new Army(units);
    }
}
