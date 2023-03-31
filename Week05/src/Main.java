import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[] deck = new String[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = faces[i % 13] + " of " + suits[i / 13];
        }
        String[] deckAfterShuffling = Arrays.copyOf(deck, deck.length);

        // shuffle
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < deckAfterShuffling.length; i++) {
            int randomIndex = random.nextInt(deckAfterShuffling.length);
            String temp = deckAfterShuffling[i];
            deckAfterShuffling[i] = deckAfterShuffling[randomIndex];
            deckAfterShuffling[randomIndex] = temp;
        }

        // deal several cards
        int counter = 0; // next new index
        int number = 3; // number of cards to deal

        if (counter + number > 52) {
            System.out.println("Out of cards");
        }
        else {
            System.out.println("Deal " + number + " cards");
            for (int j = counter; j < (counter + number); j++) {
                System.out.println(deckAfterShuffling[j]);
            }
            counter += number;
        }
        System.out.println();

        // shuffle the remaining cards
        for (int i = counter; i < deckAfterShuffling.length; i++) {
            int randomIndex = random.nextInt(deckAfterShuffling.length - counter) + counter;
            String temp = deckAfterShuffling[i];
            deckAfterShuffling[i] = deckAfterShuffling[randomIndex];
            deckAfterShuffling[randomIndex] = temp;
        }

        // deal several cards again
        number = 2;
        if (counter + number > 52) {
            System.out.println("No more remaining cards");
        }
        else {
            System.out.println("Deal " + number + " cards");
            for (int i = counter; i < (counter + number); i++) {
                System.out.println(deckAfterShuffling[i]);
            }
            counter += number;
        }
        System.out.println();

        //shuffle after dealing
        for (int i = 0; i < counter; i++) {
            int randomIndex = random.nextInt(counter);
            String temp = deckAfterShuffling[i];
            deckAfterShuffling[i] = deckAfterShuffling[randomIndex];
            deckAfterShuffling[randomIndex] = temp;
        }

        // deal several cards after shuffling
        number = 4;
        System.out.println("Deal " + number + " cards");
        for (int i = 0; i < number; i++) {
            System.out.println(deckAfterShuffling[i]);
        }
    }
}