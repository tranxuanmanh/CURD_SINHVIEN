package DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class DBHelper {
        private static Connection conn=null;
	private final static String DB_URL="jdbc:mysql://localhost:3306/qlsv";
	private final static String USER_NAME="root";
	private final static String PASSWORD="";
	public static Connection getConnect() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
			
			 System.out.print("Ket noi thanh cong"+"\n");
						 
		}catch(SQLException e) {
			e.printStackTrace();
		}
          
		return conn;
		
	}
}
