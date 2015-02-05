package bootcamp.exercises;


public class MainClass {

	public static void main(String[] args){
		
		MySql mySql= new MySql();
		try{
			mySql.ListPerCourses("Fisica");
			//mySql.ListPerFinal(2);
		}catch (Exception e){
			System.out.println("Error");
		}
	}
}


