package com.octo.marsrover;

import java.security.PrivateKey;

public class Rover {
    public Position getCurrentPosition() {
        return currentPosition;
    }


    private Position currentPosition;
    private Position target;


    private int angle;

    public Rover(Position target) {
        this.target = target;
        this.currentPosition = new Position(0, 0);
    }

    public void moveForward() {
        while (currentPosition.getX() < target.getX()) {
            currentPosition.move();


        }
    }

    public void turnRight() {
        int turnRight = angle += 90;
        System.out.println("Le Mars Rover tourne à droite de  " + turnRight + " degrès. ");


    }


    public void tunrLeft() {
        int turnLeft = angle -= 90;
        System.out.println("Le Mars Rover tourne à gauche de  " + turnLeft + " degrès. ");
    }
    public void moveUp(){
        while(currentPosition.getX()<target.getY()){
            currentPosition.move();
            System.out.println("Le Mars Rover se déplace vers le haut ");
        }
    }
    public int getAngle() {
        return angle;
    }

}
