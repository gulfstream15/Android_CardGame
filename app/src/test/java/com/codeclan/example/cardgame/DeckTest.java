package com.codeclan.example.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canCreateDeck(){
        assertEquals(52, deck.deckSize());
    }

    @Test
    public void getDeckSize(){
        assertEquals(52, deck.deckSize());
    }

    @Test
    public void canDealRandomCard() {
        assertNotNull(deck.dealRandomCard());
    }

}