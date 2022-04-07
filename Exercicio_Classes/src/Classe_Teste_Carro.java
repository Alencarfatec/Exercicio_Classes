import javax.swing.JOptionPane;

public class Classe_Teste_Carro {

	public static void main(String[] args) {
//		*COM CONSTRUTOR*
		
//		String modelo1 = JOptionPane.showInputDialog("Insira o Modelo do primeiro carro: ");
//		String cor1 = JOptionPane.showInputDialog("Insira a Cor do primeiro carro: ");
//		
//		String modelo2 = JOptionPane.showInputDialog("Insira o Modelo do segundo carro: ");
//		String cor2 = JOptionPane.showInputDialog("Insira a Cor do segundo carro: ");
//		
//		Classe_Carro carro1 = new Classe_Carro(modelo1,cor1);
//		Classe_Carro carro2 = new Classe_Carro(modelo2,cor2);
//		
//		System.out.println(carro1.getModelo());
//		System.out.println(carro1.getCor());
//		System.out.println(carro2.getModelo());
//		System.out.println(carro2.getCor());
		
		
//		*SEM CONSTRUTOR*
		
		Classe_Carro carro1 = new Classe_Carro();
		Classe_Carro carro2 = new Classe_Carro();
		carro1.setModelo("Fiat");
		carro1.setCor("Azul");
		carro2.setModelo("Camaro");
		carro2.setCor("Amarelo");
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		
	}

}
