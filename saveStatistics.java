

import java.sql.*;

public class saveStatistics extends DBConnection {
	
	public String insertStatistics(Statistics statistics) {
		String SQL = "INSERT INTO passengers(iata, year, amount) VALUES(?,?,?)";
		
		try (Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(SQL)) {
				
				pstmt.setString(1, statistics.getIata());
				pstmt.setInt(2, statistics.getYear());
				pstmt.setInt(3, statistics.getAmount());
				
				pstmt.executeUpdate();
		}

		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return SQL;
	}

}
