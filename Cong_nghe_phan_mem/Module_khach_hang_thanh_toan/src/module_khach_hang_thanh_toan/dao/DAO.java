/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module_khach_hang_thanh_toan.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nam
 */
public class DAO {
    public static Connection con;
	
	public DAO(){
		if(con == null){
			String dbUrl = "jdbc:mysql://localhost:3306/qlysanbong";
			String dbClass = "com.mysql.jdbc.Driver";

			try {
				Class.forName(dbClass);
				con = DriverManager.getConnection (dbUrl, "root", "011002");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
