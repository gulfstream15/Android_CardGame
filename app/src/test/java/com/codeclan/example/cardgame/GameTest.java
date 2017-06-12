package com.codeclan.example.cardgame;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */

import java.util.ArrayList;

public class GameTest {

    Hand hand1 = new Hand();
    Hand hand2 = new Hand();

    ArrayList<Card> player1Hand;
    ArrayList<Card> player2Hand;

    Suit lastCardSuitPlayer1;
    Suit lastCardSuitPlayer2;

    Player player1  = new Player("Mike", hand1);
    Player player2  = new Player("Bob", hand2);

    @Test @Ignore
    public void player1Exists() {
        Game game = new Game(player1, player2);
        assertNotNull(game.getPlayer1());
    }

    @Test @Ignore
    public void player2Exists() {
        Game game = new Game(player1, player2);
        assertNotNull(game.getPlayer2());
    }

    @Test @Ignore
    public void player1HandHasValue() {
        Game game = new Game(player1, player2);
        player1Hand = game.dealPlayer1Card();
        int player1HandNewValue = game.getPlayer1HandNewValue();
        assertNotNull(player1HandNewValue);
    }

    @Test @Ignore
    public void player2HandHasValue() {
        Game game = new Game(player1, player2);
        player2Hand = game.dealPlayer2Card();
        int player2HandNewValue = game.getPlayer2HandNewValue();
        assertNotNull(player2HandNewValue);
    }

    @Test @Ignore
    public void player1HandHasSize() {
        Game game = new Game(player1, player2);
        player1Hand = game.dealPlayer1Card();
        int getPlayer1HandSize = game.getPlayer1HandSize();
        assertEquals(1, getPlayer1HandSize);
    }

    @Test @Ignore
    public void player2HandHasSize() {
        Game game = new Game(player1, player2);
        player2Hand = game.dealPlayer2Card();
        int getPlayer2HandSize = game.getPlayer2HandSize();
        assertEquals(1, getPlayer2HandSize);
    }

    @Test
    public void gameHasResult() {
        Game game = new Game(player1, player2);
        ArrayList<Card> player1Hand1 = game.dealPlayer1Card();
        ArrayList<Card> player1Hand2 = game.dealPlayer1Card();

        lastCardSuitPlayer1 = game.getplayer1DealtCardSuit();

        int player1HandNewValue = game.getPlayer1HandNewValue();

        ArrayList<Card> player2Hand1 = game.dealPlayer2Card();
        ArrayList<Card> player2Hand2 = game.dealPlayer2Card();

        lastCardSuitPlayer2 = game.getplayer2DealtCardSuit();

        int player2HandNewValue = game.getPlayer2HandNewValue();

        String resultMessage = game.getResult(player1HandNewValue, player2HandNewValue);

        assertNotNull(resultMessage);
    }

}