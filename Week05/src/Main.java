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

        // deal
        Scanner input = new Scanner(System.in);
        int counter = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("How many cards do you want to deal? ");
            int number = input.nextInt();

            if (counter + number > 52) {
                System.out.println("Out of cards");
                break;
            }
            else {
                for (int j = counter; j < (counter + number); j++) {
//                    System.out.println(j);
                    System.out.println(deckAfterShuffling[j]);
                }
                counter += number;
            }
            System.out.println();
        }

        // deal the remaining cards
        if (counter >= 52) {
            System.out.println("No more remaining cards");
        }
        else {
            System.out.println("The remaining cards are:");
            for (int i = counter; i < 52; i++) {
                System.out.println(deckAfterShuffling[i]);
            }
        }
    }
}