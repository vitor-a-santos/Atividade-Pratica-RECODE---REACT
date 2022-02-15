package dao;

import java.util.List;

import model.Passageiro;

public interface CRUD {
	
	public static void create(Passageiro passageiro) {};
	public static void delete(int passageiroId) {};
	public static List<Passageiro> find(String pesquisa){return null;}
	public static Passageiro findByPk(int passageiroId) {return null;}
	public static void update(Passageiro passageiro) {};
	
}