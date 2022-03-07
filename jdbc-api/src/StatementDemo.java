import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
public static void main(String[] args) {
	//String sql = "insert into citizen2 values("+ args[0]+","+args[1]+","+args[2]+", "+args[3]");
	
	String sql="insert into citizen values(105,'jack',24,'Delhi')";
	try {
		Connection conn = JdbcFactory.getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Record inserted");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
