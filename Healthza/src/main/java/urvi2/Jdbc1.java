package urvi2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc1 {
	public static void main(String[] args) throws java.lang.ClassNotFoundException, SQLException
	{ 
		try{
			String url="jdbc:mysql://localhost:3306/student";
	String user="root";
	String password="admin";
	String sql="select * from Sample";
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection=null;
		Connection con=DriverManager.getConnection(url,user,password);
Statement st=con.createStatement();
ResultSet rs= st.executeQuery(sql);
while(rs.next())
{
int Roll=rs.getInt(1);
String Name=rs.getNString(2);
String Ciy=rs.getNString(3);

System.out.println(Roll+"  "+Name+"  "+Ciy);

//st.close();


}
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		}
	}




