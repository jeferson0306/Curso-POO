package Aula02;

public class Caneta {

	// Classe Caneta - cria��o dos seus objetos (modelo, cor,...)
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("Status:");
		// o this referencia quem o chamou, como s� tem c1, ser� c1, por isso tem que
		// ficar pr�ximo do objeto
		System.out.println("Uma caneta de cor: " + this.cor);
		System.out.println("Est� Tampada? " + this.tampada);
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.printf("Carga: %d%%\n", this.carga);

	}

	// Criar os m�todos da caneta, as a��es da classe

	void rasbicar() {
		if (this.tampada == true) {
			System.out.println("N�o posso rabiscar!");
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