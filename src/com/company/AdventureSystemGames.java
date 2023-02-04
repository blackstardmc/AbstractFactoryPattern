package com.company;

interface Game {
    void play();
}

interface GameFactory {
    Game createGame(String type);
}

class DotaGame implements Game {

    @Override
    public void play() {
        System.out.println("Playing Dota2");
    }
}

class StarCraftGame implements Game {

    @Override
    public void play() {
        System.out.println("Playing StarCraft");

    }
}

class GodOfWarGame implements Game {

    @Override
    public void play() {
        System.out.println("Playing God of War");

    }
}

class FifaGame implements Game {

    @Override
    public void play() {
        System.out.println("Playing FIFA");
    }
}

class PCFactory implements GameFactory {

    @Override
    public Game createGame(String type) {
        switch (type) {
            case "Dota":
                return new DotaGame();

            case "StarCraft":
                return new StarCraftGame();

            default:
                return null;
        }
    }
}

class PlayStationFactory implements GameFactory {

    @Override
    public Game createGame(String type) {
        switch (type) {
            case "Fifa":
                return new FifaGame();
            case "God of War":
                return new GodOfWarGame();
            default:
                return null;
        }
    }
}


class FactoryProducer {
    public static GameFactory getFactory(String factoryName) {
        switch (factoryName) {
            case "PC":
                return new PCFactory();
            case "PlayStation":
                return new PlayStationFactory();
            default:
                return null;
        }
    }
}