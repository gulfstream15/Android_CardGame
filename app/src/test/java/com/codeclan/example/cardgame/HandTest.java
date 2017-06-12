package com.codeclan.example.cardgame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */

public class HandTest {

    Hand hand;
    Card card;

    ArrayList<Card> currentHand;
    ArrayList<Card> nextHand;

    @Before
    public void before() {
        hand = new Hand ();
        card = new Card();
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, hand.getHandSize());
    }

    @Test
    public void handHasSize() {
        currentHand = hand.buildHand();
        int handSize = hand.getHandSize();
        assertEquals(1, handSize);
    }

    @Test
    public void cardHasSuit() {
        currentHand = hand.buildHand();
        Suit suit = hand.getCardSuit();
        assertNotNull(suit);
    }

    @Test
    public void cardHasRank() {
        currentHand = hand.buildHand();
        Rank rank = hand.getCardRank();
        assertNotNull(rank);
    }

    @Test
    public void cardHasValue() {
        currentHand = hand.buildHand();
        int cardValue = hand.getCardValue();
        assertNotNull(cardValue);
    }

    @Test
    public void handHasSizeTwoDeals() {
        currentHand = hand.buildHand();
        nextHand = hand.buildHand();
        int handSize = hand.getHandSize();
        assertEquals(2, handSize);
    }

}
