package com.octo.marsrover;

public class Position {

    private int x;


    private int y;
    public Position(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public int getY() {

        return y;
    }
    public int getX() {

        return x;
    }
    public void move(){
        x++;
    }

    public void moveUp() {
        y++;
    }
}
