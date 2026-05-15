package models;

public class Pix extends Pagamento {
	private String chave;
	private tipoChave tipo;
	public Pix() {
		super();
	}
	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}
	public tipo getTipoChave() {
		return tipo;
	}
	public void setTipoChave(tipoChave tipo) {
		this.tipo = tipo;
	}
	public void processar() {
		
	}
}
