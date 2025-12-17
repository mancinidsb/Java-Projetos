package fundamentos.main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao = menu(scanner);
		String nome = "";
		int idade = 0;
		double saldo=0, deposito, saque;
		ArrayList<String> historico = new ArrayList<String>();
		
		while(opcao!=0) {
			switch (opcao) {
			case 1: {
				if(nome.equals("") && idade==0) {					
					System.out.println("\n-=-=-= Bem vindo ao Banco ATM (CADASTRO) -=-=-= ");
					System.out.print("Digite seu nome: ");
					nome = scanner.nextLine();
					System.out.print("Digite sua idade: ");
					idade = Integer.parseInt(scanner.nextLine());
					
				}else {
					System.out.println("Pessoa Já Cadastrada No Sistema");
				}
				break;
			}
			case 2:
				System.out.println("\n-=-=-= Bem vindo ao Banco ATM (Deposito) -=-=-= ");
				System.out.print("Digite o valor para deposito: ");
				deposito = Float.parseFloat(scanner.nextLine());
				if(deposito<=0) System.out.print("Digite um valor acima de 0.0 R$!");
				else {
					saldo+=deposito;
					historico.add(String.format("Movimentação: Deposito | Valor: %.2f | Saldo Anterior: R$ %.2f | Saldo Atual: R$ %.2f", deposito,saldo-deposito, saldo));
				}
				break;
			case 3:
				System.out.println("\n-=-=-= Bem vindo ao Banco ATM (Sacar) -=-=-= ");
				System.out.print("Digite o valor para sacado: ");
				saque = Float.parseFloat(scanner.nextLine());
				if(saque<=0) System.out.print("Digite um valor acima de 0.0 R$!");
				else {
					saldo-=saque;
					historico.add(String.format("Movimentação: Saque | Valor: %.2f | Saldo Anterior: R$ %.2f | Saldo Atual: R$ %.2f", saque,saldo+saque, saldo));
				}
				break;
			case 4:
				for(int i=historico.size()-1; i>=0;i--) {
					System.out.println(historico.get(i));
				}
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
			opcao=menu(scanner);
			
		}
		
	}
	public static int menu(Scanner scan) {
		System.out.println("\n-=-=-= Bem vindo ao Banco ATM -=-=-= ");
		System.out.println("1 - Criar Conta");
		System.out.println("2 - Depositar Saldo");
		System.out.println("3 - Retirar Saldo");
		System.out.println("4 - Ver Histórico");
		System.out.println("0 - Sair");
		System.out.print("Digite uma opção: ");
		int opcao = Integer.parseInt(scan.nextLine());
		if(opcao>4 || opcao<0) {
			return -1;
		}
		return opcao;
	}
}
