package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySQLConnection;
import model.Passageiro;

public class PassageiroDAO implements CRUD {
	
	private static Connection connection = MySQLConnection.createConnection();
	private static String sql;
	
	public static void create(Passageiro passageiro) {
		 sql = "INSERT INTO passageiros VALUES (null, ?, ?, ?, ?, ?)";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, passageiro.getNome());
			 preparedStatement.setString(2, passageiro.getCpf());
			 preparedStatement.setString(3, passageiro.getIdade());
			 preparedStatement.setString(4, passageiro.getDestino());
			 preparedStatement.setString(5, passageiro.getPagamento());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
	}
	
	public static void delete(int passageiroId) {
		sql = "DELETE FROM passageiros WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, passageiroId);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on cliente");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on cliente. " + e.getMessage());
		}
	}
	
	public static List<Passageiro> find(String pesquisa){
		
		sql = String.format("SELECT * FROM passageiros WHERE nome like '%s%%' OR cpf LIKE '%s%%' ", pesquisa, pesquisa);
		List<Passageiro> passageiros = new ArrayList<Passageiro>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Passageiro passageiro = new Passageiro();
				
				passageiro.setId(resultSet.getInt("id"));
				passageiro.setNome(resultSet.getString("nome"));
				passageiro.setCpf(resultSet.getString("cpf"));
				passageiro.setIdade(resultSet.getString("idade"));
				passageiro.setDestino(resultSet.getString("Destino"));
				passageiro.setPagamento(resultSet.getString("Pagamento"));
				
				passageiros.add(passageiro);
				
			}
			
			System.out.println("--correct find passageiros");
			return passageiros;
			
		} catch(SQLException e) {
			System.out.println("--incorrect find passageiros. " + e.getMessage());
			return null;
		}
		
		
	}
	
	public static Passageiro findByPk(int passageiroId) {
		sql = String.format("SELECT * FROM passageiros WHERE id = %d ", passageiroId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Passageiro passageiro = new Passageiro();
			
			while (resultSet.next()) {
				passageiro.setId(resultSet.getInt("id"));
				passageiro.setNome(resultSet.getString("nome"));
				passageiro.setCpf(resultSet.getString("cpf"));
				passageiro.setIdade(resultSet.getString("idade"));
				passageiro.setDestino(resultSet.getString("destino"));
				passageiro.setPagamento(resultSet.getString("pagamento"));
			}
			
			System.out.println("--correct find by pk passageiros");
			return passageiro;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk passageiros. " + e.getMessage());
			return null;
		}
	}
	
	public static void update(Passageiro passageiro) {
		sql = "UPDATE passageiros SET nome=?, cpf=?, idade=?, destino=?, pagamento=? WHERE id=?";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, passageiro.getNome());
			 preparedStatement.setString(2, passageiro.getCpf());
			 preparedStatement.setString(3, passageiro.getIdade());
			 preparedStatement.setString(4, passageiro.getDestino());
			 preparedStatement.setString(5, passageiro.getPagamento());
			 preparedStatement.setInt(6, passageiro.getId());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct update on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect update on database. " + e.getMessage());
		 }
	}
}
