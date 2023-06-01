package Sunday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class cud {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load and register driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Qspider@7219");
			Statement st= c.createStatement();
			//String s="create database intim";
			//boolean s1=st.execute(s);
			//st.execute(s);
			//System.out.println(s1+""+" create database intimeat:");
			//st.execute("create table intim.intim(id int primary key,name varchar(8) not null,sal double)");
			//System.out.println("create table intim");
		  	insert(st);
		  	update(st);
			//delete(st);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void delete(Statement st) {
		try {
			st.execute("delete  from intim.intim where id=2");
			System.out.println("deleat table intim.intim where id=all");
			st.execute("delete from intim.intim where id=3");
			st.execute("delete  from intim.intim where id=4");
			st.execute("delete  from intim.intim where id=1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void update(Statement st) throws SQLException {
		
		st.execute("update  intim.intim set name='dk'  where id=4");
		st.execute("update  intim.intim set name='ap'  where id=1");
		st.execute("update  intim.intim set name='sy'  where id=2");
		st.execute("update  intim.intim set name='bk'  where id=3");
		System.out.println("update table"); 
	}
	public static void insert(Statement s)
	{
		try {
			s.execute("insert into intim.intim(id,name,sal)values(1,'kd',123.9)");
			s.execute("insert into intim.intim(id,name,sal)values(2,'avi',1239.9)");
			s.execute("insert into intim.intim(id,name,sal)values(3,'darsh',1223.9)");
			s.execute("insert into intim.intim(id,name,sal)values(4,'bha',1213.9)");
			System.out.println("inserted records");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
