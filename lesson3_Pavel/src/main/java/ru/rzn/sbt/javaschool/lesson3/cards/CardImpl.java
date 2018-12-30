package ru.rzn.sbt.javaschool.lesson3.cards;

public class CardImpl implements Card {
    private int suit;
    static final int DIAMOND = 0;
    static final int CLUB = 1;
    static final int HEART = 2;
    static final int SPADE = 3;
    private int rank;
    static final int ACE = 0;
    static final  int SIX = 1;
    static final int SEVEN = 2;
    static final int EIGHT = 3;
    static final int NINE = 4;
    static final int TEN = 5;
    static final int JACK = 6;
    static final int QUEEN = 7;
    static final int KING = 8;
    CardImpl(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        String str_suit = "";
        switch(suit) {
            case DIAMOND:
                str_suit = "бубны";
                break;
            case CLUB:
                str_suit = "трефы";
                break;
            case HEART:
                str_suit = "червы";
                break;
            case SPADE:
                str_suit = "пики";
                break;
        }
        String str_rank = "";
        switch(rank) {
            case ACE:
                str_rank = "туз";
                break;
            case SIX:
                str_rank = "шестёрка";
                break;
            case SEVEN:
                str_rank = "семёрка";
                break;
            case EIGHT:
                str_rank = "восьмёрка";
                break;
            case NINE:
                str_rank = "девятка";
                break;
            case TEN:
                str_rank = "десятка";
                break;
            case JACK:
                str_rank = "валет";
                break;
            case QUEEN:
                str_rank = "дама";
                break;
            case KING:
                str_rank = "король";
                break;
        }
        return str_rank + " " + str_suit;
    }
}
