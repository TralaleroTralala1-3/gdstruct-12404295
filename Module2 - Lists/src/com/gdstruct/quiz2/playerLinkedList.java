package com.gdstruct.quiz2;

public class playerLinkedList {

    private PlayerNode head;
    private int size;   // in-place counter

    public void addtoFront(player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;   // increase size
    }

    public PlayerNode removeFromFront() {
        if (head == null) return null;

        PlayerNode removedNode = head;
        head = head.getNextPlayer();
        removedNode.setNextPlayer(null);
        size--;   // decrease size
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }

        System.out.println("null");
    }

    public boolean contains(player p) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().getId() == p.getId()) {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(player p) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().getId() == p.getId()) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }
}
