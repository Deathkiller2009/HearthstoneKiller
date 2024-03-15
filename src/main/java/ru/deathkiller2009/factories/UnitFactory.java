package ru.deathkiller2009.factories;

import ru.deathkiller2009.units.HeavyUnit;
import ru.deathkiller2009.units.LightUnit;

public interface UnitFactory {
    HeavyUnit createHeavyUnit();
    LightUnit createLightUnit();
}
