package exercicio3;

public class Teste {

	public static void main(String[] args) {
		FabricaDeCarros carroUnico=null;
		
		for(int i=0;i<100;i++){
			carroUnico= carroUnico.getInstancia();
		}

	}

}
