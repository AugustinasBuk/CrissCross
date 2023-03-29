package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    public JLabel textField;
    public JButton buttonThree;
    public JButton buttonTwo;
    public JButton buttonOne;
    public JPanel mainPanel;
    private JButton xButton;
    private JButton oButton;
    public boolean isXturn = true;

    public Menu(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                TicTacToe ticTacToe = new TicTacToe();
                ticTacToe.setXturn(isXturn);
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                TicTacToe2 ticTacToe2 = new TicTacToe2();
                ticTacToe2.setXturn(isXturn);
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                TicTacToe3 ticTacToe3 = new TicTacToe3();
                ticTacToe3.setXturn(isXturn);
            }



        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isXturn = true;

            }



        });
        oButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isXturn = false;
            }



        });

    }

    public static void main(String[] args) {
        JFrame frame = new Menu("Menu");
        frame.setVisible(true);
    }
}

