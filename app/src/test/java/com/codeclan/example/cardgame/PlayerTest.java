package com.codeclan.example.cardgame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */

public class PlayerTest {

    @Test
    public void canGetPlayerName() {
        Hand hand = new Hand();
        Player player = new Player("Mike", hand);
        assertEquals("Mike", player.getName());
    }

    @Test
    public void playerHasHand() {
        Hand hand = new Hand();
        Player player = new Player("Mike", hand);
        assertNotNull(hand);
    }

}