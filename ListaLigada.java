package continuacaoExercicios;

public class ListaLigada {
	private No primeiro;
	
	public ListaLigada() {
		this.primeiro = null;
	}
	
	public void adicionar(int valor) {
		No novoNo = new No(valor);
		
		if (this.primeiro == null) {
			this.primeiro = novoNo;
		} else {
			No atual = this.primeiro;
			while (atual.proximo != null) {
				atual = atual.proximo;
			}
			atual.proximo = novoNo;
		}
	}
	
	public void exibirLista() {
		No atual = this.primeiro;
		
		while (atual != null) {
			System.out.print(atual.valor + " ⮕ ");
			atual = atual.proximo;
		}
		System.out.println("null");
	}

}
