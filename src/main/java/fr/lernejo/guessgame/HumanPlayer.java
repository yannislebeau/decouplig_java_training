package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

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


