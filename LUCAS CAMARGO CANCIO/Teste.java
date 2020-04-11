public class Teste {
	public static void main(String[] args) {
		// Criar um objeto com o construtor definido no item 4
		AgenciaBancaria agenciaBancaria = new AgenciaBancaria(10);
		
		System.out.println(">>Agencia Banc�ria<<");
		// Utilizar o m�todo imprime() definido na AgenciaBancaria para imprimir os
		// atributos do objeto agenciaBancaria
		agenciaBancaria.imprime();

		// Criar um objeto com o construtor definido no item 8
		ContaBancaria contaBancaria1 = new ContaBancaria("1620652-0", 600.2, agenciaBancaria);
		
		System.out.println("\n>>Conta Banc�ria 1 (Com ag�ncia)<<");
		// Utilizar o m�todo imprime() definido na ContaBancaria para imprimir os
		// atributos do objeto contaBancaria1
		contaBancaria1.imprime();
		
		// Criar um objeto com o construtor definido no item 9
		ContaBancaria contaBancaria2 = new ContaBancaria("60439835-1", 1200.3);
		
		System.out.println("\n>>Conta Banc�ria 2 (Sem ag�ncia)<<");
		// Utilizar o m�todo imprime() definido na ContaBancaria para imprimir os
		// atributos do objeto contaBancaria2
		contaBancaria2.imprime();

		// Criar um objeto com o construtor definido no item 12
		ContaPoupanca contaPoupanca = new ContaPoupanca("321000", 100.4, agenciaBancaria,(short) 16 );

		System.out.println("\n>>Conta Poupan�a<<");
		// Utilizar o m�todo imprime() definido na ContaPoupanca para imprimir os
		// atributos do objeto contaPoupanca
		contaPoupanca.imprime();
	}
}
