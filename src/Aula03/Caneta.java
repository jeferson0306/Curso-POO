package Aula03;

public class Caneta {

	// Classe Caneta - criação dos seus objetos (modelo, cor,...)
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status() {
		System.out.println("Status:");
		// o this referencia quem o chamou, como só tem c1, será c1, por isso tem que
		// ficar próximo do objeto
		System.out.println("Moelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.printf("Carga: %d%%\n", this.carga);
		System.out.println("Está Tampada? " + this.tampada);
	}

	// Criar os métodos da caneta, as ações da classe

	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Não posso rabiscar!");
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