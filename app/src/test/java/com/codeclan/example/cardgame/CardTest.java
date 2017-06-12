package com.codeclan.example.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card (Suit.CLUBS, Rank.TWO);
    }

    @Test
    public void canGetSuit() {
        card = new Card(Suit.CLUBS, Rank.TWO);
        assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        card = new Card(Suit.CLUBS, Rank.TWO);
        assertEquals(Rank.TWO, card.getRank());
    }

    @Test
    public void canGetValue(){
        card = new Card(Suit.CLUBS, Rank.TWO);
        assertEquals(2, card.getValue(Rank.TWO));
    }

}