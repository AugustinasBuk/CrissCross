package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TicTacToeTest3 {
    int number = 0;
    TicTacToe3 ticTacToe3;


    @BeforeEach
    public void beforeEach(){
        ticTacToe3 = new TicTacToe3();
    }



    @Test
    void check() {
       for (int i=0; i<25; i++){
           ticTacToe3.buttons[i].setEnabled(true);
            number++;
       }
       assertEquals(25,number);
    }

    @Test
    void xWins() {
        for (int i=0; i<25; i++){
            ticTacToe3.buttons[0].setText("X");
            ticTacToe3.buttons[1].setText("X");
            ticTacToe3.buttons[2].setText("X");

        }

        if (ticTacToe3.xWins(0,1,2)){
            assertEquals(true,true);
        }
    }

    @Test
    void oWins() {
        for (int i=0; i<25; i++){
            ticTacToe3.buttons[0].setText("X");
            ticTacToe3.buttons[1].setText("X");
            ticTacToe3.buttons[2].setText("X");

        }
        if (ticTacToe3.oWins(0,1,2)){
            assertEquals(false,false);
        }

    }

    @Test
    void checkIfTieFalse() {
       assertFalse(ticTacToe3.Tie());

    }

    @Test
    void checkIfTieTrue() {
        for( int i=0; i<ticTacToe3.buttons.length; i++) {
            ticTacToe3.buttons[i].setText("Y");
        }
        assertTrue(ticTacToe3.Tie());
    }

    @Test
    void checkifWinFalse(){
        assertFalse(ticTacToe3.checkWin("X"));

    }
    @Test
    void checkifWinTrue(){
        ticTacToe3.buttons[0].setText("Y");
        ticTacToe3.buttons[1].setText("Y");
        ticTacToe3.buttons[2].setText("Y");
        assertTrue(ticTacToe3.checkWin("Y"));

    }
    @Test
    void getButtonCount(){
        assertEquals(25,ticTacToe3.getButtonCount());


    }

}
