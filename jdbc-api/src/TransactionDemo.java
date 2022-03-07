import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
String sql1="insert into citizen2 values(909,'Kim',31,'Kerala')";
String sql2="update citizen2 set age =30 where id =101";
String sql3="delete from citizen2 where id=104";
Connection conn = null;
try {
	conn= JdbcFactory.getConnection();
	Statement stmt = conn.createStatement();
	//Adding batch of queries to execute in one go
	stmt.addBatch(sql1);
	stmt.addBatch(sql2);
	stmt.addBatch(sql3);
	//Setting auto-commit state to false
	conn.setAutoCommit(false);
	stmt.executeBatch();// executing all queries
	conn.commit();//committing transaction on successful execution of all queries
} catch (SQLException e) {
	try {
		conn.rollback();//roll back transaction as either of the query failed
	}catch(SQLException e1) {
		e1.printStackTrace();
	}
	e.printStackTrace();
}
String sql = "SELECT*from citizen2";
try {
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

