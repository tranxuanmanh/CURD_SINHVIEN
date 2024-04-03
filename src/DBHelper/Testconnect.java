/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manh
 */
public class Testconnect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn=DBHelper.getConnect();
       String sql="select * from sinhvien";
		   
		   PreparedStatement pr=conn.prepareStatement(sql);
		   
		       ResultSet r1=pr.executeQuery();
		 
		
		   
		   while(r1.next()) {
			   System.out.print(r1.getInt("id")+"--");
			   System.out.print(r1.getInt("masv")+"--");
			   System.out.print(r1.getString("hoten")+"--");
			   System.out.print(r1.getString("lop"));
			   System.out.print("\n");
		   } 
        
    }
}
