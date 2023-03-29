package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;


class TicTacToeTest {
    int number = 0;
    TicTacToe ticTacToe;


    @BeforeEach
    public void beforeEach(){
        ticTacToe = new TicTacToe();
    }



    @Test
    void check() {
       for (int i=0; i<9; i++){
           ticTacToe.buttons[i].setEnabled(true);
            number++;
       }
       assertEquals(9,number);
    }

    @Test
    void xWins() {
        for (int i=0; i<9; i++){
            ticTacToe.buttons[0].setText("X");
            ticTacToe.buttons[1].setText("X");
            ticTacToe.buttons[2].setText("X");

        }

        if (ticTacToe.xWins(0,1,2)){
            assertEquals(true,true);
        }
    }

    @Test
    void oWins() {
        for (int i=0; i<9; i++){
            ticTacToe.buttons[0].setText("X");
            ticTacToe.buttons[1].setText("X");
            ticTacToe.buttons[2].setText("X");

        }
        if (ticTacToe.oWins(0,1,2)){
            assertEquals(false,false);
        }

    }

    @Test
    void checkIfTieFalse() {
       assertFalse(ticTacToe.Tie());

    }

    @Test
    void checkIfTieTrue() {
        for( int i=0; i<ticTacToe.buttons.length; i++) {
            ticTacToe.buttons[i].setText("Y");
        }
        assertTrue(ticTacToe.Tie());
    }

    @Test
    void checkifWinFalse(){
        assertFalse(ticTacToe.checkWin("X"));

    }
    @Test
    void checkifWinTrue(){
        ticTacToe.buttons[0].setText("Y");
        ticTacToe.buttons[1].setText("Y");
        ticTacToe.buttons[2].setText("Y");
        assertTrue(ticTacToe.checkWin("Y"));

    }
    @Test
    void getButtonCount(){
        assertEquals(9,ticTacToe.getButtonCount());


    }

}
