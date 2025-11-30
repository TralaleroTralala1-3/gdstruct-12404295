package com.gdstruct.module2;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {

	    List<player> playerList= new ArrayList<>();

        player asuna =new player(1,"Asuna", 100);
        player amongus =new player(2,"Amongus", 69);
        player akira = new player(3,"Akira", 21);

        playerLinkedList PlayerLinkedList = new playerLinkedList();

        PlayerLinkedList.addtoFront(asuna);
        PlayerLinkedList.addtoFront(amongus);
        PlayerLinkedList.addtoFront(akira);

        PlayerLinkedList.printList();
        System.out.println("Size: " +  PlayerLinkedList.getSize());

        //Remove From front function

        PlayerNode removed =  PlayerLinkedList.removeFromFront();
        System.out.println("Removed: " + removed.getPlayer());

        //Element counter after removing frontmost player
        System.out.println("Size: " +  PlayerLinkedList.getSize());

        //contains and index amount
        System.out.println("Contains Asuna? " + PlayerLinkedList.contains(asuna));
        System.out.println("Index of Akira: " + PlayerLinkedList.indexOf(akira));
    }


}
