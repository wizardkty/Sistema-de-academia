package models;

public class Dinheiro extends Pagamento {
	public Dinheiro() {
		super();
	}
	public Double darTroco() {
		return 0.0;
	}
	@Override
	public void processar() {
		// TODO Auto-generated method stub
		System.out.println("Pagamento finalizado");
	}
}
