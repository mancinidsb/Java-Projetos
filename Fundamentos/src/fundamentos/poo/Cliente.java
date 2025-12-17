package fundamentos.poo;

//import fundamentos.poo.Pessoa;

public class Cliente extends Pessoa{
	private double desconto;
	public Cliente(String nome, int idade, String cpf, double desconto) {
		super(nome, idade, cpf);
		this.setDesconto(desconto);
	}
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}
