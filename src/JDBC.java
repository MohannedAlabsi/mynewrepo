import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC {

	static Connection connection = null;
	static String dataBacename = "AllStudent";
	private static final String URL = "jdbc:mysql://localhost/" + dataBacename;
	private static final String userName = "root";
	private static final String password = "MU.99AlAbse_0179103";

			
		
			
	static public void main(String[] args) {

		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Plz enter the Student Id , Name , Grade ");
//			int number = input.nextInt();
//			String name = input.next();
//			String grade = input.next();
//			
			connection = DriverManager.getConnection(URL, userName, password);

			PreparedStatement ps = connection.prepareStatement(
					"INSERT INTO AllStudent.student(idStudent , NAmeStudent , GradeStudent ) VALUES(1 , 'ahmad', 'A')");
			/*ps = connection.prepareStatement(
					"UPDATE  AllStudent.student SET NAmeStudent = 'AHMAD' WHERE NAmeStudent = 'MOHANNED'");

			ps = connection.prepareStatement(
					"UPDATE  AllStudent.student SET NAmeStudent = 'mohanned' WHERE idStudent = 3");
				//ps = connection.prepareStatement("INSERT INTO AllStudent.student(idStudent , NAmeStudent , GradeStudent ) VALUES(3, 'mohanned', 'C')");
			
			ps =connection.prepareStatement(
					"INSERT INTO student(idStudent , NAmeStudent , GradeStudent ) VALUES(4 , 'ali', 'D')");
			ps =connection.prepareStatement(
					"INSERT INTO student(idStudent , NAmeStudent , GradeStudent ) VALUES(5 , 'ali', 'F')");
			
			ps = connection.prepareStatement("INSERT INTO student(idStudent , NAmeStudent , GradeStudent ) VALUES(6 , 'ahamd', 'F')");
			//ps = connection.prepareStatement("INSERT INTO student(idStudent , NAmeStudent , GradeStudent ) VALUES('number' , 'name', 'grade')");
			ps = connection.prepareStatement(
					"CREATE TABLE REGISTRATION " +"(id INTEGER not NULL, " + " first VARCHAR(255), " + " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))");
			ps = connection.prepareStatement(
					"DROP TABLE REGISTRATION");
			
			ps = connection.prepareStatement("DELETE FROM student");
			
			ps = connection.prepareStatement(
					"CREATE TABLE REGISTRATION (id INTEGER not NULL,  first VARCHAR(255),  last VARCHAR(255), age INTEGER, PRIMARY KEY ( id ))");
			
			//ps =connection.prepareStatement(
					//"INSERT INTO student(idStudent , NAmeStudent , GradeStudent ) VALUES(5 , 'ali', 'F')");
			
			//ps =connection.prepareStatement(
					//"INSERT INTO student(idStudent , NAmeStudent , GradeStudent ) VALUES(6 , 'ali', 'F')");*/

			
            ResultSet rs = ps.executeQuery("SELECT * FROM  student");
            
            while(rs.next())
            {
            	System.out.print("ID = " + rs.getInt("idStudent") +" ," +"Name = "+ rs.getString("NAmeStudent") +" ,"+ "Grade = " +rs.getString("GradeStudent")+"\n");
            }

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			System.out.println("Succseful");

		}
		
		
	
		
		
		
		
		
		
		
	
		
		
		
		
		

	}
}
