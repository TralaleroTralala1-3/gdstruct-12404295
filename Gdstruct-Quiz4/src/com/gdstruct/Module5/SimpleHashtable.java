package com.gdstruct.Module5;

public class SimpleHashtable {

    private StoredPlayer[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean isOccupied(int index) {
        return hashtable[index] != null;
    }


    //PUT — insert with linear probing

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);

        // If spot occupied, probe forward
        if (isOccupied(hashedKey)) {
            int stopIndex = hashedKey;

            hashedKey = (hashedKey + 1) % hashtable.length;

            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("Sorry, no empty position found for key: " + key);
        } else {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }


    //GET — Lookup using findKey and proper probing

    public Player get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) return null;

        return hashtable[hashedKey].value;
    }


    //FINDKEY — search using linear probing

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        hashedKey = (hashedKey + 1) % hashtable.length;

        while (hashedKey != stopIndex &&
                (hashtable[hashedKey] == null ||
                        !hashtable[hashedKey].key.equals(key))) {

            // If null, skip forward
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        return -1; // not found
    }


    //REMOVE — deletes and rebuilds the cluster properly

    public Player remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null; // key not found
        }

        Player removedPlayer = hashtable[hashedKey].value;

        // Remove the entry
        hashtable[hashedKey] = null;

        // Rehash everything to maintain cluster
        StoredPlayer[] oldTable = hashtable;
        hashtable = new StoredPlayer[oldTable.length];

        for (StoredPlayer sp : oldTable) {
            if (sp != null) {
                put(sp.key, sp.value);
            }
        }

        return removedPlayer;
    }

    //PRINT
    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("Element " + i + ": empty");
            } else {
                System.out.println("Element " + i + ": " +
                        hashtable[i].value);
            }
        }
    }
}

