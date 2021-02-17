package Aula05;

public class Aula05 {

	public static void main(String[] args) {
	
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(430951);
		p1.setDono("Jeferson");
		p1.estadoAtual();
		p1.abrirConta("cc");
		p1.depositar(100);
		p1.fecharConta();
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(10049);
		p2.setDono("Siqueira");
		p2.estadoAtual();
		p2.abrirConta("cp");
		p2.depositar(500);
		p2.sacar(100);
		
		

	}

}
