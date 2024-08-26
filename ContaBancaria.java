package continuacaoExercicios;

public class ContaBancaria {
	private double saldo;
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("O valor do depósito tem que ser positivo!");
		}
	}
	
	public void sacar (double valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
		} else if (valor > this.saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			System.out.println("O valor do saque tem que ser positivo!");
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
