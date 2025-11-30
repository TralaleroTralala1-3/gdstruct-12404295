package com.gdstruct.module2;

public class PlayerNode
{
    private player player;
    private PlayerNode nextPlayer;

    public PlayerNode(player player) {
        this.player = player;
    }

    public player getPlayer() {
        return player;
    }

    public void setPlayer(player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}
