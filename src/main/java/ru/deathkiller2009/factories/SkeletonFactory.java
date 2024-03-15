package ru.deathkiller2009.factories;

import ru.deathkiller2009.factories.UnitFactory;
import ru.deathkiller2009.units.HeavySkeleton;
import ru.deathkiller2009.units.HeavyUnit;
import ru.deathkiller2009.units.LightSkeleton;
import ru.deathkiller2009.units.LightUnit;

public class SkeletonFactory implements UnitFactory {
    @Override
    public HeavyUnit createHeavyUnit() {
        return new HeavySkeleton();
    }

    @Override
    public LightUnit createLightUnit() {
        return new LightSkeleton();
    }
}
