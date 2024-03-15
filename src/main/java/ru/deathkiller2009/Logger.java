package ru.deathkiller2009;

import ru.deathkiller2009.army.Army;
import ru.deathkiller2009.units.Unit;

public final class Logger {
    private Logger(){

    }
    public static void printArmy(Army army){
        System.out.println(army.army);
    }
    public static void printUnitInfo(Unit unit){
        System.out.println(unit);
    }
    public static void printAttackStatus(Army army1, Army army2){
        Unit unit1 = army1.army.peek();
        Unit unit2 = army2.army.peek();
        System.out.printf("%s - %d hp ударил %s - %d hp \n",
                unit1.getClass().getSimpleName(), unit1.getHealthPoints(), unit2.getClass().getSimpleName(), unit2.getHealthPoints());
    }
}
