package continuacaoExercicios;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirInformacoes() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
	}
}
