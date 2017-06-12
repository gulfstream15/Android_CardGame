package com.codeclan.example.cardgame;

/**
 * Created by user on 27/05/2017.
 */

public class Rule {

    private String rank;
    private int value;

    private int player1HandValue;
    private int player2HandValue;

    private String result;

    public Rule() {

    }

    public Rule(int player1HandValue, int player2HandValue) {
        this.player1HandValue = player1HandValue;
        this.player2HandValue = player2HandValue;
    }

    public Rule(String rank) {
        this.rank = rank;
        this.value = value;
    }

    public String getRank() {
        return this.rank;
    }

    public int getValueFromRank(String rank) {
        switch(rank) {
            case "ACE":
                value = 1;
                break;
            case "TWO":
                value = 2;
                break;
            case "THREE":
                value = 3;
                break;
            case "FOUR":
                value = 4;
                break;
            case "FIVE":
                value = 5;
                break;
            case "SIX":
                value = 6;
                break;
            case "SEVEN":
                value = 7;
                break;
            case "EIGHT":
                value = 8;
                break;
            case "NINE":
                value = 9;
                break;
            case "TEN":
                value = 10;
                break;
            case "JACK":
                value = 10;
                break;
            case "QUEEN":
                value = 10;
                break;
            case "KING":
                value = 10;
                break;
        }
        return value;
    }

    public String getResult(int player1HandNewValue, int player2HandNewValue) {
        if (player1HandNewValue > player2HandNewValue) {
            return "Player1";
        } else if (player2HandNewValue > player1HandNewValue) {
            return "Player2";
        } else {
            return "Game Drawn";
        }
    }

}