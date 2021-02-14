package Aula04;
public class Aula04 {
	public static void main(String[] args) {


		Caneta c1 = new Caneta();
		c1.setModelo("BIC");
		c1.setPonta(0.5f);
		c1.setCor("Azul");
		c1.status();

		System.out.println("Eu tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() 
		+ " e cor "+ c1.getCor() + ".");
	}

}
