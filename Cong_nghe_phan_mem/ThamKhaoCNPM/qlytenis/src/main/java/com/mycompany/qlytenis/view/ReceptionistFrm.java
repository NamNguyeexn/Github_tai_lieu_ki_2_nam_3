package com.mycompany.qlytenis.view;

import com.mycompany.qlytenis.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReceptionistFrm {
    public JPanel receptionistFrm;
    private JButton searchClientButton;

    public ReceptionistFrm() {
        // Thêm ActionListener cho nút searchClientButton
        searchClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mở JPanel "searchclient"
                JFrame home = Main.home;
//                        home.setSize(800, 600);
                home.setContentPane(new SearchClientFrm().searchclientfrm);
                home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                home.pack();
                home.setVisible(true);
            }
        });
    }
}

