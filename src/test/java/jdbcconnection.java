import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "abcd");
		String query = "Select * from employees";
		PreparedStatement statement = con.prepareStatement(query);
		ResultSet rs =statement.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("first_name"));
		}
	}
}
