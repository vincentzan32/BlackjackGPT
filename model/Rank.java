package model;

public enum Rank {
    TWO("2", 2, 1),
    THREE("3", 3, 1),
    FOUR("4", 4, 1),
    FIVE("5", 5, 1),
    SIX("6", 6, 1),
    SEVEN("7", 7, 0),
    EIGHT("8", 8, 0),
    NINE("9", 9, 0),
    TEN("10", 10, -1),
    JACK("Jack", 10, -1),
    QUEEN("Queen", 10, -1),
    KING("King", 10, -1),
    ACE("Ace", 11, -1);

    private final String label;
    private final int blackjackValue;
    private final int hiLoValue;

    Rank(String label, int blackjackValue, int hiLoValue) {
        this.label = label;
        this.blackjackValue = blackjackValue;
        this.hiLoValue = hiLoValue;
    }
    
    public String getLabel() {
        return label;
    }

    public int getBlackjackValue() {
        return blackjackValue;
    }

    public int getHiLoValue() {
        return hiLoValue;
    }

    @Override
    public String toString() {
        return label;
    }

}
