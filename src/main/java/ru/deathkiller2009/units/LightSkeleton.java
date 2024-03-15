package ru.deathkiller2009.units;

public class LightSkeleton extends LightUnit{
    public LightSkeleton() {
        super(200, 5, 1, 20, 20);
    }

    @Override
    public String toString() {
        return "LightSkeleton{" + super.toString() + "}";
    }
}
