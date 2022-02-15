package model;

public class Passageiro {
		
	private int id;
	private String nome;
	private String cpf;
	private String idade;
	private String destino;
	private String pagamento;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	@Override
	public String toString() {
		return "Passageiro [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", destino=" + destino
				+ ", pagamento=" + pagamento + "]";
	}
	
	
	
}
