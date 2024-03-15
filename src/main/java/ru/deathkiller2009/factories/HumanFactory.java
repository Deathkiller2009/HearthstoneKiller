package ru.deathkiller2009.factories;

import ru.deathkiller2009.factories.UnitFactory;
import ru.deathkiller2009.units.HeavyHuman;
import ru.deathkiller2009.units.HeavyUnit;
import ru.deathkiller2009.units.LightHuman;
import ru.deathkiller2009.units.LightUnit;

public class HumanFactory implements UnitFactory {
    @Override
    public HeavyUnit createHeavyUnit() {
        return new HeavyHuman();
    }

    @Override
    public LightUnit createLightUnit() {
        return new LightHuman();
    }
}
