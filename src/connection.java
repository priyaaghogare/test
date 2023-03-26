import java.sql.*;
public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/demodb","root","1234");
			Statement stmt=con.createStatement();
			System.out.println("Insert Record");
			String sql="INSERT INTO student VALUES(1,'Ram','pune','mech')";
			stmt.executeUpdate(sql);
			String sql1="INSERT INTO student VALUES(2,'Raj','mumbai','Tech')";
			stmt.executeUpdate(sql1);
			System.out.println("Record insert successfully....");
			
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		
		
	}

}
