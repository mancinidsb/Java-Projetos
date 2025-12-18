package fundamentos.estruturaDados;

public class ListaEncadeada<T> {
	private int size = 0;
	private Node<T> begin;
	private Node<T> last;
	
	public ListaEncadeada() {}
	
	public void inserirFrente(T value) {
		Node<T> newNode = new Node<T>(value);
		if(this.size>0) {
			newNode.setAfter(this.begin);
			this.begin.setBefore(newNode);
			this.begin=newNode;
			this.size++;
			return;
		}
		this.begin=this.last=newNode;
		this.size++;
	}
	
	public void inserirAtras(T value) {
		Node<T> newNode = new Node<T>(value);
		if(this.size>0) {
			newNode.setBefore(this.last);
			this.last.setAfter(newNode);
			this.last=newNode;
			this.size++;
			return;
		}
		this.begin=this.last=newNode;
		this.size++;
	}
	
	public T pegarPeloIndice(int indice) throws IllegalArgumentException{
		if (indice>=this.size) {
			throw new IllegalArgumentException("Indice Inválido");
		}
		Node<T> node = this.begin;
		for(int i=0; i<this.size;i++) {
			if(i==indice) {return node.getValue();}
			node=node.getAfter();
		}
		
		throw new IllegalArgumentException("Indice Não Encontrado");
	}
	
	public void printLista() throws IllegalArgumentException{
		Node<T> node = this.begin;
		for(int i=0; i<this.size;i++) {
			System.out.println(node.getValue());
			node=node.getAfter();
		}
	}
	
	public T getValorBegin() {return this.begin.getValue();}
	public T getValorLast() {return this.last.getValue();}
}
