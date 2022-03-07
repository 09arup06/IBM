import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class QueryAnalyzer {

	public static void main(String[] args) {
		String sql = "SELECT*from citizen2";
		try {
			Connection conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
}
		}
	}