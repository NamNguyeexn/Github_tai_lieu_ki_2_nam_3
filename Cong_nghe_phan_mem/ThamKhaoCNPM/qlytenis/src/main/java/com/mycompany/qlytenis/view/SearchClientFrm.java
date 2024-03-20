package com.mycompany.qlytenis.view;

import com.mycompany.qlytenis.dao.MySQLConnUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchClientFrm {
    private JTextField enterClientSNameTextField;
    private JButton searchButton;
    public JTable table1;
    public JPanel searchclientfrm;

    public SearchClientFrm() {
        // Thêm sự kiện cho nút tìm kiếm
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = enterClientSNameTextField.getText().trim();

// Tạo kết nối tới database
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cnpm", "root", "huyhuyhuy1");

// Tạo câu lệnh SQL để tìm kiếm dữ liệu
                    String sql  = "SELECT * FROM user WHERE name LIKE '%" + name + "%'";

// Tạo PreparedStatement để thực thi câu lệnh SQL
                    PreparedStatement statement = conn.prepareStatement(sql);

// Thực thi câu lệnh SQL và lấy kết quả trả về
                    ResultSet rs = statement.executeQuery();

                    // Hiển thị kết quả trả về trên JTable
                    DefaultTableModel model = (DefaultTableModel) table1.getModel();
                    model.setRowCount(0);
                    while (rs.next()) {
                        Object[] row = new Object[] {
                                rs.getString("id"),
                                rs.getString("name"),
                                rs.getString("identity"),
                                rs.getString("address"),
                                rs.getString("phonenumber"),
                                rs.getString("email"),
                                rs.getString("note")
                        };
                        model.addRow(row);
                    }

                    // Đóng kết nối
                    conn.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Lỗi: " + ex.getMessage());
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("SearchClientFrm");
        frame.setContentPane(new SearchClientFrm().searchclientfrm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
