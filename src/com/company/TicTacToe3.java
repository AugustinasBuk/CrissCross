package com.company;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe3 implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlepanel = new JPanel();
    JPanel buttonpanel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[25];
    boolean isXturn;
    int score = 0;

    TicTacToe3(){
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


        buttonpanel.setLayout(new GridLayout(5,5));
        buttonpanel.setBackground(new Color(150,150,150));

        for (int i=0; i<25; i++){
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
        for (int i=0; i<25; i++){
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
        if (checkWin("X")  ){
            xWins(0,1,2);
        }
        else if (    (buttons[1].getText()=="X") &&
                (buttons[2].getText()=="X") &&
                (buttons[3].getText()=="X")   ){
            xWins(1,2,3);
        }
        else if (    (buttons[2].getText()=="X") &&
                (buttons[3].getText()=="X") &&
                (buttons[4].getText()=="X")   ){
            xWins(2,3,4);
        }
        else if (    (buttons[5].getText()=="X") &&
                (buttons[6].getText()=="X") &&
                (buttons[7].getText()=="X")   ){
            xWins(5,6,7);
        }
        else if (    (buttons[6].getText()=="X") &&
                (buttons[7].getText()=="X") &&
                (buttons[8].getText()=="X")   ){
            xWins(6,7,8);
        }
        else if (    (buttons[7].getText()=="X") &&
                (buttons[8].getText()=="X") &&
                (buttons[9].getText()=="X")   ){
            xWins(7,8,9);
        }
        else if (    (buttons[10].getText()=="X") &&
                (buttons[11].getText()=="X") &&
                (buttons[12].getText()=="X")   ){
            xWins(10,11,12);
        }
        else if (    (buttons[11].getText()=="X") &&
                (buttons[12].getText()=="X") &&
                (buttons[13].getText()=="X")   ){
            xWins(11,12,13);
        }
        else if (    (buttons[12].getText()=="X") &&
                (buttons[13].getText()=="X") &&
                (buttons[14].getText()=="X")   ){
            xWins(12,13,14);
        }
        else if (    (buttons[15].getText()=="X") &&
                (buttons[16].getText()=="X") &&
                (buttons[17].getText()=="X")   ){
            xWins(15,16,17);
        }
        else if (    (buttons[16].getText()=="X") &&
                (buttons[17].getText()=="X") &&
                (buttons[18].getText()=="X")   ){
            xWins(16,17,18);
        }
        else if (    (buttons[17].getText()=="X") &&
                (buttons[18].getText()=="X") &&
                (buttons[19].getText()=="X")   ){
            xWins(17,18,19);
        }
        else if (    (buttons[20].getText()=="X") &&
                (buttons[21].getText()=="X") &&
                (buttons[22].getText()=="X")   ){
            xWins(20,21,22);
        }
        else if (    (buttons[21].getText()=="X") &&
                (buttons[22].getText()=="X") &&
                (buttons[23].getText()=="X")   ){
            xWins(21,22,23);
        }
        else if (    (buttons[22].getText()=="X") &&
                (buttons[23].getText()=="X") &&
                (buttons[24].getText()=="X")   ){
            xWins(22,23,24);
        }
        else if (    (buttons[0].getText()=="X") &&
                (buttons[5].getText()=="X") &&
                (buttons[10].getText()=="X")   ){
            xWins(0,5,10);
        }
        else if (    (buttons[1].getText()=="X") &&
                (buttons[6].getText()=="X") &&
                (buttons[11].getText()=="X")   ){
            xWins(1,6,11);
        }
        else if (    (buttons[2].getText()=="X") &&
                (buttons[7].getText()=="X") &&
                (buttons[12].getText()=="X")   ){
            xWins(2,7,12);
        }
        else if (    (buttons[3].getText()=="X") &&
                (buttons[8].getText()=="X") &&
                (buttons[13].getText()=="X")   ){
            xWins(3,8,13);
        }
        else if (    (buttons[4].getText()=="X") &&
                (buttons[9].getText()=="X") &&
                (buttons[14].getText()=="X")   ){
            xWins(4,9,14);
        }
        else if (    (buttons[5].getText()=="X") &&
                (buttons[10].getText()=="X") &&
                (buttons[15].getText()=="X")   ){
            xWins(5,10,15);
        }
        else if (    (buttons[6].getText()=="X") &&
                (buttons[11].getText()=="X") &&
                (buttons[16].getText()=="X")   ){
            xWins(6,11,16);
        }
        else if (    (buttons[7].getText()=="X") &&
                (buttons[12].getText()=="X") &&
                (buttons[17].getText()=="X")   ){
            xWins(7,12,17);
        }
        else if (    (buttons[8].getText()=="X") &&
                (buttons[13].getText()=="X") &&
                (buttons[18].getText()=="X")   ){
            xWins(8,13,18);
        }
        else if (    (buttons[9].getText()=="X") &&
                (buttons[14].getText()=="X") &&
                (buttons[19].getText()=="X")   ){
            xWins(9,14,19);
        }
        else if (    (buttons[10].getText()=="X") &&
                (buttons[15].getText()=="X") &&
                (buttons[20].getText()=="X")   ){
            xWins(10,15,20);
        }
        else if (    (buttons[11].getText()=="X") &&
                (buttons[16].getText()=="X") &&
                (buttons[21].getText()=="X")   ){
            xWins(11,16,21);
        }
        else if (    (buttons[12].getText()=="X") &&
                (buttons[17].getText()=="X") &&
                (buttons[22].getText()=="X")   ){
            xWins(12,17,22);
        }
        else if (    (buttons[13].getText()=="X") &&
                (buttons[18].getText()=="X") &&
                (buttons[23].getText()=="X")   ){
            xWins(13,18,23);
        }
        else if (    (buttons[14].getText()=="X") &&
                (buttons[19].getText()=="X") &&
                (buttons[24].getText()=="X")   ){
            xWins(14,19,24);
        }
        else if (    (buttons[0].getText()=="X") &&
                (buttons[6].getText()=="X") &&
                (buttons[12].getText()=="X")   ){
            xWins(0,6,12);
        }
        else if (    (buttons[6].getText()=="X") &&
                (buttons[12].getText()=="X") &&
                (buttons[18].getText()=="X")   ){
            xWins(6,12,18);
        }
        else if (    (buttons[12].getText()=="X") &&
                (buttons[18].getText()=="X") &&
                (buttons[24].getText()=="X")   ){
            xWins(12,18,24);
        }
        else if (    (buttons[5].getText()=="X") &&
                (buttons[11].getText()=="X") &&
                (buttons[17].getText()=="X")   ){
            xWins(5,11,17);
        }
        else if (    (buttons[11].getText()=="X") &&
                (buttons[17].getText()=="X") &&
                (buttons[23].getText()=="X")   ){
            xWins(11,17,23);
        }
        else if (    (buttons[10].getText()=="X") &&
                (buttons[16].getText()=="X") &&
                (buttons[22].getText()=="X")   ){
            xWins(10,16,22);
        }
        else if (    (buttons[1].getText()=="X") &&
                (buttons[7].getText()=="X") &&
                (buttons[13].getText()=="X")   ){
            xWins(1,7,13);
        }
        else if (    (buttons[7].getText()=="X") &&
                (buttons[13].getText()=="X") &&
                (buttons[19].getText()=="X")   ){
            xWins(7,13,19);
        }
        else if (    (buttons[2].getText()=="X") &&
                (buttons[8].getText()=="X") &&
                (buttons[14].getText()=="X")   ){
            xWins(2,8,14);
        }
        else if (    (buttons[4].getText()=="X") &&
                (buttons[8].getText()=="X") &&
                (buttons[12].getText()=="X")   ){
            xWins(4,8,12);
        }
        else if (    (buttons[8].getText()=="X") &&
                (buttons[12].getText()=="X") &&
                (buttons[16].getText()=="X")   ){
            xWins(8,12,16);
        }
        else if (    (buttons[12].getText()=="X") &&
                (buttons[16].getText()=="X") &&
                (buttons[20].getText()=="X")   ){
            xWins(12,16,20);
        }
        else if (    (buttons[3].getText()=="X") &&
                (buttons[7].getText()=="X") &&
                (buttons[11].getText()=="X")   ){
            xWins(7,11,15);
        }
        else if (    (buttons[2].getText()=="X") &&
                (buttons[6].getText()=="X") &&
                (buttons[10].getText()=="X")   ){
            xWins(2,6,10);
        }
        else if (    (buttons[9].getText()=="X") &&
                (buttons[13].getText()=="X") &&
                (buttons[17].getText()=="X")   ){
            xWins(9,13,17);
        }
        else if (    (buttons[13].getText()=="X") &&
                (buttons[17].getText()=="X") &&
                (buttons[21].getText()=="X")   ){
            xWins(13,17,21);
        }
        else if (    (buttons[14].getText()=="X") &&
                (buttons[18].getText()=="X") &&
                (buttons[22].getText()=="X")   ){
            xWins(14,18,22);
        }

        //p2



        if (    (buttons[0].getText()=="O") &&
                (buttons[1].getText()=="O") &&
                (buttons[2].getText()=="O")   ){
            oWins(0,1,2);
        }
        else if (    (buttons[1].getText()=="O") &&
                (buttons[2].getText()=="O") &&
                (buttons[3].getText()=="O")   ){
            oWins(1,2,3);
        }
        else if (    (buttons[2].getText()=="O") &&
                (buttons[3].getText()=="O") &&
                (buttons[4].getText()=="O")   ){
            oWins(2,3,4);
        }
        else if (    (buttons[5].getText()=="O") &&
                (buttons[6].getText()=="O") &&
                (buttons[7].getText()=="O")   ){
            oWins(5,6,7);
        }
        else if (    (buttons[6].getText()=="O") &&
                (buttons[7].getText()=="O") &&
                (buttons[8].getText()=="O")   ){
            oWins(6,7,8);
        }
        else if (    (buttons[7].getText()=="O") &&
                (buttons[8].getText()=="O") &&
                (buttons[9].getText()=="O")   ){
            oWins(7,8,9);
        }
        else if (    (buttons[10].getText()=="O") &&
                (buttons[11].getText()=="O") &&
                (buttons[12].getText()=="O")   ){
            oWins(10,11,12);
        }
        else if (    (buttons[11].getText()=="OX") &&
                (buttons[12].getText()=="O") &&
                (buttons[13].getText()=="O")   ){
            oWins(11,12,13);
        }
        else if (    (buttons[12].getText()=="O") &&
                (buttons[13].getText()=="O") &&
                (buttons[14].getText()=="O")   ){
            oWins(12,13,14);
        }
        else if (    (buttons[15].getText()=="O") &&
                (buttons[16].getText()=="O") &&
                (buttons[17].getText()=="O")   ){
            oWins(15,16,17);
        }
        else if (    (buttons[16].getText()=="O") &&
                (buttons[17].getText()=="O") &&
                (buttons[18].getText()=="O")   ){
            oWins(16,17,18);
        }
        else if (    (buttons[17].getText()=="O") &&
                (buttons[18].getText()=="O") &&
                (buttons[19].getText()=="O")   ){
            oWins(17,18,19);
        }
        else if (    (buttons[20].getText()=="O") &&
                (buttons[21].getText()=="O") &&
                (buttons[22].getText()=="O")   ){
            oWins(20,21,22);
        }
        else if (    (buttons[21].getText()=="O") &&
                (buttons[22].getText()=="O") &&
                (buttons[23].getText()=="O")   ){
            oWins(21,22,23);
        }
        else if (    (buttons[22].getText()=="O") &&
                (buttons[23].getText()=="O") &&
                (buttons[24].getText()=="O")   ){
            oWins(22,23,24);
        }
        else if (    (buttons[0].getText()=="O") &&
                (buttons[5].getText()=="O") &&
                (buttons[10].getText()=="O")   ){
            oWins(0,5,10);
        }
        else if (    (buttons[1].getText()=="O") &&
                (buttons[6].getText()=="O") &&
                (buttons[11].getText()=="O")   ){
            oWins(1,6,11);
        }
        else if (    (buttons[2].getText()=="O") &&
                (buttons[7].getText()=="O") &&
                (buttons[12].getText()=="O")   ){
            oWins(2,7,12);
        }
        else if (    (buttons[3].getText()=="O") &&
                (buttons[8].getText()=="O") &&
                (buttons[13].getText()=="O")   ){
            oWins(3,8,13);
        }
        else if (    (buttons[4].getText()=="O") &&
                (buttons[9].getText()=="O") &&
                (buttons[14].getText()=="O")   ){
            oWins(4,9,14);
        }
        else if (    (buttons[5].getText()=="O") &&
                (buttons[10].getText()=="O") &&
                (buttons[15].getText()=="O")   ){
            oWins(5,10,15);
        }
        else if (    (buttons[6].getText()=="O") &&
                (buttons[11].getText()=="O") &&
                (buttons[16].getText()=="O")   ){
            oWins(6,11,16);
        }
        else if (    (buttons[7].getText()=="O") &&
                (buttons[12].getText()=="O") &&
                (buttons[17].getText()=="O")   ){
            oWins(7,12,17);
        }
        else if (    (buttons[8].getText()=="O") &&
                (buttons[13].getText()=="O") &&
                (buttons[18].getText()=="O")   ){
            oWins(8,13,18);
        }
        else if (    (buttons[9].getText()=="O") &&
                (buttons[14].getText()=="O") &&
                (buttons[19].getText()=="O")   ){
            oWins(9,14,19);
        }
        else if (    (buttons[10].getText()=="O") &&
                (buttons[15].getText()=="O") &&
                (buttons[20].getText()=="O")   ){
            oWins(10,15,20);
        }
        else if (    (buttons[11].getText()=="O") &&
                (buttons[16].getText()=="O") &&
                (buttons[21].getText()=="O")   ){
            oWins(11,16,21);
        }
        else if (    (buttons[12].getText()=="O") &&
                (buttons[17].getText()=="O") &&
                (buttons[22].getText()=="O")   ){
            oWins(12,17,22);
        }
        else if (    (buttons[13].getText()=="O") &&
                (buttons[18].getText()=="O") &&
                (buttons[23].getText()=="O")   ){
            oWins(13,18,23);
        }
        else if (    (buttons[14].getText()=="O") &&
                (buttons[19].getText()=="O") &&
                (buttons[24].getText()=="O")   ){
            oWins(14,19,24);
        }
        else if (    (buttons[0].getText()=="O") &&
                (buttons[6].getText()=="O") &&
                (buttons[12].getText()=="O")   ){
            oWins(0,6,12);
        }
        else if (    (buttons[6].getText()=="O") &&
                (buttons[12].getText()=="O") &&
                (buttons[18].getText()=="O")   ){
            oWins(6,12,18);
        }
        else if (    (buttons[12].getText()=="O") &&
                (buttons[18].getText()=="O") &&
                (buttons[24].getText()=="O")   ){
            oWins(12,18,24);
        }
        else if (    (buttons[5].getText()=="O") &&
                (buttons[11].getText()=="O") &&
                (buttons[17].getText()=="O")   ){
            oWins(5,11,17);
        }
        else if (    (buttons[11].getText()=="O") &&
                (buttons[17].getText()=="O") &&
                (buttons[23].getText()=="O")   ){
            oWins(11,17,23);
        }
        else if (    (buttons[10].getText()=="O") &&
                (buttons[16].getText()=="O") &&
                (buttons[22].getText()=="O")   ){
            oWins(10,16,22);
        }
        else if (    (buttons[1].getText()=="O") &&
                (buttons[7].getText()=="O") &&
                (buttons[13].getText()=="O")   ){
            oWins(1,7,13);
        }
        else if (    (buttons[7].getText()=="O") &&
                (buttons[13].getText()=="O") &&
                (buttons[19].getText()=="O")   ){
            oWins(7,13,19);
        }
        else if (    (buttons[2].getText()=="O") &&
                (buttons[8].getText()=="O") &&
                (buttons[14].getText()=="O")   ){
            oWins(2,8,14);
        }
        else if (    (buttons[4].getText()=="O") &&
                (buttons[8].getText()=="O") &&
                (buttons[12].getText()=="O")   ){
            oWins(4,8,12);
        }
        else if (    (buttons[8].getText()=="O") &&
                (buttons[12].getText()=="O") &&
                (buttons[16].getText()=="O")   ){
            oWins(8,12,16);
        }
        else if (    (buttons[12].getText()=="O") &&
                (buttons[16].getText()=="O") &&
                (buttons[20].getText()=="O")   ){
            oWins(12,16,20);
        }
        else if (    (buttons[3].getText()=="O") &&
                (buttons[7].getText()=="O") &&
                (buttons[11].getText()=="O")   ){
            oWins(7,11,15);
        }
        else if (    (buttons[2].getText()=="O") &&
                (buttons[6].getText()=="O") &&
                (buttons[10].getText()=="O")   ){
            oWins(2,6,10);
        }
        else if (    (buttons[9].getText()=="O") &&
                (buttons[13].getText()=="O") &&
                (buttons[17].getText()=="O")   ){
            oWins(9,13,17);
        }
        else if (    (buttons[13].getText()=="O") &&
                (buttons[17].getText()=="O") &&
                (buttons[21].getText()=="O")   ){
            oWins(13,17,21);
        }
        else if (    (buttons[14].getText()=="O") &&
                (buttons[18].getText()=="O") &&
                (buttons[22].getText()=="O")   ){
            oWins(14,18,22);
        }
    }



    public boolean xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i=0; i<25; i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("X Win!!!");
        return true;
    }

    public boolean oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i=0; i<25; i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("O Win!!!");
        return false;
    }

    public int getButtonCount(){
        int count = 0;
        for (int i=0; i<25; i++)
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
