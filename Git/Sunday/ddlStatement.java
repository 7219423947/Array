package Sunday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ddlStatement {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("load and register driver");
				Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Qspider@7219");
				Statement st= c.createStatement();
			       //  String s="create database k";
			       //  st.executeUpdate(s);
				//st.executeUpdate("create table k.k(id int,name varchar(23),sal double)");
				//st.executeQuery("rename k.k to k.J2E");
				//st.executeUpdate("alter table k.k add loc");//
			         System.out.println(st);
			         
			}
			 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}}
