package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

	
	private static final String url = "jdbc:mysql://localhost:3306/TurismoCrudJava?serverTimezone=UTC";
	private static final String user = "root";
	private static final String password = "root";
	
	public static Connection createConnection() {
	
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Sucesso ");
			
		} catch(ClassNotFoundException e) {
			System.out.println(" Driver not found " + e.getMessage());
		}


		try{
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println(" Conectado ao DB ");
			return connection;
			
		} catch (SQLException e) {
			System.out.println(" ERRO DE CONEXAO " + e.getMessage());;
			return null;
		}
}
}



