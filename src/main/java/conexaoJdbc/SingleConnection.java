package conexaoJdbc;

import java.sql.Connection;

public class SingleConnection {
	
	private static String banco = "";
	private static String user = "";
	private static String passwor = "";
	private static Connection connection = null;
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar() {
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	
	

}
