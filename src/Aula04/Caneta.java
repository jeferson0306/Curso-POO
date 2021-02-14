package Aula04;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	// criar método construtor
	public Caneta() {

	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String c) {
		this.cor = c;

	}

	public void tampar() {
		this.tampada = false;

	}

	public void destampar() {
		this.tampada = true;
	}

	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("MODELO: " + this.modelo);
		System.out.println("PONTA: " + this.ponta);
		System.out.println("COR: " + this.cor);

	}

}
