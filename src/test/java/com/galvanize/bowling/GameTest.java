package com.galvanize.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void startGame() {
        Game game = new Game();
    }

    @Test
    public void gameGetScore() {
        Game game = new Game();

        assertEquals(0, game.getScore(), "New game score should be 0");
    }

    @Test
    public void gameAddScore() {
        Game game = new Game();

        game.score(1);

        assertEquals(1, game.getScore(), "Game score should be 1");
    }

    @Test
    public void gameAddSpare() {
        Game game = new Game();

        game.score(5);
        game.score(5);
        game.score(5);

        assertEquals(20, game.getScore(), "Game score with spare should be 20");
    }

    @Test
    public void gameAddStrikes() {
        Game game = new Game();

        game.score(10);
        game.score(4);
        game.score(4);

        assertEquals(26, game.getScore(), "Game score with strike should be 26");
    }

    @Test
    public void gameAllStrikes() {
        Game game = new Game();

        for (int i = 0; i < 12; i++) {
            game.score(10);
        }

        assertEquals(300, game.getScore(), "Game score with all strikes should be 300");
    }
}