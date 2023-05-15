package contabancaria;

public class conta {

	public String nome;
	public int numero;
	public double saldo;

	public double depositar(double deposito) {
		return this.saldo + deposito;
	}

	public double sacar(double saque) {
		if (saldo > saque) {
			this.saldo -= saque;
			System.out.println("SAQUE REALIZADO COM SUCESSO!!!!");
		} else {
			System.out.println("Saldo insuficiente");
		}
		return this.saldo;
	}

	public void mostrarStatus() {

		System.out.println("Nome do cliente: " + nome);
		System.out.println("Nome do cliente: " + numero);
		System.out.println("Nome do cliente: " + saldo);
	}
}
