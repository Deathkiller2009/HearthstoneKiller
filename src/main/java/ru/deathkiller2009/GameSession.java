package ru.deathkiller2009;

import ru.deathkiller2009.army.Army;
import ru.deathkiller2009.army.ArmyMaker;
import ru.deathkiller2009.army.HeavyArmy;
import ru.deathkiller2009.army.LightArmy;
import ru.deathkiller2009.factories.HumanFactory;
import ru.deathkiller2009.factories.SkeletonFactory;
import ru.deathkiller2009.factories.UnitFactory;

import java.util.Scanner;

public class GameSession {
    private Army army1;
    private Army army2;
    private ArmyMaker armyMaker;
    private UnitFactory unitFactory;
    private Scanner scanner = new Scanner(System.in);

    public void start(int moneyForFirstArmy, int moneyForSecondArmy) {
        createArmies(moneyForFirstArmy, moneyForSecondArmy);
        playTillTheEnd();
    }

    private void createArmies(int moneyForFirstArmy, int moneyForSecondArmy) {
        army1 = createArmy(moneyForFirstArmy);
        Logger.printArmy(army1);
        army2 = createArmy(moneyForSecondArmy);
        Logger.printArmy(army2);
    }

    private Army createArmy(int moneyForFirstArmy) {
        configureArmy();
        return armyMaker.createArmy(moneyForFirstArmy);
    }

    private void configureArmy() {
        int choiceOfUnitTypes = scanner.nextInt();
        configureUnitTypes(choiceOfUnitTypes);
        int choiceOfArmyType = scanner.nextInt();
        configureArmyType(choiceOfArmyType);
    }

    private void configureUnitTypes(int choiceOfUnitTypes) {
        switch (choiceOfUnitTypes) {
            case 1 -> unitFactory = new SkeletonFactory();
            case 2 -> unitFactory = new HumanFactory();
        }
    }

    private void configureArmyType(int choiceOfArmyType) {
        switch (choiceOfArmyType) {
            case 1 -> armyMaker = new LightArmy(unitFactory);
            case 2 -> armyMaker = new HeavyArmy(unitFactory);
        }
    }

    private void playTillTheEnd() {
        while (armiesNotEmpty()) {
            Turn turn = new Turn(army1, army2);
            int armyToSelect = scanner.nextInt();
            turn.makeTurn(armyToSelect);
        }
    }

    private boolean armiesNotEmpty() {
        return !army1.army.isEmpty() && !army2.army.isEmpty();
    }

}
