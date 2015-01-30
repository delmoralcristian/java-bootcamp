package bootcamp.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySql{	

	public void ListPerCourses (String nameCourse) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/highschool", "root", "14929952");
		PreparedStatement statement= con.prepareStatement("select t.first_name, t.last_name, s.first_name, s.last_name from teacher t, course c, student s, assists a where c.assigned_teacher= t.id_teacher and c.id_course= a.id_course and a.id_student= s.id and c.name='" + nameCourse+"' order by s.last_name;");
		ResultSet result= statement.executeQuery();
		if(result.next()){
			System.out.println("Teacher: " + result.getString(1) + "  " + result.getString(2) + "\n");
		}
		System.out.println("Students: "+ "\n");
		while(result.next()){
			System.out.println(result.getString(3) + "   " + result.getString(4));
		}
	}
	
public void ListPerFinal (int idStudent) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/highschool", "root", "14929952");
		PreparedStatement statement= con.prepareStatement("select a.final, c.name from course c, student s, assists a where c.id_course= a.id_course and a.id_student= s.id and s.id= '" + idStudent +"' order by a.final desc, c.name;");
		ResultSet result= statement.executeQuery();
		while(result.next()){
			System.out.println(result.getString(1) + " " + result.getString(2));
		}
	}

}
