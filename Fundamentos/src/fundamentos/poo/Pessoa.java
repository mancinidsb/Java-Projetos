package fundamentos.poo;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String cpf;
	
	public Pessoa(String nome, int idade, String cpf){
		this.cpf=cpf;
		this.idade=idade;
		this.nome=nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	
}
