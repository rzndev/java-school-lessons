package ru.rzn.sbt.javaschool.lesson3.cards;

public class DeckImpl implements Deck {
    private CardImpl[][] cards;
    public DeckImpl() {
        cards = new CardImpl[4][9];
        for(int suit = 0; suit < 4; suit++)
            for(int rank = 0; rank < 9; rank++)
                cards[suit][rank] = new CardImpl(suit, rank);
    }
    @Override
    public Card getCard(int suit, int rank) {
        return cards[suit][rank];
    }
}
