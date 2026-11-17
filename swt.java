import java.sql.*;
class swt{
	public static void main(String ar[])throws Exception
	{
		String s1=ar[0];
		String s2=ar[1];
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///ajava56","root","12345678");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from login where uname='"+s1+"'AND upass='"+s2+"'");
		if(rs.next())
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("Invalid username and Password");
		}
		con.close();
	}
}
		