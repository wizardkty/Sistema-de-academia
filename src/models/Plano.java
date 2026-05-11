package models;

public class Plano {

	private int nomePlano;
	private float valor;
	private int duracao;
	private String descricao;
	
	public void CalculaVencimento(int tempoDecorrido) {
		duracao -= tempoDecorrido;
	}
	
	public int getNomePlano() {
		return nomePlano;
	}
	public void setNomePlano(int nomePlano) {
		this.nomePlano = nomePlano;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
