public class ContaPoupanca extends ContaBancaria {
	public ContaPoupanca(String numero, double saldo,AgenciaBancaria agenciaBancaria,short diaAniversario) {
		super(numero,saldo,agenciaBancaria);
		this.setDiaAniversario(diaAniversario);
	}
	
	private short diaAniversario;
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Dia do Aniversário: " + this.getDiaAniversario());
	}
	
	//Getters and Setters
	public short getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(short diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
}
