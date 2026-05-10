import java.util.Date;
package models;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private Date dataNascimento;
	
	public Pessoa() {
		this.nome = "";
		this.cpf = "";
		this.dataNascimento = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
