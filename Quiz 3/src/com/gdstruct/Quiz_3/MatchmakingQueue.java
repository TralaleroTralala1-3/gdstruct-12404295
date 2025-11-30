package com.gdstruct.Quiz_3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class MatchmakingQueue {

    private Queue<Player> queue;
    private int nextPlayerId;
    private Random random;

    private static final String[] ARTHURIAN_NAMES = {
            "Arthur","Lancelot","Guinevere","Merlin","Gawain",
            "Mordred","Galahad","Tristan","Isolde","Percival",
            "Morgan","Elaine","Kay","Bedivere","Uther"
    };

    public MatchmakingQueue() {
        queue = new ArrayDeque<>();
        nextPlayerId = 1;
        random = new Random();
    }

    // Generate random 1–7 players joining the queue
    public void addRandomPlayers() {

        // Print holdover players at start of turn
        if (!queue.isEmpty()) {
            System.out.println("Holdover players from previous turn:");
            for (Player p : queue) {
                System.out.println("  " + p);
            }
        }

        int joiningPlayers = random.nextInt(7) + 1; // 1–7 players
        System.out.println("\n" + joiningPlayers + " new players joined the queue!");

        for (int i = 0; i < joiningPlayers; i++) {
            String name = ARTHURIAN_NAMES[random.nextInt(ARTHURIAN_NAMES.length)];
            Player p = new Player(nextPlayerId, name, random.nextInt(101));
            queue.add(p);
            nextPlayerId++;
        }

        System.out.println("Total queue size: " + queue.size());
    }

    // Check if 5 players are available and start a game
    public boolean tryCreateMatch(int gameNumber) {
        if (queue.size() < 5) return false;

        System.out.println("\n=== Starting Game " + gameNumber + " ===");

        for (int i = 0; i < 5; i++) {
            Player matched = queue.poll(); // Pops front
            System.out.println("Matched: " + matched);
        }

        System.out.println("Game " + gameNumber + " created!");

        // Print leftover players at the end of the round
        if (!queue.isEmpty()) {
            System.out.println("Leftover players in queue:");
            for (Player p : queue) {
                System.out.println("  " + p);
            }
        } else {
            System.out.println("No leftover players.");
        }

        return true;
    }
}
