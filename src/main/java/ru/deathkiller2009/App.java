package ru.deathkiller2009;

import ru.deathkiller2009.factories.SkeletonFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GameSession gameSession = new GameSession();
        gameSession.start(20, 20);
    }
}
