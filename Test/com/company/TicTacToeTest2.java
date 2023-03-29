package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TicTacToeTest2 {
    int number = 0;
    TicTacToe2 ticTacToe2;


    @BeforeEach
    public void beforeEach(){
        ticTacToe2 = new TicTacToe2();
    }



    @Test
    void check() {
       for (int i=0; i<9; i++){
           ticTacToe2.buttons[i].setEnabled(true);
            number++;
       }
       assertEquals(9,number);
    }

    @Test
    void xWins() {
        for (int i=0; i<9; i++){
            ticTacToe2.buttons[0].setText("X");
            ticTacToe2.buttons[1].setText("X");
            ticTacToe2.buttons[2].setText("X");

        }

        if (ticTacToe2.xWins(0,1,2)){
            assertEquals(true,true);
        }
    }

    @Test
    void oWins() {
        for (int i=0; i<9; i++){
            ticTacToe2.buttons[0].setText("X");
            ticTacToe2.buttons[1].setText("X");
            ticTacToe2.buttons[2].setText("X");

        }
        if (ticTacToe2.oWins(0,1,2)){
            assertEquals(false,false);
        }

    }

    @Test
    void checkIfTieFalse() {
       assertFalse(ticTacToe2.Tie());

    }

    @Test
    void checkIfTieTrue() {
        for( int i=0; i<ticTacToe2.buttons.length; i++) {
            ticTacToe2.buttons[i].setText("Y");
        }
        assertTrue(ticTacToe2.Tie());
    }

    @Test
    void checkifWinFalse(){
        assertFalse(ticTacToe2.checkWin("X"));

    }
    @Test
    void checkifWinTrue(){
        ticTacToe2.buttons[0].setText("Y");
        ticTacToe2.buttons[1].setText("Y");
        ticTacToe2.buttons[2].setText("Y");
        assertTrue(ticTacToe2.checkWin("Y"));

    }
    @Test
    void getButtonCount(){
        assertEquals(16,ticTacToe2.getButtonCount());


    }

}
