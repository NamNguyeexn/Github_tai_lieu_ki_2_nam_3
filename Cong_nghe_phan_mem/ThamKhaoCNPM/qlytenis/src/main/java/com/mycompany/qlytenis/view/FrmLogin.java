package com.mycompany.qlytenis.view;

import com.mycompany.qlytenis.Main;
import java.sql.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLogin extends JFrame {
    private JTextField editUserName;
    private JPasswordField edtPassword;
    private JButton btnLogin;
    public JPanel loginPanel;

    public FrmLogin() {
        super();

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = editUserName.getText().trim();
                String password = new String(edtPassword.getPassword()).trim();

                // Kết nối đến cơ sở dữ liệu MySQL
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnpm", "root", "huyhuyhuy1")) {
                    String query = "SELECT * FROM user WHERE username = ? AND password = ?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) { // Nếu có bản ghi trả về
                        JFrame home = Main.home;
//                        home.setSize(800, 600);
                        home.setContentPane(new ReceptionistFrm().receptionistFrm);
                        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        home.pack();
                        home.setVisible(true);
                    } else { // Nếu không có bản ghi trả về
                        JOptionPane.showMessageDialog(null, "Username hoặc password không đúng!");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
