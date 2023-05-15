package contabancaria;

public class Main {

	public static void main(String[] args) {

		conta c1 = new conta();

		c1.nome = "ariel";
		c1.numero = 1234;
		c1.saldo = 10.000;

		c1.mostrarStatus();
		c1.depositar(100);
		c1.mostrarStatus();
		c1.sacar(200);
	}
}