package exercicio3;

public class FabricaDeCarros {
	
	private FabricaDeCarros(){
		
	}
	
	private static FabricaDeCarros instancia = null;
	
	public static FabricaDeCarros getInstancia(){
		if(instancia==null){
			System.out.println("Carro Criado");
			instancia = new FabricaDeCarros();
		}
		return instancia;
	}

}
