package ru.deathkiller2009.units;

public class LightHuman extends LightUnit{
    public LightHuman() {
        super(200, 5, 1, 20, 20);
    }

    @Override
    public String toString() {
        return "LightHuman{" + super.toString() + "}";
    }
}
