package com.codeclan.example.cardgame;

import java.util.ArrayList;

/**
 * Created by user on 27/05/2017.
 */

public class Game {

    private int player1HandOldValue;
    private int player1HandNewValue;
    private int player2HandOldValue;
    private int player2HandNewValue;

    private Suit player1DealtCardSuit;
    private Rank player1DealtCardRank;
    private Suit player2DealtCardSuit;
    private Rank player2DealtCardRank;

    private ArrayList<Card> player1Hand;
    private ArrayList<Card> player2Hand;

    private String player1Name;
    private String player2Name;

    private String result;
    private String resultMessage;

    Hand hand1 = new Hand();
    Hand hand2 = new Hand();

    Player player1  = new Player("Player1", hand1);
    Player player2  = new Player("Player2", hand2);

    Rule rule = new Rule();

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Hand = new ArrayList<Card>();
        this.player2Hand = new ArrayList<Card>();
        this.player1HandOldValue = player1HandOldValue;
        this.player1HandNewValue = player1HandNewValue;
        this.player2HandOldValue = player2HandOldValue;
        this.player2HandNewValue = player2HandNewValue;
        this.player1DealtCardSuit = player1DealtCardSuit;
        this.player1DealtCardRank = player1DealtCardRank;
        this.player2DealtCardSuit = player2DealtCardSuit;
        this.player2DealtCardRank = player2DealtCardRank;
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public Hand getPlayer1Hand() {
        return this.player1.getHand();
    }

    public Hand getPlayer2Hand() {
        return this.player2.getHand();
    }

    public ArrayList<Card> dealPlayer1Card() {
        player1Hand = hand1.buildHand();
        Player player1  = new Player("Player1", hand1);
        player1Name = player1.getName();

        player1DealtCardSuit = hand1.getCardSuit();
        player1DealtCardRank = hand1.getCardRank();

        player1Hand = hand1.getCardsInHand();
        for (Card card:player1Hand) {
            Suit suit = card.getSuit();
            Rank rank = card.getRank();
            int cardValue = card.getValue(rank);
        }

        player1HandNewValue = player1HandOldValue + hand1.getCardValue();
        player1HandOldValue = player1HandNewValue;

        return player1Hand;
    }

    public int getPlayer1HandNewValue() {
        return player1HandNewValue;
    }

    public Suit getplayer1DealtCardSuit() {
        return this.player1DealtCardSuit;
    }

    public Rank getplayer1DealtCardRank() {
        return this.player1DealtCardRank;
    }

    public int getPlayer1HandSize() {
        return player1Hand.size();
    }

    public ArrayList<Card> dealPlayer2Card() {
        player2Hand = hand2.buildHand();
        Player player2  = new Player("Player2", hand2);
        player2Name = player2.getName();

        player2DealtCardSuit = hand2.getCardSuit();
        player2DealtCardRank = hand2.getCardRank();

        player2Hand = hand2.getCardsInHand();
        for (Card card:player2Hand) {
            Suit suit = card.getSuit();
            Rank rank = card.getRank();
            int cardValue = card.getValue(rank);
        }

        player2HandNewValue = player2HandOldValue + hand2.getCardValue();
        player2HandOldValue = player2HandNewValue;

        return player2Hand;
    }

    public int getPlayer2HandNewValue() {
        return player2HandNewValue;
    }

    public Suit getplayer2DealtCardSuit() {
        return this.player2DealtCardSuit;
    }

    public Rank getplayer2DealtCardRank() {
        return this.player2DealtCardRank;
    }

    public int getPlayer2HandSize() {
        return player2Hand.size();
    }

    public String getResult(int player1HandNewValue, int player2HandNewValue) {
        player1HandNewValue = getPlayer1HandNewValue();
        player2HandNewValue = getPlayer2HandNewValue();
        result = rule.getResult(player1HandNewValue, player2HandNewValue);
        if (result.equals("Player1")) {
            resultMessage = player1.getName() + " is the winner!!!";
        } else if (result.equals("Player2")) {
            resultMessage = player2.getName() + " is the winner!!!";
        } else {
            resultMessage = "It's a draw!!!";
        }
        return resultMessage;
    }

}