package Aula02;

public class Aula02 {

	public static void main(String[] args) {


		//Instanciando os objetos
		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		
		//Classe objeto = new Caneta(Classe)
	
		//Colocar atribui��es
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 90;
		c1.tampada = false;
		
		//Chamar os m�todos
		c1.tampar();
		c1.status();
		c1.rasbicar();
		
		//Colocar atribui��es
		c2.modelo = "BIC";
		c2.cor = "Preta";
		c2.ponta = 1.0f;
		c2.carga = 40;
		c2.tampada = true;
		
		//Chamar os m�todos
		c2.destampar();
		c2.status();
		c2.rasbicar();
		
	}

}
