public class ContaBancaria {
	public ContaBancaria(String numero, double saldo, AgenciaBancaria agenciaBancaria) {
		this(numero,saldo);
		this.setAgenciaBancaria(agenciaBancaria);
	}
	
	public ContaBancaria(String numero, double saldo) {
		this.setNumero(numero);
		this.setSaldo(saldo);
	}
	
	private String numero;
	private double saldo;
	private AgenciaBancaria agenciaBancaria;

	public void imprime() {
		System.out.println("Número: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		if(this.getAgenciaBancaria() != null) {
			this.agenciaBancaria.imprime();
		}	
	}

	//Getters and Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public AgenciaBancaria getAgenciaBancaria() {
		return this.agenciaBancaria;
	}

	public void setAgenciaBancaria(AgenciaBancaria agenciaBancaria) {
		this.agenciaBancaria = agenciaBancaria;
	}

}
