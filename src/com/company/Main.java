package com.company;

public class Main {

    public static void main(String[] args) {
	// Abstract Factory Demo
        try {
            GameFactory factory = FactoryProducer.getFactory("PlayStation");
            Game game = factory.createGame("Fifa");
            game.play();
        }catch (NullPointerException e){
            System.out.println("Error , the game or the environment doesn't  exist");
        }
    }
}
