package fundamentos.poo;

public class Funcionario extends Pessoa{
	private double desconto=0.05;
	private String matricula;
	private float bonus;
	
	public Funcionario(String nome, int idade, String cpf, String matricula) {
		super(nome, idade, cpf);
		this.setDesconto(desconto);
		this.setMatricula(matricula);
	}
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//public float getBonus()
	
}