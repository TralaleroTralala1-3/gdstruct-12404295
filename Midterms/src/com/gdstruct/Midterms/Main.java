package com.gdstruct.Midterms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Create deck with 30 cards
        CardStack deck = new CardStack(30);
        CardStack discardPile = new CardStack(30);

        String[] cardNames = {
                "Pot of Greed", "Polymerization", "Fusion Deployment", "Big-Shield Gardna",
                "Blue eyes white dragon", "Vanquish Soul, Ceasar Valius", "Evil Hero Malicious Fiend", "Meteor Black Dragon"
        };

        // Fill deck (top = last inserted)
        for (int i = 0; i < 30; i++) {
            String name = cardNames[random.nextInt(cardNames.length)];
            deck.push(new Card(name));
        }

        // Player hand (not a stack)
        List<Card> hand = new ArrayList<>();

        System.out.println("=== Card Drawing Simulator ===");

        // Game loop
        while (!deck.isEmpty()) {

            System.out.println("\nPress ENTER for next turn...");
            scanner.nextLine();

            int command = random.nextInt(3); // 0 = draw, 1 = discard, 2 = get from discard
            int x = random.nextInt(5) + 1;   // 1–5 cards

            switch (command) {

                // -------- DRAW --------
                case 0:
                    System.out.println("Command: DRAW " + x + " cards.");
                    for (int i = 0; i < x; i++) {
                        if (deck.isEmpty()) break;
                        hand.add(deck.pop());
                    }
                    break;

                // -------- DISCARD --------
                case 1:
                    System.out.println("Command: DISCARD " + x + " cards.");
                    for (int i = 0; i < x; i++) {
                        if (hand.isEmpty()) break;
                        discardPile.push(hand.remove(hand.size() - 1));
                    }
                    break;

                // -------- GET FROM DISCARD --------
                case 2:
                    System.out.println("Command: GET " + x + " cards from discard pile.");
                    for (int i = 0; i < x; i++) {
                        if (discardPile.isEmpty()) break;
                        hand.add(discardPile.pop());
                    }
                    break;
            }

            // ----- STATUS PRINT -----
            System.out.println("\n=== End of Turn Status ===");

            System.out.println("Player Hand:");
            if (hand.isEmpty()) {
                System.out.println("  (empty)");
            } else {
                for (Card c : hand) {
                    System.out.println("  " + c);
                }
            }

            System.out.println("Cards left in Deck: " + deck.size());
            System.out.println("Cards in Discard Pile: " + discardPile.size());
        }

        System.out.println("\n=== The Deck is Empty! Game Over ===");
    }
}
