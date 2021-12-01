package fr.yannislebeau;

import fr.yannislebeau.guessgame.HumanPlayer;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
// long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        long  number = random.nextInt(5000); // génère un nombre entre 0 (inclus) et 100 (exclus)
        Simulation simulation = new Simulation(new HumanPlayer());
        simulation.initialize(number);
        simulation.loopUntilPlayerSucceed();
    }
}
