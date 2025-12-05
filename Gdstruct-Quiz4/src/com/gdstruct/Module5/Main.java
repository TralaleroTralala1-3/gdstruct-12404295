package com.gdstruct.Module5;

public class Main {
    public static void main(String[] args) {

        // Create players
        Player Amongus = new Player(234, "AmongUSA", 69);
        Player Joey = new Player(123, "BrooklynBro", 13);
        Player Kaiba = new Player(873, "EyesOFBLU", 99);
        Player Jaden = new Player(3029, "MiracleHERO", 100);
        Player Chazz = new Player(1220, "Sanda", 130);

        // Create hashtable
        SimpleHashtable hashtable = new SimpleHashtable();

        // PUT players into the table
        hashtable.put(Amongus.getUserName(), Amongus);
        hashtable.put(Joey.getUserName(), Joey);
        hashtable.put(Kaiba.getUserName(), Kaiba);
        hashtable.put(Jaden.getUserName(), Jaden);
        hashtable.put(Chazz.getUserName(), Chazz);

        // Print the table
        System.out.println("Hashtable after inserting players:");
        hashtable.printHashtable();
        System.out.println();

        // GET a player
        System.out.println("Get player 'AmongUSA':");
        Player p = hashtable.get("AmongUSA");
        System.out.println(p);
        System.out.println();

        // REMOVE a player
        System.out.println("Remove player 'BrooklynBro':");
        Player removed = hashtable.remove("BrooklynBro");
        System.out.println("Removed: " + removed);
        System.out.println();

        // Print table after removal
        System.out.println("Hashtable after removal:");
        hashtable.printHashtable();
    }
}