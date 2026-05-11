package models;

import java.util.Date;

public abstract class Pagamento {
	private float valor;
	private Date data;
	private Status status;
	
	public Pagamento() {
		this.valor = -1;
		this.data = null;
		this.status = null;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	public abstract void processar();
}
