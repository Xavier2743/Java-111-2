public class Main {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

//        for (int i = 0; i < 52; i++) {
//            Card myCard = deck.deal();
//            System.out.println(myCard.toString());
//        }

        Card[] dealtCards1 = deck.deal(52);
        for (int i = 0; i < dealtCards1.length; i++) {
            System.out.println(i);
            System.out.println(dealtCards1[i].toString());
        }
    }
}