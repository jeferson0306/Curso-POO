package Aula02;

public class Caneta {

	// Classe Caneta - criação dos seus objetos (modelo, cor,...)
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("Status:");
		// o this referencia quem o chamou, como só tem c1, será c1, por isso tem que
		// ficar próximo do objeto
		System.out.println("Uma caneta de cor: " + this.cor);
		System.out.println("Está Tampada? " + this.tampada);
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.printf("Carga: %d%%\n", this.carga);

	}

	// Criar os métodos da caneta, as ações da classe

	void rasbicar() {
		if (this.tampada == true) {
			System.out.println("Não posso rabiscar!");
		} else {
			System.out.println("Rabiscando...");

		}

	}

	void tampar() {
		this.tampada = true;

	}

	void destampar() {
		this.tampada = false;

	}
}