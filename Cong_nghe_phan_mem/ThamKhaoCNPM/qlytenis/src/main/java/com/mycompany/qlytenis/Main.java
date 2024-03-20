package com.mycompany.qlytenis;
/*
 * @author: Vo Huu Tuan
 * @since:  20/04/2023 15:46
 * @github:  https://github.com/hidenobi
 * @update:
 *
 * */


import com.mycompany.qlytenis.view.FrmLogin;

import javax.swing.*;

public class Main {
    public static JFrame home = new JFrame("Quan ly cho thue san tennis");
    public static void main(String[] args) {
        home.setContentPane(new FrmLogin().loginPanel);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.pack();
        home.setVisible(true);


    }
}