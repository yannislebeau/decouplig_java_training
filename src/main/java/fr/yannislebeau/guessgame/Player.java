package fr.yannislebeau.guessgame;

public interface Player {

    long askNextGuess();

    void respond(boolean lowerOrGreater);
}
