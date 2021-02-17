package Aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(430951);
		p1.setDono("Jeferson");
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(1004);
		p2.setDono("Luiz");
		p2.abrirConta("CP");
		
		p1.depositar(300);
		p2.depositar(500);
		
		p1.sacar(350);
		p2.sacar(548);
		
		p1.fecharConta();
		
		p2.estadoAtual();
		p1.estadoAtual();
	}

}