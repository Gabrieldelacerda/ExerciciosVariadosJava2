package continuacaoExercicios;

public class Livro {

	private String titulo;
	private String autor;
	private int ano;
	
	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	public void exibirDetalhes() {
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano: " + this.ano);
	}
}
