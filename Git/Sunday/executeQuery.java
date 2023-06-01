package Sunday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class executeQuery {

	       public static void main(String[] args) {
	    		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection n1=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","Qspider@7219");
					Statement st=n1.createStatement();
				   // int  rs=st.executeUpdate("update student.student set sid=5 where sid=6 ");
					//System.out.println(rs);
					//String s=("select * from student.student");
					//boolean b= st.execute(s);
					//System.out.println(b);
					ResultSet rs=st.executeQuery("select sid ,name from student.student where sid=1");
					while (rs.next()) {
						
					
					
			 
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
						System.out.println(rs.getInt(3));
						System.out.println(rs.getString(4));
						
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

}
