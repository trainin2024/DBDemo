package jdbcwithOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		JavaUtil javaUtil = new JavaUtil(); 
		Employee emp = new Employee(7, "Alex", "John", "alex@gmail.com");
	 javaUtil.insertEmployee(emp);
		//javaUtil.displayRecord();
	 // javaUtil.deleteRecord(100l);
		//javaUtil.updateRecord(7l);
	}
}