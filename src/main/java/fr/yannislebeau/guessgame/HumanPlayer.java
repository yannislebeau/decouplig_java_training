package fr.yannislebeau.guessgame;

import fr.yannislebeau.logger.Logger;
import fr.yannislebeau.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private final Logger logger = new LoggerFactory().getLogger("player");

    public HumanPlayer() {
    }

    public long askNextGuess() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextLong();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void respond(boolean lowerOrGreater) {

    }
}


