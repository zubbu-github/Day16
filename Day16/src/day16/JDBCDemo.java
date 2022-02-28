package day16;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Zubeir@7863");
		
		Statement st = con.createStatement();
		//String query = "create table student(ID int primary key,SName varchar(20),SMarks int)";
		String query1 = "insert into student values (3,'Tariq',30)";
		
		//st.executeUpdate(query);
		st.executeUpdate(query1);
		
		//System.out.println("Student Table Created Successfully");
		System.out.println("Row inserted Successfully");
		
		st.close();
		con.close();
	}
}
