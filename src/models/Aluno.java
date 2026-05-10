
public class Aluno extends Pessoa {
	private int matricula;
	private Plano plano;
	
	public Aluno() {
		super();
		this.matricula = -1;
		this.plano = new Plano();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	public void realizarMatricula () {
	 System.out.println("Matricula realizada");
	}
}
