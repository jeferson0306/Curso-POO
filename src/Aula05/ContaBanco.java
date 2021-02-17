package Aula05;

public class ContaBanco {

	// Declarar atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	public String CC, CP;
	

	// Declarar M�todos
	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());

	}

	public void ContaBanco(String t) {
		this.saldo = 0;
		this.status = false;
		if (t == CC) {
			this.setSaldo(50);
		} else if (t == CP) {
			this.setSaldo(150);
		}
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (CC.equals(t)) {
			this.setSaldo(50);
		} else if (CP.equals(t)) {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta n�o pode ser fechada. "
					+ "Ainda " + "tem dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta n�o pode ser fechada. " + 
		"Existem d�bitos");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float v) {
		if (this.getStatus()) {
			// this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Dep�sito realizado com sucesso na " 
			+ "conta de " + this.getDono());
		} else {
			System.out.println("Imposs�vel depositar em uma conta " 
		+ "fechada");
		}
	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " 
				+ this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Imposs�vel sacar! Conta fechada!");
		}

	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por "
					+ "" + this.getDono());
		} else {
			System.out.println("Imposs�vel pagar uma conta "
					+ "fechada " + "ou" + " n�o existente");
		}

	}

	// Declarar M�todos especiais
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = (float) d;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
