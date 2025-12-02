package com.gdstruct.quiz2;

public class player
{
    private int id;
    private String name;
    private int level;

    public player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {  // <-- Capital S
        return name;
    }

    public void setName(String name) {  // <-- Capital S
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "player{" +
                "id=" + id +
                ", name=" + name +
                ", level=" + level +
                '}';
    }
}
