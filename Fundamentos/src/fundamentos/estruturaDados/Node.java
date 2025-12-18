package fundamentos.estruturaDados;

class Node<T> {
	private Node<T> before;
	private Node<T> after;
	private T value;
	
	protected Node(T value){
		this.setValue(value);
	}

	protected Node<T> getBefore() {
		return before;
	}

	protected void setBefore(Node<T> before) {
		this.before = before;
	}

	protected Node<T> getAfter() {
		return after;
	}

	protected void setAfter(Node<T> after) {
		this.after = after;
	}

	protected T getValue() {
		return value;
	}

	protected void setValue(T value) {
		this.value = value;
	}
	
	
}
