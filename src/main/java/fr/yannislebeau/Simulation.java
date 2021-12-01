package fr.yannislebeau;

import fr.yannislebeau.guessgame.Player;
import fr.yannislebeau.logger.Logger;
import fr.yannislebeau.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long guess = player.askNextGuess();
        if (guess < numberToGuess) {
            player.respond(true);
            logger.log("It's higher");
        } else if (guess > numberToGuess) {
            logger.log("It's lower");
            player.respond(false);
        } else {
            logger.log("GG WP");
            return true;
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while(!nextRound());
    }
}
