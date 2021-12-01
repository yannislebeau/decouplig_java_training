package fr.yannislebeau;

import fr.yannislebeau.guessgame.HumanPlayer;

public class Launcher {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(new HumanPlayer());
        simulation.initialize((long) (Math.random() * 5000));
        simulation.loopUntilPlayerSucceed();
    }
}
