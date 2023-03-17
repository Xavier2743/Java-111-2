public class Card {
    final String suit;
    final String face;

    public Card(String suit, String face) {
        this.suit = suit;
        this.face = face;
    }

    public String toString() {
        return face + " of " + suit;
    }
}
