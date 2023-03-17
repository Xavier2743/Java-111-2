import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    Card[] deck;
    private Card[] deckAfterShuffling = new Card[52];
    private SecureRandom random = new SecureRandom();
    private int lastCard = 0;

    public DeckOfCards() {
        deck = new Card[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(suits[i / 13], faces[i % 13]);
        }
    }

    // 洗牌
    public void shuffle() {
        int[] randomNumbers = new int[52];
        int temp;
        for (int i = 0; i < 52; i++) {
            do {
                temp = random.nextInt(52);
            }
            while (randomNumbers[temp] != 0);
            randomNumbers[temp] = i;
        }

        for (int i = 0; i < 52; i++) {
            deckAfterShuffling[randomNumbers[i]] = deck[i];
        }
    }

    // 發牌
    public Card[] deal(int number) {
        int max = lastCard + number;
        if (max > 52) {
            return null;
        }
        else {
            Card[] cards = Arrays.copyOfRange(deckAfterShuffling, lastCard, max);
            lastCard = max;
            return cards;
        }
    }
}
