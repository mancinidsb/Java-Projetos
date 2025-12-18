package fundamentos.estruturaDados;

public class Main {

	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
		lista.inserirFrente(4);
		lista.inserirAtras(5);
		lista.inserirAtras(6);
		
		lista.printLista();

	}

}
