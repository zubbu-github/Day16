package day16;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Zubeir@7863");
		
		Statement st = con.createStatement();
		//String query = "create table student(ID int primary key,SName varchar(20),SMarks int)";
		String query1 = "insert into student values (4,'Tariq',30)";
		//String query2 ="delete from student  where ID =  1";
		//String query3 ="update student Set SName = 'Kalpesh' where ID = 3";
		ResultSet rs = st.executeQuery("Select ID, SName, SMarks from student");
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		
		//st.executeUpdate(query);
		st.executeUpdate(query1);
		//st.executeUpdate(query2);
		
		System.out.println("Student Table Created Successfully");
		//System.out.println("Row inserted Successfully");
		//System.out.println("Row deleted Successfully");
		
		st.close();
		con.close();
	}
}
