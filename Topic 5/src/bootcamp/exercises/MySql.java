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
		PreparedStatement statement= con.prepareStatement("select t.first_name, t.last_name, s.first_name, s.last_name from teacher t inner join course c on t.id_teacher= c.assigned_teacher inner join assists a on a.id_course= c.id_course inner join student s on s.id= a.id_student where c.name='" + nameCourse+"' order by s.last_name;");
		ResultSet result= statement.executeQuery();
		System.out.println("Course: " + nameCourse + "\n");
		result.next();
		System.out.println("Teacher: " + result.getString(1) + "  " + result.getString(2) + "\n");
		result.beforeFirst();
		System.out.println("Students: "+ "\n");
		while(result.next()){
			System.out.println(result.getString(3) + "   " + result.getString(4));
		}
	}
	
public void ListPerFinal (int idStudent) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager
		          .getConnection("jdbc:mysql://localhost:3306/highschool", "root", "14929952");
		PreparedStatement statement= con.prepareStatement("select s.*, a.final, c.name from assists a inner join student s on a.id_student= s.id inner join course c on c.id_course= a.id_course where s.id= '" + idStudent +"' order by a.final desc, c.name;");
		ResultSet result= statement.executeQuery();
		while(result.next()){
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3)+ " " + result.getString(4) + " " + result.getString(5) + " " + result.getString(6));
		}
	}

}
