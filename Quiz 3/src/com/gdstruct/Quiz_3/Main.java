package com.gdstruct.Quiz_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MatchmakingQueue mm = new MatchmakingQueue();
        Scanner scanner = new Scanner(System.in);

        int gameCount = 0;

        System.out.println("=== Matchmaking Simulator ===");
        System.out.println("Press ENTER to simulate each turn.\n");

        while (gameCount < 10) {

            System.out.print("[TURN] Press ENTER... ");
            scanner.nextLine();

            mm.addRandomPlayers();      // 1–7 players join queue

            if (mm.tryCreateMatch(gameCount + 1)) {
                gameCount++;            // match successfully formed
            }
        }

        System.out.println("=== 10 Games Completed. Program Finished. ===");
    }
}
