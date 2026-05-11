package models;

public class Pix extends Pagamento {
	private String chave;
	private tipo tipoChave;
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
		return tipoChave;
	}
	public void setTipoChave(tipo tipoChave) {
		this.tipoChave = tipoChave;
	}
	public void processar() {
		
	}
}
