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
        Position target =  new Position(1,8);
        Rover robot = new Rover(target);

        //when
        robot.moveUp();

        //then
        assertEquals(robot.getCurrentPosition().getY(),target.getY());


    }
    @Test
    public void shouldMoveToTarget(){
        //given
        Position target =  new Position(3,0);
        Rover robot = new Rover(target);

        //when
        robot.moveToTarget();
        System.out.println(robot);

        //then
        assertEquals(target.getX(),robot.getCurrentPosition().getX());
        assertEquals(target.getY(),robot.getCurrentPosition().getY());

    }




}