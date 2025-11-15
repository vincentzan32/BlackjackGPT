package model;

public enum Suit {
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    CLUBS("Clubs");

    private final String label;

    Suit(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}

