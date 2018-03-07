

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class showStatistics extends DBConnection{
	public void show(String stat_iata) {
		
		String SQL = "SELECT iata, year, amount FROM passengers WHERE iata = '" + stat_iata + "'";
		
		/* Connection DB*/
		try (Connection conn = connect();
				 /* send SQL Stmt to DB */
				Statement stmt = conn.createStatement();
				/* ResultSet: execute SQL Statement brings Tupel . */
				ResultSet rs = stmt.executeQuery(SQL)) {
			/* brings Statistics */
			show(rs);
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	

	private void show(ResultSet rs) throws SQLException{
		while (rs.next()) {
			System.out.println(
					rs.getString("iata") + "\t"
				+	rs.getInt("year") + "\t"
				+	rs.getInt("amount"));
		}
	}
}
