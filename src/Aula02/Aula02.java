package Aula02;

public class Aula02 {

	public static void main(String[] args) {


		//Instanciando os objetos
		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		
		//Classe objeto = new Caneta(Classe)
	
		//Colocar atribuições
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 90;
		c1.tampada = false;
		
		//Chamar os métodos
		c1.tampar();
		c1.status();
		c1.rasbicar();
		
		//Colocar atribuições
		c2.modelo = "BIC";
		c2.cor = "Preta";
		c2.ponta = 1.0f;
		c2.carga = 40;
		c2.tampada = true;
		
		//Chamar os métodos
		c2.destampar();
		c2.status();
		c2.rasbicar();
		
	}

}
