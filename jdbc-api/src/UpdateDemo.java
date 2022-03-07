import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class UpdateDemo {
	public static void main(String[] args) {
		String sql = "SELECT*from citizen2";
			try {
				Connection conn = JdbcFactory.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				rs.moveToInsertRow();
				rs.updateString(3, "heineken");
				ResultSetMetaData meta = rs.getMetaData();
				for (int i = 1; i <= meta.getColumnCount(); i++)
					System.out.println(meta.getColumnName(i) + "\t");
				System.out.println();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}