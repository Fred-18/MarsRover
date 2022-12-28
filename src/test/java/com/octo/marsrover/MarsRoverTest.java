package com.octo.marsrover;

import org.junit.Test;


import static org.junit.Assert.*;

public class MarsRoverTest {
    @Test
    public void shouldMoveForwars() {
        //given

        Position target = new Position(3, 0) {
        };
        Rover robot = new Rover(target);
        //when
        robot.moveForward();


        //then
        assertEquals(robot.getCurrentPosition().getX(

        ), target.getX());


    }

    @Test
    public void shouldTurnRight90() {
        //given

        Rover robot = new Rover(new Position(0, 0));
        //when
        robot.turnRight();


        //then
        assertEquals(robot.getAngle(), 90);

    }

    @Test
    public void shouldTurnRight180() {
        //given

        Rover robot = new Rover(new Position(0, 0));
        //when
        robot.turnRight();
        robot.turnRight();


        //then
        assertEquals(robot.getAngle(), 180);


    }

    @Test
    public void shouldTurnleft90() {
        //given

        Rover robot = new Rover(new Position(0, 0));
        //when
        robot.tunrLeft();


        //then
        // assertEquals(robot.getAngle(), 180);
        assertEquals(robot.getAngle(), -90);
    }

    @Test
    public void shouldMoveUp() {
        //given
        Position target =  new Position(0,1);
        Rover robot = new Rover(target);

        //when
        robot.moveUp();

        //then
        // assertEquals(robot.getAngle(), 180);
        assertEquals(robot.getCurrentPosition().getX(),target.getY());


    }
        /*Si mon Rover monte je dois le monter soit
        * -Avec un classe case qui s'incémente à chaque monter
        * et qui de décrémente à chaque décente
        * -Soit en  incémentent Y */

        /*Afficher une aire de jeux */



}