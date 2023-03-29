package com.company;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe2 implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlepanel = new JPanel();
    JPanel buttonpanel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[16];
    boolean isXturn;
    int score = 0;

    TicTacToe2(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        titlepanel.setLayout(new BorderLayout());
        titlepanel.setBounds(150,150,1000,250);


        buttonpanel.setLayout(new GridLayout(4,4));
        buttonpanel.setBackground(new Color(150,150,150));

        for (int i=0; i<16; i++){
            buttons[i] = new JButton();
            buttonpanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        titlepanel.add(textfield);
        frame.add(titlepanel,BorderLayout.NORTH);
        frame.add(buttonpanel);

    }

    public void actionPerformed(ActionEvent e) {
        for (int i=0; i<16; i++){
            if (e.getSource()==buttons[i]) {
                if (isXturn){
                    if (buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        isXturn = false;
                        textfield.setText("O Turn");
                        check();
                    }
                }
                else {
                    if (buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        isXturn = true;
                        textfield.setText("X Turn");
                        check();
                    }
                }
            }
        }
        Tie();
    }

    public void setXturn(boolean value){
        isXturn = value;



    }


    public boolean checkWin(String player){
        if ((buttons[0].getText()==player) &&
                (buttons[1].getText()==player) &&
                (buttons[2].getText()==player)) {
            return true;

        }
        return false;



    }

    public void check(){
        //p1
        if (checkWin("X")  ){
            xWins(0,1,2);
        }
        else if (    (buttons[1].getText()=="X") &&
                (buttons[2].getText()=="X") &&
                (buttons[3].getText()=="X")   ){
            xWins(1,2,3);
        }
        else if (    (buttons[4].getText()=="X") &&
                (buttons[5].getText()=="X") &&
                (buttons[6].getText()=="X")   ){
            xWins(4,5,6);
        }
        else if (    (buttons[5].getText()=="X") &&
                (buttons[6].getText()=="X") &&
                (buttons[7].getText()=="X")   ){
            xWins(5,6,7);
        }
        else if (    (buttons[8].getText()=="X") &&
                (buttons[9].getText()=="X") &&
                (buttons[10].getText()=="X")   ){
            xWins(8,9,10);
        }
        else if (    (buttons[9].getText()=="X") &&
                (buttons[10].getText()=="X") &&
                (buttons[11].getText()=="X")   ){
            xWins(9,10,11);
        }
        else if (    (buttons[12].getText()=="X") &&
                (buttons[13].getText()=="X") &&
                (buttons[14].getText()=="X")   ){
            xWins(12,13,14);
        }
        else if (    (buttons[13].getText()=="X") &&
                (buttons[14].getText()=="X") &&
                (buttons[15].getText()=="X")   ){
            xWins(13,14,15);
        }
        else if (    (buttons[0].getText()=="X") &&
                (buttons[4].getText()=="X") &&
                (buttons[8].getText()=="X")   ){
            xWins(0,4,8);
        }
        else if (    (buttons[1].getText()=="X") &&
                (buttons[5].getText()=="X") &&
                (buttons[9].getText()=="X")   ){
            xWins(1,5,9);
        }
        else if (    (buttons[2].getText()=="X") &&
                (buttons[6].getText()=="X") &&
                (buttons[10].getText()=="X")   ){
            xWins(2,6,10);
        }
        else if (    (buttons[3].getText()=="X") &&
                (buttons[7].getText()=="X") &&
                (buttons[11].getText()=="X")   ){
            xWins(3,7,11);
        }
        else if (    (buttons[4].getText()=="X") &&
                (buttons[8].getText()=="X") &&
                (buttons[12].getText()=="X")   ){
            xWins(4,8,12);
        }
        else if (    (buttons[5].getText()=="X") &&
                (buttons[9].getText()=="X") &&
                (buttons[13].getText()=="X")   ){
            xWins(5,9,13);
        }
        else if (    (buttons[6].getText()=="X") &&
                (buttons[10].getText()=="X") &&
                (buttons[14].getText()=="X")   ){
            xWins(6,10,14);
        }
        else if (    (buttons[7].getText()=="X") &&
                (buttons[11].getText()=="X") &&
                (buttons[15].getText()=="X")   ){
            xWins(7,11,15);
        }
        else if (    (buttons[0].getText()=="X") &&
                (buttons[5].getText()=="X") &&
                (buttons[10].getText()=="X")   ){
            xWins(0,5,10);
        }
        else if (    (buttons[5].getText()=="X") &&
                (buttons[10].getText()=="X") &&
                (buttons[15].getText()=="X")   ){
            xWins(5,10,15);
        }
        else if (    (buttons[1].getText()=="X") &&
                (buttons[6].getText()=="X") &&
                (buttons[11].getText()=="X")   ){
            xWins(1,6,11);
        }
        else if (    (buttons[4].getText()=="X") &&
                (buttons[9].getText()=="X") &&
                (buttons[14].getText()=="X")   ){
            xWins(4,9,14);
        }
        else if (    (buttons[3].getText()=="X") &&
                (buttons[6].getText()=="X") &&
                (buttons[9].getText()=="X")   ){
            xWins(3,6,9);
        }
        else if (    (buttons[6].getText()=="X") &&
                (buttons[9].getText()=="X") &&
                (buttons[12].getText()=="X")   ){
            xWins(6,9,12);
        }
        else if (    (buttons[7].getText()=="X") &&
                (buttons[10].getText()=="X") &&
                (buttons[13].getText()=="X")   ){
            xWins(7,10,13);
        }
        else if (    (buttons[2].getText()=="X") &&
                (buttons[5].getText()=="X") &&
                (buttons[8].getText()=="X")   ){
            xWins(2,5,8);
        }

        //p2



        else if (    (buttons[0].getText()=="O") &&
                (buttons[1].getText()=="O") &&
                (buttons[2].getText()=="O")   ){
            oWins(0,1,2);
        }
        else if (    (buttons[1].getText()=="O") &&
                (buttons[2].getText()=="O") &&
                (buttons[3].getText()=="O")   ){
            oWins(1,2,3);
        }
        else if (    (buttons[4].getText()=="O") &&
                (buttons[5].getText()=="O") &&
                (buttons[6].getText()=="O")   ){
            oWins(4,5,6);
        }
        else if (    (buttons[5].getText()=="O") &&
                (buttons[6].getText()=="O") &&
                (buttons[7].getText()=="O")   ){
            oWins(5,6,7);
        }
        else if (    (buttons[8].getText()=="O") &&
                (buttons[9].getText()=="O") &&
                (buttons[10].getText()=="O")   ){
            oWins(8,9,10);
        }
        else if (    (buttons[9].getText()=="O") &&
                (buttons[10].getText()=="O") &&
                (buttons[11].getText()=="O")   ){
            oWins(9,10,11);
        }
        else if (    (buttons[12].getText()=="O") &&
                (buttons[13].getText()=="O") &&
                (buttons[14].getText()=="O")   ){
            oWins(12,13,14);
        }
        else if (    (buttons[13].getText()=="O") &&
                (buttons[14].getText()=="O") &&
                (buttons[15].getText()=="O")   ){
            oWins(13,14,15);
        }
        else if (    (buttons[0].getText()=="O") &&
                (buttons[4].getText()=="O") &&
                (buttons[8].getText()=="O")   ){
            oWins(0,4,8);
        }
        else if (    (buttons[1].getText()=="O") &&
                (buttons[5].getText()=="O") &&
                (buttons[9].getText()=="O")   ){
            oWins(1,5,9);
        }
        else if (    (buttons[2].getText()=="O") &&
                (buttons[6].getText()=="O") &&
                (buttons[10].getText()=="O")   ){
            oWins(2,6,10);
        }
        else if (    (buttons[3].getText()=="O") &&
                (buttons[7].getText()=="O") &&
                (buttons[11].getText()=="O")   ){
            oWins(3,7,11);
        }
        else if (    (buttons[4].getText()=="O") &&
                (buttons[8].getText()=="O") &&
                (buttons[12].getText()=="O")   ){
            oWins(4,8,12);
        }
        else if (    (buttons[5].getText()=="O") &&
                (buttons[9].getText()=="O") &&
                (buttons[13].getText()=="O")   ){
            oWins(5,9,13);
        }
        else if (    (buttons[6].getText()=="O") &&
                (buttons[10].getText()=="O") &&
                (buttons[14].getText()=="O")   ){
            oWins(6,10,14);
        }
        else if (    (buttons[7].getText()=="O") &&
                (buttons[11].getText()=="O") &&
                (buttons[15].getText()=="O")   ){
            oWins(7,11,15);
        }
        else if (    (buttons[0].getText()=="O") &&
                (buttons[5].getText()=="O") &&
                (buttons[10].getText()=="O")   ){
            oWins(0,5,10);
        }
        else if (    (buttons[5].getText()=="O") &&
                (buttons[10].getText()=="O") &&
                (buttons[15].getText()=="O")   ){
            oWins(5,10,15);
        }
        else if (    (buttons[1].getText()=="O") &&
                (buttons[6].getText()=="O") &&
                (buttons[11].getText()=="O")   ){
            oWins(1,6,11);
        }
        else if (    (buttons[4].getText()=="O") &&
                (buttons[9].getText()=="O") &&
                (buttons[14].getText()=="O")   ){
            oWins(4,9,14);
        }
        else if (    (buttons[3].getText()=="O") &&
                (buttons[6].getText()=="O") &&
                (buttons[9].getText()=="O")   ){
            oWins(3,6,9);
        }
        else if (    (buttons[6].getText()=="O") &&
                (buttons[9].getText()=="O") &&
                (buttons[12].getText()=="O")   ){
            oWins(6,9,12);
        }
        else if (    (buttons[7].getText()=="O") &&
                (buttons[10].getText()=="O") &&
                (buttons[13].getText()=="O")   ){
            oWins(7,10,13);
        }
        else if (    (buttons[2].getText()=="O") &&
                (buttons[5].getText()=="O") &&
                (buttons[8].getText()=="O")   ){
            oWins(2,5,8);
        }
    }



    public boolean xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i=0; i<16; i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("X Win!!!");
        return true;
    }

    public boolean oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i=0; i<16; i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("O Win!!!");
        return false;
    }

    public int getButtonCount(){
        int count = 0;
        for (int i=0; i<16; i++)
        {
            if (buttons[i].getText()!=""){
                count++;
            }

        }
        return count;
    }

    public boolean Tie(){
        int count=getButtonCount();
        if (count==buttons.length){
            return true;
        }
        return false;
    }

}
