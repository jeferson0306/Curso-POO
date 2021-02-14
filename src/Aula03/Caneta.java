package Aula03;

public class Caneta {

	// Classe Caneta - cria��o dos seus objetos (modelo, cor,...)
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status() {
		System.out.println("Status:");
		// o this referencia quem o chamou, como s� tem c1, ser� c1, por isso tem que
		// ficar pr�ximo do objeto
		System.out.println("Moelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.printf("Carga: %d%%\n", this.carga);
		System.out.println("Est� Tampada? " + this.tampada);
	}

	// Criar os m�todos da caneta, as a��es da classe

	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("N�o posso rabiscar!");
		} else {
			System.out.println("Rabiscando...");

		}

	}

	public void tampar() {
		this.tampada = true;

	}

	public void destampar() {
		this.tampada = false;

	}
}