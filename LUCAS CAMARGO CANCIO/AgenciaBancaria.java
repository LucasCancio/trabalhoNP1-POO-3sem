public class AgenciaBancaria {
	public AgenciaBancaria(int codigo) {
		this.setCodigo(codigo);
	}

	private int codigo;
	
	public void imprime() {
		System.out.println("Agência: "+this.getCodigo());
	}

	//Getters and Setters
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
