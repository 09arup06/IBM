import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class ResultDemo {

	public static void main(String[] args) {
		String sql = "SELECT*from citizen2";
		try {
			Connection conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			for (int i = 1; i <= meta.getColumnCount(); i++)
				System.out.println(meta.getColumnName(i) + "\t");
			System.out.println();
			while (rs.next())
				System.out
						.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
