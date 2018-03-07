


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private final String url 		= "jdbc:postgresql://localhost/airports";
	private final String user 		= "postgres";
	private final String password 	= "postgres";
	
	

	public Connection connect() throws SQLException{
		return DriverManager.getConnection(url, user, password);
	}
}
