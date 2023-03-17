public class Main {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] dealtCards1 = deck.deal(10);
        for (Card card : dealtCards1) {
            System.out.println(card.toString());
        }

        System.out.println("===================================");

        Card[] dealtCards2 = deck.deal(41);
        for (Card card : dealtCards2) {
            System.out.println(card.toString());
        }
    }
}